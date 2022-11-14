package leo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDemo {

    static Connection conn;

    public static void main(String[] args) {
        String uname;
        String passkey;

        try {
            conn = DbConnect.getConnection();
            if (conn != null) {
                System.out.println("Connected to the database!");
                String sql = "select username, password from users";
                Statement stm = conn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                while (rs.next()) {
                    uname = rs.getString(1);
                    passkey = rs.getString(2);

                    System.out.println("Username:" + uname);
                    System.out.println("Password:" + passkey);
                }

            }
            
            conn.close();

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
