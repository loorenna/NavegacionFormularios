package org.example.demo;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class AdminController {

    @FXML
    private void cerrar() {

        Stage stage = (Stage) javafx.stage.Stage.getWindows().getLast();
        stage.close();
    }
}