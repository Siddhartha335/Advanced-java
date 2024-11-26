package com.example.unit7;

import java.sql.*;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/java_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "siddhartha";
    private Connection connection;

    public Database() {
        try {
            // Establish the connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected to a database!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }

    // Method to get the connection
    public Connection getConnection() {
        return connection;
    }

    // Close the connection
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Instantiate Database to test the connection
        new Database();
    }

}

