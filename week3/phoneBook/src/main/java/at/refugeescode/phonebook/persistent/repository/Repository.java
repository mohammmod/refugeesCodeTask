package at.refugeescode.phonebook.persistent.repository;

import at.refugeescode.phonebook.persistent.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Person,Long> {
    boolean existsByName(String name);
}
