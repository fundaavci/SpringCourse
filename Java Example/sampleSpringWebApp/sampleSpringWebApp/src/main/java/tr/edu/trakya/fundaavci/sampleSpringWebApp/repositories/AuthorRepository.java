package tr.edu.trakya.fundaavci.sampleSpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.fundaavci.sampleSpringWebApp.domain.Author;

public interface AuthorRepository extends CrudRepository <Author,Long>{
}
