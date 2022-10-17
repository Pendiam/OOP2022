package gui;

import javax.swing.JOptionPane;

public class Numbers {
    public static void main(String[] args) {
        String s;
        int num1 = 0, num2 = 0, sum = 0;
        s = JOptionPane.showInputDialog(null, "Enter first number");
        num1 = Integer.parseInt(s);
        s = JOptionPane.showInputDialog(null, "Enter second number");
        num2 = Integer.parseInt(s);

        sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "The sum is: " + sum);

    }
}
