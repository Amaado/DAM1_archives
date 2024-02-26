package tarefasAV;

import java.io.*;

public class Tarefa8 {
    public static void main(String[] args) {
        String archivo1 = "archivo1.txt";
        String archivo2 = "archivo2.txt";
        String archivoCombinado = "archivoCombinado.txt";

        try (BufferedReader reader1 = new BufferedReader(new FileReader(archivo1));
             BufferedReader reader2 = new BufferedReader(new FileReader(archivo2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivoCombinado))) {

            String linea;
            // Copiar contenido del primer archivo al archivo combinado
            while ((linea = reader1.readLine()) != null) {
                writer.write(linea);
                writer.newLine();
            }

            // Copiar contenido del segundo archivo al archivo combinado
            while ((linea = reader2.readLine()) != null) {
                writer.write(linea);
                writer.newLine();
            }

            System.out.println("Archivos combinados correctamente.");

        } catch (IOException e) {
            System.err.println("Error al combinar archivos: " + e.getMessage());
        }
    }
}

