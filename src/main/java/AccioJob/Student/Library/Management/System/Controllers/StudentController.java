package AccioJob.Student.Library.Management.System.Controllers;

import AccioJob.Student.Library.Management.System.Entity.Student;
import AccioJob.Student.Library.Management.System.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/student")
    public class StudentController {

        @Autowired
        private StudentService studentService;

        @PostMapping("/add")
        public String addStudent(@RequestBody Student student) {

            String result = studentService.addStudent(student);
            return result;
        }

        @GetMapping("/getTopperStudents")
        public List<Student> getStudents(@RequestParam("branch") String branch,
                                         @RequestParam("cgpa") double cgpa) {

            List<Student> ansList = studentService.findStudents(branch, cgpa);
            return ansList;
        }

    }