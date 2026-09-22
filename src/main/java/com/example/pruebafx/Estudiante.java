package com.example.pruebafx;

public class Estudiante {
    private String nombre;
    private String matricula;

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getMatricula() {
        return this.matricula;
    }
}
