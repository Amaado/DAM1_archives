import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();

        // Llamar a la función para sumar los dígitos e imprimir el resultado
        int suma = sumarDigitos(numero);
        System.out.println("La suma de los dígitos es: " + suma);

        sc.close();
    }

    // Función para sumar los dígitos de un número
    public static int sumarDigitos(int num) {
        int suma = 0;

        // Iterar mientras haya dígitos en el número
        while (num != 0) {
            // Obtener el último dígito y sumarlo
            suma += num % 10;

            // Eliminar el último dígito del número
            num /= 10;
        }

        return suma;
    }
}
