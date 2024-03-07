package andres;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String [] nombres = new String[5];
        System.out.println("Ingresa 5 nombres: ");

        for (int i=0;i<nombres.length;i++){

            System.out.println("Nombre "+(i+1));
            nombres[i]=entrada.nextLine();
        }

        System.out.println("\nNombres de más de 5 caracteres: ");
        for (int i=0;i<nombres.length;i++){
            if (nombres[i].length()>5){
                System.out.println(nombres[i]);
            }
        }



    }
}
