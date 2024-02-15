package tarefasAV;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tarefa1 {
    public static void main(String[] args) {
        // Definir los nombres de los archivos de entrada y salida
        String entrada = "entrada.txt";
        String salida = "salida.txt";

        // Copia contenido del archivo de entrada al archivo de salida
        try {
            // Crear un FileReader para leer el archivo de entrada
            FileReader fileReader = new FileReader(entrada);

            // Crear un FileWriter para escribir en el archivo de salida (creará uno nuevo o sobrescribirá el existente)
            FileWriter fileWriter = new FileWriter(salida);

            // Leer y escribir cada carácter hasta el final del archivo
            int caracter;
            while ((caracter = fileReader.read()) != -1) {
                fileWriter.write(caracter);
                //System.out.print((char) caracter);
                //System.out.print((char)fileReader.read());
            }

            // Cerrar los flujos de lectura y escritura
            fileReader.close();
            fileWriter.close();

            System.out.println("\nTodo OK. Archivo copiado");
        } catch (IOException e) {
            System.err.println("Error al copiar el archivo: " + e.getMessage());
        }
    }

}
