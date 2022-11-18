package edu.umss.unidad4.ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SistemaCalificaciones {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new FileReader("planillaestudiantes.csv"));
        String linea;
        int cont = 0;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        while ((linea = br.readLine()) != null) {
            cont++;

            if (cont == 1) {
                continue;
            }

            String[] datos = linea.split(",");
            String apellidoPaterno = datos[0];
            String apellidoMaterno = datos[1];
            String nombre = datos[2];
            Date fechaNacimiento = sdf.parse(datos[3]);
            String ciudad = datos[4];
            Integer primerParcial = Integer.parseInt(datos[5]);
            Integer segundoParcial = Integer.parseInt(datos[6]);
            Integer examenFinal = Integer.parseInt(datos[7]);

            Estudiante estudiante = new Estudiante(apellidoPaterno, apellidoMaterno, nombre, fechaNacimiento, ciudad, primerParcial, segundoParcial, examenFinal);
            estudiantes.add(estudiante);
        }

        br.close();

        System.out.println("Mostrando estudiantes:");

        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre() + " " +
                               "Apellido paterno: " + estudiante.getApellidoPaterno() + " " +
                               "Fecha de nacimiento: " + sdf.format(estudiante.getFechaNacimiento()) + " " +
                               "Edad: " + estudiante.getEdad() + " " +
                               "Promedio de notas: " + estudiante.getPromedio());
        }
    }
}
