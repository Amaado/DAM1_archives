import java.util.Scanner;

public class prueba1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos productos quieres añadir? ");
        int numero = scanner.nextInt();

        // Imprimir la primera línea
        System.out.print("  ‖");

        // Imprimir espacios en blanco para alinear el texto
        for (int i = 0; i < 98; i++) {
            System.out.print(" ");
        }

        // Imprimir la barra del final
        System.out.println("‖");

        // Imprimir la segunda línea con el número introducido
        System.out.printf("  ‖       Cuantos productos quieres añadir? %d", numero);

        // Imprimir espacios en blanco para alinear el texto
        for (int i = 0; i < 48 - String.valueOf(numero).length(); i++) {
            System.out.print(" ");
        }

        // Imprimir la barra del final
        System.out.println("‖");
    }
}