package Practice16.task3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {

    Database database;
    JPanel panel = new JPanel(new GridBagLayout());
    JLabel serviceLabel = new JLabel("Service:");
    JLabel usernameLabel = new JLabel("User name:");
    JLabel passwordLabel = new JLabel("Password:");
    JTextField serviceTextField = new JTextField(25);
    JTextField usernameTextField = new JTextField(25);
    JTextField passwordTextField = new JTextField(25);

    App parent = this;

    KeyListener keyListener = new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode()==KeyEvent.VK_ENTER){
                String tService = serviceTextField.getText().trim();
                String tUsername = usernameTextField.getText().trim();
                String tPassword = passwordTextField.getText().trim();
                if (database.check(tService, tUsername, tPassword)) {
                    passwordTextField.setBackground(Color.WHITE);
                    usernameTextField.setBackground(Color.WHITE);
                    serviceTextField.setBackground(Color.WHITE);
                    JOptionPane.showMessageDialog(parent, "Поздравляю, вы успешно вошли");

                }
                else {
                    passwordTextField.setBackground(Color.PINK);
                    usernameTextField.setBackground(Color.PINK);
                    serviceTextField.setBackground(Color.PINK);
                    JOptionPane.showMessageDialog(parent, "Неправильно");
                }
            }

        }
    };


    public App() {
        super("Password application");
        database = new Database();
        fillDatabase();
        placeComponents();
        addListeners();
        setVisible(true);
    }

    private void addListeners() {
        panel.addKeyListener(keyListener);
        serviceTextField.addKeyListener(keyListener);
        usernameTextField.addKeyListener(keyListener);
        passwordTextField.addKeyListener(keyListener);
    }

    private void placeComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 200);

        GridBagConstraints gbc = new GridBagConstraints();

        // Add components to the panel using GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(serviceLabel, gbc);
        gbc.gridx = 1;
        panel.add(serviceTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(usernameLabel, gbc);

        gbc.gridx = 1;
        panel.add(usernameTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        panel.add(passwordTextField, gbc);
        add(panel);

    }

    private void fillDatabase() {
        database.add("google.com", "poulyak", "1234");
        database.add("vk.com", "poulyak", "1234");
        database.add("t.me", "poulyak", "1234");
        database.add("facebook.com", "poulyak", "1234");
    }



    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new Practice16.task1.App();
            ex.setVisible(true);
        });
    }

}

