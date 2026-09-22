package com.example.pruebafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtMatricula;

    @FXML
    private Label lblResultado;

    @FXML
    private void registrarEstudiante() {

        String nombre = txtNombre.getText();
        String matricula = txtMatricula.getText();

        Estudiante estudiante = new Estudiante(nombre, matricula);

        lblResultado.setText(
                "Registrado exitosamente: \n" +
                "Nombre: " + estudiante.getNombre() +
                        "\nMatrícula: " + estudiante.getMatricula()
        );
    }
}