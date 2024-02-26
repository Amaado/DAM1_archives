package tarefasAV;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarefa7{

    static class FileManager {

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gestión de archivos y directorios:");
        System.out.println("1. Crear archivo");
        System.out.println("2. Eliminar archivo");
        System.out.println("3. Crear directorio");
        System.out.println("4. Eliminar directorio");
        System.out.println("5. Listar contenido de un directorio");
        System.out.print("Seleccione una opción (1/2/3/4/5): ");
        try {
            int choice = scanner.nextInt();


            scanner.nextLine(); // Consumir el salto de línea

            switch (choice) {
                case 1:
                    System.out.print("Introduce la ruta del archivo a crear: ");
                    String fileToCreate = scanner.nextLine();
                    fileManager.createFile(fileToCreate);
                    break;
                case 2:
                    System.out.print("Introduce la ruta del archivo a eliminar: ");
                    String fileToDelete = scanner.nextLine();
                    fileManager.deleteFile(fileToDelete);
                    break;
                case 3:
                    System.out.print("Introduce la ruta del directorio a crear: ");
                    String dirToCreate = scanner.nextLine();
                    fileManager.createDirectory(dirToCreate);
                    break;
                case 4:
                    System.out.print("Introduce la ruta del directorio a eliminar: ");
                    String dirToDelete = scanner.nextLine();
                    fileManager.deleteDirectory(dirToDelete);
                    break;
                case 5:
                    System.out.print("Introduce la ruta del directorio a listar: ");
                    String dirToList = scanner.nextLine();
                    fileManager.listDirectory(dirToList);
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
            System.err.println("Introduce un parametro válido");
        }
        scanner.close();
    }

    public void createFile(String file) {
        File newFile = new File(file);
        try {
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public void deleteFile(String file) {
        File existingFile = new File(file);
        if (existingFile.delete()) {
            System.out.println("File deleted: " + existingFile.getName());
        } else {
            System.out.println("Unable to delete the file.");
        }
    }

    public void createDirectory(String path) {
        File newDir = new File(path);
        if (newDir.mkdir()) {
            System.out.println("Directory created: " + newDir.getName());
        } else {
            System.out.println("Directory already exists or could not be created.");
        }
    }

    public void deleteDirectory(String path) {
        File existingDir = new File(path);
        if (existingDir.isDirectory()) {
            if (existingDir.delete()) {
                System.out.println("Directory deleted: " + existingDir.getName());
            } else {
                System.out.println("Unable to delete the directory.");
            }
        } else {
            System.out.println("Not a valid directory.");
        }
    }

    public void listDirectory(String path) {
        File dir = new File(path);
        if (dir.isDirectory()) {
            String[] contents = dir.list();
            System.out.println("Contents of the directory " + dir.getName() + ":");
            for (String content : contents) {
                File file = new File(dir.getPath(), content);
                if (file.isFile()) {
                    System.out.println("File: " + content);
                } else if (file.isDirectory()) {
                    System.out.println("Directory: " + content);
                }
            }
        } else {
            System.out.println("Not a valid directory.");
        }
    }

}
}

