import java.sql.*;

public class Database {
    public Database() {
        String url = "jdbc:mysql://localhost:3306/java_db";
        String username = "root";
        String password = "root";

        System.out.println("Connecting database ...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }

    public static void main(String[] args) {
            new Database();
    }
}
