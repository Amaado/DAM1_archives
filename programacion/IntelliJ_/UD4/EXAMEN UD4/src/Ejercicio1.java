public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println("Sumatorio de numeros pares de 2 a 100");
        int N1;
        int suma = 0;

        for (N1=2; N1 <= 100; N1++){
            if (N1 % 2 ==0){
                suma = suma +N1;
            }
        }
        System.out.println("Solución: "+suma);
    }
}
