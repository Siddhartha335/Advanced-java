import java.sql.*;

public class MovieDatabaseExample {
    public static void main(String[] args) {
        // Database URL and credentials
        String url = "jdbc:mysql://localhost:3306/java_db";
        String username = "root";
        String password = "siddhartha";

        // JDBC Connection and Statement
        Connection conn = null;
        PreparedStatement insertStmt = null;
        PreparedStatement updateStmt = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database.");

            // --- Part a: Insert three records into the MOVIE table ---
            String insertSQL = "INSERT INTO MOVIE (id, title, genre) VALUES (?, ?, ?)";
            insertStmt = conn.prepareStatement(insertSQL);

            insertStmt.setInt(1, 1);  // ID
            insertStmt.setString(2, "Jatra");  // Title
            insertStmt.setString(3, "Cultural Heritage");  // Genre
            insertStmt.executeUpdate();

            insertStmt.setInt(1, 2);  // ID
            insertStmt.setString(2, "Sonic 3 - Shadow the Hedgehog");  // Title
            insertStmt.setString(3, "Action and Animation");  // Genre
            insertStmt.executeUpdate();

            insertStmt.setInt(1, 3);  // ID
            insertStmt.setString(2, "Mufasa");  // Title
            insertStmt.setString(3, "Adventure");  // Genre
            insertStmt.executeUpdate();

            System.out.println("Three records added to the MOVIE table.");

            String updateSQL = "UPDATE MOVIE SET genre = ? WHERE title = ?";
            updateStmt = conn.prepareStatement(updateSQL);

            updateStmt.setString(1, "Comedy");  // New genre
            updateStmt.setString(2, "Jatra");  // Movie title to match

            int rowsAffected = updateStmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Genre for 'Jatra' has been updated to 'Comedy'.");
            } else {
                System.out.println("No movie found with the title 'Jatra'.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Step 3: Clean up resources
            try {
                if (insertStmt != null) insertStmt.close();
                if (updateStmt != null) updateStmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
