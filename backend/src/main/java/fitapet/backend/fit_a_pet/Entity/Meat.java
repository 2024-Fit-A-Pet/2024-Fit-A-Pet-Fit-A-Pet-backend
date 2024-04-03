package fitapet.backend.fit_a_pet.Entity;

import fitapet.backend.fit_a_pet.common.CoreEntity;
import jakarta.persistence.*;

@Table(name="meat")
@Entity
public class Meat extends CoreEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="meat_id")
    private Long id;
    private String meatName;
}
