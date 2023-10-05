package Practice15.task1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LabExample extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JTextField oper = new JTextField(1);

    JButton button = new JButton(" Add themup");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    //начало конструктора класса
    LabExample() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 150);
        // создаем надпись 1
        add(new JLabel("1st Number"));
        // добавляем текстовое поле jta1
        add(jta1);
        // создаем надпись 2
        add(new JLabel("2nd Number"));
        // добавляем текстовое поле jta2
        add(jta2);
        add(new JLabel("Operation"));
        // добавляем текстовое поле jta2
        add(oper);
        // добавляем кнопку
        add(button);
//добавляем слушателя к кнопке
        button.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent e) {
                try {
//переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    //переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    String op = oper.getText().trim();
                    //создаем всплывающее окно INFORMATION_MESSAGE
                    if (op.equals("+"))
                        JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                    else if (op.equals("-"))

                        JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                    else if (op.equals("*"))

                        JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                    else if (op.equals("/"))

                        JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception exception) {
//создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });// конец button.addActionListener();\
        setVisible(true);
    } // конец конструктора




    public static void main(String[] args) {
        new LabExample();
    } // конец main()
} // конец класса LabExample
