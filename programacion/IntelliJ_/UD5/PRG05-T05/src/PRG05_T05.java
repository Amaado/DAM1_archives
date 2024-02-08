import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class PRG05_T05 {
    public static void main(String[] args) {
        String nombreArchivo = "C:/Users/DAM1_Alu02/Documents/GitHub/DAM1_archives/programacion/IntelliJ_/UD5/PRG05-T05/src/Benedetti.txt";

        try (FileReader fr = new FileReader(nombreArchivo)) {
            int caracter;
            while ((caracter = fr.read()) != -1) {
                if (!Character.isWhitespace((char) caracter)) {
                    System.out.print((char) caracter);
                }
            }
        } catch (IOException e) {
            System.out.println("Error de E/S de datos");
            e.printStackTrace();
        }
    }
}
