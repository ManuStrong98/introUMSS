
import java.util.Scanner;

public class Recursividad {
    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public boolean palindrome(String cadena) 
    {
        if (cadena.length() <= 1) {
            return true;
        }

        if (cadena.charAt(0) != cadena.charAt(cadena.length() - 1)) {
            return false;
        }

        return palindrome(cadena.substring(1, cadena.length() - 1));
    }

    public static void main(String[] args) {
        Recursividad recursividad = new Recursividad();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un numero");

        int n = scanner.nextInt();
        System.out.println(recursividad.factorial(n));

        String nombre = "Juan";
        System.out.println(nombre.substring(0, 2));
        System.out.println(nombre.substring(1, 3));

        String cadena = "oruro";
        boolean palindrome = recursividad.palindrome(cadena);

        if (palindrome) {
            System.out.println("Es palindrome");
        } else {
            System.out.println("No es palindrome");
        }
    }
}
