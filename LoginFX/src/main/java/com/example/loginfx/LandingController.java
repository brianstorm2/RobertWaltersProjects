package com.example.loginfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.io.IOException;

public class LandingController {
    @FXML
    private Label welcomeLabel;

    public void welcome(String username) {
        welcomeLabel.setText("Welcome " + username + "!");
    }
    @FXML
    protected void onBackButtonClick() throws IOException {
        LoginApplication.menu();
    }
}
