package org.rosalia.repaso2;

import java.util.Random;

public class LetrasAleatorias {
    public static void main(String[] args) {
        char[] mayusculas = generarMayusculas();
        char[] minusculas = generarMinusculas();

        char[] alternas = new char[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                alternas[i] = mayusculas[rand.nextInt(mayusculas.length)];
            } else {
                alternas[i] = minusculas[rand.nextInt(minusculas.length)];
            }
        }

        // Imprimir el array MAY
        System.out.println("Array MAY:");
        for (char letra : mayusculas) {
            System.out.print(letra);

        }
        System.out.println();
        // Imprimir el array MAY
        System.out.println("Array min:");
        for (char letra : minusculas) {
            System.out.print(letra);

        }
        System.out.println();
        // Imprimir el array alternas
        System.out.println("Array alternas:");
        for (char letra : alternas) {
            System.out.print(letra);
        }
    }

    // Método para generar el array de mayúsculas
    public static char[] generarMayusculas() {
        char[] mayusculas = new char[26];
        for (int i = 0; i < 26; i++) {
            mayusculas[i] = (char) ('A' + i);
        }
        return mayusculas;
    }

    // Método para generar el array de minúsculas
    public static char[] generarMinusculas() {
        char[] minusculas = new char[26];
        for (int i = 0; i < 26; i++) {
            minusculas[i] = (char) ('a' + i);
        }
        return minusculas;
    }
}

