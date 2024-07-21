package Portfolio.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table
public class Project {
    @Id
    @GeneratedValue
    private int id;
    private String description;
    private String duration;
    private String technology_used;

    public Project() {

    }


    public  Project (String name, String description, String technology_used, int id) {
        this.description = description;
        this.duration= duration;
        this.technology_used = technology_used;
    }

}
