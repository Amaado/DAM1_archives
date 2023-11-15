package prog2_tarea05;
import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char char1, char2;

        System.out.println("Programa de Aritmética de Caracteres (Versión Simplificada)");
        System.out.print("Ingrese el primer carácter: ");
        char1 = scanner.next().charAt(0);

        System.out.print("Ingrese el segundo carácter: ");
        char2 = scanner.next().charAt(0);

        System.out.println("OPERACIONES REALIZADAS:");
        System.out.println("-------------------------");

        System.out.println("El valor numérico de "+char1 +" es " + (int)char1+ " y de "+char2+ " es "+(int)char2);
        System.out.println("Concatenación: " + char1+char2);
        System.out.println("Suma de valores numéricos: " + ((int)char1+(int)char2));


        scanner.close();
    }
}

