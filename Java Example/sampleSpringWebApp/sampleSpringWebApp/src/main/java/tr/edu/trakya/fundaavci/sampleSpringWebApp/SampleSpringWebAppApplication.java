package tr.edu.trakya.fundaavci.sampleSpringWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.edu.trakya.fundaavci.sampleSpringWebApp.domain.Author;
import tr.edu.trakya.fundaavci.sampleSpringWebApp.domain.Book;

@SpringBootApplication
public class SampleSpringWebAppApplication {

	public static void main(String[] args) {
		Author author = new Author();
		author.setFirstName("Ali");
		author.setLastName("Duru");

		Book book =new Book();

		SpringApplication.run(SampleSpringWebAppApplication.class, args);
	}

}
