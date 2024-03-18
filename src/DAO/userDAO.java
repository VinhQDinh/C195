package DAO;

import helper.JDBC;
import model.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class userDAO extends Users {

    public static boolean validateCredentials(String username, String password) throws SQLException {
        String sqlQuery = "SELECT User_ID FROM users WHERE User_Name = ? AND Password = ?";
        try (Connection connection = JDBC.openConnection();
             PreparedStatement ps = connection.prepareStatement(sqlQuery)) {
            ps.setString(1, username);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next(); // Return true if result set has at least one row
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Log or handle the exception appropriately
            throw e; // Rethrow the exception to propagate it
        }
    }

    public static boolean validateUsername(String username) throws SQLException {
        // Establish database connection
        Connection conn = JDBC.openConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // SQL query to check if the username exists
            String query = "SELECT * FROM users WHERE User_Name = ?";
            statement = conn.prepareStatement(query);
            statement.setString(1, username);
            resultSet = statement.executeQuery();

            // If resultSet has any rows, then the username exists
            return resultSet.next();
        } finally {
            // Close the resultSet, statement, and connection
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }


    public static boolean validatePassword(String password) throws SQLException {
        Connection conn = JDBC.openConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM users WHERE Password = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, password);
            rs = ps.executeQuery();
            return rs.next();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }


}
