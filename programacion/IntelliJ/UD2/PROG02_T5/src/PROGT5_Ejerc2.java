public class PROGT5_Ejerc2 {
    public static void main(String[] args) {
        short x = 7;
        int y = 5;
        float f1 = 13.5f;
        float f2 = 8.0f;

        System.out.printf("El valor de x es: %d%n", x);
        System.out.printf("El valor de y es: %d%n", y);

        int suma = x + y;
        System.out.printf("La suma de x y y es: %d%n", suma);

        int resta = x - y;
        System.out.printf("La resta de x y y es: %d%n", resta);

        int divisionEntera = x / y;
        System.out.printf("La división entera de x entre y es: %d%n", divisionEntera);

        int restoDivision = x % y;
        System.out.printf("El resto de la división entera de x entre y es: %d%n", restoDivision);

        System.out.printf("El valor de f1 es: %.1f%n", f1);
        System.out.printf("El valor de f2 es: %.1f%n", f2);

        float divisionFloat = f1 / f2;
        System.out.printf("La división de f1 entre f2 es: %.2f%n", divisionFloat);
    }
}
