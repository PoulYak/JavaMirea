package Practice12.classwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NullLayout extends JFrame {
    JButton but1 = new JButton("One");
    JButton but2 = new JButton("two");
    JButton but3 = new JButton("three");

    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("open");
    JMenuItem b1 = new JMenuItem("smth");

    public NullLayout() {
        setLayout(null);
        but1.setBounds(150, 300, 100, 20);
// добаволяем 150,300 ширина = 100, высота =20
        but2.setSize(80, 400);
// добавляем к 0,0 ширина = 80, высота =400
        but3.setLocation(300, 100);
        but3.setSize(200, 75);
// those two steps can be combined in onesetBounds method call
        add(but1);
        add(but2);
        add(but3);
        setSize(500, 500);
        menu.add(b1);
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        new NullLayout().setVisible(true);
    }
}