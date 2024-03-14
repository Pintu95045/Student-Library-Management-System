package AccioJob.Student.Library.Management.System.Repositories;

import AccioJob.Student.Library.Management.System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository <Student,Integer>{

    List<Student> findStudentByBranchAndCgpaGreaterThan(String branch, double cgpa);

    Student findStudentByEmailId(String emailId);

}
