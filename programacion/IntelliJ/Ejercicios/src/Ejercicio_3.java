import java.util.Scanner;
import java.util.Locale;

public class Ejercicio_3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int edad;
        double estatura;

        System.out.println("Escribe tu nombre: ");
        nombre=entrada.nextLine();
        System.out.println("Escribe tu edad: ");
        edad=entrada.nextInt();
        System.out.println("Escribe tu estatura en metros: ");
        estatura=entrada.nextDouble();

        System.out.println("Tu nombre es "+nombre);
        System.out.println("Tu edad es "+edad);
        System.out.println("Tu estatura en metros es "+estatura);


    }
}
