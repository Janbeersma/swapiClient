package domain;

import java.util.List;

/**
 * The domain class representing a Star Wars person.
 *
 * @author QNH
 */
public interface Person {

    /**
     * Returns the unique id of the person.
     *
     * @return the unique id of the person
     */
    long getId();

    /**
     * Retuns the name of the person.
     *
     * @return the name of the person
     */
    String getName();

    /**
     * Retuns the birth year of the person.
     *
     * @return the birth year of the person
     */
    String getBirthYear();

    /**
     * Retuns the gender of the person.
     *
     * @return the gender of the person
     */
    Gender getGender();

    /**
     * Retuns the height of the person in centimeters.
     *
     * @return the height of the person
     */
    String getHeight();

    /**
     * Retuns the weight of the person in kilograms.
     *
     * @return the weight of the person
     */
    String getMass();

    /**
     * Returns the films the person has been in.
     *
     * @return the films the person has been in
     */
    List<String> getFilms();
}
