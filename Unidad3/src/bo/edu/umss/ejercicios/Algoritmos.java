package bo.edu.umss.ejercicios;

import java.util.Scanner;

public class Algoritmos {
    public boolean esPar(int num) {
        boolean resultado = (num % 2 == 0);
        return resultado;
    }

    public void verificarSalario(double salario) {
        if (salario < 1500) {
            System.out.println("Salario básico");
        } else if (salario >= 1500 && salario < 6000) {
            System.out.println("Salario medio");
        } else {
            System.out.println("Salario alto");
        }
    }

    public void obtenerCriterioCalificacion(int nota) {
        // Implementar la lógica
        // Para lo siguiente.
        // Cuando la nota es menor que 51 -> Mostrar: Reprobado
        // Cuando la nota está entre 51 - 64 -> Mostrar: Suficiente
        // Cuando la nota está entre 65 - 77 -> Mostrar: Distinguido
        // Cuando la nota está entre 78 - 100 -> Mostrar: Sobresaliente
        // 7:45
    }

    public void contar(int num) {
        int cont = 1;

        while (cont <= num) {
            System.out.println(cont);
            cont++;
        }
    }

    public int factorial(int num) {
        int mul = 1;

        for (int cont = 2; cont <= num; cont++) {
            //mul = mul * cont;
            mul *= cont;
        }

        return mul;
    }

    public void visualizarDigitos(int num) {
        int aux = num;

        while (aux != 0) {
            int digito = aux % 10;
            System.out.println(digito);
            //aux = aux / 10;
            aux /= 10;
        }
    }

    public int invertirDigitos(int num) {
        // Implementar el algoritmo
        // para invertir los dígitos de num
        // 10:40
        int aux = num;
        int resultado = 0;

        while (aux != 0) {
            int digito = aux % 10;
            resultado = resultado * 10 + digito;
            aux = aux / 10;
        }

        return resultado;
    }

    public static String decimalAHex(int decimal) {
        String resultado = "";
        int aux = decimal;

        while (aux != 0) {
            int digito = aux % 16;

            if (digito >= 10) {
                switch (digito) {
                    case 10:
                        resultado = "a" + resultado;
                        break;
                    case 11:
                        resultado = "b" + resultado;
                        break;
                    case 12:
                        resultado = "c" + resultado;
                        break;
                    case 13:
                        resultado = "d" + resultado;
                        break;
                    case 14:
                        resultado = "e" + resultado;
                        break;
                    case 15:
                        resultado = "f" + resultado;
                        break;
                }
            } else {
                resultado = digito + resultado;
            }

            aux /= 16;
        }

        return resultado;
    }

    public static int decimalABinario(int decimal) {
        int mul = 1;
        int binario = 0;
        int aux = decimal;

        while (aux != 0) {
            int digito = aux % 2;
            binario = digito * mul + binario;
            mul *= 10;
            aux /= 2;
        }

        return binario;
    }

    public static int binarioADecimal(int binario) {
        int decimal = 0;
        int aux = binario;
        int mul = 1;

        while (aux != 0) {
            int digito = aux % 2;
            decimal += digito * mul;
            mul *= 2;
            aux /= 10;
        }

        return decimal;
    }

    /*
     Ejercicio: Crear un método que permita convertir de base 10
     a hexadecimal
     8:50
     */

    public static int decimalABase(int decimal, int base) {
        int mul = 1;
        int resultado = 0;
        int aux = decimal;

        while (aux != 0) {
            int digito = aux % base;
            resultado = digito * mul + resultado;
            mul *= 10;
            aux /= base;
        }

        return resultado;
    }

    public static int hexadecimalADecimal(String hex) {
        int decimal = 0;
        int mul = 1;

        for (int i = hex.length() - 1; i >= 0; i--) {
            char digito = hex.charAt(i);
            int digitoNumeral = 0;
            switch (digito) {
                case 'a':
                    digitoNumeral = 10;
                    break;
                case 'b':
                    digitoNumeral = 11;
                    break;
                case 'c':
                    digitoNumeral = 12;
                    break;
                case 'd':
                    digitoNumeral = 13;
                    break;
                case 'e':
                    digitoNumeral = 14;
                    break;
                case 'f':
                    digitoNumeral = 15;
                    break;
                default:
                    String numeroCadena = Character.toString(digito);
                    digitoNumeral = Integer.parseInt(numeroCadena);
                    break;
            }

            decimal += digitoNumeral * mul;
            mul *= 16;
        }

        return decimal;
    }

    public static void cuadradoMagico(int n) {
        int aux = n;
        int mul = 1;
        int cont = 0;

        while (aux != 0) {
            mul *= 10;
            cont++;
            aux = aux / 10;
        }

        mul /= 10;
        aux = n;

        for (int i = 1; i <= cont; i++) {
            System.out.println(aux);
            int digito = aux % 10;
            aux = digito * mul + aux / 10;
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducir un numero");
        num = scanner.nextInt();

        Algoritmos algoritmos = new Algoritmos();

        /*if (algoritmos.esPar(num)) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }*/

        String texto = (algoritmos.esPar(num)) ? "El numero es par" : "El numero es impar";
        System.out.println(texto);

        algoritmos.contar(10);

        int fact = algoritmos.factorial(5);
        System.out.println("El factorial de 5 es " + fact);

        System.out.println("Los dígitos de 1234 son:");
        algoritmos.visualizarDigitos(1234);

        int invertido = algoritmos.invertirDigitos(1234);
        System.out.println("El número 1234 invertido es " + invertido);

        // Operador terciario
        int valor = 2;
        String ciudad = (valor == 1) ? "Cochabamba" : "Otra ciudad";
        System.out.println(ciudad);

        algoritmos.verificarSalario(7000);

        System.out.println(Algoritmos.decimalABinario(14));
        System.out.println(Algoritmos.decimalABase(14, 8));
        System.out.println(Algoritmos.binarioADecimal(1000));
        System.out.println(Algoritmos.decimalAHex(127));
        System.out.println(Algoritmos.hexadecimalADecimal("fe"));

        Algoritmos.cuadradoMagico(1234);
    }
}
