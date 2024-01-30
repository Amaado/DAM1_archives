import java.util.Scanner;
import java.util.InputMismatchException;

public class DemoEx1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num;

        try {
            num = cin.nextInt();
        }

        catch(InputMismatchException e) {
            System.out.println("Entrada no válida!");
        }

    }
}
