package andres;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos números vas a introducir?");
        int tamanho = entrada.nextInt();
        int [] array = new int[tamanho];

        for (int i=0;i<tamanho;i++){
            System.out.print("Numero "+(i+1)+": ");
            array[i]=entrada.nextInt();
        }

        entrada.nextLine();
        while (true){

            System.out.println("Que operación quiere realizar? (. para salir)");
            System.out.println("1. Suma");
            System.out.println("2. Producto");
            System.out.println("3. Concatenación");
            String opcion = entrada.nextLine();
            if (opcion.equals(".")){
                break;
            }
            switch (opcion){
                case "1":
                    calcularSuma(array);
                    break;
                case "2":
                    calcularProducto(array);
                    break;
                case "3":
                    concatenar(array);
                    break;
            }


        }
        System.out.println("Adios");
    }

    private static void calcularSuma(int[] array){
        int suma = 0;
        for (int i=0;i<array.length;i++){
            suma += array[i];
        }
        System.out.println("Suma: "+suma);
        System.out.println("");

    }

    private static void calcularProducto(int[] array){
        int producto = 1;
        for (int i=0;i<array.length;i++){
            producto *= array[i];
        }
        System.out.println("Producto: "+producto);
        System.out.println("");
    }

    private static void concatenar(int[] array){
        System.out.print("Concatenación: ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println("\n");
    }

}
