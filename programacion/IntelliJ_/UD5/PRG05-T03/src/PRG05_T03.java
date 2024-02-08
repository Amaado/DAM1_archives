import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PRG05_T03 {
    public static void main(String[] args) {
        String archivoEntrada = "C:/Users/DAM1_Alu02/Documents/GitHub/DAM1_archives/programacion/IntelliJ_/UD5/PRG05-T03/src/entrada.txt";
        String archivoSalidaFiltrada = "C:/Users/DAM1_Alu02/Documents/GitHub/DAM1_archives/programacion/IntelliJ_/UD5/PRG05-T03/src/salida_filtrada.txt";

        try {
            FileReader fileReader = new FileReader(archivoEntrada);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(archivoSalidaFiltrada);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {

                if (linea.contains("Java")) {
                    bufferedWriter.write(linea);
                    bufferedWriter.newLine();
                }
            }

            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Se han filtrado y copiado las líneas que contienen 'Java' en '" + archivoSalidaFiltrada + "'");
        } catch (IOException e) {
            System.err.println("Error al filtrar y copiar el archivo: " + e.getMessage());
        }
    }
}

