import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Pedimos los números
        System.out.println("Introduce cinco dígitos juntos: ");
        String digitos = sc.nextLine();

        //Dividimos la cadena por posiciones y las separamos con espacios
        System.out.println(digitos.charAt(0)+" "+digitos.charAt(1)+" "+digitos.charAt(2)+" "+digitos.charAt(3)+" "+digitos.charAt(4));
    }
}
