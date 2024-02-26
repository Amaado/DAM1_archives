import java.util.Random;

public class prueba2 {
    public static void main(String[] args) {
        // Crear una matriz de 4x5 para almacenar los números enteros aleatorios
        int[][] matriz = new int[4][5];

        // Generar números aleatorios entre 0 y 9 y llenar la matriz
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(10); // Genera números aleatorios entre 0 y 9
            }
        }

        // Mostrar la matriz y calcular las sumas parciales
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t"); // Imprimir elemento de la matriz
                sumaFila += matriz[i][j]; // Calcular la suma parcial de la fila
            }
            System.out.println("| " + sumaFila); // Mostrar la suma parcial de la fila
        }

        // Mostrar las sumas de las columnas
        System.out.println("-----------------------------");
        System.out.print("   ");
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += matriz[i][j]; // Calcular la suma parcial de la columna
            }
            System.out.print(sumaColumna + "\t"); // Mostrar la suma parcial de la columna
        }

        // Calcular y mostrar la suma total
        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += matriz[i][j]; // Calcular la suma total
            }
        }
        System.out.println("\n\nSuma total: " + sumaTotal);
    }
}