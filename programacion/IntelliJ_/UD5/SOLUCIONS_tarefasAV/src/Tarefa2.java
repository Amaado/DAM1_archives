package tarefasAV;

import java.io.FileInputStream;
import java.io.IOException;

public class Tarefa2 {
    public static void main(String[] args) {
        String rutaArchivo = "mem_128.bin";

        try (FileInputStream fileInputStream = new FileInputStream(rutaArchivo)) {
            int byteLeido;
            while ((byteLeido = fileInputStream.read()) != -1) {
           // while ((fileInputStream.read()) != -1) {
                //System.out.println(byteLeido);
                System.out.print((char) byteLeido);
                //System.out.print((char) fileInputStream.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

