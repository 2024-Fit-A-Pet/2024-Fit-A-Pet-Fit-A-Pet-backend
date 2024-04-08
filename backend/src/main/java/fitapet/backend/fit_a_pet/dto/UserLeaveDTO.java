package fitapet.backend.fit_a_pet.dto;

import lombok.Getter;

@Getter
public class UserLeaveDTO {
    public final Long id;

    public UserLeaveDTO(Long id) {
        this.id = id;
    }
}
