package edu.umss.unidad5.ejercicios.ejemplointerfaces;

import java.text.SimpleDateFormat;

public class ClasePrincipalInterfaces {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ClaseImplementadora claseImplementadora = new ClaseImplementadora();
        System.out.println(sdf.format(claseImplementadora.mostrarFecha()));
        claseImplementadora.mostrarNombre();
        claseImplementadora.holaMundo();
    }
}
