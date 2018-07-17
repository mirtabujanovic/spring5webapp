package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * CRUD operations defined for the {@link Author} entity.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
