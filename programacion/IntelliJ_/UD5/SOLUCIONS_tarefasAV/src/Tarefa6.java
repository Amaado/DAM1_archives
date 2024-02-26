package tarefasAV;

import java.io.File;
import java.util.Scanner;

public class Tarefa6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la ruta (fichero o directorio): ");
        String ruta = scanner.nextLine();
        File archivo = new File(ruta);

        if (archivo.exists()) {
            // Nombre
            System.out.println("Nombre: " + archivo.getName());

            // Ruta relativa
            System.out.println("Ruta relativa: " + archivo.getPath());

            // Ruta absoluta
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());

            // Permiso de lectura
            //System.out.println("Permiso de lectura: " + archivo.canRead());
            if (archivo.canRead()){
                System.out.println("Tenemos permiso de lectura");

            }else{
                System.out.println("No tenemos permiso de lectura");
            }

            // Permiso de escritura
            //System.out.println("Permiso de escritura: " + archivo.canWrite());
            if (archivo.canWrite()){
                System.out.println("Tenemos permiso de escritura");

            }else{
                System.out.println("No tenemos permiso de escritura");
            }
            // Tamaño
            System.out.println("Tamaño: " + archivo.length() + " bytes");

            // Es un directorio
            //System.out.println("Es un directorio: " + archivo.isDirectory());
            if (archivo.isDirectory()){
                System.out.println("Es un directorio");

            }else{
                System.out.println("No es un directorio");
            }
            // Es un fichero
            //System.out.println("Es un fichero: " + archivo.isFile());
            if (archivo.isFile()){
                System.out.println("Es un fichero");

            }else{
                System.out.println("No es un fichero");
            }
        } else {
            System.out.println("La ruta indicada no existe.");
        }
    }
}
