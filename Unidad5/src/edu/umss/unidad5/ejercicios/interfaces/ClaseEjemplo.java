package edu.umss.unidad5.ejercicios.interfaces;

public class ClaseEjemplo implements InterfazEjemplo, InterfazEjemplo2 {
    @Override
    public void holaMundo() {
        System.out.println("Hola a todos");
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Tu nombre es Oscar");
    }

    // Sobrecarga

    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int multiplicar(int ... valores) { // Argumentos variables (varargs)
        int numParametros = valores.length;
        System.out.println("El numero de parametros es " + numParametros);
        int mul = 1;

        for (int parametro : valores) {
            mul *= parametro;
        }

        return mul;
    }

    @Override
    public void miMetodo() {
        System.out.println("Llamando miMetodo");
    }
}
