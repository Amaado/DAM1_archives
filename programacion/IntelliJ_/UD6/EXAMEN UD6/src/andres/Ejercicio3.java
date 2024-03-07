package andres;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("-----------------------\nENCONTRAR MAYOR Y MENOR\n-----------------------\n");
        System.out.println("Cuantos números vas a introducir?");
        int tamanho = entrada.nextInt();

        double [] array = new double[tamanho];

        for (int i=0;i<tamanho;i++){
            System.out.print("Numero "+(i+1)+": ");
            array[i]=entrada.nextDouble();
        }

        encontrarMayorMenor(array);

    }

    private static void encontrarMayorMenor(double[] array){
        double numMayor;
        double numMenor;

        numMayor = array[0];
        numMenor = array[0];

        for (int i=0;i<array.length;i++){
            if (array[i]<numMenor){
                numMenor=array[i];
            }
            if (array[i]>numMayor){
                numMayor=array[i];
            }
        }
        double [] arrayFinal = new double[2];
        arrayFinal[0] = numMayor;
        arrayFinal[1] = numMenor;

        System.out.println(Arrays.toString(arrayFinal));

    }
}
