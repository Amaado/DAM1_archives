import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la primera calificación: ");
        double cal1 = entrada.nextDouble();

        System.out.println("Introduce la segunda calificación: ");
        double cal2 = entrada.nextDouble();

        System.out.println("Introduce la tercera calificación: ");
        double cal3 = entrada.nextDouble();

        double media = (cal1+cal2+cal3)/3;

        if (media<4){
            System.out.println("Alumno suspenso");
        }else{
            System.out.println("La media del alumno es "+media);
        }


    }
}
