import java.util.Scanner;

public class PRG04_T02_Ejerc1_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuanta comida diaria se utiliza para alimentar a los animales? (kg): ");
        double comidaDiaria = entrada.nextDouble();
        System.out.println("Cuantos animales hay en la granja?: ");
        double numAnimales = entrada.nextDouble();
        System.out.println("Cuanta comida necesita un animal diariamente? (kg): ");
        double kilosAnimal = entrada.nextDouble();

        double excedente = comidaDiaria - (numAnimales*kilosAnimal);

        if (excedente < 0){
            double racion = ((comidaDiaria + excedente)/numAnimales);
            System.out.println("No existe excedente.");
            System.out.println("No llega la comida diaria para alimentar a todos los animales con la comida por animal recomendada.");
            System.out.println("La ración máxima para que puedan comer todos los animales por igual sería de "+racion+" Kg.");
        }else {
            System.out.println("El excedente de comida de hoy es "+excedente+" Kg.");
        }

    }
}
