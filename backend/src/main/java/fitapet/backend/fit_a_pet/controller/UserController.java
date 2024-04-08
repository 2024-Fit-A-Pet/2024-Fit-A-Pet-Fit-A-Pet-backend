package fitapet.backend.fit_a_pet.controller;

import fitapet.backend.fit_a_pet.Entity.User;
import fitapet.backend.fit_a_pet.dto.UserCreateDTO;
import fitapet.backend.fit_a_pet.dto.UserUpdateDTO;
import fitapet.backend.fit_a_pet.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    // No Use of @Autowired annotation
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 모든 유저 조회
    @GetMapping("/show/all")
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    // 특정 유저 조회 by name
    @GetMapping("/show/name/{name}")
    public User findUserByName(@PathVariable String name){
        return userService.findUserByName(name);
    }

    // 특정 유저 조회 by email
    @GetMapping("/show/email/{email}")
    public User findUserByEmail(@PathVariable String email){
        return userService.findUserByEmail(email);
    }
    // 유저 정보 등록
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody UserCreateDTO userCreateDTO){
        return ResponseEntity.ok(userService.createUser(userCreateDTO));
    }
    // 유저 정보 수정
    @PatchMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody UserUpdateDTO userUpdateDTO){
        return ResponseEntity.ok(userService.updateUser(userUpdateDTO));
    }
    // 유저 정보 삭제
    @DeleteMapping("/leave")
    public ResponseEntity<User> deleteUser(@RequestParam Long userId) {
        return ResponseEntity.ok(userService.deleteUser(userId));
    }
}
