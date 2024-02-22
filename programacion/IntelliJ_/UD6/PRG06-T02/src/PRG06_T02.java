import java.util.Arrays;
import java.util.Random;

public class PRG06_T02 {
    public static void main(String[] args) {
        double num = 0;
        int[] ar1 = new int[20];

        //Creamos un array con números aleatorios ('ar1').
        for (int i=0;i<ar1.length;i++){
            num = Math.random()*100;
            int numInt = (int) num;

            if (num == 100){
                i--;
                continue;
            }

            ar1[i]=numInt;
        }
        System.out.println("\nArray aleatorio de 20 números (entre 0 y 99): \n"+Arrays.toString(ar1));

        /*
        Aquí asignamos los primos al otro array('ar2').
        */
        int[] ar2 = new int[20];
        int contador = 0;
        for (int i=0;i<ar1.length;i++){
            boolean esPrimo = true;
            int divisor = 0;

            if (ar1[i]>0){
                for (divisor=2;divisor<=ar1[i]/2;divisor++){
                    if ((ar1[i] % divisor)==0){
                        esPrimo = false;
                    }
                }
                if (esPrimo) {
                    contador++;
                    ar2[i] = ar1[i];
                }
            }
        }


        /*
        El problema es que 'ar2' tiene 20 numeros almacenados, los numeros primos y el resto de posiciones con el número 0.
        Para solucionar esto, tenemos 'contador'. Metemos 'contador' como la longitudo del tercer array ('ar3').
        */
        int[] ar3 = new int[contador];


        //Asignacion de primos a 'ar3' con la longitud correcta.
        int contador2=0;
        for (int i=0;i<ar1.length;i++){
            boolean esPrimo = true;
            int divisor = 0;

            if (ar1[i]>0){
                for (divisor=2;divisor<=ar1[i]/2;divisor++){
                    if ((ar1[i] % divisor)==0){
                        esPrimo = false;
                    }
                }
                if (esPrimo) {
                    ar3[contador2] = ar1[i];
                    contador2++;
                }
            }
        }

        //El print de 'ar2':
        //System.out.println("\nAr2:\n"+Arrays.toString(ar2));
        System.out.println("\nNúmeros primos del array:\n"+Arrays.toString(ar3));

    }
}
