

//Lectura de un fichero de texto con Scanner
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio3 {

    public static void main(String[] args) {

        File f = new File("enteros.txt");
        int numero, suma = 0, cont = 0;
        StringTokenizer st;
        Scanner entrada = null;
        String cadena;

        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                cadena = entrada.nextLine();
                st = new StringTokenizer(cadena, " ,");// considerará tanto las comas como los espacios en blanco como delimitadores para dividir la cadena en tokens.
                while (st.hasMoreTokens()) {
                    numero = Integer.parseInt(st.nextToken());
                    System.out.println(numero);
                    suma = suma + numero;
                    cont++;
                }
            }
            System.out.println("Número leídos: " + cont);
            System.out.println("Suma " + suma);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
    }
}
