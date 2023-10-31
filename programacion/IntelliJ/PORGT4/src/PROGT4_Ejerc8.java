import java.util.Scanner;

public class PROGT4_Ejerc8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("CALCULADORA DE ÁREA DE TRIÁNGULOS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Introduce la base: ");
        float base= Float.parseFloat(input.nextLine());

        System.out.println("Introduce la altura: ");
        float alto= Float.parseFloat(input.nextLine());

        float area;
        area=(alto*base)/2;
        System.out.println("Área= "+area);
    }
}
