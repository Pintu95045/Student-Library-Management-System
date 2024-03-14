package AccioJob.Student.Library.Management.System.Controllers;

import AccioJob.Student.Library.Management.System.Entity.Author;
import AccioJob.Student.Library.Management.System.Entity.Book;
import AccioJob.Student.Library.Management.System.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("add")
    public String addAuthor(@RequestBody Author author){

        String result = authorService.addAuthor(author);
        return result;
    }

    @GetMapping("/getAuthorWithMaxBooks")
    public Author getAuthor(){

        Author ansAuthor = authorService.getAuthorWithMaxBooks();
        return ansAuthor;
    }


}