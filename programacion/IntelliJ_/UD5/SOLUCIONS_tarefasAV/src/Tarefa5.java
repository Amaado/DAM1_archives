package tarefasAV;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tarefa5 {
    public static void main(String[] args) throws IOException {

        int c;
        try {
            FileReader fr=new FileReader("entrada.txt");
            c=fr.read();
            /*el bucle termina cuando c tome el valor -1
            que resulta ser el valor que el sistema le da (EOF o fin de fichero)*/
            System.out.println("EL CONTENIDO DEL FICHERO ES: ");
            while(c!=-1){
                if(c!=32){
                    System.out.print((char)c);
                }

                //contenido+=(char)c;
                c=fr.read();
            }
        } catch (FileNotFoundException ex) {
            System.err.println("No se encontró el archivo");
            //Logger.getLogger(Tarefa7.class.getName()).log(Level.SEVERE, "No se encontró el archivo", ex.getCause());
        }

    }
}
