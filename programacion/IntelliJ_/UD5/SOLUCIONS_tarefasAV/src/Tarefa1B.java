package tarefasAV;

import java.io.*;

public class Tarefa1B {
    public static void main(String[] args) {
        String rutaEntrada = "entrada.txt";
        String rutaSalida = "salida.txt";

        try (FileReader fileReader = new FileReader(rutaEntrada);

             FileWriter fileWriter = new FileWriter(rutaSalida,true);
             ) {

            int caracter;
            while ((caracter = fileReader.read()) != -1) {
                fileWriter.write(caracter);
                //System.out.print((char) caracter);
                //System.out.print((char)fileReader.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
