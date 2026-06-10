package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CajeroController {

    @FXML
    private Button btnCerrar;

    @FXML
    private void cerrar() {

        Stage stage = (Stage) btnCerrar.getScene().getWindow();
        stage.close();
    }
}