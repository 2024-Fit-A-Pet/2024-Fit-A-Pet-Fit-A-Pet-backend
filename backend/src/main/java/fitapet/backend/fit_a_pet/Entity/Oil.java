package fitapet.backend.fit_a_pet.Entity;


import fitapet.backend.fit_a_pet.common.CoreEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name="oil")
@Entity
public class Oil extends CoreEntity {

    @Column(name="oil_name")
    private String oilName;
}
