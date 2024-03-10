package AccioJob.Student.Library.Management.System.Repositories;

import AccioJob.Student.Library.Management.System.Entity.Author;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRespository extends JpaRepository<Author,Integer> {

}
