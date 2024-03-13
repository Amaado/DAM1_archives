package andres;

import java.util.Scanner;

public class Ejercicio4_prueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese o tamaño das matrices cadradas (n x n): ");
        int tamanho = entrada.nextInt();

        int[][] matrizA = new int[tamanho][tamanho];
        int[][] matrizB = new int[tamanho][tamanho];

        System.out.println("Ingrese os elementos da matriz A:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("Elemento [%d][%d]: ", (i + 1), (j + 1));
                matrizA[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Ingrese os elementos da matriz B:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("Elemento [%d][%d]: ", (i + 1), (j + 1));
                matrizB[i][j] = entrada.nextInt();
            }
        }

        // Matriz A
        imprimirMatriz("A", matrizA, tamanho);

        // Matriz B
        imprimirMatriz("B", matrizB, tamanho);

        // Matriz A+B
        imprimirMatrizSuma("A+B", matrizA, matrizB, tamanho);

    }

    public static void imprimirMatriz(String nombre, int[][] matriz, int tamanho) {
        // Imprime las aperturas iniciales
        System.out.printf("%7s ╭", "");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("\t");
        }
        System.out.println("╮");

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (j == 0) {
                    System.out.printf("%7s │\t%d", (i == tamanho / 2 && j == 0) ? nombre + " =" : "", matriz[i][j]);
                    continue;
                }
                System.out.printf("\t%d", matriz[i][j]);
            }
            System.out.println("\t│");
        }

        // Imprime los cierres finales
        System.out.printf("%7s ╰", "");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("\t");
        }
        System.out.println("╯\n");
    }

    public static void imprimirMatrizSuma(String nombre, int[][] matrizA, int[][] matrizB, int tamanho) {
        // Imprime las aperturas iniciales
        System.out.printf("%9s ╭", "");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("\t");
        }
        System.out.println("╮");

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (j == 0) {
                    System.out.printf("%9s │\t%d+%d", (i == tamanho / 2 && j == 0) ? nombre + " =" : "", matrizA[i][j],
                            matrizB[i][j]);
                    continue;
                }
                System.out.printf("\t%d+%d", matrizA[i][j], matrizB[i][j]);
            }
            System.out.println("\t│");
        }

        // Imprime los cierres finales
        System.out.printf("%9s ╰", "");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("\t");
        }
        System.out.println("╯\n");
    }

}