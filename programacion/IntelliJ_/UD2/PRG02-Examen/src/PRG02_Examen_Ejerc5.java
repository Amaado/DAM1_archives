import java.util.Scanner;

public class PRG02_Examen_Ejerc5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Pedimos los números
        System.out.println("Introduce cinco dígitos juntos: ");
        String digitos = sc.nextLine();

        for (int i = 0; i<digitos.length(); i++) { //Variable; condición; paso
            System.out.print(digitos.charAt(i)+" ");
        }
    }
}
