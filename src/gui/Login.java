package gui;

import javax.swing.*;

import db.DbConnect;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class Login extends JFrame {
    private static JPanel panel = new JPanel();
    private static JLabel lbluser = new JLabel("Username: ");
    private static JLabel lblPass = new JLabel("Password: ");
    private static JTextField txtUser = new JTextField(30);
    private static JPasswordField txtPass = new JPasswordField();
    private static JButton btnLogin = new JButton("Login");
    private static JButton btnClear = new JButton("Clear");
    private static JButton btnCancel = new JButton("Cancel");

    public static void main(String[] args) throws Exception {
        Login login = new Login();
        login.setSize(350, 200);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setLocationRelativeTo(null);
        login.setTitle("Login");
        login.setVisible(true);

        // add swing components

        login.add(panel);

        panel.setLayout(null);

        lbluser.setBounds(10, 20, 80, 25);
        panel.add(lbluser);

        txtUser.setBounds(100, 20, 200, 25);
        panel.add(txtUser);

        lblPass.setBounds(10, 50, 80, 25);
        panel.add(lblPass);

        txtPass.setBounds(100, 50, 200, 25);
        panel.add(txtPass);

        btnLogin.setBounds(20, 100, 80, 25);
        panel.add(btnLogin);

        btnClear.setBounds(120, 100, 80, 25);
        panel.add(btnClear);

        btnCancel.setBounds(220, 100, 80, 25);
        panel.add(btnCancel);

        // login.pack();

        // add action listeners
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onlineLogin(e);
                // offlineLogin(e);
            }

        });
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                clearButton(e);
            }

        });
        btnCancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cancelButton(e);
            }

        });

    }

    /**
     * @param event
     *              Method
     */
    public static void cancelButton(ActionEvent event) {
        System.exit(ABORT);
    }

    /**
     * @param event
     */
    public static void clearButton(ActionEvent event) {
        txtUser.setText(null);
        txtPass.setText(null);
        txtUser.requestFocus();
    }

    /**
     * @param event
     */
    public static void onlineLogin(ActionEvent event) {
        String user = txtUser.getText().trim();
        String pwd = new String(txtPass.getPassword()).trim();
        String uname = "", passkey = "";
        char status = '\0';

        if (user.length() > 0 && pwd.length() > 0) {

            // Connect to database
            try {
                // create the connection object
                Connection conn = DbConnect.getConnection();
                if (conn != null) {
                    String sql = "SELECT * FROM AUTH WHERE USERNAME = '" + user + "'";

                    // create the statement object
                    Statement stmt = conn.createStatement();
                    // execute query
                    ResultSet rs = stmt.executeQuery(sql);
                    // retrieve data from resultset
                    while (rs.next()) {
                        uname = rs.getString(2);
                        passkey = rs.getString(3);
                        status = rs.getString(4).charAt(0);
                    }

                    if (user.compareTo(uname) == 0 && (pwd.compareTo(passkey) == 0) && status == 'Y') {
                        JOptionPane.showMessageDialog(null, "Login Success");
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password");
                    }
                }
                conn.close();
            }

            catch (SQLException e) {
                System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fill in the username and password!");
            txtUser.requestFocus();
        }

    }

    public static void offlineLogin(ActionEvent event) {
        HashMap<String, String> credentials = new HashMap<String, String>();
        credentials.put("sarah", "FluffyP0nie!");
        credentials.put("arnold", "AloeVera?");
        credentials.put("coolguy", "Swag;-)");

        String user = txtUser.getText().trim();
        String pwd = new String(txtPass.getPassword()).trim();
        

        if (user.length() > 0 && pwd.length() > 0 && credentials.size() > 0) {

            if (credentials.containsKey(user) && credentials.containsValue(pwd)) {
                JOptionPane.showMessageDialog(null, "Login Success");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
            }

        }

    }
}
