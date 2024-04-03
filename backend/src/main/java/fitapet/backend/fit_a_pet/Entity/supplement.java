package fitapet.backend.fit_a_pet.Entity;

import fitapet.backend.fit_a_pet.common.CoreEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Table(name="supplement")
@Entity
public class supplement extends CoreEntity {
    @Column(name="supplement_name",length = 32, nullable = false,)
    private String supplementName;

}
