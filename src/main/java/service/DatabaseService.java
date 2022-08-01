package service;
import java.sql.Connection;

public interface DatabaseService {

    public void insertIntoDB(String query);

    public void getFromDB();

    public String deleteFromDB(int id);
}
