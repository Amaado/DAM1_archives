

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números aleatorios a generar: ");
        int cantidadNumeros = scanner.nextInt();

        System.out.print("Ingrese la ruta del archivo para guardar los números: ");
        String rutaArchivo = scanner.next();

        generarYGuardarNumeros(cantidadNumeros, rutaArchivo);
        mostrarNumerosGuardados(rutaArchivo);

        scanner.close();
    }

    private static void generarYGuardarNumeros(int cantidadNumeros, String rutaArchivo) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(rutaArchivo, true))) {
            Random random = new Random();

            for (int i = 0; i < cantidadNumeros; i++) {
                int numeroAleatorio = random.nextInt(101); // Números aleatorios entre 0 y 100 (inclusive)
                dataOutputStream.writeInt(numeroAleatorio);
            }

            System.out.println("Números aleatorios generados y guardados en el archivo correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    private static void mostrarNumerosGuardados(String rutaArchivo) {
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(rutaArchivo))) {
            System.out.println("Números aleatorios guardados en el archivo:");
            while (dataInputStream.available() > 0) {
                int numero = dataInputStream.readInt();
                System.out.println(numero);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

