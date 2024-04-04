package andres;

import java.util.Arrays;
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



        //Cálculo de caracteres

        String[] matrizS = new String[tamanho * tamanho * 2];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                int variable = matrizA[i][j];
                matrizS[i*tamanho + j] = String.valueOf(variable);
            }
        }

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                int variable = matrizB[i][j];
                matrizS[i*tamanho + j + tamanho*tamanho] = String.valueOf(variable);
            }
        }


        //Ordena la matrizS dejando en la posición 0 el numero con más caracteres
        Arrays.sort(matrizS, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        int caracteres = matrizS[0].length();

        System.out.println(Arrays.toString(matrizS));







        // Matriz A
        imprimirMatriz("A", matrizA, tamanho, caracteres);

        // Matriz B
        imprimirMatriz("B", matrizB, tamanho, caracteres);

        // Matriz A+B
        imprimirMatrizSuma("A+B", matrizA, matrizB, tamanho, caracteres);

    }

    public static void imprimirMatriz(String nombre, int[][] matriz, int tamanho, int caracteres) {
        // Imprime las aperturas iniciales
        System.out.printf("%7s ╭", "");
        System.out.print("\t");

        for (int i=0;i<tamanho;i++){
            for (int j=0;j<caracteres-1;j++){
                System.out.print(" ");
            }
            System.out.print("\t");
        }
        System.out.println("╮");

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (j == 0) {
                    System.out.printf("%7s │\t%d", (i == tamanho / 2 && j == 0) ? nombre + " =" : "", matriz[i][j]);

                    int caracteresAanhadir = caracteres-String.valueOf(matriz[i][j]).length();
                    for (int k=0;k<caracteresAanhadir;k++){
                        System.out.print(" ");
                    }
                    continue;
                }
                System.out.printf("\t%d", matriz[i][j]);

                int caracteresAanhadir = caracteres-String.valueOf(matriz[i][j]).length();
                for (int k=0;k<caracteresAanhadir;k++){
                    System.out.print(" ");
                }
            }
            System.out.println("\t│");
        }


        // Imprime los cierres finales
        System.out.printf("%7s ╰", "");
        System.out.print("\t");

        for (int i=0;i<tamanho;i++){
            for (int j=0;j<caracteres-1;j++){
                System.out.print(" ");
            }
            System.out.print("\t");
        }
        System.out.println("╯");
    }

    public static void imprimirMatrizSuma(String nombre, int[][] matrizA, int[][] matrizB, int tamanho, int caracteres) {
        String espacio = " ";
















        // Imprime las aperturas iniciales
        System.out.printf("%9s ╭", "");
        System.out.print("\t");

        for (int i=0;i<tamanho;i++){

            for (int j=0;j<caracteres-1;j++){
                System.out.print(" ");
            }
            System.out.print("   ");
            for (int j=0;j<caracteres-1;j++){
                System.out.print(" ");
            }

            if (i!= tamanho-1){
                System.out.print("\t\t\t");
            }else{
                System.out.print("\t");
            }

        }
        System.out.println("╮");

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (j == 0) {
                    int caracteresAanhadirA = caracteres - String.valueOf(matrizA[i][j]).length();
                    int caracteresAanhadirB = caracteres - String.valueOf(matrizB[i][j]).length();

                    System.out.printf("%9s │\t%d", (i == tamanho / 2 && j == 0) ? nombre + " =" : "", matrizA[i][j]);

                    for (int k = 0; k < caracteresAanhadirA; k++) {
                        System.out.print(espacio);
                    }

                    System.out.print(" + ");

                    for (int k = 0; k < caracteresAanhadirB; k++) {
                        System.out.print(espacio);
                    }
                    System.out.printf("%d", matrizB[i][j]);

                    //System.out.print("\t\t");
                    continue;
                }
                int caracteresAanhadirA = caracteres - String.valueOf(matrizA[i][j]).length();
                int caracteresAanhadirB = caracteres - String.valueOf(matrizB[i][j]).length();

                System.out.print("\t\t");
                System.out.printf("\t%d", matrizA[i][j]);
                for (int k = 0; k < caracteresAanhadirA; k++) {
                    System.out.print(espacio);
                }

                System.out.print(" + ");

                for (int k = 0; k < caracteresAanhadirB; k++) {
                    System.out.print(espacio);
                }
                System.out.printf("%d", matrizB[i][j]);

            }

            System.out.print("\t│  ");

            for (int j = 0; j < tamanho; j++) {
                if (j == 0) {
                    int suma = matrizA[i][j]+matrizB[i][j];
                    System.out.printf("%s │\t%d", " =  ", suma);

                    int caracteresAanhadir = caracteres-String.valueOf(suma).length();
                    for (int k=0;k<caracteresAanhadir;k++){
                        System.out.print(" ");
                    }
                    continue;
                }

                int suma = matrizA[i][j]+matrizB[i][j];
                System.out.printf("\t%d", suma);

                int caracteresAanhadir = caracteres-String.valueOf(suma).length();
                for (int k=0;k<caracteresAanhadir;k++){
                    System.out.print(" ");
                }
            }
            System.out.print("\t│\n");
        }

        // Imprime los cierres finales
        System.out.printf("%9s ╰", "");
        System.out.print("\t");

        for (int i=0;i<tamanho;i++){

            for (int j=0;j<caracteres-1;j++){
                System.out.print(" ");
            }
            System.out.print("   ");
            for (int j=0;j<caracteres-1;j++){
                System.out.print(" ");
            }

            if (i!= tamanho-1){
                System.out.print("\t\t\t");
            }else{
                System.out.print("\t");
            }

        }
        System.out.println("╯");
    }

}