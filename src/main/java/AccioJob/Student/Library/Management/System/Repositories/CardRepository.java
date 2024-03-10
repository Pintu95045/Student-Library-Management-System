package AccioJob.Student.Library.Management.System.Repositories;

import AccioJob.Student.Library.Management.System.Entity.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<LibraryCard,Integer> {


}
