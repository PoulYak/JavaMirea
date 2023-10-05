package Practice16.classwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTextField = new JTextField(15);

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageTextField = new JTextField(3);

        JButton submitButton = new JButton("Submit");

        // Add components to the panel using GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(nameLabel, gbc);

        gbc.gridx = 1;
        panel.add(nameTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(ageLabel, gbc);

        gbc.gridx = 1;
        panel.add(ageTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // Make the button span two columns
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(submitButton, gbc);

        // Add an ActionListener to the Submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String age = ageTextField.getText();
                JOptionPane.showMessageDialog(frame, "Name: " + name + "\nAge: " + age);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
