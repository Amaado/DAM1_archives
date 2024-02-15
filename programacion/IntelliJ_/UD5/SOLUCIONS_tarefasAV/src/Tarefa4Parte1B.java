package tarefasAV;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Tarefa4Parte1B {
    public static void main(String[] args) throws IOException {
        File archivo = new File("CrearFichero.txt");
        if (!archivo.exists()) {
            archivo.createNewFile();
        }

        try (FileWriter writer = new FileWriter(archivo)) {
            writer.write("Este es el archivo de texto creado.");
        }

        System.out.println("Archivo creado con texto");
    }
}
