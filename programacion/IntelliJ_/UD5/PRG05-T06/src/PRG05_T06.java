import java.io.File;
import java.util.Scanner;

public class PRG05_T06 {
    public static void main(String[] args) {

        System.out.print("Introduce la ruta (fichero o directorio): \n");
        Scanner entrada = new Scanner(System.in);
        String ruta = entrada.nextLine();

        File file = new File(ruta);

        if (file.exists()) {

            System.out.println("    Nombre: " + file.getName());
            System.out.println("    Ruta relativa: " + file.getPath());
            System.out.println("    Ruta absoluta: " + file.getAbsolutePath());

            if (file.canRead()){
                System.out.println("(x) Permiso de lectura");
            }else {
                System.out.println("( ) Permiso de lectura");
            }

            if (file.canWrite()){
                System.out.println("(x) Permiso de escritura");
            }else {
                System.out.println("( ) Permiso de escritura");
            }

            System.out.println("    Tamaño: " + file.length() + " bytes");

            if (file.isDirectory()){
                System.out.println("    Es un directorio");
            }else {
                System.out.println("    No es un directorio");
            }

            if (file.isFile()){
                System.out.println("    Es un archivo");
            }else {
                System.out.println("    No es un archivo");
            }

        } else {
            System.out.println("\nLa ruta especificada no existe.");
        }
    }
}
