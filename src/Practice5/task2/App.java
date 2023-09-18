package Practice5.task2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class App extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    int method;

    // Init
    App() {
        super("Some shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        //setBackground(Color.BLACK);
        setLocation(200, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.method = 0;
    }


    // Paint method
    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;

        if (this.method==0)
            random_shapes_paint(50, g);


    }

    // Random shapes paint methid
    void random_shapes_paint(int shapes, Graphics2D g) {
        for (int i = 0; i < shapes; i++) {
            int choice = (int) (Math.random() * 3);

            switch (choice) {

                // Oval
                case 1:
                    g.setColor(getRandomColor());
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;

                // Rect
                case 2:
                    g.setColor(getRandomColor());
                    g.fillRect(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;

                default:
                    break;
            }
        }
    }

    Color getRandomColor(){
        return new Color((int) (Math.random() * 0x1000000));
    }

    // Start app
    public static void main(String[] args) {
        App app = new App();
    }
}