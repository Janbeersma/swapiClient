package service;

import java.util.List;
import java.util.Optional;

import domain.ConcretePerson;
import domain.Person;

/**
 * The person service to search and retrieve persons.
 *
 * @author QNH
 */
public interface PersonService {
    /**
     * Searches for persons.
     *
     * @param query the query string
     * @return the list of persons
     */
    List<ConcretePerson> search(String query);

    /**
     * Returns the person with the provided id.
     *
     * @param id the id of the person
     * @return the person
     */
    Optional<Person> get(long id);
}
