package AccioJob.Student.Library.Management.System.Entity;

import AccioJob.Student.Library.Management.System.Enum.Genre;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorId;

    private String name;

    private Integer age;

    private String emailId;

    private Double rating;

    @Column(columnDefinition = "INT DEFAULT 0")
    private int noOfBooks;

}
