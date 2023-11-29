import java.util.Scanner;

public class PRG02_Examen_Ejerc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~");
        System.out.println("CALCULADORA");
        System.out.println("~~~~~~~~~~~");

        //Pedimos los números
        System.out.println("\nIngresa el primer número: ");
        double x=sc.nextDouble();

        System.out.println("Ingresa el segundo número: ");
        double y=sc.nextDouble();

        //Los mostramos por pantalla
        System.out.println("x= "+x+" y= "+y);
        System.out.println("-----------");


        //Realizamos e imprimimos todas las operaciones
        double s=x+y;
        System.out.println("x + y= "+s);

        double r=x-y;
        System.out.println("x + y= "+r);

        double mult=x*y;
        System.out.println("x * y= "+mult);

        double div=x/y;
        System.out.println("x / y= "+div);

        double pot = Math.pow(x,2);
        System.out.println("x ^ 2= "+pot);

        //Acudimos a la clase Math para realizar la raíz
        double raiz=Math.sqrt(x);
        System.out.println("raíz x= "+raiz);

    }
}
