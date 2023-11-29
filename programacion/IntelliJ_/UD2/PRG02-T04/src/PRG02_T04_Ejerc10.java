import java.util.Scanner;

public class PRG02_T04_Ejerc10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("CALCULADORA DE SALARIOS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Introduce tu salario (€):");
        double salario = input.nextDouble();

        double salarioT=salario-(salario*0.2);

        System.out.println("Tu salario de "+salario+"€ con el 20% de retenciones se queda en "+salarioT+"€");

    }
}

