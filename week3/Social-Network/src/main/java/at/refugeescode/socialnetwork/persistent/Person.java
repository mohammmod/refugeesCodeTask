package at.refugeescode.socialnetwork.persistent;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id ;
    private String name ;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Person> friend = new ArrayList<>();

    public Person() {
    }

    public Person(String name){
        this.name = name ;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Person> getFriend() {
        return friend;
    }

    public void setFriend(List<Person> friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", friends=" + friend +
                '}';
    }
}
