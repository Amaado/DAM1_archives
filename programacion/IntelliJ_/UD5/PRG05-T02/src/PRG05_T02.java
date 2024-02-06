import java.io.FileInputStream;
import java.io.IOException;


public class PRG05_T02 {
    public static void main(String[] args) {
        String Archivo = "C:/Users/DAM1_Alu02/Downloads/datos.bin";

        try (FileInputStream fis = new FileInputStream(Archivo)) {
            int byteLeido;

            while ((byteLeido = fis.read()) != -1) {
                System.out.print((char) byteLeido);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
