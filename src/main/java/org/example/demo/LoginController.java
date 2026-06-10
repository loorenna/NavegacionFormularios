package org.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.application.Platform;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private ComboBox<String> cmbRol;

    @FXML
    private Label lblMensaje;

    @FXML
    public void initialize() {

        cmbRol.getItems().addAll(
                "Administrador",
                "Cajero"
        );
    }

    @FXML
    private void ingresar() {

        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();
        String rol = cmbRol.getValue();

        if(usuario.isEmpty() || password.isEmpty() || rol == null){
            lblMensaje.setText("Complete todos los campos");
            return;
        }

        try {

            if(rol.equals("Administrador")) {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("Administrador.fxml"));

                Stage stage = new Stage();
                stage.setScene(new Scene(loader.load()));
                stage.show();
                Stage actual = (Stage) txtUsuario.getScene().getWindow();
                actual.close();
            }

            else if(rol.equals("Cajero")) {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("Cajero.fxml"));

                Stage stage = new Stage();
                stage.setScene(new Scene(loader.load()));
                stage.show();
                Stage actual = (Stage) txtUsuario.getScene().getWindow();
                actual.close();
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void salir() {
        Platform.exit();
    }
}