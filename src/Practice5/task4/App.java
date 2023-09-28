package Practice5.task4;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import java.util.Objects;


public class App extends JFrame {

    private JLabel imgLabel;
    private int imgNum = 1;

    private App(){
        this.setSize(1200, 1200);
        imgLabel = new JLabel("", new ImageIcon(Objects.requireNonNull(getClass().getResource("Capture1.PNG"))), SwingConstants.CENTER);

        getContentPane().add(imgLabel);

        Timer timer = new Timer(1000, e -> nextImg());
        timer.start();
    }
    private void nextImg(){
        imgLabel.setIcon(new ImageIcon(getClass().getResource("Capture"+(++imgNum)+".PNG")));
        if(imgNum == 4) imgNum = 0;
    }

    public static void main(String[] args) {
        App mf = new App();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);

    }
}
