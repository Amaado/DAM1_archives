import java.util.Scanner;

public class PRG04_T02_Ejerc2_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número entre 0 y 9: ");
        int num = entrada.nextInt();
        int multiplicador;
        int resultado;


        if (num>=0 && num<=9){
            System.out.println ("Tabla de multiplicar del "+num+":");
            for (multiplicador = 0; multiplicador<11; multiplicador++) {
                resultado = multiplicador*num;
                System.out.println(num+" x "+multiplicador+" = "+resultado);
            }
        }else {
            System.out.println("Número fuera del rango permitido.");
        }
    }
}
