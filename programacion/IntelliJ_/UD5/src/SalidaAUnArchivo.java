import java.io.*;

public class SalidaAUnArchivo {
    public static void main(String[] args) {
        // Ruta del archivo en el que quieres escribir
        String entrada = "archivo_salida.txt";
        String salida = "salida.txt";
        try{
            FileReader fileReader = new FileReader(entrada);
            FileWriter fileWriter = new FileWriter(salida);
            int caracter;
            while ((caracter=fileReader.read())!=-1){

            }
        }
    }
}