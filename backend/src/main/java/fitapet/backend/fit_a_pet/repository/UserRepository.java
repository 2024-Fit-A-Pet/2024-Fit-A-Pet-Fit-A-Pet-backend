package fitapet.backend.fit_a_pet.repository;

import fitapet.backend.fit_a_pet.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String name);

    List<User> findAll();
    Optional<User> findByEmail(String email);
}
