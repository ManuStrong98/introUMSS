package bo.edu.umss.ejercicios;

import java.util.Scanner;

public class PruebaSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el día de la semana");
        int dia = scanner.nextInt();

        switch (dia) {
            default:
                System.out.println("Entrada no válida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;

        }

        String cadena = "Hola mundo";
        System.out.println("El caracter en la primera posición es " + cadena.charAt(0));
        System.out.println("El caracter en la cuarta posición es " + cadena.charAt(3));
        System.out.println("La longitud de la cadena es " + cadena.length());

        // Ejercicio:
        // Introduzca el nombre de una persona y muestre en pantalla
        // todos los caracteres de su nombre.
        // Ej: Oscar -> O  s  c  a  r
        // 9:50
        System.out.println("Introduce tu nombre");
        String nombre = scanner.next();

        for (int i = 0; i < nombre.length(); i++) {
            System.out.println("El caracter en la posición " + (i + 1) + " es " + nombre.charAt(i));
        }
    }
}
