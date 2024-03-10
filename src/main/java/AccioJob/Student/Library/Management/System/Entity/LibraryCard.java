package AccioJob.Student.Library.Management.System.Entity;

import AccioJob.Student.Library.Management.System.Enum.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "card_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class LibraryCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;
    private int noOfBooksIssued;
    private Date Validity;

    @JoinColumn // its for an new colum is joining
    @OneToOne // mapping type
    private Student student;  //entity name which want to join

}
