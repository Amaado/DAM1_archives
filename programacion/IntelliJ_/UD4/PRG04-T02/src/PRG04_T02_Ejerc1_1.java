import java.util.Scanner;

public class PRG04_T02_Ejerc1_1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora de múltiplos \n -----------------------");
        System.out.println("Introduce N1");
        int N1=entrada.nextInt();
        System.out.println("Introduce N2");
        int N2=entrada.nextInt();

        if (N1 % N2 == 0){
            System.out.println(N1+" es múltiplo de "+N2);
        }else{
            System.out.println(N1+" no es múltiplo de "+N2);
        }
    }
}
