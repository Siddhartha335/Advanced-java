import java.sql.*;

public class DatabaseOperations {
    private Database db;

    // Constructor to initialize the Database connection
    public DatabaseOperations() {
        db = new Database(); // Establish the connection
    }

    // Method to create a table
    public void createTable() {
        Connection connection = db.getConnection(); // Get the connection from Database class

        String createTableSQL = "CREATE TABLE IF NOT EXISTS Employee (" + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "first_name VARCHAR(50), "
                + "last_name VARCHAR(50), "
                + "email VARCHAR(100), "
                + "hire_date DATE)";

//        String createTableSQL = "CREATE TABLE IF NOT EXISTS Students ("
//                + "id INT AUTO_INCREMENT PRIMARY KEY, "
//                + "sname VARCHAR(50), "
//                + "semail VARCHAR(50), "
//                + "saddress VARCHAR(100))";

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(createTableSQL);
            System.out.println("Table 'Employee' created successfully.");
        } catch (SQLException e) {
            System.out.println("Error while creating table: " + e.getMessage());
        }
    }

    // Method to close the database connection
    public void close() {
        db.closeConnection();
    }

    public static void main(String[] args) {
        // Create an instance of DatabaseOperations to perform operations
        DatabaseOperations operations = new DatabaseOperations();

        // Perform the create table operation
        operations.createTable();

        // Close the connection when done
        operations.close();
    }
}
