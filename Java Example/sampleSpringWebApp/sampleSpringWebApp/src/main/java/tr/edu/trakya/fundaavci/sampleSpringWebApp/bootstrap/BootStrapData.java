package tr.edu.trakya.fundaavci.sampleSpringWebApp.bootstrap;
import org.springframework.stereotype.Component;
import tr.edu.trakya.fundaavci.sampleSpringWebApp.domain.Author;
import tr.edu.trakya.fundaavci.sampleSpringWebApp.domain.Book;
import tr.edu.trakya.fundaavci.sampleSpringWebApp.repositories.AuthorRepository;
import tr.edu.trakya.fundaavci.sampleSpringWebApp.repositories.BookRepositroy;
@Component
public class BootStrapData {

    private final AuthorRepository authorRepository;
    private final BookRepositroy bookRepositroy;

    public BootStrapData(AuthorRepository authorRepository, BookRepositroy bookRepositroy) {
        this.authorRepository = authorRepository;
        this.bookRepositroy = bookRepositroy;
    }

    @Override
    public void run(String... args) throws Exception{
        Author eric=new Author("Eric","Evas");
        Book ddd =new Book (title:"Domain Driven Design",isbn:"123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepositroy.save(ddd);
        System.out.println("Started in Bootstrap");
        System.out.println("Number of books:" +bookRepositroy.count());

    }
}
