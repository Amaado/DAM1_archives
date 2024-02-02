import java.io.*;

public class SalidaAUnArchivo {
    public static void main(String[] args) {

        String rutaArchivo = "archivo_salida.txt";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter printWriter = new PrintWriter(new FileWriter(rutaArchivo))) {
            String linea;

            while (!(linea = reader.readLine()).equalsIgnoreCase("salir")) {
                printWriter.println(linea);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}