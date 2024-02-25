
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Ingresa la ruta del archivo que deseas buscar: ");
        String nombreArchivo=scanner.nextLine();

        System.out.print("Ingresa la cadena que deseas buscar en el archivo "+nombreArchivo+": ");
        String cadenaBusqueda = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            boolean encontrado = false;
            int contarCoindidencias=0;

            while ((linea = br.readLine()) != null) {
                if (linea.toLowerCase().contains(cadenaBusqueda.toLowerCase())) {
                    encontrado = true;
                    contarCoindidencias++;

                }
            }

            if (encontrado) {
                System.out.println("Registro encontrado: " + cadenaBusqueda);
                System.out.println("Número de coincidencias de la palabra "+ cadenaBusqueda+ ": "+ contarCoindidencias);
            } else {
                System.out.println("Registro no encontrado");
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

