import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("CALCULADORA DA ECUACIÓN: C1x + C2 = 0");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Pedimos los datos
        System.out.println("Introduce C1: ");
        double C1= sc.nextDouble();

        System.out.println("Introduce C2: ");
        double C2=sc.nextDouble();

        //Cálculo de la ecuación
        double x=(-C2/C1);
        System.out.println("El resultado de "+C1+"x + "+C2+" = "+x);
    }
}
