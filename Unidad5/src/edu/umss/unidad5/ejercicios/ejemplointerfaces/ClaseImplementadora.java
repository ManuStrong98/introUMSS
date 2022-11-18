package edu.umss.unidad5.ejercicios.ejemplointerfaces;

import java.util.Date;

public class ClaseImplementadora implements Interfaz1, Interfaz2 {
    @Override
    public Date mostrarFecha() {
        return new Date();
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Tu nombre es Oscar");
    }

    @Override
    public void holaMundo() {
        System.out.println("Hola Cochabamba");
    }
}
