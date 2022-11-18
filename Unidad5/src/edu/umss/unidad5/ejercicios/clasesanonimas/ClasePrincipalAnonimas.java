package edu.umss.unidad5.ejercicios.clasesanonimas;

public class ClasePrincipalAnonimas {
    public static void main(String[] args) {
        EjemploInterfaz ejemploInterfaz = new EjemploInterfaz() {
            @Override
            public void holaMundo() {
                System.out.println("Hola mundo");
            }

            @Override
            public void mostrarNombre() {
                System.out.println("Mostrar nombre");
            }

            public void holaCochabamba() {
                System.out.println("Hola Cochabamba");
            }
        };

        ejemploInterfaz.holaMundo();
        ejemploInterfaz.mostrarNombre();

    }
}
