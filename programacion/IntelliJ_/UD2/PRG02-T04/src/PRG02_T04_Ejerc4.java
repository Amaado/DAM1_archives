import java.util.Scanner;

public class PRG02_T04_Ejerc4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce la base imponible (precio sin IVA): ");
        double baseImponible = input.nextDouble();

        double tasaIVA = 0.21;

        double totalFactura = baseImponible * (1 + tasaIVA);

        System.out.println("El total de la factura es: " + totalFactura + " euros (incluyendo " + (tasaIVA * 100) + "% de IVA).");

        input.close();
    }
}
