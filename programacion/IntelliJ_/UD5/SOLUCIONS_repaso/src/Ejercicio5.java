
import java.io.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        String archivoEntrada = "entrada.txt";
        String archivoSalida = "lineasFiltradas.txt";
        String prefijo = "O"; // Prefijo a buscar en las líneas

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida))) {

            String linea;

            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith(prefijo)) {
                    writer.write(linea);
                    writer.newLine();
                }
            }

            System.out.println("Líneas filtradas correctamente.");

        } catch (IOException e) {
            System.err.println("Error al filtrar líneas: " + e.getMessage());
        }
    }
}
