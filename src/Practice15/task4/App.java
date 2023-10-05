package Practice15.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {

    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton zero = new JButton("0");

    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton equal = new JButton("=");
    JButton divide = new JButton("/");
    JButton product = new JButton("*");
    JButton dot = new JButton(".");




    public App(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        TextArea ta = new TextArea();
        ta.setSize(new Dimension(400, 50));
        setLayout(new BorderLayout());
        add(ta, BorderLayout.NORTH);
        ta.setFont(new Font("MS Sans Serif", Font.BOLD, 20));

        ta.setEditable(false);
        Container container = new Container();
        container.setLayout(new GridLayout(4, 4, 5, 5));
        setSize(new Dimension(400, 600));
        container.add(seven);
        container.add(eight);
        container.add(nine);
        container.add(divide);
        container.add(four);
        container.add(five);
        container.add(six);
        container.add(product);
        container.add(one);
        container.add(two);
        container.add(three);
        container.add(minus);
        container.add(zero);
        container.add(dot);
        container.add(equal);
        container.add(plus);
        add(container);
        setVisible(true);

        for (JButton b: new JButton[]{one, two, three, four, five, six, seven, eight, nine, zero, minus, plus, divide, product, dot, equal}){
            b.addActionListener(actionEvent -> {
                ta.setText(ta.getText()+((JButton)actionEvent.getSource()).getText());
            });
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new App();
            ex.setVisible(true);
        });
    }
}
