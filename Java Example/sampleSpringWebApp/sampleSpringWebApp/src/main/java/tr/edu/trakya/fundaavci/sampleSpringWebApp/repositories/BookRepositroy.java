package tr.edu.trakya.fundaavci.sampleSpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.fundaavci.sampleSpringWebApp.domain.Book;
public interface BookRepositroy extends CrudRepository <Book,Long> {
}
