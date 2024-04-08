package fitapet.backend.fit_a_pet.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserUpdateDTO {
    private String name;
    private String password;
    private String email;

    public UserUpdateDTO(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
