package tarefasAV;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Tarefa4Parte2 {
    public static void main(String[] args){
        File fichero;
        try{
            //fichero=new File("C:\\Users\\Rosalia\\Desktop","CrearFichero.txt");
            fichero=new File("CrearFichero.txt");
            FileWriter fw=new FileWriter(fichero,true);
            fw.write("\nEsto es lo añadido al texto creado");
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

}
