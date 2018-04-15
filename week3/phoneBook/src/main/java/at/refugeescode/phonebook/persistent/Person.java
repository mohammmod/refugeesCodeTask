package at.refugeescode.phonebook.persistent;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id ;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Adderss adderss;

   /* public Person(String name , Adderss address){
        this.adderss =address ;
        this.name = name;
    }*/

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

    public Adderss getAdderss() {
        return adderss;
    }

    public void setAdderss(Adderss adderss) {
        this.adderss = adderss;
    }
    @Override
    public String toString() {
        return "persons{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + adderss +
                '}';
    }
}
