import java.util.Scanner;

public class PRG04_T02_Ejerc1_2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora de números pares o impares \n -------------------------------------");
        System.out.println("Introduce N1");
        int N1=entrada.nextInt();

        if (N1==0){
            System.out.println("0 es un número par");
        }else{
            if (N1 % 2 ==0){
                System.out.println(N1+" es un número par");
            }else{
                System.out.println(N1+" es un número impar");
            }
        }
    }
}
