package fitapet.backend.fit_a_pet.service;

import fitapet.backend.fit_a_pet.Entity.User;
import fitapet.backend.fit_a_pet.dto.UserUpdateDTO;

import java.net.http.HttpResponse;
import java.util.List;

public interface UserService {

    ////////////////////////////////////////////////////////////
    /*
    / User Service Interface for User CRUD
     */
    List<User> findAllUsers();

    User findUserByName(String name);

    User findUserByEmail(String email);

    User findUserById(Long id);

    User createUser(User user);

    User updateUser(User user, UserUpdateDTO userUpdateDTO);

    User deleteUser(User user);

    ////////////////////////////////////////////////////////////

}
