
import java.io.*;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    leerFicheroExistente();
                    break;
                case 2:
                    crearFicheroNuevo();
                    break;
                case 3:
                    copiarFichero();
                    break;
                case 4:
                    buscarPalabraEnFichero();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n*** Menú Principal ***");
        System.out.println("1. Leer fichero existente");
        System.out.println("2. Crear fichero nuevo");
        System.out.println("3. Copiar fichero en otro");
        System.out.println("4. Buscar una palabra en el fichero");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void leerFicheroExistente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo a leer: ");
        String nombreArchivo = scanner.next();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static void crearFicheroNuevo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo a crear: ");
        String nombreArchivo = scanner.next();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            System.out.println("Ingrese el contenido del archivo (escriba 'fin' para finalizar):");
            String linea;
            while (!(linea = scanner.nextLine()).equalsIgnoreCase("fin")) {
                writer.write(linea);
                writer.newLine();
            }
            System.out.println("Archivo creado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    private static void copiarFichero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo a copiar: ");
        String nombreArchivoOrigen = scanner.next();
        System.out.print("Ingrese el nombre del nuevo archivo de destino: ");
        String nombreArchivoDestino = scanner.next();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivoOrigen));
             BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivoDestino))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea);
                writer.newLine();
            }
            System.out.println("Archivo copiado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al copiar el archivo: " + e.getMessage());
        }
    }

    private static void buscarPalabraEnFichero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo donde buscar: ");
        String nombreArchivo = scanner.next();
        System.out.print("Ingrese la palabra a buscar: ");
        String palabraBuscada = scanner.next();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            int numeroLinea = 1;
            boolean encontrada = false;
            System.out.println("Líneas donde se encontró la palabra:");
            while ((linea = reader.readLine()) != null) {
                if (linea.toLowerCase().contains(palabraBuscada)) {
                    System.out.println("Línea " + numeroLinea + ": " + linea);
                    encontrada = true;
                }
                numeroLinea++;
            }
            if (!encontrada) {
                System.out.println("La palabra no se encontró en el archivo.");
            }
        } catch (IOException e) {
            System.err.println("Error al buscar la palabra en el archivo: " + e.getMessage());
        }
    }
}

