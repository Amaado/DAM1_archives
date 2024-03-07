package org.rosalia.repaso;

import java.util.Scanner;

public class Repaso3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de números a ingresar
        System.out.print("Ingrese la cantidad de números a ingresar: ");
        int cantidadNumeros = scanner.nextInt();

        // Crear un array para almacenar los números
        int[] numeros = new int[cantidadNumeros];

        // Solicitar al usuario que ingrese los números
        System.out.println("Ingrese los números:");
        for (int i = 0; i < cantidadNumeros; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Imprimir la colección de números ingresados
        System.out.println("Colección de números ingresados:");
        imprimirArray(numeros);

        // Invertir el orden de los valores del array
        invertirArray(numeros);

        // Imprimir el orden inverso de los valores del array
        System.out.println("Orden inverso de los valores del array:");
        imprimirArray(numeros);

        scanner.close();
    }

    // Método para imprimir un array de números
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Método para invertir el orden de los valores del array
    public static void invertirArray(int[] array) {
        int inicio = 0;
        int fin = array.length - 1;
        while (inicio < fin) {
            // Intercambiar los valores en las posiciones inicio y fin
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;
            // Mover los índices de inicio y fin hacia el centro
            inicio++;
            fin--;
        }
    }
}

