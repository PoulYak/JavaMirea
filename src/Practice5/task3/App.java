package Practice5.task3;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Objects;

public class App extends JFrame {
    private int width = 500;
    private int height = 500;
    private Image img;

    public App(){
        this.setSize(width, height);
        setTitle("Picture from url");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    public void loadImage(String src){
        img = new ImageIcon(src).getImage();
    }

    public void showImage(){
        Graphics g = getGraphics();
        g.drawImage(img, 0, 0, width, height, null);
    }


    public static void main(String[] args) {
        App app = new App();
        if (args.length>0)
            app.loadImage(args[0]);
        else
            app.loadImage("C:\\Users\\pavli\\Desktop\\programming\\Samsung\\Java Programming\\src\\Practice5\\task3\\wallhaven-n6rgrq.png");
        app.showImage();
    }
}
