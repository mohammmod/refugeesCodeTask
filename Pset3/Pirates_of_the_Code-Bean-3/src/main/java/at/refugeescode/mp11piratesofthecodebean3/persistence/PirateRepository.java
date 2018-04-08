package at.refugeescode.mp11piratesofthecodebean3.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PirateRepository extends JpaRepository<Pirate , Long> {
}
