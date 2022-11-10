package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Peter Arnold
 *         This class is used to create a JDBC
 *         connection with Oracle DB.
 */
public class DbConnect {
    private static String dbUrl = Env.get("DB_URL");
    private static String dbUsername = Env.get("DB_USER");
    private static String dbPassword = Env.get("DB_PASS");

    /**
     * @return Connetion to the database
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
    }
}
