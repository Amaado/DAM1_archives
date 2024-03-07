package org.rosalia.repaso2;

public class MatrizUnitaria {
    public static void main(String[] args) {
        int[][] matrizUnitaria = generarMatrizUnitaria(10);
        escribirMatriz(matrizUnitaria);
    }

    // Método para generar una matriz unitaria de orden n
    public static int[][] generarMatrizUnitaria(int n) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            matriz[i][i] = 1; // Establecer los elementos de la diagonal principal como 1
        }
        return matriz;
    }

    // Método para escribir una matriz
    public static void escribirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}

