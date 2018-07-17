package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * CRUD operations defined for the {@link Book} entity.
*/

public interface BookRepository extends CrudRepository<Book, Long> {
}
