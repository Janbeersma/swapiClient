package domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConcreteFilm implements Film {
    private String title;
    private Integer episode_id;
    private String director;
    private LocalDate release_date;

    public ConcreteFilm(String title, Integer episode_id, String director, LocalDate release_date) {
        this.title = title;
        this.episode_id = episode_id;
        this.director = director;
        this.release_date = release_date;
    }

    @JsonCreator
    public ConcreteFilm() {

    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Integer getEpisode_id() {
        return episode_id;
    }

    @Override
    public String getDirector() {
        return director;
    }

    @Override
    public LocalDate getRelease_date() {
        return release_date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEpisode_id(Integer episode_id) {
        this.episode_id = episode_id;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setRelease_date(LocalDate release_date) {
        this.release_date = release_date;
    }
}
