package domain;

import java.util.List;

public interface Containable {

    public int getCount();

    public String getNext();

    public String getPrevious();

    public List<ConcretePerson> getResults();
}
