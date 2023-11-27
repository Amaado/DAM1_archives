import java.util.Scanner;

public class PROG02_T4_Ejerc7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce o teu nome: ");
        String nombre = input.nextLine();

        System.out.println(nombre+" tiene "+nombre.length()+" caracteres");
        System.out.println("La primera letra de "+nombre+" es "+nombre.charAt(0));
        System.out.println("La última letra de "+nombre+" es "+nombre.charAt(nombre.length()-1));
    }
}
