package edu.umss.unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio1Arreglos {
    public static int[] generarSerieIntercalada(int n) {
        int cont = 2;
        int signo = 1;
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            resultado[i] = cont * signo;
            signo *= -1;
            cont += 2;
        }

        return resultado;
    }

    public static int[] invertirArreglo(int[] arreglo) {
        int n = arreglo.length;
        int[] invertido = new int[n];

        for (int i = 0; i < n; i++) {
            invertido[n - 1 - i] = arreglo[i];
        }

        return invertido;
    }

    public static int[] invertirArregloInPlace(int[] arreglo) {


        for (int i = 0; i < arreglo.length / 2; i++) {
            int aux = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = aux;
        }

        return arreglo;
    }

    public static int encontrarMaximo(int[] arreglo) {
        // Devolver el máximo valor almacenado en el arreglo
        // Asumir que todos los elementos del arreglo son mayores a 0
        // 15, 20, 10, 50, 45, 9, 8 -> devolver 50
        int max = 0;

        for (int elemento : arreglo) {
            if (elemento > max) {
                max = elemento;
            }
        }

        return max;
    }

    public static int encontrarMinimo(int[] arreglo) {
        int min = 1000;

        for (int elemento : arreglo) {
            if (elemento < min) {
                min = elemento;
            }
        }

        return min;
    }

    public static int[] extraerDigitos(int n) {
        int nDigitos = (int)Math.log10(n) + 1; //Casteo
        int[] arreglo = new int[nDigitos];
        int aux = n;
        int cont = 0;

        while (aux != 0) {
            int digito = aux % 10;
            arreglo[arreglo.length - cont - 1] = digito;
            cont++;
            aux /= 10;
        }

        return arreglo;
    }

    public static void visualizarArreglo(int[] arreglo) {
        /*for (int j = 0; j < arreglo.length; j++) {
            System.out.print(arreglo[j] + "\t");
        }*/

        for (int elemento : arreglo) {
            System.out.print(elemento + "\t");
        }

        System.out.println();
    }

    public static int[] generarSerieFibonacci(int n) {
        int[] arreglo = new int[n];
        int a = 0, b = 1, c = 0;

        for (int cont = 0; cont < arreglo.length; cont++) {
            c = a + b;
            b = a;
            a = c;

            arreglo[cont] = a;
        }

        return arreglo;
    }

    public static void main(String[] args) {
        /*int[] arreglo1 = new int[12];
        //int longitud = arreglo1.length;

        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = (i + 1) * 10;
        }

        int[] arregloFibonacci = Ejercicio1Arreglos.generarSerieFibonacci(7);
        Ejercicio1Arreglos.visualizarArreglo(arregloFibonacci);

        String[] nombres = new String[3];
        System.out.println("Introduzca los nombres de tres personas");
        int cont = 0;

        while (cont < 3) {
            System.out.println("Introduzca nombre");
            Scanner scanner = new Scanner(System.in);
            nombres[cont] = scanner.next();
            cont++;
        }

        System.out.println(nombres[1]);

        // Ejercicio: Para cada uno de los nombres introducidos
        // mostrar la inicial
        // 9:40

        int longitud = nombres.length;

        for (int i = 0; i < longitud; i++) {
            System.out.println("La inicial es " + nombres[i].charAt(0));
        }

        System.out.println("Utilizando alternativa de bucle for");

        for (String nombre : nombres) {  // For-each
            System.out.println("La inicial de " + nombre + " es " + nombre.charAt(0));
        }

        int [] serie = Ejercicio1Arreglos.generarSerieIntercalada(7);
        Ejercicio1Arreglos.visualizarArreglo(serie);

        int [] numeros = {15, 20, 10, 50, 100, 9, 8};
        int max = Ejercicio1Arreglos.encontrarMaximo(numeros);
        int min = Ejercicio1Arreglos.encontrarMinimo(numeros);
        System.out.println("El maximo valor es " + max);
        System.out.println("El minimo valor es " + min);

        int[] arreglo = Ejercicio1Arreglos.extraerDigitos(601602);
        Ejercicio1Arreglos.visualizarArreglo(arreglo);*/

        int[] arreglo1 = {10, 20, 30, 40, 50};
        //int[] invertido = Ejercicio1Arreglos.invertirArreglo(arreglo1);}
        int[] invertido = Ejercicio1Arreglos.invertirArregloInPlace(arreglo1);
        Ejercicio1Arreglos.visualizarArreglo(invertido);
    }
}
