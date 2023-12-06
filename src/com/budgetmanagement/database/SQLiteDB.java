package com.budgetmanagement.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLiteDB {
    private Connection connection;

    public SQLiteDB() {
        connect();  // Connect to the SQLite database upon object creation
    }

    private void connect() {
        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Connect to the SQLite database (assuming you have a file named "budget.db")
            connection = DriverManager.getConnection("jdbc:sqlite:budget.db");

            System.out.println("Connected to SQLite database");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Disconnected from SQLite database");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Implement methods for CRUD operations (insert, update, delete, select) here
}
