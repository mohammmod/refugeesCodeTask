package at.refugeescode.phonebook.initilaize;

import at.refugeescode.phonebook.persistent.Adderss;
import at.refugeescode.phonebook.persistent.Person;
import at.refugeescode.phonebook.persistent.repository.Repository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Initilazier {
    @Bean
    ApplicationRunner applicationRunner(Repository repository){
     return args -> {
        repository.deleteAll();
         Person personList = creatPersons();
         repository.save(personList);
         System.out.println("this is the people at the phone book");
         /*personList.stream()
                 .forEach(element -> System.out.println(element.getName() + " " + element.getAdderss()));*/
     };
    }

    private Person creatPersons() {
        Person person = new Person();
        person.setName("mohammad");
        person.setAdderss(new Adderss("amarica"));

        return person;
    }
}
