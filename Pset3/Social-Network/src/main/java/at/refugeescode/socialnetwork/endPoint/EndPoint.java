package at.refugeescode.socialnetwork.endPoint;

import at.refugeescode.socialnetwork.persistent.Person;
import at.refugeescode.socialnetwork.persistent.Repository.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EndPoint {
    private Repository repository;

    public EndPoint(Repository repository) {
        this.repository = repository;
    }


    @GetMapping("/persons")
    List<Person> getAllPerson(){
        return repository.findAll();
    }

    @PostMapping("/persons")
    public String addPerson(@RequestBody String person){
        repository.save(new Person(person));
        return person;
    }

    @PutMapping("persons/{id1}/friend/{id2}")
    public void addfriends(@PathVariable Long id1 ,@PathVariable Long id2){
        Optional<Person> firstPerson = repository.findById(id1);
        Optional<Person> secondPerson = repository.findById(id2);
        if(firstPerson.isPresent()&&secondPerson.isPresent()){
            Person person = firstPerson.get();
            Person person1 = secondPerson.get();
            person.getFriend().add(person1);
            repository.save(person);
        }
    }

    @PutMapping("persons/{id1}/unfriend/{id2}")
    public void deletfriends(@PathVariable Long id1 ,@PathVariable Long id2){
        Optional<Person> firstPerson = repository.findById(id1);
        Optional<Person> secondPerson = repository.findById(id2);
        if(firstPerson.isPresent()&&secondPerson.isPresent()){
            Person person = firstPerson.get();
            Person person1 = secondPerson.get();
            person.getFriend().remove(person1);
            repository.save(person);
        }
    }
}
