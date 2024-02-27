import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class prueba1 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][5];


        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }


        System.out.println("| | |                                   | | |");
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;

            for (int j = 0; j < 5; j++) {
                if (j==0) {
                    System.out.print("| | |  "+matriz[i][j] + "   ");
                    sumaFila += matriz[i][j];
                }else {
                    System.out.print(matriz[i][j] + "   ");
                    sumaFila += matriz[i][j];
                }


            }
            System.out.println(" ——— Σ -> " + sumaFila+" | | |");
        }


        System.out.println("| | |  ǀ   ǀ   ǀ   ǀ   ǀ              |\n| | |  Σ   Σ   Σ   Σ   Σ              |\n| | |  |   |   |   |   |         Σ    |\n| | |  v   v   v   v   v       total  v | | |");
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += matriz[i][j];
            }
            if (j==0){
                System.out.print("| | |  "+sumaColumna + "  ");
            }else {
                System.out.print(sumaColumna + "  ");
            }
        }
        System.out.println("——————->");

        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("\n\n| | |  Suma total: " + sumaTotal+"                   | | |");
        System.out.println("| | |                                   | | |");


    }
}