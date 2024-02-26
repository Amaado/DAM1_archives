package tarefasAV;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Tarefa4Parte2B {
    public static void main(String[] args) throws IOException {
        File archivo = new File("CrearFichero.txt");
        if (!archivo.exists()) {
            archivo.createNewFile();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.newLine();
            writer.write("Este es el contenido adicional.");
        }

        System.out.println("Archivo creado con texto");
    }
}
