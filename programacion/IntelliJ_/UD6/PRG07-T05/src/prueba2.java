import java.util.Scanner;

public class prueba2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca un número
        System.out.print("‖                                                                                                  ‖\n‖ ");
        System.out.print("Cuantos productos quieres añadir? ");
        int numero = scanner.nextInt();
        // Imprimir la barra superior


        System.out.print("‖");
        for (int i = 0; i < 98; i++) {
            System.out.print(" ");
        }
        System.out.println("‖");


        // Cerrar el escáner
        scanner.close();
    }
}
