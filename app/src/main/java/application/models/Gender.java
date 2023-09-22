package application.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Gender")
@Table
public class Gender {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;

    public long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
