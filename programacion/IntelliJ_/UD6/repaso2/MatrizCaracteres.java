package org.rosalia.repaso2;

import java.util.Scanner;

public class MatrizCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las dimensiones de la matriz
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        // Crear la matriz y asignar los caracteres
        char[][] matriz = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
                    matriz[i][j] = '*'; // Carácter '*' para el marco
                } else {
                    matriz[i][j] = '-'; // Carácter '-' para el relleno
                }
            }
        }

        // Mostrar la matriz por pantalla
        System.out.println("Matriz generada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}

