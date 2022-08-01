package service;

import java.sql.*;

/**
 * Class that implements the database service and can instantiate a database object
 * that can be used to insert, get and delete database entries
 */
public class ConcreteDatabaseService implements DatabaseService {

    String jdbcDriver = "org.postgresql.Driver";
    String dbUrl = "jdbc:postgresql://localhost:5432/postgres";

    final String username = "postgres";
    final String password = "123";
    Connection connection = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;

    /**
     * Function for inserting search entries into the database
     * @param query
     *
     */
    @Override
    public void insertIntoDB(String query) {
        try {
            Class.forName(jdbcDriver);
            System.out.println("Connecting to the database");
            connection = DriverManager.getConnection(dbUrl, username, password);
            String sql = "INSERT INTO api_analytics(searched_query)" + "VALUES(?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, query);
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Function for gettin all the rows from the database
     *
     */
    @Override
    public void getFromDB() {
        try {
            Class.forName(jdbcDriver);
            System.out.println("Connecting to the database");
            connection = DriverManager.getConnection(dbUrl, username, password);
            String sql = "SELECT * FROM api_analytics";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while ( rs.next() ) {

                int id = rs.getInt("id");

                Timestamp ts = rs.getTimestamp("created_at");

                String searched_query  = rs.getString("searched_query");

                System.out.printf( "id = %s , timestamp = %s, searched_query = %s ", id,ts,searched_query );

                System.out.println();

            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * function for removing an entry from the database
     * @param id
     * @return
     */
    @Override
    public String deleteFromDB(int id) {
        try {
            Class.forName(jdbcDriver);
            System.out.println("Connecting to the database");
            connection = DriverManager.getConnection(dbUrl, username, password);
            String sql = "DELETE FROM api_analytics WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
