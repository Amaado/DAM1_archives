import java.util.Arrays;
import java.util.Scanner;

public class PRG06_T01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] ar1 = new int[10];


        for (int i=0;i<=9;i++){
            System.out.println("Escribe un numero: ");
            int numero = entrada.nextInt();
            ar1[i] = numero;
        }

        int numMax=ar1[0];
        int numMin=ar1[0];
        int posiMax=ar1[0];
        int posiMin=ar1[0];

        for (int i=0;i<=ar1.length-1;i++){
            if (ar1[i]>numMax){
                numMax=ar1[i];
                posiMax=i+1;
            }
            if (ar1[i]<numMin){
                numMin=ar1[i];
                posiMin=i+1;
            }
        }

        System.out.println("\nNumero mayor: "+numMax+" (Posicion "+posiMax+"º posición)");
        System.out.println("Numero menor: "+numMin+" (Posicion "+posiMin+"º posición)");

    }
}
