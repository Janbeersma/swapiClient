package service;

import domain.ConcretePerson;
import domain.Person;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ConcretePersonservice implements PersonService{

    private static final String GET_ALL_PERSONS_URI = "https://swapi.dev/api/people";
    private static final String GET_PERSON_BY_ID_URI = "https://swapi.dev/api/people/";
    static RestTemplate restTemplate = new RestTemplate();

    /*@Override
    public void DisplayAllPersonsFromAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        ResponseEntity<String> result = restTemplate.exchange(GET_ALL_PERSONS_URI, HttpMethod.GET, entity, String.class);
        System.out.println(result);
    }*/

    /**
     * Searches for persons.
     *
     * @param query the query string
     * @return the list of persons
     */
    @Override
    public List<Person> search(String query) {
        return null;
    }

    /**
     * Returns the person with the provided id.
     *
     * @param id the id of the person
     * @return the person
     */

    @Override
    public Optional<Person> get(long id) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        Optional<Person> optPerson = Optional.ofNullable(restTemplate.getForObject(GET_PERSON_BY_ID_URI + id,ConcretePerson.class));
        return optPerson;
    }
}
