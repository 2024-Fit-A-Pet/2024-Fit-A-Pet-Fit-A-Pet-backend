package fitapet.backend.fit_a_pet.Entity;

import fitapet.backend.fit_a_pet.common.CoreEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name="meat")
@Entity
public class Meat extends CoreEntity {
    private String meatName;
}
