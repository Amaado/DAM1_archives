import java.util.Scanner;

public class PRG04_T02_Ejerc2_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingrese un número entero positivo: ");
        num = entrada.nextInt();
        boolean esPrimo = true;
        int divisor = 0;

        if (num>0){
            for (divisor=2;divisor<=num/2;divisor++){
                if ((num % divisor)==0){
                    esPrimo = false;
                }
            }
            if (esPrimo){
                System.out.println(num+" es un número primo.");
            }else{
                System.out.println(num+" no es un número primo.");
            }
        }else {
            System.out.println("El número no es entero o positivo.");
            main(args);
        }

    }
}
