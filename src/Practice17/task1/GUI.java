package Practice17.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    int WINDOW_WIDTH = 400;
    int WINDOW_HEIGHT = 200;
    JPanel panel;
    JLabel name;
    JLabel rollNo;
    JButton btn;

    GUI(){
        super("Some shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(200, 200);
        setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        add(panel);
        addButton();
        addText();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    private void addText() {
        name = new JLabel("---");
        rollNo = new JLabel("---");
        panel.add(name);
        panel.add(rollNo);
    }

    private void addButton() {
        btn = new JButton("Поменять студента");
        panel.add(btn);

    }

    public void updateView(String name, String rollNo) {
        this.name.setText(name);
        this.rollNo.setText(rollNo);
    }
    public void addGenerateButtonListener(ActionListener listener) {
        btn.addActionListener(listener);
    }


}
