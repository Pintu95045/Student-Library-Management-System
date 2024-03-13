package AccioJob.Student.Library.Management.System.Entity;

import AccioJob.Student.Library.Management.System.Enum.Genre;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer bookId;

    @Column(unique = true)
    private String title;

    private int noOfPages;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    private Integer price;

    private boolean isIssued;

    @JoinColumn
    @ManyToOne
    private Author author;

}
