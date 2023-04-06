package com.example.online;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {

    @FXML
    TextArea mainTextArea;
//    @FXML
//    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        mainTextArea.setText("Welcome to JavaFX Application!");
    }
}