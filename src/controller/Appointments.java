package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

import java.io.IOException;

public class Appointments {

    @FXML
    private TableView<?> appointmentsTable;

    @FXML
    private Button deleteAppointmentButton;

    @FXML
    private Button addAppointmentButton;

    @FXML
    private Button modifyAppointmentButton;

    @FXML
    private Button backButton;

    @FXML
    private void handleBack(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MainScreen.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) backButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Add Customer");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception properly
        }
    }

    @FXML
    private void handleModifyAppointment(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ModifyAppointment.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) modifyAppointmentButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Modify Appointment");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception properly
        }
    }

    @FXML
    private void handleAddAppointment(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/AddAppointment.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) addAppointmentButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Add Appointment");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception properly
        }
    }

    @FXML
    private void handleDeleteAppointment(ActionEvent event) {


    }
}
