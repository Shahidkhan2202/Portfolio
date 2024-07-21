package Portfolio.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table
public class Experience {
    @Id
    @GeneratedValue
    private Long id;
    private String companyName;
    private String duration;
    private String description;
    private String techStack;
    public Experience() {

    }
    public Experience(String companyName, String duration, String description, String techStack) {
        this.companyName = companyName;
        this.duration = duration;
        this.description = description;
        this.techStack = techStack;
    }
}
