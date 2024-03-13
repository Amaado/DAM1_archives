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

        /*System.out.println("A matriz suma é:");
        for (int i=0;i<tamanho;i++){
            for (int j=0;j<tamanho;j++){
                int suma = matrizA[i][j]+matrizB[i][j];
                System.out.print(suma+" ");
            }
            System.out.println("");
        }*/

        //MATRIZ A
        //Imprime las aperturas iniciales
        System.out.print("\n\n    ╭\t");
        for (int i=0;i<tamanho;i++){
            System.out.print("\t");
        }
        System.out.print("╮\n");

        for (int i=0;i<tamanho;i++){
            for (int j=0;j<tamanho;j++){
                if (i==((tamanho/2)) && j==0){//Pone la letra centrada
                    System.out.print("A = │\t"+matrizA[i][j]+"\t");
                    continue;

                }

                if (j==0){//Imprime las barras antes de los primeros elementos
                    System.out.print("    │\t"+matrizA[i][j]+"\t");
                    continue;
                }
                if (j==tamanho-1){//Imprime las barras despúes de los últimos elementos
                    System.out.print(matrizA[i][j]+"\t│");
                    continue;
                }


                System.out.print(matrizA[i][j]+"\t");//Imprime el resto de números
            }
            System.out.println("");
        }

        //Imprime los cierres finales
        System.out.print("    ╰\t");
        for (int i=0;i<tamanho;i++){
            System.out.print("\t");
        }
        System.out.print("╯\n\n");





        //MATRIZ B
        //Imprime las aperturas iniciales
        System.out.print("    ╭\t");
        for (int i=0;i<tamanho;i++){
            System.out.print("\t");
        }
        System.out.print("╮\n");

        for (int i=0;i<tamanho;i++){
            for (int j=0;j<tamanho;j++){
                if (i==((tamanho/2)) && j==0){//Pone la letra centrada
                    System.out.print("B = │\t"+matrizB[i][j]+"\t");
                    continue;

                }

                if (j==0){//Imprime las barras antes de los primeros elementos
                    System.out.print("    │\t"+matrizB[i][j]+"\t");
                    continue;
                }
                if (j==tamanho-1){//Imprime las barras despúes de los últimos elementos
                    System.out.print(matrizB[i][j]+"\t│");
                    continue;
                }


                System.out.print(matrizB[i][j]+"\t");//Imprime el resto de números
            }
            System.out.println("");
        }

        //Imprime los cierres finales
        System.out.print("    ╰\t");
        for (int i=0;i<tamanho;i++){
            System.out.print("\t");
        }
        System.out.print("╯\n\n");







        //MATRIZ "A+B"
        //Imprime las aperturas iniciales
        System.out.print("      ╭\t");
        for (int i=0;i<tamanho;i++){
            for (int j=0;j<tamanho;j++){
                String lenght = String.valueOf(matrizA[i][j]);
                int lenght2 = lenght.length()-1;
                for (int k=0;k<lenght2;k++){
                    System.out.print(" ");
                }
            }
            System.out.print("\t");
        }
        System.out.print("╮\n");

        for (int i=0;i<tamanho;i++){
            for (int j=0;j<tamanho;j++){
                if (i==((tamanho/2)) && j==0){//Pone la letra centrada
                    System.out.print("A+B = │\t"+matrizA[i][j]+"+"+matrizB[i][j]+"\t");
                    continue;

                }

                if (j==0){//Imprime las barras antes de los primeros elementos
                    System.out.print("      │\t"+matrizA[i][j]+"+"+matrizB[i][j]+"\t");
                    continue;
                }
                if (j==tamanho-1){//Imprime las barras despúes de los últimos elementos
                    System.out.print(matrizA[i][j]+"+"+matrizB[i][j]+"\t│");
                    continue;
                }


                System.out.print(matrizA[i][j]+"+"+matrizB[i][j]+"\t");//Imprime el resto de números
            }
            System.out.println("");
        }

        //Imprime los cierres finales
        System.out.print("      ╰\t");
        for (int i=0;i<tamanho;i++){
            for (int j=0;j<tamanho;j++){
                String lenght = String.valueOf(matrizA[i][j]);
                int lenght2 = lenght.length()-1;
                for (int k=0;k<lenght2;k++){
                    System.out.print(" ");
                }
            }
            System.out.print("\t");
        }
        System.out.print("╯\n\n");

    }
}
