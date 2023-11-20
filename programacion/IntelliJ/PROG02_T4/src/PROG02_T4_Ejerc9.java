import java.util.Scanner;

public class PROG02_T4_Ejerc9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("CALCULADORA DE PRECIOS MEDIOS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Introduce la el precio del producto en el primer establecimiento (en €): ");
        float precio1= Float.parseFloat(input.nextLine());
        System.out.println("Introduce la el precio del producto en el segundo establecimiento (en €): ");
        float precio2= Float.parseFloat(input.nextLine());
        System.out.println("Introduce la el precio del producto en el tercer establecimiento (en €): ");
        float precio3= Float.parseFloat(input.nextLine());

        float precioMedio=(precio1+precio2+precio3)/3;
        System.out.println("El precio medio entre los tres establecimientos es "+precioMedio+"€");



    }
}
