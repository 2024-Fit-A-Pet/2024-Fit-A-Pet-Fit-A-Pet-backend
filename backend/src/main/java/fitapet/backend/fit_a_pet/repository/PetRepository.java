package fitapet.backend.fit_a_pet.repository;

import fitapet.backend.fit_a_pet.Entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {

}
