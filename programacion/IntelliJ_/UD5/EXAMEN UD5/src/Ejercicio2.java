import java.io.*;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------");
        System.out.println("Introduce el número correspondiente a las siguientes opciones:");
        System.out.println("--------------------------------------------------------------\n");
        System.out.println("1.Leer fichero existente");
        System.out.println("2.Crear fichero nuevo");
        System.out.println("3.Copiar fichero en otro");
        System.out.println("4.Buscar una cadena en el fichero");
        System.out.println("5.Salir");

        int opcion = entrada.nextInt();
        entrada.nextLine();

        if (opcion == 1){
            System.out.println("Escribe la ruta del archivo en el que deseas leer");
            String ruta = entrada.nextLine();

            try {
                FileReader fileReader = new FileReader(ruta);
                BufferedReader bufferedReader = new BufferedReader(fileReader);


                String linea;
                while ((linea = bufferedReader.readLine()) != null) {
                    System.out.println(linea);
                }

                bufferedReader.close();

            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
            main(args);


        }

        if (opcion == 2){
            System.out.println("Escribe la ruta donde quieres crear el archivo:\n(/.../.../Archivo.txt)");
            String ruta = entrada.nextLine();

            try {
                FileWriter fileWriter = new FileWriter(ruta);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.close();

                System.out.println("Se ha creado el archivo");
            } catch (IOException e) {
                System.err.println("Error al crear el archivo: " + e.getMessage());
            }
            String contenidoAdicional="\n";

            System.out.println("Escribe contenido adiccional: ");
            contenidoAdicional = entrada.nextLine();

            try {
                FileWriter fileWriter = new FileWriter(ruta, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.write(contenidoAdicional);

                bufferedWriter.close();

                System.out.println("Se ha añadido contenido adicional al archivo '" + ruta + "'.");
            } catch (IOException e) {
                System.err.println("Error al añadir contenido al archivo: " + e.getMessage());
            }
            main(args);

        }

        if (opcion == 3){
            System.out.println("Introduce la ruta del archivo de entrada: ");
            String archivoEntrada = entrada.nextLine();

            System.out.println("Introduce la ruta del archivo de salida: ");
            String archivoSalida = entrada.nextLine();

            try {
                FileReader fileReader = new FileReader(archivoEntrada);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                FileWriter fileWriter = new FileWriter(archivoSalida);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                String linea;
                while ((linea = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(linea);
                    bufferedWriter.newLine();
                }

                bufferedReader.close();
                bufferedWriter.close();

                System.out.println("El contenido se ha copiado correctamente de '" + archivoEntrada + "' a '" + archivoSalida + "'");
            } catch (IOException e) {
                System.err.println("Error al copiar el archivo: " + e.getMessage());
            }
            main(args);


        }

        if (opcion == 4){
            System.out.println("Escribe la ruta del archivo en el que deseas filtrar");
            String ruta = entrada.nextLine();
            System.out.println("Que cadena específica quieres filtrar?");
            String cadena = entrada.nextLine();
            File file = new File(ruta);


            try {
                FileReader fileReader = new FileReader(ruta);
                BufferedReader bufferedReader = new BufferedReader(fileReader);


                int contador = 0;
                String linea;
                while ((linea = bufferedReader.readLine()) != null) {

                    if (linea.contains(cadena)) {
                        contador = contador+1;
                    }
                }

                bufferedReader.close();


                System.out.println("Se han filtrado el archivo "+file.getName());
                if (contador != 0){
                    System.out.println("Se han encontrado coincidencias.\nLa cadena '"+cadena+"' se ha repetido "+contador+" veces.");
                }else {
                    System.out.println("No se han encontrado coincidencias.");
                }


            } catch (IOException e) {
                System.err.println("Error al filtrar archivo: " + e.getMessage());
            }
            main(args);
        }

        if (opcion == 5){
            System.out.println("Chao!");
        }

    }
}
