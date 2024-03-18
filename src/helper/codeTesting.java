package helper;

import DAO.customerDAO;
import javafx.collections.ObservableList;
import model.Customers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class codeTesting {

    public static void main(String[] args) {
        try {
            // Establish a database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/client_schedule", "sqlUser", "Passw0rd!");

            // Call the getAllCustomers method
            ObservableList<Customers> customersList = customerDAO.getAllCustomers(connection);

            // Print the contents of the ObservableList
            for (Customers customer : customersList) {
                System.out.println(customer);
            }

            // Close the database connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
