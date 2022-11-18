package edu.umss.ejerciciosadicionales.hilos;

public class PrincipalHilos {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Iniciando programa principal");
        MiHilo hilo = new MiHilo();
        hilo.start();
        hilo.join();
        System.out.println("Finalizando programa principal");
    }
}
