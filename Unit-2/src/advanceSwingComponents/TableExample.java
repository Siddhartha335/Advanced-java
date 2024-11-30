package advanceSwingComponents;
import javax.swing.*;

public class TableExample {
    public static void main(String[] args) {
        // Column names for the table
        String[] columnNames = {"ID", "Title", "Genre"};

        // Sample data to populate the table
        Object[][] data = {
                {1, "Jatra", "Comedy"},
                {2, "Sonic 3 - Shadow the Hedgehog", "Action and Animation"},
                {3, "Mufasa", "Adventure"}
        };

        // Create a table with the data and column names
        JTable table = new JTable(data, columnNames);

        // Place the table inside a JScrollPane to make it scrollable
        JScrollPane scrollPane = new JScrollPane(table);

        // Create a frame to display the table
        JFrame frame = new JFrame("Movie Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(scrollPane);  // Add the scroll pane containing the table to the frame

        // Make the frame visible
        frame.setVisible(true);
    }
}

