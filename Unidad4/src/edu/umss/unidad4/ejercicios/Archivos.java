package edu.umss.unidad4.ejercicios;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Archivos {
    public static void main(String[] args) throws IOException {
        // Lectura y escritura de archivos
        BufferedReader br = new BufferedReader(new FileReader("archivo1.txt"));
        String linea;

        System.out.println("El contenido del archivo es");

        while ((linea = br.readLine()) != null) {
            String[] valores = linea.split(",");
            String dia = valores[0];
            int numeralDia = Integer.parseInt(valores[1]);
            System.out.println("Literal: " + dia + " valor: " + numeralDia);
        }

        br.close();

        // Escritura
        //BufferedWriter bw = new BufferedWriter(new FileWriter("archivo2.txt")); Sobrescribir totalmente el archivo
        BufferedWriter bw = new BufferedWriter(new FileWriter("archivo2.txt", true));
        bw.write("Cuatro");
        bw.newLine();
        bw.write("Cinco");
        bw.newLine();
        bw.write("Seis");
        bw.newLine();
        bw.close();

        /**
         * Ejercicio: 10:40
         * Volcar el HashMap a continuación a un archivo
         *
         * Archivo:
         * 1234,Juan Perez
         * 4321,Alejandro Gomez
         * 1111,Martha Lopez
         */

        HashMap<String, String> valores = new HashMap<>();
        valores.put("1234", "Juan Perez");
        valores.put("4321", "Alejandro Gomez");
        valores.put("1111", "Martha Lopez");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("datos.txt"));

        for (Map.Entry<String, String> elemento : valores.entrySet()) {
            bufferedWriter.write(elemento.getKey() + "," + elemento.getValue());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
