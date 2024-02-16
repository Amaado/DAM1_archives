import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
public class PRG05_T05 {
    final static String PROJECT_PATH = new File("").getAbsolutePath();

    final static String UD6_PATH = new File(PROJECT_PATH, "\\UD5\\PRG05-T05\\src\\Benedetti.txt").getAbsolutePath();
    public static void main(String[] args) {
        String nombreArchivo = UD6_PATH;

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
