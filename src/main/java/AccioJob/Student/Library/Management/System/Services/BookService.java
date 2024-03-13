package AccioJob.Student.Library.Management.System.Services;

import AccioJob.Student.Library.Management.System.Entity.Author;
import AccioJob.Student.Library.Management.System.Entity.Book;
import AccioJob.Student.Library.Management.System.Exceptions.InvalidPageCountException;
import AccioJob.Student.Library.Management.System.Repositories.AuthorRespository;
import AccioJob.Student.Library.Management.System.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRespository authorRespository;

    public String addBook(Book book) throws Exception{
        if(book.getNoOfPages()<=0){
            throw new InvalidPageCountException("page count entered is incorrect");
        }
        bookRepository.save(book);
        return "Book has been saved to the DB";
    }
    public String associateBookAndAuthor(Integer bookId,Integer authorId) throws Exception{

        //Get the book from the bookId
        Optional<Book> bookOptional = bookRepository.findById(bookId);

        if(bookOptional.isEmpty()) {
            throw new Exception("BookId Entered is incorrect");
            //Throw an exception that book is not found
        }
        Book book = bookOptional.get();

        Optional<Author> optionalAuthor = authorRespository.findById(authorId);
        if(optionalAuthor.isEmpty()) {
            //thow an exception saying AuthorId entered is incorrect
            throw new Exception("AuthorId entered is incorrect");
        }
        Author author = optionalAuthor.get();

        //associate book and author Entity
        book.setAuthor(author);
        author.setNoOfBooks(author.getNoOfBooks()+1);

        bookRepository.save(book);
        authorRespository.save(author);
        return "Book and Author have been associated";
    }

    public List<Book> findBooksByAuthor(Integer authorId) {

        List<Book> allBooks = bookRepository.findAll();
        //I need to iterate where :
        //Book.getAuthor.getId is matching
        List<Book> ansList = new ArrayList<>();

        for(Book book:allBooks) {
            if(book.getAuthor().getAuthorId().equals(authorId)){
                ansList.add(book);
            }
        }
        return ansList;
    }
}
