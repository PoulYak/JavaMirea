package Practice15.task3;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame{
    JMenuBar jMenuBar = new JMenuBar();
    JMenu jMenuFile = new JMenu("File");
    JMenu jMenuEdit = new JMenu("Edit");
    JMenu jMenuHelp = new JMenu("Help");
    JMenuItem item1 = new JMenuItem("Save");
    JMenuItem item2 = new JMenuItem("Exit");
    JMenuItem item3 = new JMenuItem("Copy");
    JMenuItem item4 = new JMenuItem("Cut");
    JMenuItem item5 = new JMenuItem("Paste");
    JMenuItem item6 = new JMenuItem("Reference");
    JButton jButton1 = new JButton("Button1");
    JButton jButton2 = new JButton("Button2");


    public App() {
        setSize(200,100);
        setJMenuBar(jMenuBar);
        jMenuBar.add(jMenuFile);
        jMenuBar.add(jMenuEdit);
        jMenuBar.add(jMenuHelp);
        jMenuFile.add(item1);
        jMenuFile.add(item2);
        jMenuEdit.add(item3);
        jMenuEdit.add(item4);
        jMenuEdit.add(item5);
        jMenuHelp.add(item6);
        setLayout(new GridLayout(1, 2));
        add(jButton1);
        add(jButton2);
    }

    public static void main(String[] args) {
        new App().setVisible(true);
    }
}
