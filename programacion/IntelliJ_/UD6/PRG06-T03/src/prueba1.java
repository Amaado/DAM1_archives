import com.sun.xml.internal.ws.api.ha.StickyFeature;

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


        System.out.println(" .------------------------------------------,\n" +
                "| .---------------------------------------, |\n" +
                "| | _~_                                   | |\n" +
                "| |  \\/  Texas Instruments     T I - 8 6  | |\n" +
                "| | .-----------------------------------, | |\n" +
                "| | |                                   | | |");
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

            String sumaFilaStr = String.valueOf(sumaFila);
            if (sumaFilaStr.length()==1){
                System.out.println(" ——— Σ -> " + sumaFila+"  | | |");
            }else {
                System.out.println(" ——— Σ -> " + sumaFila+" | | |");
            }

        }


        System.out.println("| | |  ǀ   ǀ   ǀ   ǀ   ǀ              | | | |\n| | |  Σ   Σ   Σ   Σ   Σ              | | | |\n| | |  |   |   |   |   |         Σ    | | | |\n| | |  v   v   v   v   v       total  v | | |");
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += matriz[i][j];
            }

            String sumaColumnaStr = String.valueOf(sumaColumna);
            if (sumaColumnaStr.length()==1){
                if (j==0){
                    System.out.print("| | |  "+sumaColumna + "   ");
                }else {
                    System.out.print(sumaColumna + "   ");
                }
            }else {
                if (j==0){
                    System.out.print("| | |  "+sumaColumna + "  ");
                }else {
                    System.out.print(sumaColumna + "  ");
                }
            }

        }

        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += matriz[i][j];
            }
        }

        String sumaTotalStr = String.valueOf(sumaTotal);
        if (sumaTotalStr.length()==2){
            System.out.println("———————-> "+sumaTotal+" | | |");
        }else {
            System.out.println("———————-> "+sumaTotal+"| | |");
        }

        System.out.println("| | |                                   | | |\n" +
                "| | |                                   | | |\n" +
                "| | |                                   | | |\n" +
                "| | `-----------------------------------' | |\n" +
                "| |                                       | |\n" +
                "| `---------------------------------------' |\n" +
                "|     M1      M2      M3      M4      M5    |\n" +
                "|  .-----, .-----, .-----, .-----, .-----,  |\n" +
                "|  |  F1 | |  F2 | |  F3 | |  F4 | |  F5 |  |\n" +
                "|  `-----' `-----' `-----' `-----' `-----'  |\n" +
                "|-------.________          ________,--------|\n" +
                "|                `--------'                 |\n" +
                "|                                           |\n" +
                "|          QUIT    MODE        _,-._        |\n" +
                "|  .-----, .-----, .-----,  /\\ \\_^_/ /\\     |\n" +
                "|  | 2nd | | EXIT| | MORE| / /   |   \\ \\    |\n" +
                "|  `-----' `-----' `-----' |<|   O   |>|    |\n" +
                "|  alpha   LINK x  INS     \\ \\  _|_  / /    |\n" +
                "|  .-----, .-----, .-----,  \\/ / v \\ \\/     |\n" +
                "|  |ALPHA| |x-VAR| | DEL |     -._,-        |\n" +
                "|  `-----' `-----' `-----'                  |\n" +
                "|  SOLVER  SIMULT  POLY   CATLG-VARS        |\n" +
                "|  .-----, .-----, .-----, .-----, .-----,  |\n" +
                "|  |GRAPH| |TABLE| | PRGM| |CUSTM| |CLEAR|  |\n" +
                "|  `-----' `-----' `-----' `-----' `-----'  |\n" +
                "|  10x  A  SIN-1 B COS-1 C TAN-1 D pi   E   |\n" +
                "|  .-----, .-----, .-----, .-----, .-----,  |\n" +
                "|  | LOG | | SIN | | COS | | TAN | |  ^  |  |\n" +
                "|  `-----' `-----' `-----' `-----' `-----'  |\n" +
                "|  ex   F  x-1  G  [    H  ]    I  CALC J   |\n" +
                "|  .-----, .-----, .-----, .-----, .-----,  |\n" +
                "|  | LN  | | EE  | |  (  | |  )  | |     |  |\n" +
                "|  `-----' `-----' `-----' `-----' `-----'  |\n" +
                "|  ./~  K  MATRX L VECTR M CPLX N  MATH O   |\n" +
                "|  .-----, .-----, .-----, .-----, .-----,  |\n" +
                "|  | X2  | |  7  | |  8  | |  9  | |  x  |  |\n" +
                "|  `-----' `-----' `-----' `-----' `-----'  |\n" +
                "|  /_   P  CONS Q  CONV R  STRNG S LIST T   |\n" +
                "|  .-----, .-----, .-----, .-----, .-----,  |\n" +
                "|  |  ,  | |  4  | |  5  | |  6  | |  -  |  |\n" +
                "|  `-----' `-----' `-----' `-----' `-----'  |\n" +
                "|  RCL  =  BASE U  TEST V  MEM  W  STAT X   |\n" +
                "|  .-----, .-----, .-----, .-----, .-----,  |\n" +
                "|  | STO>| |  1  | |  2  | |  3  | |  +  |  |\n" +
                "|  `-----' `-----' `-----' `-----' `-----'  |\n" +
                "|  OFF     CHAR Y  :    z  ANS  _  ENTRY    |\n" +
                "|  .-----, .-----, .-----, .-----, .-----,  |\n" +
                "|  | ON  | |  0  | |  .  | | (-) | |ENTER|  |\n" +
                "|  `-----' `-----' `-----' `-----' `-----'  |\n" +
                "|  -------                                  |\n" +
                "`\\                                         /'\n" +
                "  `-._                                 _.-'\n" +
                "      `--.__                     __.--'\n" +
                "            ``----.._____,,---\n");


    }
}