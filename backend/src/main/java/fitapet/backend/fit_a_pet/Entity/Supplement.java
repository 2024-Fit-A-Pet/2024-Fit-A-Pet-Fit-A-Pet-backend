package fitapet.backend.fit_a_pet.Entity;

import fitapet.backend.fit_a_pet.common.CoreEntity;
import jakarta.persistence.*;


@Table(name="supplement")
@Entity
public class Supplement extends CoreEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="supplement_id")
    private Long id;
    @Column(name="supplement_name",length = 32, nullable = false)
    private String supplementName;

}
