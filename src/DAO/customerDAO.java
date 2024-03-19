package DAO;



import helper.JDBC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Customers;
import java.sql.*;
import java.time.LocalDateTime;

public class customerDAO {

    public static ObservableList<Customers> getAllCustomers(Connection connection) throws SQLException {
        ObservableList<Customers> allCustomersInfo = FXCollections.observableArrayList();
        String query = "SELECT * from customers";

        try {
            PreparedStatement statement = JDBC.openConnection().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int customerId = resultSet.getInt("Customer_ID");
                String customerName = resultSet.getString("Customer_Name");
                String address = resultSet.getString("Address");
                String postalCode = resultSet.getString("Postal_Code");
                String phone = resultSet.getString("Phone");
                Timestamp createDate = resultSet.getTimestamp("Create_Date");
                String createdBy = resultSet.getString("Created_By");
                Timestamp lastUpdate = resultSet.getTimestamp("Last_Update");
                String lastUpdatedBy = resultSet.getString("Last_Updated_By");
                int divisionId = resultSet.getInt("Division_ID");
                Customers customersInfo = new Customers(customerId, customerName, address, postalCode, phone,
                        createDate, createdBy, lastUpdate, lastUpdatedBy, divisionId);
                LocalDateTime createDateLocalDateTime = createDate.toLocalDateTime();
                LocalDateTime lastUpdateLocalDateTime = lastUpdate.toLocalDateTime();
                allCustomersInfo.add(customersInfo);
            }
            return allCustomersInfo;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    // Existing method to get all customers

    public static void addCustomer(Connection connection, Customers newCustomer) throws SQLException {
        String query = "INSERT INTO customers (Customer_Name, Address, Postal_Code, Phone, Create_Date, Created_By, Last_Update, Last_Updated_By, Division_ID) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, newCustomer.getCustomerName());
            statement.setString(2, newCustomer.getAddress());
            statement.setString(3, newCustomer.getPostalCode());
            statement.setString(4, newCustomer.getPhone());
            statement.setTimestamp(5, new Timestamp(newCustomer.getCreateDate().getTime()));
            statement.setString(6, "YourAppName");
            statement.setTimestamp(7, new Timestamp(newCustomer.getLastUpdate().getTime()));
            statement.setString(8, "YourAppName");
            statement.setInt(9, newCustomer.getDivisionId());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new customer was inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void deleteCustomer(Connection connection, int customerId) throws SQLException {
        String query = "DELETE FROM customers WHERE Customer_ID = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, customerId);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Customer with ID " + customerId + " deleted successfully.");
            } else {
                System.out.println("No customer found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void updateCustomer(Connection connection, Customers updatedCustomer) throws SQLException {
        String query = "UPDATE customers SET Customer_Name = ?, Address = ?, Postal_Code = ?, Phone = ?, Last_Update = ?, Last_Updated_By = ?, Division_ID = ? WHERE Customer_ID = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, updatedCustomer.getCustomerName());
            statement.setString(2, updatedCustomer.getAddress());
            statement.setString(3, updatedCustomer.getPostalCode());
            statement.setString(4, updatedCustomer.getPhone());
            statement.setTimestamp(5, updatedCustomer.getLastUpdate());
            statement.setString(6, updatedCustomer.getLastUpdatedBy());
            statement.setInt(7, updatedCustomer.getDivisionId());
            statement.setInt(8, updatedCustomer.getCustomerId());

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Customer with ID " + updatedCustomer.getCustomerId() + " updated successfully.");
            } else {
                System.out.println("No customer found with ID " + updatedCustomer.getCustomerId());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }



}