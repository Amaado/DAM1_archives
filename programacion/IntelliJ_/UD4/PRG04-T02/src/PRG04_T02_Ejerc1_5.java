import java.util.Scanner;

public class PRG04_T02_Ejerc1_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("-----------------------------\nCalculadora de letra del DNI\n-----------------------------");
        System.out.println("\nIntroduce los 8 números de tu DNI: ");
        String dni= entrada.next();

        if (dni.length() == 8) {
            int resto =  Integer.parseInt(dni) % 23;

            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            char letra = letras.charAt(resto);

            System.out.println("La letra tu dni DNI es la " + letra);
        } else {
            System.out.println("Hay más de 8 números");
        }
    }
}