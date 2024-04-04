package ejercicio4;

import java.util.Scanner;

public class App {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Creando cuenta bancaria nº ab123 con saldo inicial 500");
        CuentaBancaria ab123=new CuentaBancaria("ab123",500);



        String opcion;

        while (true){
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("X. Salir");
            opcion = entrada.nextLine();

            opcion=opcion.toUpperCase();
            if (opcion.equals("X")){
                break;
            }

            int opcionI = Integer.parseInt(opcion);
            switch (opcionI){
                case 1:
                    System.out.println("Mi saldo actual es: "+ab123.getSaldo());
                    break;
                case 2:
                    System.out.println("De cuanto va a ser el ingreso?");
                    double ingreso = entrada.nextDouble();
                    ab123.depositar(ingreso);
                    System.out.println("Saldo despues de ingresar 1000: "+ab123.getSaldo());

                case 3:
                    System.out.println("Cuanto pretendes retirar?");
                    double retiro = entrada.nextDouble();
                    ab123.retirar(retiro);
                    System.out.println("Saldo despues de retirar: "+ab123.getSaldo());
            }
        }



    }
}
