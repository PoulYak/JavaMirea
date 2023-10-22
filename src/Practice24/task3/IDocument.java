package Practice24.task3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public abstract class IDocument extends JFrame {
    JPanel instrumentPanel;
    JFrame parent = this;

    JPanel mainPanel;
    JLabel filename;
    JMenuBar menuBar;
    JMenuItem menuItemNew;
    JMenuItem menuItemOpen;

//    ActionListener al = actionEvent -> {
//        if (((JMenuItem)actionEvent.getSource()).getText().equals("New")){
//
//        }
//        else if (((JMenuItem)actionEvent.getSource()).getText().equals("Open")){
//
//        }
//
//    };
    public IDocument() {
        super("XXX");
        addMenu();
        addInstrumentPanel();
        addLabel();
        setSize(1200, 800);
        setResizable(false);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void addLabel() {
        filename = new JLabel("File.file");
        JPanel tempPanel = new JPanel();
        tempPanel.setLayout(new FlowLayout());
        tempPanel.setBackground(new Color(204, 229, 255));
        tempPanel.add(filename);
        mainPanel.add(tempPanel, BorderLayout.NORTH);
    }

    private void addInstrumentPanel(){
        JButton btn = new JButton("+");
        btn.setBackground(Color.PINK);
        btn.setPreferredSize(new Dimension(40, 40));
        btn.setMargin(new Insets(20, 0, 0, 0));
        mainPanel = new JPanel(new BorderLayout());
        instrumentPanel = new JPanel();
        instrumentPanel.setLayout(new BoxLayout(instrumentPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(new Color(204, 229, 255));
        instrumentPanel.setBackground(new Color(153, 204, 255));
        mainPanel.add(instrumentPanel, BorderLayout.WEST);

        instrumentPanel.add(btn);


        add(mainPanel);
    }


    private void addMenu() {
        menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        menuBar.add(menu);
        menuItemNew = new JMenuItem("New");
        menuItemOpen = new JMenuItem("Open");
        JMenuItem menuItemSave = new JMenuItem("Save");
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.addActionListener(actionEvent -> {
            JOptionPane.showMessageDialog(parent,"Уже уходишь?");
            System.exit(0);
        });

        menuItemExit.addActionListener(actionEvent -> {
            JOptionPane.showMessageDialog(parent,"Уже уходишь?");
            System.exit(0);
        });

        menu.add(menuItemNew);
        menu.add(menuItemOpen);
        menu.add(menuItemSave);
        menu.add(menuItemExit);

        setJMenuBar(menuBar);
    }

}
