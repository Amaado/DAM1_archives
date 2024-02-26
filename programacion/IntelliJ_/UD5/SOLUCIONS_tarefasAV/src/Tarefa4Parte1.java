package tarefasAV;

import java.io.FileWriter;
import java.io.IOException;

public class Tarefa4Parte1 {
    public static void main(String[] args){

        String frase="Esto es una prueba de escritura. Quiero agregar esta info";
        try {
            FileWriter escritura=new FileWriter("CrearFichero.txt",true);
            for (int i=0;i<frase.length();i++){
                escritura.write(frase.charAt(i));
            }
            escritura.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

