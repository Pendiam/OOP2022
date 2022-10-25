package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

                loginButton(e);

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
    public static void loginButton(ActionEvent event) {
        String user = txtUser.getText();
        String pwd = new String(txtPass.getPassword());
        System.out.println("Username: " + user);
        System.out.println("Password: " + pwd);
        // JOptionPane.showMessageDialog(null, "Success");

    }

}
