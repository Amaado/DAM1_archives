import java.util.Scanner;

public class Ejercicio4Math {
    public static void main(String[] args){
        double a,b,h,r,e;

        Scanner entrada = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quiereres calcular hipotenusas o exponentes?");
        String respuesta2 = sc.nextLine();
        if (respuesta2.equalsIgnoreCase("hipotenusa")||respuesta2.equalsIgnoreCase("hipotenusas")){

            System.out.print("CALCULADORA DE HIPOTENUSAS");

            System.out.print ("\n Introduce el valor del primer cateto: ");
            a = entrada.nextInt();

            System.out.print ("\n Introduce el valor del segundo cateto: ");
            b = entrada.nextInt();

            h=Math.sqrt(a*a+b*b);

            System.out.println("\n La hipotenusa es "+h);

            System.out.print ("\n Quieres redondearlo? ");

            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("si")){
                System.out.println("\n La hipotenusa redondeada es " + Math.round(h));
            }else{
                System.out.println("Pues tu te lo pierdes. Fin del programa");
            }

        }else {
            System.out.print("CALCULADORA DE EXPONENTES");

            System.out.print ("\n Introduce el número a elevar: ");
            a = entrada.nextInt();

            System.out.print ("\n Introduce el valor del exponente: ");
            b = entrada.nextInt();

            e=Math.pow(a,b);
            System.out.print ("\n El resultado es: "+e);



        }
    }
}

