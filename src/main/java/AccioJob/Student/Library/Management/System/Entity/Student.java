package AccioJob.Student.Library.Management.System.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // to define the schema
@Table (name = "student_info") // to define the table

@Getter
@Setter
@NoArgsConstructor // this is a default Constructor
@AllArgsConstructor // create constructor of all argument

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;

    @Column(nullable = false)
    private String name;

    private String branch;

    @Column(nullable = false)
    private Double cgpa;

    @Column(unique = true)
    private String emailId;

}
