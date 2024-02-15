

import java.io.*;
import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        String archivoEntrada = "nuevo.txt";
        String archivoSalida = "contadorPalabras.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida))) {

            String linea;
            int contadorPalabras = 0;

            while ((linea = reader.readLine()) != null) {
                String[] palabras = linea.split("\\s+"); // Dividir la línea en palabras usando espacios en blanco como delimitador
                contadorPalabras += palabras.length;
                System.out.println(Arrays.toString(palabras));
            }

            writer.write("El número de palabras en el archivo es: " + contadorPalabras);
            System.out.println("El número de palabras en el archivo es: " + contadorPalabras);
            System.out.println("Conteo de palabras completado.");

        } catch (IOException e) {
            System.err.println("Error al contar palabras: " + e.getMessage());
        }
    }
}

