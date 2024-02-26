
import java.io.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Solicitar la ruta de los archivos de origen y destino al usuario
            System.out.print("Ingrese la ruta del primer archivo binario de origen: ");
            String rutaArchivoOrigen1 = br.readLine();

            System.out.print("Ingrese la ruta del segundo archivo binario de origen: ");
            String rutaArchivoOrigen2 = br.readLine();

            System.out.print("Ingrese la ruta del archivo binario de destino: ");
            String rutaArchivoDestino = br.readLine();

            // Combinar los archivos binarios
            combinarArchivosBinarios(rutaArchivoOrigen1, rutaArchivoOrigen2, rutaArchivoDestino);

            System.out.println("La combinación de archivos se realizó con éxito.");
        } catch (IOException e) {
            System.err.println("Error al leer la entrada del usuario: " + e.getMessage());
        }
    }

    private static void combinarArchivosBinarios(String rutaArchivoOrigen1, String rutaArchivoOrigen2, String rutaArchivoDestino) {
        try (InputStream inputStream1 = new FileInputStream(rutaArchivoOrigen1);
             InputStream inputStream2 = new FileInputStream(rutaArchivoOrigen2);
             OutputStream outputStream = new FileOutputStream(rutaArchivoDestino)) {

            // Copiar el contenido del primer archivo al archivo de destino
            copiarContenido(inputStream1, outputStream);

            // Insertar un marcador o separador en el archivo de destino
            outputStream.write("==== Separador entre archivos ====".getBytes());
            outputStream.write("\n".getBytes());

            // Copiar el contenido del" segundo archivo al archivo de destino
            copiarContenido(inputStream2, outputStream);

        } catch (IOException e) {
            System.err.println("Error al combinar archivos binarios: " + e.getMessage());
        }
    }

    private static void copiarContenido(InputStream origen, OutputStream destino) throws IOException {
        byte[] buffer = new byte[1024];
        int bytesLeidos;

        while ((bytesLeidos = origen.read(buffer)) != -1) {
            destino.write(buffer, 0, bytesLeidos);
        }
    }
}

