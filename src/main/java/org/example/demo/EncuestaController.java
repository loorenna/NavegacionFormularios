package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class EncuestaController {

    @FXML
    private ComboBox<String> cmb1;

    @FXML
    private ComboBox<String> cmb2;

    @FXML
    private ComboBox<String> cmb3;

    @FXML
    private ComboBox<String> cmb4;

    @FXML
    private Label lblCorrectas;

    @FXML
    private Label lblIncorrectas;

    @FXML
    private Label lblPuntaje;

    @FXML
    public void initialize() {

        cmb1.getItems().addAll(
                "Quito",
                "Guayaquil",
                "Cuenca"
        );

        cmb2.getItems().addAll(
                "15",
                "20",
                "25"
        );

        cmb3.getItems().addAll(
                "Python",
                "Java",
                "C++"
        );

        cmb4.getItems().addAll(
                "5",
                "6",
                "7"
        );
    }

    @FXML
    private void calcular() {

        int correctas = 0;

        if ("Quito".equals(cmb1.getValue())) {
            correctas++;
        }

        if ("20".equals(cmb2.getValue())) {
            correctas++;
        }

        if ("Java".equals(cmb3.getValue())) {
            correctas++;
        }

        if ("7".equals(cmb4.getValue())) {
            correctas++;
        }

        int incorrectas = 4 - correctas;
        int puntaje = correctas * 5;

        lblCorrectas.setText("Correctas: " + correctas);
        lblIncorrectas.setText("Incorrectas: " + incorrectas);
        lblPuntaje.setText("Puntaje: " + puntaje + "/20");
    }
}