package at.refugeescode.phonebook.persistent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adderss {
    @Id
    @GeneratedValue
    private Long id;

    private String placeName;

    public Adderss(){

    }
    public Adderss (String placeName){
        this.placeName = placeName;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "address{" +
                "id=" + id +
                ", place name='" + placeName + '\'' +
                '}';
    }
}
