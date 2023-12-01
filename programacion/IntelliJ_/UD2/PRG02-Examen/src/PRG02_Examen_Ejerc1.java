import java.util.Scanner;

public class PRG02_Examen_Ejerc1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaramos variables
        int num1;
        int num2;

        //Pedimos los números y los almacenamos en las variables
        System.out.println("Primer número: ");
        num1 = sc.nextInt();

        System.out.println("Segundo número: ");
        num2 = sc.nextInt();

        //Creaemos un if en el que si num1 es divisible entre num2 se imprimirá que es cierto
        if (num2%num1==0){
            System.out.println("El número "+num1+" es múltiplo de "+num2);

            //Si nó, imprime que no es múltipo
        }else{
            System.out.println("El número "+num1+" NO es múltiplo de "+num2);
        }

    }
}
