package tarefasAV;

import java.io.*;

public class Tarefa3 {
    public static void main(String[] args) {
        String rutaEntrada = "entrada.txt";
        String rutaSalidaFiltrada = "salida_filtrada.txt";

        try (FileReader fileReader = new FileReader(rutaEntrada);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(rutaSalidaFiltrada);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                if (linea.contains("Java")) {
                    bufferedWriter.write(linea);
                    bufferedWriter.newLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
