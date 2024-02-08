import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PRG05_T04 {
    public static void main(String[] args) {
        String nombreArchivo = "C:/Users/DAM1_Alu02/Documents/GitHub/DAM1_archives/programacion/IntelliJ_/UD5/PRG05-T04/src/CrearFichero.txt";
        String contenidoInicial = "Este es el archivo de texto creado";

        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(contenidoInicial);

            bufferedWriter.close();

            System.out.println("Se ha creado el archivo '" + nombreArchivo + "' con el contenido inicial.");
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }

        String contenidoAdicional = "\nEsto es lo añadido al texto creado";

        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(contenidoAdicional);

            bufferedWriter.close();

            System.out.println("Se ha añadido contenido adicional al archivo '" + nombreArchivo + "'.");
        } catch (IOException e) {
            System.err.println("Error al añadir contenido al archivo: " + e.getMessage());
        }
    }
}
