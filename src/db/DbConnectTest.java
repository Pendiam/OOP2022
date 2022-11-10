package db;

import java.sql.Connection;
import java.sql.SQLException;

public class DbConnectTest {
    static Connection conn;
    public static void main(String[] args) {

        try {
            conn = DbConnect.getConnection();
            if (conn != null) {
                System.out.println("Connected to the database!");
            } 
            conn.close();

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
