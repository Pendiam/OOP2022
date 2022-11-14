package leo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    private static String dbUrl = "jdbc:sqlite:StudentDB.db";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl);
    }
}
