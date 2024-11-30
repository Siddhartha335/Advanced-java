package advanceSwingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonColorChange {

    public static void main(String[] args) {
        // Initialize the Swing components on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create the main frame (form container)
                JFrame frame = new JFrame("Color Change Form with Fields");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new GridLayout(4, 1, 10, 10)); // GridLayout to organize components

                // Create a panel for text fields and labels
                JPanel formPanel = new JPanel();
                formPanel.setLayout(new GridLayout(2, 2, 5, 5)); // 2 rows and 2 columns
                JLabel nameLabel = new JLabel("Enter Name:");
                JTextField nameField = new JTextField();
                JLabel emailLabel = new JLabel("Enter Email:");
                JTextField emailField = new JTextField();

                formPanel.add(nameLabel);
                formPanel.add(nameField);
                formPanel.add(emailLabel);
                formPanel.add(emailField);

                // Create buttons with captions "RED", "BLUE", "GREEN"
                JButton redButton = new JButton("RED");
                JButton blueButton = new JButton("BLUE");
                JButton greenButton = new JButton("GREEN");

                // Set buttons to be opaque so their background color is visible
                redButton.setOpaque(true);
                blueButton.setOpaque(true);
                greenButton.setOpaque(true);

                // Add ActionListener to the RED button to change its background to RED
                redButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        redButton.setBackground(Color.RED);  // Set background color to RED
                    }
                });

                // Add ActionListener to the BLUE button to change its background to BLUE
                blueButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        blueButton.setBackground(Color.BLUE); // Set background color to BLUE
                    }
                });

                // Add ActionListener to the GREEN button to change its background to GREEN
                greenButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        greenButton.setBackground(Color.GREEN); // Set background color to GREEN
                    }
                });

                // Add formPanel and buttons to the frame
                frame.add(formPanel);  // Add the panel containing text fields and labels
                frame.add(redButton);  // Add the "RED" button
                frame.add(blueButton); // Add the "BLUE" button
                frame.add(greenButton); // Add the "GREEN" button

                // Set the frame size and center it on the screen
                frame.setSize(400, 250);
                frame.setLocationRelativeTo(null); // Center the window on screen
                frame.setVisible(true); // Make the frame visible
            }
        });
    }
}
