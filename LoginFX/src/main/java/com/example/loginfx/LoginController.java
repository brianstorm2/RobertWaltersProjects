package com.example.loginfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

import java.io.IOException;

public class LoginController {

    byte loginAttemptsRemaining = 3; //var declared outside of login button call to stop it refreshing
    @FXML
    public TextField inputUsername;
    @FXML
    public TextField inputPassword;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onLoginButtonClick() throws IOException {
        String username = inputUsername.getText();
        String password = inputPassword.getText();
        if (verifyUserLogin(username, password)) {
            welcomeText.setText("Welcome to JavaFX Application " + inputUsername.getText() + " !");
            LoginApplication.landingController(username);
        }
        else if (loginAttemptsRemaining == 1) { //gives user 3 attempts to login
            showAlertAndExit();
        }
        else {
            welcomeText.setText("Invalid Username or Password. You have " + (loginAttemptsRemaining-1) + " attempts remaining!.");
            loginAttemptsRemaining--;
        }
    }

    @FXML
    protected void onBackButtonClick() throws IOException {
        LoginApplication.menu();
    }

    private void showAlertAndExit() {
        Alert alert = new Alert(Alert.AlertType.ERROR); //alert runs after too many login attempts
        alert.setTitle("Login Attempts Exceeded");
        alert.setHeaderText(null);
        alert.setContentText("You have run out of login attempts. The application will now close.");

        alert.showAndWait(); // show alert and wait for the user to close it
        System.exit(0); // exit application after alert closed
    }

    public static boolean verifyUserLogin(String username, String password) {
        boolean credentialsVerified = false;

        username = username.trim().toLowerCase(); //sanitise username to lowercase removing spaces
        if (DataStorage.usernamesAndPasswords.containsKey(username) && DataStorage.usernamesAndPasswords.get(username).equals(password)) { //if username exists and password matches value in hashmap
            credentialsVerified = true;
        }
        return credentialsVerified;
    }
}
