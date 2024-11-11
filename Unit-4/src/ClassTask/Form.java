package ClassTask;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Form extends JFrame implements ActionListener {
    // Declare GUI components
    JLabel idlbl, namelbl, emaillbl, addresslbl;
    JTextField idtxt, nametxt, emailtxt, addresstxt;
    JButton addbtn;

    private Database db;  // Assuming you have a Database class for managing the DB connection

    public Form() {
        // Set up the JFrame
        setTitle("Student Registration Form");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 5, 5));  // GridLayout for form structure

        // Initialize the labels and text fields
        idlbl = new JLabel("Student Id:");
        namelbl = new JLabel("Student Name:");
        emaillbl = new JLabel("Student Email:");
        addresslbl = new JLabel("Student Address:");
        idtxt = new JTextField(20);
        nametxt = new JTextField(20);
        emailtxt = new JTextField(20);
        addresstxt = new JTextField(20);

        // Initialize the button and add action listener
        addbtn = new JButton("Add Student");
        addbtn.addActionListener(this);  // Register the button click event handler

        // Add components to the frame
        add(idlbl);
        add(idtxt);
        add(namelbl);
        add(nametxt);
        add(emaillbl);
        add(emailtxt);
        add(addresslbl);
        add(addresstxt);
        add(new JLabel());  // Empty space
        add(addbtn);

        // Frame setup
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Initialize database connection
        db = new Database();  // Assuming this class manages DB connection
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Retrieve user input and insert into database
        if (e.getSource() == addbtn) {
            String id = idtxt.getText();
            String name = nametxt.getText();
            String email = emailtxt.getText();
            String address = addresstxt.getText();

            // Validate the inputs (basic validation for non-empty fields)
            if (id.isEmpty() || name.isEmpty() || email.isEmpty() || address.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled!");
                return;
            }

            // Database connection
            Connection connection = db.getConnection();
            try (Statement stmt = connection.createStatement()) {
                // Create the SQL INSERT query
                String sql = "INSERT INTO Students (id, sname, semail, saddress) VALUES ('"
                        + Integer.parseInt(id) + "', '"
                        + name + "', '"
                        + email + "', '"
                        + address + "')";

                // Execute the query
                stmt.executeUpdate(sql);

                // Inform the user that the record has been added
                JOptionPane.showMessageDialog(this, "Student added successfully!");

                // Optionally clear the form fields after successful insert
                idtxt.setText("");
                nametxt.setText("");
                emailtxt.setText("");
                addresstxt.setText("");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error adding student: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new Form();  // Create and display the form
    }
}
