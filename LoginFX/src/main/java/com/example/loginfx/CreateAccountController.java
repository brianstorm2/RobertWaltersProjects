package com.example.loginfx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CreateAccountController {

    @FXML
    public TextField inputUsername;
    @FXML
    public TextField inputPassword;
    @FXML
    public TextField inputPasswordTwo;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onCreateButtonClick() throws IOException {
        //processes
        String username = inputUsername.getText();
        String password = inputPassword.getText();
        String passwordTwo = inputPasswordTwo.getText();

        if (username.isBlank() || DataStorage.usernamesAndPasswords.containsKey(username)) { //rejects empty usernames or names already in hashmap
            welcomeText.setText("Your username is invalid or already exists");
        }
        else if (password.isBlank()) {
            welcomeText.setText("Password cannot be empty");
        }
        else if (password.length() < 8) {
            welcomeText.setText("Password must be at least 8 characters");
        }
        else if (!password.matches(".*[!£$%^&*()'_=+{};:|,./<>?~`@#].*")) { //using regex to check if password has a special char
            welcomeText.setText("Password must contain at least one special character");
        }
        else if (!password.matches(".*[0-9].*")) {
            welcomeText.setText("Password must contain at least one digit");
        }
        else if (!password.equals(passwordTwo)) {
            welcomeText.setText("Passwords do not match");
        }
        else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Account Created");
            alert.setHeaderText(null);
            alert.setContentText("Welcome " + username + "! Your account has been created!");
            alert.showAndWait();
            //add to hashmap
            DataStorage.usernamesAndPasswords.put(username, password);
            LoginApplication.landingController(username);
        }
    }

    @FXML
    protected void onBackButtonClick() throws IOException {
        LoginApplication.menu();
    }
}
