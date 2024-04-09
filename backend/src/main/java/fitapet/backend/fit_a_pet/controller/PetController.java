package fitapet.backend.fit_a_pet.controller;

import fitapet.backend.fit_a_pet.Entity.Pet;
import fitapet.backend.fit_a_pet.service.PerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetController {

    @Autowired
    private PerService perService;

    @PostMapping
    public Pet createPet(@RequestBody Pet pet) {

        return perService.createPet(pet);
    }

    @GetMapping("/{id}")
    public Pet getPetById(@PathVariable Long id) {

        return perService.getPetById(id);
    }

    @GetMapping
    public List<Pet> getAllPets() {

        return perService.getAllPets();
    }

    @PutMapping("/{id}")
    public Pet updatePet(@PathVariable Long id, @RequestBody Pet pet) {

        pet.setId(id);
        return perService.updatePet(pet);
    }

    @DeleteMapping("/{id}")
    public void deletePetById(@PathVariable Long id) {

        perService.deletePetById(id);
    }
}
