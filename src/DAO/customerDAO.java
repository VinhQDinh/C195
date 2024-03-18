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
}