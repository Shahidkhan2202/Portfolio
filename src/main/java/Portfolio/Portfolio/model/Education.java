package Portfolio.Portfolio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
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
}
