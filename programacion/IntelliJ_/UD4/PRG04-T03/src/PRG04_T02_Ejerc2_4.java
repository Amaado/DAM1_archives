import java.util.Scanner;

public class PRG04_T02_Ejerc2_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = 0;
        int contador = 0;
        int resto = 0;

        System.out.println("Ingrese un número entero positivo: ");
        num = entrada.nextInt();

        if (num>1){
            System.out.println("Números primos entre 1 y "+num);
            for (int j=2;j<=num;j++){
                contador=0;
                for(int i=1;i<j;i++){
                    resto=j%i;
                    if(resto!=0){
                        contador++;
                    }
                    if (contador==j-2){
                        System.out.println(j);
                    }
                }
            }
        }else {
            System.out.println("El número no es entero o positivo.");
            main(args);
        }
    }
}
