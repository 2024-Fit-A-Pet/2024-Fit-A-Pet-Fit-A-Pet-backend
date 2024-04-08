package fitapet.backend.fit_a_pet.dto;

import lombok.Getter;

@Getter
public class UserCreateDTO{
    private final String name;
    private final String password;
    private final String email;

    public UserCreateDTO(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
