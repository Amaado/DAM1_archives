import java.util.Objects;
import java.util.Scanner;

public class PRG04_T02_Ejerc2_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor;
        double suma = 0;
        double mayor = 0;
        double menor = 0;
        System.out.println("Ingrese un valor numérico (o 00 para salir): ");
        valor = entrada.nextLine();
        double num = Double.parseDouble(valor);
        menor=num;
        while(true){
            if (!Objects.equals(valor, "00")){

                suma = suma + num;

                if (num > mayor){
                    mayor=num;
                }
                if (num < menor){
                    menor=num;
                }
            }
            if (Objects.equals(valor, "00")){
                break;
            }
            System.out.println("Ingrese un valor numérico (o 00 para salir): ");
            valor = entrada.nextLine();
            num = Double.parseDouble(valor);
        }

        System.out.println("Suma de los valores: "+suma);
        System.out.println("Mayor valor ingresado: "+mayor);
        System.out.println("Menor valor ingresado: "+menor);
    }
}
