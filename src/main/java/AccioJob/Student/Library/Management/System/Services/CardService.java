package AccioJob.Student.Library.Management.System.Services;

import AccioJob.Student.Library.Management.System.Enum.CardStatus;
import AccioJob.Student.Library.Management.System.Entity.LibraryCard;
import AccioJob.Student.Library.Management.System.Entity.Student;
import AccioJob.Student.Library.Management.System.Repositories.CardRepository;
import AccioJob.Student.Library.Management.System.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;
    @Autowired
    private StudentRepository studentRepository;
    public String generateCard(){

        //i want to save some card to DB
        LibraryCard card= new LibraryCard();
        card.setCardStatus(CardStatus.NEW);
        card.setNoOfBooksIssued(0);

        Date exiparyDate = new Date(2028,6,1);
        card.setValidity(exiparyDate);
        card=cardRepository.save(card);

        return "The card has been generated with cardID "+card.getCardNo();

    }

    public String associateCardAndStudent(Integer cardId,Integer studentId){
        LibraryCard libraryCard=cardRepository.findById(cardId).get();
        Student student=studentRepository.findById(studentId).get();
        libraryCard.setCardStatus(CardStatus.ISSUED);
        libraryCard.setStudent(student); // setting the FK lc table
        cardRepository.save(libraryCard);
        return "The card and the student has been associated";
    }
}
