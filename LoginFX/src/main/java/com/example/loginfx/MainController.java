package com.example.loginfx;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class MainController {

    @FXML
    private VBox menuPage;

    @FXML
    public void initialize() { //loads menu page upon starting
        menuPage.setVisible(true);
    }

//    private void initMenuPage() { //reveals menu hides login
//        menuPage.setVisible(true);
//        loginPage.setVisible(false);
//    }
//
//    private void initLoginPage() { //reveals login hides menu
//        loginPage.setVisible(true);
//        menuPage.setVisible(false);
//    }

    @FXML
    protected void onLoginMenuButtonClick() throws IOException { //when login clicked on menu login page initialised
        LoginApplication.login();
    }

    @FXML
    protected void onCreateAccountButtonClick() throws IOException {
        LoginApplication.createAccount();
    }

    @FXML
    protected void onQuitButtonClick() {
        System.exit(0);
   }

}
