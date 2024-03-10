package AccioJob.Student.Library.Management.System.Repositories;

import AccioJob.Student.Library.Management.System.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
