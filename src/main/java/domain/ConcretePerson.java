package domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConcretePerson implements Person{

    private long id;
    private String name;
    private String birth_year;
    private Gender gender;
    private Integer heighth;
    private Integer weigth;
    private List<ConcreteFilm> films;

    @JsonCreator
    public ConcretePerson() {

    }

    public ConcretePerson(long id, String name, String birth_year, Gender gender, Integer heighth, Integer weigth, List<ConcreteFilm> films) {
        this.id = id;
        this.name = name;
        this.birth_year = birth_year;
        this.gender = gender;
        this.heighth = heighth;
        this.weigth = weigth;
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
    public Integer getHeight() {
        return heighth;
    }

    @Override
    public Integer getWeight() {
        return weigth;
    }

    @Override
    public List<ConcreteFilm> getFilms() {
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

    public Integer getHeighth() {
        return heighth;
    }

    public void setHeighth(Integer heighth) {
        this.heighth = heighth;
    }

    public Integer getWeigth() {
        return weigth;
    }

    public void setWeigth(Integer weigth) {
        this.weigth = weigth;
    }

    public void setFilms(List<ConcreteFilm> films) {
        this.films = films;
    }
}
