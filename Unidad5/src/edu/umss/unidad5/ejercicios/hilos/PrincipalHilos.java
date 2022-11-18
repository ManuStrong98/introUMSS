package edu.umss.unidad5.ejercicios.hilos;

public class PrincipalHilos {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Iniciando programa principal");
        MiHilo hilo = new MiHilo();
        hilo.start();
        hilo.join(); // Llevar el hilo al proceso en primer plano
        //hilo.stop(); // Se considera una mala práctica
        System.out.println("Continuando con ejecucion...");
    }
}
