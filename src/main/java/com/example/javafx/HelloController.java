package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label successText;

    @FXML
    protected void onHelloButtonClick() {
        successText.setText("Registration Complete");
    }
}