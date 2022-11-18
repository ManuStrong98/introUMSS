package bo.edu.umss.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EjercicioEstructuras {
    public static void main(String[] args) throws IOException {
        int a = 15;
        int b = 10;

        if (b > a) {
            System.out.println("b es mayor que a");
        } else {
            System.out.println("b no es mayor que a");
        }

        String nombre;

        System.out.println("Introduce tu nombre");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        nombre = bufferedReader.readLine();

        System.out.println("Tu nombre es: " + nombre);

        System.out.println("Introduce el valor de a");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("El valor de a es " + a);
    }
}
