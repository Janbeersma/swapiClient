package domain;

import java.time.LocalDate;

/**
 * The domain class representing a Star Wars movie.
 * @deprecated is not even used by the personservice.
 * @author Florian.Romijn
 */
public interface Film {

    /**
     * Returns the title.
     *
     * @return the title
     */
    String getTitle();

    /**
     * Returns the episode number.
     *
     * @return the episode number
     */
    Integer getEpisode_id();

    /**
     * Returns the name of the person who directed the film.
     *
     * @return the name of the director
     */
    String getDirector();

    /**
     * The release date of the film.
     *
     * @return the release date
     */
    LocalDate getRelease_date();
}