package AccioJob.Student.Library.Management.System.Services;

import AccioJob.Student.Library.Management.System.Entity.Author;
import AccioJob.Student.Library.Management.System.Repositories.AuthorRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRespository authorRespository;
    public String addAuthor(Author author){

        author.setNoOfBooks(0);   //setting the default vale to 0
        authorRespository.save(author);
        return "Author has been saved to DB";

    }
}
