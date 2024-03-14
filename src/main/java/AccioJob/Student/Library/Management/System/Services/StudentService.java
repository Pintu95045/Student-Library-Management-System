package AccioJob.Student.Library.Management.System.Services;

import AccioJob.Student.Library.Management.System.Entity.Student;
import AccioJob.Student.Library.Management.System.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(Student student) {

        studentRepository.save(student);
        return "Student has been Saved to the DB";
    }

    public List<Student> findStudents(String branch, double cgpa){

        List<Student> students = studentRepository.findStudentByBranchAndCgpaGreaterThan(branch,cgpa);
        return students;
    }

}