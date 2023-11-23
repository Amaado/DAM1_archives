import java.util.Scanner;

public class PROGT5_Ejerc3 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        System.out.printf("El valor de x es: %d%n", x);
        System.out.printf("El valor de y es: %d%n", y);

        x += y;
        System.out.printf("Después de x += y, el valor de x es: %d%n", x);
        x = 5;


        x -= y;
        System.out.printf("Después de x -= y, el valor de x es: %d%n", x);
        x = 5;


        x *= y;
        System.out.printf("Después de x *= y, el valor de x es: %d%n", x);
        x = 5;


        x /= y;
        System.out.printf("Después de x /= y, el valor de x es: %d%n", x);
        x = 5;


        x %= y;
        System.out.printf("Después de x %%= y, el valor de x es: %d%n", x);
    }
}
