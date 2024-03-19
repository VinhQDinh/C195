package helper;

import DAO.customerDAO;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import model.Customers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;

public class codeTesting {
    /*
    public static void main(String[] args) {

        try{
            Connection connection = JDBC.openConnection();

            Customers newCustomer = new Customers();
            newCustomer.setCustomerName("New Customer Name");
            newCustomer.setAddress("New Customer Address");
            newCustomer.setPostalCode("New Postal Code");
            newCustomer.setPhone("New Phone Number");
            newCustomer.setCreateDate(new Timestamp(System.currentTimeMillis())); // Set current timestamp as creation date
            newCustomer.setCreatedBy("Creator"); // Set the user who created the customer
            newCustomer.setLastUpdate(new Timestamp(System.currentTimeMillis())); // Set current timestamp as last update time
            newCustomer.setLastUpdatedBy("Updater"); // Set the user who last updated the customer
            newCustomer.setDivisionId(1); // Set the division ID

            // Call the addCustomer method to insert the new customer into the database
            customerDAO.addCustomer(connection, newCustomer);

            // Close the database connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    } */

    public static void main(String[] args) {
        try {

            Connection connection = JDBC.openConnection();


            Customers updatedCustomer = new Customers();
            updatedCustomer.setCustomerId(5);
            updatedCustomer.setCustomerName("123");
            updatedCustomer.setAddress("134");
            updatedCustomer.setPostalCode("U342");
            updatedCustomer.setPhone("342234");
            updatedCustomer.setLastUpdate(new Timestamp(System.currentTimeMillis()));
            updatedCustomer.setLastUpdatedBy("U4234234");
            updatedCustomer.setDivisionId(2);


            customerDAO.updateCustomer(connection, updatedCustomer);


            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}



