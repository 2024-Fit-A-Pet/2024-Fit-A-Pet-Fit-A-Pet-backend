package fitapet.backend.fit_a_pet.service;

import fitapet.backend.fit_a_pet.Entity.Pet;
import fitapet.backend.fit_a_pet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerService {

    @Autowired
    private PetRepository petRepository;

    public Pet createPet(Pet pet) {

        return petRepository.save(pet);
    }

    public Pet getPetById(Long id) {

        return petRepository.findById(id).orElseThrow();
    }

    public List<Pet> getAllPets() {

        return petRepository.findAll();
    }

    public Pet updatePet(Pet pet) {

        if (!petRepository.existsById(pet.getId())) {
            throw new RuntimeException("Pet not found");
        }
        return petRepository.save(pet);
    }

    public void deletePetById(Long id) {

        petRepository.deleteById(id);
    }
}
