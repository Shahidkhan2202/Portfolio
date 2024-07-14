package Portfolio.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="education")
public class Education {
    @Id
    @GeneratedValue
    private Long id;

    private String institutionName;
    private String degree;
    private String fieldOfStudy;
    private Integer graduationYear;
    private Double gpa;

    public Education() {

    }

    public Education(String institutionName, String degree, String fieldOfStudy, Integer graduationYear, Double gpa) {
        this.institutionName = institutionName;
        this.degree = degree;
        this.fieldOfStudy = fieldOfStudy;
        this.graduationYear = graduationYear;
        this.gpa = gpa;


    }
}
