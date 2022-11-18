package edu.umss.ejerciciosadicionales.hilos;

public class MiHilo extends Thread {
    @Override
    public void run() {
        long c = 1;
        System.out.println("Empezando proceso largo");
        while (c <= 5000000000L) {
            c++;
        }
        System.out.println("Terminando proceso largo");
    }
}
