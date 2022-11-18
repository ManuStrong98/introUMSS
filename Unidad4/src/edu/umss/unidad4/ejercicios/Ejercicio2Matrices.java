package edu.umss.unidad4.ejercicios;

public class Ejercicio2Matrices {
    // Definicion de constantes
    public static final int OPERACION_SUMA = 1;
    public static final int OPERACION_RESTA = 2;
    public static final int OPERACION_HADAMARD = 3;

    public static void llenarMatrizConNumeros(int[][] matriz) {
        int cont = 0;
        int filas = matriz.length;
        int cols = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = ++cont;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int cols = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int cols = matriz1[0].length;

        int filas2 = matriz2.length;
        int cols2 = matriz2[0].length;

        if (filas != filas2 || cols != cols2) {
            System.out.println("Las dimensiones no coinciden");
            return null;
        }

        int[][] resultado = new int[filas][cols];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    public static int[][] operarMatrices(int[][] matriz1, int[][] matriz2, int operacion) {
        // operacion 1: suma
        // operacion 2: resta
        // operacion 3: producto de Hadamard
        int filas = matriz1.length;
        int cols = matriz1[0].length;

        int filas2 = matriz2.length;
        int cols2 = matriz2[0].length;

        if (filas != filas2 || cols != cols2) {
            System.out.println("Las dimensiones no coinciden");
            return null;
        }

        int[][] resultado = new int[filas][cols];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                switch (operacion) {
                    case OPERACION_SUMA:
                        resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                        break;
                    case OPERACION_RESTA:
                        resultado[i][j] = matriz1[i][j] - matriz2[i][j];
                        break;
                    case OPERACION_HADAMARD:
                        resultado[i][j] = matriz1[i][j] * matriz2[i][j];
                        break;
                }

            }
        }

        return resultado;
    }

    public static int[][] transponerMatriz(int[][] mat) {
        int filas = mat.length;
        int cols = mat[0].length;
        int[][] transpuesta = new int[cols][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                transpuesta[j][i] = mat[i][j];
            }
        }

        return transpuesta;
    }

    public static void main(String[] args) {
        //int[][] matriz1 = new int[3][4];
        //int[][] matriz2 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};

        //Ejercicio2Matrices.mostrarMatriz(matriz1);
        //Ejercicio2Matrices.mostrarMatriz(matriz2);

        //Ejercicio2Matrices.llenarMatrizConNumeros(matriz1);
        //Ejercicio2Matrices.mostrarMatriz(matriz1);

        /*int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matriz2 = {{2, 0, -2}, {8, 4, 1}, {3, 5, 6}};
        //int[][] resultado = Ejercicio2Matrices.sumarMatrices(matriz1, matriz2);
        int[][] resultado = Ejercicio2Matrices.operarMatrices(matriz1, matriz2, Ejercicio2Matrices.OPERACION_SUMA);
        Ejercicio2Matrices.mostrarMatriz(resultado);*/

        int[][] mat = {{1,2}, {3,4}, {5,6}};
        int[][] transpuesta = Ejercicio2Matrices.transponerMatriz(mat);
        Ejercicio2Matrices.mostrarMatriz(transpuesta);

        double[][] matDoubles = {{-2.0, 4.0}, {2.5, 3.5}};
        System.out.println(matDoubles[0][1]);
    }
}
