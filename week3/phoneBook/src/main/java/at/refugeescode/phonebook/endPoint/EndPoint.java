package at.refugeescode.phonebook.endPoint;

import at.refugeescode.phonebook.persistent.Person;
import at.refugeescode.phonebook.persistent.repository.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class EndPoint {
    private Repository repository;

    public EndPoint (Repository repository){
        this.repository = repository;
    }
    @GetMapping
    List<Person> showPersons(){
        return repository.findAll();
    }
    @PostMapping
    Person findPersons(@RequestBody Person person){
        repository.save(person);
        return person;
    }
}
