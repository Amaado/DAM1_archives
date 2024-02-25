
import java.io.*;

public class Ej3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese la ruta del archivo binario: ");
        try {
            String rutaArchivo = br.readLine();
            mostrarContenidoArchivoEnHexadecimal(rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al leer la entrada del usuario: " + e.getMessage());
        }
    }

    private static void mostrarContenidoArchivoEnHexadecimal(String rutaArchivo) {
        try (InputStream inputStream = new FileInputStream(rutaArchivo)) {
            int byteLeido;
            int contadorBytes = 0;

            System.out.println("Contenido del archivo en formato hexadecimal:");

            while ((byteLeido = inputStream.read()) != -1) {
                System.out.printf("%02X ", byteLeido);
                contadorBytes++;
            }

            System.out.println("\n\nCantidad total de bytes leídos: " + contadorBytes);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

