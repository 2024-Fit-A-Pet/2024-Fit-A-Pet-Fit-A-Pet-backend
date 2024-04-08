package fitapet.backend.fit_a_pet.service;

import fitapet.backend.fit_a_pet.Entity.User;
import fitapet.backend.fit_a_pet.dto.UserCreateDTO;
import fitapet.backend.fit_a_pet.dto.UserUpdateDTO;
import fitapet.backend.fit_a_pet.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;



    @Override
    public List<User> findAllUsers() {

        if(userRepository.findAll().isEmpty())
            return Collections.emptyList();

        return userRepository.findAll();
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public User findUserByName(String name) {
        return userRepository.findByName(name).orElseThrow( () -> new RuntimeException("User not found")); // 예외는 수정 예정
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public User createUser(UserCreateDTO userCreateDTO) {
        // 생성 전 중복 체크
        if(userRepository.findByEmail(userCreateDTO.getEmail()).isPresent())
            throw new RuntimeException("User already exists");

        User createdUser = new User();

        createdUser.setName(userCreateDTO.getName());
        createdUser.setEmail(userCreateDTO.getEmail());
        createdUser.setPassword(userCreateDTO.getPassword());

        return userRepository.save(createdUser);
    }

    @Override
    public User updateUser(UserUpdateDTO userUpdateDTO) {
        log.info("User update request : {}", userUpdateDTO.toString());
        // 존재 여부 파악
        if(findUserByName(userUpdateDTO.getName()) == null)
            throw new RuntimeException("User not found");

        User updatedUser = findUserByName(userUpdateDTO.getName());

        if(userUpdateDTO.getName() != null) {
            updatedUser.setName(userUpdateDTO.getName());
        }

        if(userUpdateDTO.getPassword() != null) {
            log.info("Password updated");
            updatedUser.setPassword(userUpdateDTO.getPassword());
        }

        if(userUpdateDTO.getEmail() != null) {
            updatedUser.setEmail(userUpdateDTO.getEmail());
        }

        updatedUser.setUpdatedAt(LocalDateTime.now());
        log.info("User updated at : {}", updatedUser);

        return userRepository.save(updatedUser);
    }

    @Override
    public User deleteUser(Long userID) {
        if(findUserById(userID) != null){
            User user = findUserById(userID);
            if (user.deletedAt != null)
                throw new RuntimeException("User already deleted");
            user.preRemove();
            return user;
        }
        else throw new RuntimeException("Cant Found User");
    }
}
