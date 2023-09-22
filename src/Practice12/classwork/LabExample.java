package Practice12.classwork;

import javax.swing.*;
import java.awt.*;

class LabExample extends JFrame {
    JTextField jta = new JTextField(10);
    //можно задать свойства шрифта
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    LabExample() {
// вызываем конструктор родителя JFrame super("Example");
//устанавливаем менеджер компоновки FlowLayout setLayout(new FlowLayout());
//устанавливаем размеры окна
        setSize(250, 100);
        //добавляем текстовое поле к окну
        add(jta);
//задаем цвет фона
        jta.setForeground(Color.PINK);
//задаем цвет шрифта
        jta.setFont(fnt);
        setVisible(true);
    }

    public static void main(String[] args) {
//вызываем конструктор класса LabExample
        new LabExample();
    }
}