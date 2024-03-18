package controller;


import helper.LanguageManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Node;
import DAO.userDAO;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class LogIn implements Initializable {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Button exitButton;
    @FXML
    private HBox locationHBox;
    @FXML
    private TextField locationTextField;
    @FXML
    private Label locationLabel;
    @FXML
    private Label userNameLabel;
    @FXML
    private Label passwordLabel;


   // This method is called when the "Log In" button is clicked
   @FXML
   private void handleLogin(ActionEvent event) {
       String username = usernameField.getText();
       String password = passwordField.getText();
       try {
           boolean isValidCredentials = userDAO.validateCredentials(username, password);
           boolean isValidUsername = userDAO.validateUsername(username);
           boolean isValidPassword = userDAO.validatePassword(password);
           if (isValidCredentials) {
               FXMLLoader loader = new FXMLLoader();
               loader.setLocation(getClass().getResource("/view/MainScreen.fxml"));
               Parent root = loader.load();
               Stage stage = (Stage) loginButton.getScene().getWindow();
               Scene scene = new Scene(root);
               stage.setTitle("Main Screen");
               stage.setScene(scene);
               stage.show();
           } else {
               if (!isValidUsername && !isValidPassword) {
                   showAlert(Alert.AlertType.ERROR, "login.error.title", "login.error.invalid.credentials");
               } else if (!isValidUsername) {
                   showAlert(Alert.AlertType.ERROR, "login.error.title", "login.error.invalid.username");
               } else {
                   showAlert(Alert.AlertType.ERROR, "login.error.title", "login.error.invalid.password");
               }
           }
       } catch (SQLException | IOException e) {
           throw new RuntimeException(e);
       }
   }




    private void showAlert(Alert.AlertType type, String titleKey, String messageKey) {
        ResourceBundle bundle = LanguageManager.getResourceBundle(Locale.getDefault());
        String title = bundle.getString(titleKey);
        String message = bundle.getString(messageKey);

        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    // This method is called when the "Exit" button is clicked
    @FXML
    private void handleExit(ActionEvent event) {
        // Close the application
        System.exit(0);
    }

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {
       try {
           ZoneId zoneId = ZoneId.systemDefault();
           locationTextField.setText(zoneId.getId());
           //Locale locale = Locale.getDefault();
           Locale.setDefault(Locale.FRENCH);
           ResourceBundle bundle = LanguageManager.getResourceBundle(Locale.getDefault());
           //ResourceBundle bundle = ResourceBundle.getBundle("login");
           userNameLabel.setText(bundle.getString("username"));
           passwordLabel.setText(bundle.getString("password"));
           loginButton.setText(bundle.getString("login"));
           exitButton.setText(bundle.getString("exitButton"));
           locationLabel.setText(bundle.getString("location"));
       } catch (MissingResourceException e) {
           e.printStackTrace();
       }
    }
}
