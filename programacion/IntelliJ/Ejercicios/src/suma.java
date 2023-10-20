import java.util.Scanner;
public class suma {
    public static void main(String[] args) {
        int num1;
        int num2;
        int suma;
        Scanner entrada = new Scanner(System.in);

        System.out.print("CALCULADORA DE SUMAS");
        System.out.print ("\n Primer número: ");
        num1 = entrada.nextInt();

        System.out.print(" Segundo número: ");
        num2 = entrada.nextInt();

        suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " da " + suma);
    }
}