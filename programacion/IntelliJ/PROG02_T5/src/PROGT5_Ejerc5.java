
import java.util.Scanner;

public class PROGT5_Ejerc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer caracter: ");
        char caracter1 = sc.nextLine().charAt(0);
        System.out.print("Introduce el segundo caracter: ");
        char caracter2 = sc.nextLine().charAt(0);

        System.out.println("OPERACIONES REALIZADAS");
        System.out.println("----------------------");
        System.out.println("El valor número de " + caracter1 + " es " + ((int)caracter1) + " y de "+ caracter2 + " es " + ((int)caracter2));
        System.out.println("Concatenación: " + caracter1 + caracter2);
        int valorNumerico = (caracter1 + caracter2);
        System.out.println("Suma de valores numéricos: " + valorNumerico);
    }
}
