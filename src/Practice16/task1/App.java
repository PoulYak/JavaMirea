package Practice16.task1;


import Practice16.classwork.ShortCut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App extends JFrame {
    JPanel pan;
    JTextArea ta;
    JButton btn;
    JPanel panWEST = new JPanel();
    JPanel panEAST = new JPanel();
    JPanel panNORTH = new JPanel();
//    GridBagConstraints gbc;


    int numberGuessed = (int)(Math.random()*21);
    int numberOfAttempt = 0;
    App parent = this;


    public App() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        gbc = new GridBagConstraints();
        setSize(300, 200);
        initPanel();
        initTA();
        initButton();
        initGeoPans();
        JOptionPane.showMessageDialog(this, "Угадайте число от 0 до 20, у вас будет 3 попытки");


    }

    private void initGeoPans() {
//        panWEST.setBackground(Color.BLUE);
//        pan.add(panWEST, BorderLayout.WEST);
//        panWEST.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                JOptionPane.showMessageDialog(parent, "Добро пожаловать в ЗАО");
//
//            }
//        });
//        panNORTH.setBackground(Color.PINK);
//        panNORTH.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                JOptionPane.showMessageDialog(parent, "Добро пожаловать в САО");
//            }
//        });
//        pan.add(panNORTH, BorderLayout.NORTH);
//        panEAST.setBackground(Color.BLUE);
//        panEAST.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                JOptionPane.showMessageDialog(parent, "Добро пожаловать в ВАО");
//
//            }
//        });

        pan.add(panEAST, BorderLayout.EAST);

    }

    private void initButton() {
        btn = new JButton("Отправить");
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    int yourText = Integer.parseInt(ta.getText());
                    String t =  String.format("Ваше число: %1$d\n", yourText);
                    if (numberGuessed==yourText)
                        t+="Вы угадали число, поздравляю";
                    else{
                        if (numberOfAttempt>=2)
                            t = "Попытки закончились, к сожалению вы не угадали число "+numberGuessed;
                        else {
                            if (numberGuessed>yourText)
                                t+="Загаданное число больше";
                            else
                                t+="Загаданное число меньше";
                        }
                    }



                    numberOfAttempt++;
                    JOptionPane.showMessageDialog(parent,t);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(parent,"Вы ввели какое-то плохое число");

                }

            }
        });
//        btn.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                JOptionPane.showMessageDialog(parent, "Добро пожаловать в ЮАО");
//
//            }
//        });
        pan.add(btn, BorderLayout.SOUTH);


    }

    private void initTA() {
        ta = new JTextArea(4, 15);
        ta.setBackground(Color.GREEN);
        ta.setMargin(new Insets(10, 10, 10, 10));
        pan.add(ta, BorderLayout.CENTER);
//        ta.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                JOptionPane.showMessageDialog(parent, "Добро пожаловать в ЦАО");
//
//            }
//        });


    }

    private void initPanel() {
        pan = new JPanel();
        add(pan);
        pan.setLayout(new BorderLayout());

        pan.setBackground(Color.RED);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new App();
            ex.setVisible(true);
        });
    }



}
