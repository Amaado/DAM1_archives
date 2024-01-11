import java.util.Scanner;

public class PRG04_T02_Ejerc1_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("------------------------------------------\nResolución de ecuaciones de segundo grado:");
        System.out.println("      modelo: ax^2 + bx + c = 0\n------------------------------------------");

        System.out.println("Introduce el valor de 'a':");
        double a = entrada.nextDouble();
        System.out.println("Introduce el valor de 'b':");
        double b = entrada.nextDouble();
        System.out.println("Introduce el valor de 'c':");
        double c = entrada.nextDouble();

        double x1;
        double x2;
        double x3;
        double discriminante;

        if (a==0 && b==0){
            System.out.println("No tiene resolución ya que 'a' y 'b' valen 0");
            System.out.println("Matemáticamente "+c+" = 0 no es una ecuación válida, porque a parte de ser una incongruencia en sí misma, no existe una incógnita que despejar.");
        }else{
            if (a==0){
                x1= -c/b;
                System.out.println("Como a=0, la resolución de la ecuación se convierte a primer grado.");
                System.out.println("La solución es "+x1);
            }else {
                discriminante = (b * b - 4 * a * c);
                if (discriminante >= 0) {
                    x2 = (-b + Math.sqrt(discriminante)) / (2 * a);
                    x3 = (-b - Math.sqrt(discriminante)) / (2 * a);
                    if (x2 == x3) {
                        System.out.println("Una única solución: " + x3);
                    } else {
                        System.out.println("Dos soluciones: " + x2 + ", " + x3);
                    }
                } else {
                    System.out.println("Error! El discriminante es negativo. No existe la raíz negativa en los números reales. En 1º de DAM no se dan números imaginarios!");
                }
            }
        }
    }
}
