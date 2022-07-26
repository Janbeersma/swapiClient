package domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The class for person objects that get returned from the swapi.dev api, implements the Person interface.
 * @see domain.Person
 * <p>
 * @implNote in the interface there where a couple of mistakes: the api doesn't return an id, height and mass need to be float values they where int.
 * </p>
 * <p>
 * List of films was given in the interface but the API doesn't return a list of Films rather a list of strings with the strings being urls to the films
 * </p>
 * @author Florian.Romijn
* */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConcretePerson implements Person{

    private long id;
    private String name;
    private String birth_year;
    private Gender gender;
    private float height;
    private float mass;
    private List<String> films;

    @JsonCreator
    public ConcretePerson() {

    }

    public ConcretePerson(long id, String name, String birth_year, Gender gender, float heigth, float mass, List<String> films) {
        this.id = id;
        this.name = name;
        this.birth_year = birth_year;
        this.gender = gender;
        this.height = heigth;
        this.mass = mass;
        this.films = films;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBirthYear() {
        return birth_year;
    }
    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public float getMass() {
        return mass;
    }

    @Override
    public List<String> getFilms() {
        return films;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setMass(Float mass) {
        this.mass = mass;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

}
