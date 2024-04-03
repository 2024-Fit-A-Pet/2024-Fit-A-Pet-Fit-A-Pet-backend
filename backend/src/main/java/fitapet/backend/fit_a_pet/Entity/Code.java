package fitapet.backend.fit_a_pet.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="code")
@Data
public class Code {
    @Id
    @Column(name="code_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="device_code",length = 32, nullable = false, unique = true)
    private String device_code;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="pet_id")
    private Pet pet;
}
