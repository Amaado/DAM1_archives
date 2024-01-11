import java.util.Scanner;

public class PRG04_T02_Ejerc1_3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce N1");
        int N1=entrada.nextInt();
        System.out.println("Introduce N2");
        int N2=entrada.nextInt();
        System.out.println("Introduce N3");
        int N3=entrada.nextInt();
        int mayor = N1;

        if ((N1==N2)&&(N2==N3)){
            System.out.println("Los tres números son iguales");
        }else{
            if (N2 > mayor){
                mayor = N2;
            }
            if (N3 > mayor){
                mayor = N3;
            }
        }

        System.out.println("El número mayor de los tres es: "+mayor);
    }
}
