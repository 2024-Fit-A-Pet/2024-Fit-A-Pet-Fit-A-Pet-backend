package fitapet.backend.fit_a_pet.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.Formula;

@Entity
@Table(name="code")
@Data
public class Code {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="pet_id")
    private Long pet_id;

    @Column(name="code",length = 32, nullable = false, unique = true)
    private String code;

}
