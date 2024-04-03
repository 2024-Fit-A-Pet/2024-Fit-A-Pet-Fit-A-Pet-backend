package fitapet.backend.fit_a_pet.Entity;


import fitapet.backend.fit_a_pet.common.CoreEntity;
import jakarta.persistence.*;

@Table(name="oil")
@Entity
public class Oil extends CoreEntity {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="oil_id")
    private Long id;
    @Column(name="oil_name")
    private String oilName;
}
