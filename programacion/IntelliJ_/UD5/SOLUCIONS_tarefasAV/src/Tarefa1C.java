package tarefasAV;

import java.io.*;

public class Tarefa1C {
    public static void main(String[] args) {
        String rutaEntrada = "entrada.txt";
        String rutaSalida = "salida.txt";

        try (FileReader fileReader = new FileReader(rutaEntrada);
             BufferedReader bufferedReader=new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(rutaSalida,true);
             BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)
             ) {

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                bufferedWriter.newLine();
                bufferedWriter.write(linea);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
