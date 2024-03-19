package controller;

import javafx.collections.FXCollections;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Customers;
import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;

public class CustomersController implements Initializable {


    @FXML
    private TableView<Customers> CustomerTable;

    @FXML
    private TableColumn<Customers, Integer> Customer_ID;

    @FXML
    private TableColumn<model.Customers, String> Customer_Name;

    @FXML
    private TableColumn<model.Customers, String> Address;

    @FXML
    private TableColumn<model.Customers, String> Postal_Code;

    @FXML
    private TableColumn<model.Customers, String> Phone_Number;

    @FXML
    private TableColumn<model.Customers, Calendar> Create_Date;

    @FXML
    private TableColumn<model.Customers, String> Create_By;

    @FXML
    private TableColumn<model.Customers, Calendar> Last_Update;

    @FXML
    private TableColumn<model.Customers, String> Last_Updated_By;

    @FXML
    private TableColumn<model.Customers, Integer> Division_ID;

    @FXML
    private Button addButton;

    @FXML
    private Button modifyButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button backToMainMenuButton;

    @FXML
    private void handleAdd(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/AddCustomer.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) addButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Add Customer");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception properly
        }
    }

    @FXML
    private void handleModify(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ModifyCustomer.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) modifyButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Modify Customer");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception properly
        }
    }

    @FXML
    private void handleBackToMain(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MainScreen.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) backToMainMenuButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Main Menu");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception properly
        }
    }

    @FXML
    private void handleDelete(ActionEvent event) {


    }

    ObservableList<model.Customers> customerList = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Customer_ID.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        Customer_Name.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        Address.setCellValueFactory(new PropertyValueFactory<>("address"));
        Postal_Code.setCellValueFactory(new PropertyValueFactory<>("postalCode"));
        Phone_Number.setCellValueFactory(new PropertyValueFactory<>("phone"));
        Create_Date.setCellValueFactory(new PropertyValueFactory<>("createDate"));
        Create_By.setCellValueFactory(new PropertyValueFactory<>("createdBy"));
        Last_Update.setCellValueFactory(new PropertyValueFactory<>("lastUpdate"));
        Last_Updated_By.setCellValueFactory(new PropertyValueFactory<>("lastUpdatedBy"));
        Division_ID.setCellValueFactory(new PropertyValueFactory<>("divisionId"));
    }

}