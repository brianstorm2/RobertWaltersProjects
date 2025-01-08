package com.example.loginfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

public class LoginController {
    byte loginAttemptsRemaining = 3; //var declared outside of login button call to stop it refreshing
    public TextField inputUsername;
    @FXML
    public TextField inputPassword;
    @FXML
    private Button loginButton;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onLoginButtonClick() throws InterruptedException {
        String username = inputUsername.getText();
        String password = inputPassword.getText();
        if (Login.verifyUserLogin(username, password)) {
            welcomeText.setText("Welcome to JavaFX Application " + inputUsername.getText() + " !");
        }
        else if (loginAttemptsRemaining == 1) { //gives user 3 attempts to login
            showAlertAndExit();
        }
        else {
            welcomeText.setText("Invalid Username or Password. You have " + (loginAttemptsRemaining-1) + " attempts remaining!.");
            loginAttemptsRemaining--;
        }
    }

    private void showAlertAndExit() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION); //alert runs after too many login attempts
        alert.setTitle("Login Attempts Exceeded");
        alert.setHeaderText(null);
        alert.setContentText("You have run out of login attempts. The application will now close.");

        alert.showAndWait(); // show alert and wait for the user to close it
        System.exit(0); // exit application after alert closed
    }
}