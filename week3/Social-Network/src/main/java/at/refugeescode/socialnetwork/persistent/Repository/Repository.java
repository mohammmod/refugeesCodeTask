package at.refugeescode.socialnetwork.persistent.Repository;

import at.refugeescode.socialnetwork.persistent.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repository extends
        JpaRepository<Person, Long> {
    Optional<Person> findById(Long id);
}
