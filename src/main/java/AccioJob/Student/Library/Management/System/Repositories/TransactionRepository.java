package AccioJob.Student.Library.Management.System.Repositories;

import AccioJob.Student.Library.Management.System.Entity.Book;
import AccioJob.Student.Library.Management.System.Entity.LibraryCard;
import AccioJob.Student.Library.Management.System.Entity.Transaction;
import AccioJob.Student.Library.Management.System.Enum.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {

    Transaction findTransactionByBookAndCardAndTransactionStatus(Book book, LibraryCard card, TransactionStatus transactionStatus);

}