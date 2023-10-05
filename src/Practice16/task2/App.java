package Practice16.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (((JMenuItem)actionEvent.getSource()).getText().equals("Times New Roman"))
                ta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            else if (((JMenuItem)actionEvent.getSource()).getText().equals("MS Sans Serif"))
                ta.setFont(new Font("MS Sans Serif", Font.PLAIN, 20));
            else if (((JMenuItem)actionEvent.getSource()).getText().equals("Courier New"))
                ta.setFont(new Font("Courier New", Font.PLAIN, 20));
            else if (((JMenuItem)actionEvent.getSource()).getText().equals("Красный"))
                ta.setForeground(Color.RED);
            else if (((JMenuItem)actionEvent.getSource()).getText().equals("Синий"))
                ta.setForeground(Color.BLUE);
            else if (((JMenuItem)actionEvent.getSource()).getText().equals("Черный"))
                ta.setForeground(Color.BLACK);
        }
    };
    JTextArea ta = new JTextArea();
    public App() {
        addMenu();
        addTextArea();
        setSize(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addTextArea() {
        add(ta);
        ta.setFont(new Font("Courier New", Font.PLAIN, 20));
        JScrollPane pane = new JScrollPane(ta);
        add(pane);
    }

    private void addMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Меню");
        menuBar.add(menu);
        JMenu colorMenu = new JMenu("Цвет");
        JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem menuItemBlue = new JMenuItem("Синий");
        JMenuItem menuItemRed = new JMenuItem("Красный");
        JMenuItem menuItemBlack = new JMenuItem("Черный");
        colorMenu.add(menuItemBlack);
        colorMenu.add(menuItemBlue);
        colorMenu.add(menuItemRed);
        JMenuItem menuItemRoman = new JMenuItem("Times New Roman");
        JMenuItem menuItemMS = new JMenuItem("MS Sans Serif");
        JMenuItem menuItemCourier = new JMenuItem("Courier New");
        fontMenu.add(menuItemRoman);
        fontMenu.add(menuItemMS);
        fontMenu.add(menuItemCourier);

        menuItemMS.addActionListener(al);
        menuItemBlack.addActionListener(al);
        menuItemBlue.addActionListener(al);
        menuItemRed.addActionListener(al);
        menuItemRoman.addActionListener(al);
        menuItemCourier.addActionListener(al);

        menu.add(colorMenu);
        menu.add(fontMenu);
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new App();
            ex.setVisible(true);
        });
    }
}
