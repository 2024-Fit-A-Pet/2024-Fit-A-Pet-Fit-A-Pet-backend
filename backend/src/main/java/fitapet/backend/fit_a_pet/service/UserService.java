package fitapet.backend.fit_a_pet.service;

import fitapet.backend.fit_a_pet.Entity.User;
import fitapet.backend.fit_a_pet.dto.UserCreateDTO;
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

    User findUserById(Long id);

    User findUserByEmail(String email);

    User createUser(UserCreateDTO userCreateDTO);

    User updateUser(UserUpdateDTO userUpdateDTO);

    User deleteUser(Long UserID);

    ////////////////////////////////////////////////////////////

}
