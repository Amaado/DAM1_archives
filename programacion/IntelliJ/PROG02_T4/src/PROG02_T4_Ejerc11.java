import java.util.Scanner;

public class PROG02_T4_Ejerc11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("CALCULADORA DE PRECIOS MEDIOS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Introduce los tres números en la misma línea separados por espacios: ");
        double precio1= input.nextDouble();
        double precio2= input.nextDouble();
        double precio3= input.nextDouble();

        double media = (precio1 + precio2 + precio3) / 3;
        System.out.println("La media es: "+media);
    }
}
