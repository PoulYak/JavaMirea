package Practice12.task1;


import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    int method;

    App() {
        super("Some shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(200, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        this.method = 0;
    }


    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;

        if (this.method == 0)
            random_shapes_paint(20, g);


    }

    void random_shapes_paint(int shapeNumber, Graphics2D g) {
        for (int i = 0; i < shapeNumber; i++) {
            int choice = (int) (Math.random() * 3);
            int xCoord = (int) (Math.random() * WINDOW_WIDTH);
            int yCoord = (int) (Math.random() * WINDOW_HEIGHT);
            g.setColor(getRandomColor());
            int xSize = (int) ((Math.random() * 200)+20);
            int ySize = (int) ((Math.random() * 200)+20);
            switch (choice) {
                case 0:
                    Circle circle = new Circle((double) xSize /2);
                    g.fillOval(xCoord, yCoord, (int) circle.getR(), (int) circle.getR());

                    break;
                case 1:
                    Rectangle rectangle = new Rectangle(xSize, ySize);
                    g.fillRect(xCoord, yCoord, (int) rectangle.getA(), (int) rectangle.getB());
                    break;
                case 2:
                    Square square = new Square(xSize);
                    g.fillRect(xCoord, yCoord, (int)square.getA(), (int)square.getA());
                    break;

                default:
                    break;
            }
        }
    }

    Color getRandomColor() {
        return new Color((int) (Math.random() * 0x1000000));
    }

    // Start app
    public static void main(String[] args) {
        App app = new App();
    }
}