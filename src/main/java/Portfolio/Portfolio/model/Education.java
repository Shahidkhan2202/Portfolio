package Portfolio.Portfolio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="education")
public class Education {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="institution_name")
    private String institutionName;

    @Column(name = "degree")
    private String degree;

    @Column(name = "field_of_study")
    private String fieldOfStudy;

    @Column(name="graduation_year")
    private Integer graduationYear;

    @Column(name = "gpa")
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
