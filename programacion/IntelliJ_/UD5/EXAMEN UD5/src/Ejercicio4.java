import java.io.*;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe la ruta del archivo en el que deseas filtrar");
        String ruta = entrada.nextLine();
        System.out.println("Que cadena específica quieres filtrar?");
        String cadena = entrada.nextLine();
        File file = new File(ruta);


        try {
            FileReader fileReader = new FileReader(ruta);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            int contador = 0;
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {

                if (linea.contains(cadena)) {
                    contador = contador+1;
                }
            }

            bufferedReader.close();


            System.out.println("Se han filtrado el archivo "+file.getName());
            if (contador != 0){
                System.out.println("Se han encontrado coincidencias.\nLa cadena '"+cadena+"' se ha repetido "+contador+" veces.");
            }else {
                System.out.println("No se han encontrado coincidencias.");
            }


        } catch (IOException e) {
            System.err.println("Error al filtrar archivo: " + e.getMessage());
        }
    }
}
