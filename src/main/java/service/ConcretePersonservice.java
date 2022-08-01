package service;

import domain.ConcretePerson;
import domain.PeopleSearchResult;
import domain.Person;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

public class ConcretePersonservice implements PersonService{

    private static final String SEARCH_PERSONS_URI = "https://swapi.dev/api/people/?search=";
    private static final String GET_PERSON_BY_ID_URI = "https://swapi.dev/api/people/";
    static RestTemplate restTemplate = new RestTemplate();

    /**
     * Searches for persons.
     *
     * @param query the query string
     * @return the list of persons
     */
    @Override
    public List<ConcretePerson> search(String query) {
        PeopleSearchResult searchResult = null;
        ConcreteDatabaseService databaseService = new ConcreteDatabaseService();
        databaseService.insertIntoDB(query);
        try {
            searchResult = restTemplate.getForObject(SEARCH_PERSONS_URI + query, PeopleSearchResult.class);
        } catch (RestClientException e) {
            throw new RuntimeException(e);
        }
        List<ConcretePerson> persons = searchResult.getResults();
        return persons;
    }

    /**
     * Returns the person with the provided id.
     *
     * @param id the id of the person
     * @return the person
     */

    @Override
    public Optional<Person> get(long id) {
        Optional<Person> optPerson = null;
        try {
            optPerson = Optional.ofNullable(restTemplate.getForObject(GET_PERSON_BY_ID_URI + id, ConcretePerson.class));
        } catch (RestClientException e) {
            throw new RuntimeException(e);
        }
        return optPerson;
    }
}
