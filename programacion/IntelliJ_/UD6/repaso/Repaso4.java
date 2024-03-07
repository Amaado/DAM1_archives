package org.rosalia.repaso;

import java.text.Normalizer;
import java.util.Scanner;

public class Repaso4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce una cadena:");
        String cadena = scanner.nextLine();

        if(esPalindromo(cadena)){
            System.out.println("La cadena \"" + cadena + "\" es un palíndromo. ");
        }else {
            System.out.println("La cadena \"" + cadena + "\" no es un palíndromo. ");


        }

        scanner.close();
    }

    public static boolean esPalindromo(String cadena) {
        // Normalizar la cadena para eliminar acentos
        cadena = Normalizer.normalize(cadena, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                .toLowerCase();

        // Eliminar caracteres no alfabéticos
        cadena = cadena.replaceAll("[^a-zA-Z]", "");

        // Convertir la cadena a un array de caracteres
        char[] caracteres = cadena.toCharArray();

        // Comparar los caracteres desde ambos extremos hacia el centro
        int i = 0;
        int j = caracteres.length - 1;
        while (i < j) {
            // Si los caracteres en las posiciones i y j no son iguales, no es un palíndromo
            if (caracteres[i] != caracteres[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true; // Si no se encontraron diferencias, es un palíndromo
    }
}

