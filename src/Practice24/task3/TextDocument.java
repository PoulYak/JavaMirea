package Practice24.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextDocument extends IDocument{
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
    JTextArea ta;

    public TextDocument() {
        super();
        addTextArea();
        addButtons();
        increaseMenu();
        setUpMenuItems();
    }

    private void setUpMenuItems() {
        menuItemNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                EventQueue.invokeLater(() -> {
                    var ex = new CreateTextDocument().CreateNew();
                    ex.setVisible(true);
                });

            }
        });
        menuItemOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                EventQueue.invokeLater(() -> {
                    var ex = new CreateTextDocument().CreateOpen();
                    ex.setVisible(true);
                });
            }
        });
    }

    private void addButtons(){
        addIntrumentsButton("\uD83D\uDD0F");
        addIntrumentsButton("\uD83D\uDD8B");
        addIntrumentsButton("\uD83D\uDD24");
        addIntrumentsButton("\uD83D\uDD0D");
    }
    private void addIntrumentsButton(String text) {
        JButton fontBtn = new JButton(text);
        fontBtn.setPreferredSize(new Dimension(40, 40));
        fontBtn.setMargin(new Insets(20, 0, 0, 0));

        instrumentPanel.add(fontBtn);
    }

    private void addTextArea() {
        ta = new JTextArea();
        ta.setMargin(new Insets(20, 20, 20, 20));
        ta.setFont(new Font("Courier New", Font.PLAIN, 20));
        JScrollPane pane = new JScrollPane(ta);
        mainPanel.add(pane, BorderLayout.CENTER);
    }

    private void increaseMenu() {
        JMenu menu = new JMenu("Settings");
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
            var ex = new TextDocument();
            ex.setVisible(true);
        });
    }
}
