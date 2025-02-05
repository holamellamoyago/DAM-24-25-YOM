package com.holamellamoyago.gestionusuariosfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField usernameController;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(usernameController.getText());
    }


}