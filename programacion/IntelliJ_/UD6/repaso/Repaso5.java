package org.rosalia.repaso;

import java.util.Scanner;

public class Repaso5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el número de comensales
        int numComensales;
        do {
            System.out.println("Introduce el número de comensales (entre 1 y 5):");
            numComensales = scanner.nextInt();
        } while (numComensales < 1 || numComensales > 5);

        // Crear un array para almacenar los menús de cada comensal
        int[] menus = new int[numComensales];

        // Pedir el menú para cada comensal
        for (int i = 0; i < numComensales; i++) {
            int menu;
            do {
                System.out.println("Introduce el menú seleccionado por el comensal " + (i + 1) + " (1, 2 o 3):");
                menu = scanner.nextInt();
            } while (menu < 1 || menu > 3);
            menus[i] = menu;
        }

        // Mostrar los menús seleccionados por cada comensal
        System.out.println("Menús solicitados por cada comensal:");
        for (int i = 0; i < numComensales; i++) {
            System.out.println("Comensal " + (i + 1) + ": Menú " + menus[i]);
        }

        scanner.close();
    }
}

