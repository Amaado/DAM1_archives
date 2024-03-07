package org.rosalia.repaso;

import java.util.Scanner;

public class Repaso2 {

    public static void main(String[] args) {
        int[] numeros = {5, 5, 9, 3, 45, 23, 45, 12, 87, 9, 6, 5};
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el valor a buscar y borrar
        System.out.println("Introduce el número que deseas buscar y borrar: ");
        int valorABuscar = scanner.nextInt();
        System.out.println("Valor a buscar y borrar: " + valorABuscar);

        System.out.print("Array inicial: ");
        printArray(numeros);

        // Borrar todas las ocurrencias del valor
        int ocurrencias = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorABuscar) {
                ocurrencias++;
                numeros[i] = Integer.MIN_VALUE; // Marcar ocurrencias con un valor especial
            }
        }

        // Crear un nuevo array sin las ocurrencias del valor a buscar
        int[] numerosFinal = new int[numeros.length - ocurrencias];
        int index = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != Integer.MIN_VALUE) {
                numerosFinal[index] = numeros[i];
                index++;
            }
        }

        // Mostrar el valor borrado y el array final
        System.out.println("Valor borrado: " + valorABuscar);
        System.out.print("Array final  : ");
        printArray(numerosFinal);

        scanner.close();
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
