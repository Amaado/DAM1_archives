import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        String numString = entrada.nextLine();
        int suma =0;
        int numLongitud = numString.length();

        for (numLongitud=0;numLongitud==numLongitud;numLongitud++){
            String caracter = numString.substring(0, numLongitud);

            suma = suma + Integer.parseInt(caracter);
        }

        System.out.println(suma);

        //Programa con errores. No funciona!
    }
}
