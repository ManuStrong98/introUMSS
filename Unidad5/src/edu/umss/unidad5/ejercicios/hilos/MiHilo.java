package edu.umss.unidad5.ejercicios.hilos;

public class MiHilo extends Thread {
    public void run() {
        long c = 1;
        System.out.println("Iniciando proceso.");

        while (c <= 5000000000L) {
            c++;
        }

        System.out.println("Proceso terminado.");
    }
}
