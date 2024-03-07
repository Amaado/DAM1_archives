package andres;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Ingrese o tamaño das matrices cadradas (n x n): ");
        int tamanho = entrada.nextInt();

        int [][] matrizA = new int[tamanho][tamanho];
        int [][] matrizB = new int[tamanho][tamanho];

        System.out.println("Ingrese os elementos da matriz A:");
        for (int i=0;i<tamanho;i++){
            for (int j=0;j<tamanho;j++){

                System.out.print("Elemento ["+(i+1)+"]["+(j+1)+"]:");
                matrizA[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Ingrese os elementos da matriz B:");
        for (int i=0;i<tamanho;i++){
            for (int j=0;j<tamanho;j++){

                System.out.print("Elemento ["+(i+1)+"]["+(j+1)+"]:");
                matrizB[i][j] = entrada.nextInt();
            }
        }

        System.out.println("A matriz suma é:");
        for (int i=0;i<tamanho;i++){
            for (int j=0;j<tamanho;j++){
                int suma = matrizA[i][j]+matrizB[i][j];
                System.out.print(suma+" ");
            }
            System.out.println("");
        }


        // No hacer caso!!
        /*
        System.out.println("//MATRIZ A");
        for (int i=0;i<tamanho;i++){
            for (int j=0;j<tamanho;j++){
                if (i==tamanho-1 && j==0){
                    System.out.print("A = │ "+matrizA[i][j]);

                }else {
                    if (j==0){
                        System.out.print("    │ "+matrizA[i][j]);
                        break;
                    }
                    if (i==tamanho-1){
                        System.out.print(matrizA[i][j]+"  │");
                        break;
                    }
                    System.out.print(matrizA[i][j]+"  ");
                }
            }
            System.out.println("");
        }
        System.out.print("    ╰");
        */
    }
}
