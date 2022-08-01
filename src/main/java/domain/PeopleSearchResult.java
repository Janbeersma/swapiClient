package domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


/**
 * 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class PeopleSearchResult implements Containable{

    private int count;
    private String next;
    private String previous;
    private List<ConcretePerson> results;

    public PeopleSearchResult(int count, String next, String previous, List<ConcretePerson> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public PeopleSearchResult() {}

    /**
     * @return
     */
    @Override
    public int getCount() {
        return count;
    }

    /**
     * @return
     */
    @Override
    public String getNext() {
        return next;
    }

    /**
     * @return
     */
    @Override
    public String getPrevious() {
        return previous;
    }

    /**
     * @return
     */
    @Override
    public List<ConcretePerson> getResults() {
        return results;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public void setResults(List<ConcretePerson> results) {
        this.results = results;
    }
}
