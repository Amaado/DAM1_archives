import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingresa una cantidad numérica: ");
        int num = entrada.nextInt();

        for (int j = 0; j < num; j++){
            System.out.println(nombre);
        }
    }
}
