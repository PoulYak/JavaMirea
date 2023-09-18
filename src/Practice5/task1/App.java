package Practice5.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App {
    JFrame frame;
    JPanel panel;
    JButton button1;
    JButton button2;
    JLabel label1;
    JLabel label2;
    Label label3;

    int mad_score = 0;
    int real_score = 0;


    public App() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(170, 300));
        button1 = new JButton("AC Milan");
        button2 = new JButton("Real Madrid");
        button1.addActionListener(e -> {
            press_button(button1.getText());
        });
        button2.addActionListener(e -> {
            press_button(button2.getText());
        });
        panel.add(button1);
        panel.add(button2);
        label1 = new JLabel("Result 0 X 0", JLabel.CENTER);
        label1.setPreferredSize(new Dimension(170, 20));
        label2 = new JLabel("Last Scorer: N/A");
        label3 = new Label("Winner: DRAW");
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }

    public void press_button(String team){
        if (team.equals("AC Milan")){
            this.mad_score++;
        }else if (team.equals("Real Madrid")){
            this.real_score++;
        }
        label1.setText(String.format("Result: %1$d X %2$d", this.mad_score, this.real_score));
        label2.setText(String.format("Last Scorer: %s", team));
        label3.setText(String.format("Winner: %s", (this.real_score==this.mad_score?"DRAW":(this.real_score>this.mad_score?"Real Madrid":"AC Milan"))));
    }



    public static void main(String[] args) {
        App app = new App();
    }
}
