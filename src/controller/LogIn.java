package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class LogIn implements Initializable {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label locationText;
    @FXML
    private Label locationLabel;

    // This method is called when the "Log In" button is clicked
    @FXML
    private void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        // Perform login authentication here
    }

    // This method is called when the "Exit" button is clicked
    @FXML
    private void handleExit(ActionEvent event) {
        // Close the application
        System.exit(0);
    }

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialization logic
    }
}
