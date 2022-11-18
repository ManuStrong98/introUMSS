package edu.umss.unidad5.ejercicios.interfaces;

public class PrincipalInterfaces {
    public static void main(String[] args) {
        InterfazEjemplo claseEjemplo = new ClaseEjemplo();
        claseEjemplo.holaMundo();
        claseEjemplo.mostrarNombre();

        ClaseEjemplo claseEjemplo2 = new ClaseEjemplo();
        claseEjemplo2.holaMundo();
        claseEjemplo2.mostrarNombre();
        claseEjemplo2.miMetodo();

        if (claseEjemplo2 instanceof ClaseEjemplo) {
            System.out.println("claseEjemplo2 es una instancia de ClaseEjemplo");
        }

        System.out.println(claseEjemplo2.sumar(5, 3));
        System.out.println(claseEjemplo2.sumar(5, 3, 5));
        System.out.println(claseEjemplo2.multiplicar(2, 3, 2));
    }
}
