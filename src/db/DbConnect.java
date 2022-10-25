package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Peter Arnold
 * This class is used to create a JDBC 
 * connection with Oracle DB.
 */
public class DbConnect {
    private static String dbUrl = "jdbc:oracle:thin:@41.89.129.240:1521/pdb1";
    private static String dbUsername = "hr";
    private static String dbPassword = "hr";

    /**
     * @return Connetion to the database
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
    }
}
