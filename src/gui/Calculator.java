package gui;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {

  int val1;
  int val2;
  int sum = 0;
  int num = 0;
  JTextField t1 = new JTextField(10);

  JButton b1 = new JButton("+");
  JButton b2 = new JButton("*");
  JButton b3 = new JButton("/");
  JButton b4 = new JButton("=");
  int n1, n2;

  public Calculator() {
    setLayout(new FlowLayout());
    setVisible(true);
    setSize(500, 500);
    JLabel l1 = new JLabel("Result");

    add(l1);
    add(t1);
    add(b1);
    add(b2);
    add(b3);
    add(b4);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

  }

  public void actionPerformed(ActionEvent e) {

    String[] a = { "+", "*", "/" };
    if (e.getSource() == b1) {
      val1 = Integer.parseInt(t1.getText());
      t1.setText("");
      b4.addActionListener(this);
    } else if (e.getSource() == b2) {
      val1 = Integer.parseInt(t1.getText());
      t1.setText("");
      num = 1;
      b4.addActionListener(this);
    } else if (e.getSource() == b3) {
      val1 = Integer.parseInt(t1.getText());
      t1.setText("");
      num = 2;
      b4.addActionListener(this);
    } else if (e.getSource() == b4) {
      val2 = Integer.parseInt(t1.getText());

      switch (a[num]) {
        case "+":
          sum = val1 + val2;
          System.out.println(val1 + val2);
          t1.setText(sum + "");
          break;
        case "*":
          sum = val1 * val2;
          System.out.println(val1 * val2);
          t1.setText(sum + "");
          break;
        case "/":
          sum = val1 / val2;
          System.out.println(val1 / val2);
          t1.setText(sum + "");
          break;
      }
      b4.removeActionListener(this);
      val1 = 0;
      val2 = 0;
    }
  }
}

class answer4 {
  public static void main(String[] args) {
    Calculator p = new Calculator();
    p.setVisible(true);
  }
}
