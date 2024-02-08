import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class PRG05_T01 {
    public static void main(String[] args) {
        String archivoEntrada = "C:/Users/DAM1_Alu02/Documents/GitHub/DAM1_archives/programacion/IntelliJ_/UD5/PRG05-T01/src/entrada.txt";
        String archivoSalida = "C:/Users/DAM1_Alu02/Documents/GitHub/DAM1_archives/programacion/IntelliJ_/UD5/PRG05-T01/src/salida.txt";

        try {
            FileReader fileReader = new FileReader(archivoEntrada);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(archivoSalida);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                bufferedWriter.write(linea);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("El contenido se ha copiado correctamente de '" + archivoEntrada + "' a '" + archivoSalida + "'");
        } catch (IOException e) {
            System.err.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
}

