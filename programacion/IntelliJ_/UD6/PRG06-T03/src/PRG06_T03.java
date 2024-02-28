import java.util.Random;

public class PRG06_T03 {
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
                "| |  \\/  Me merezco un 10 <3              | |\n" +
                "| | .-----------------------------------, | |\n" +
                "| | |                                   | | |");
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;

            for (int j = 0; j < 5; j++) {
                if (j==0) {
                    System.out.print("| | |  "+ANSI_CYAN+matriz[i][j]+ANSI_RESET+"   ");
                    sumaFila += matriz[i][j];
                }else {
                    System.out.print(ANSI_CYAN+matriz[i][j]+ANSI_RESET+"   ");
                    sumaFila += matriz[i][j];
                }
            }

            String sumaFilaStr = String.valueOf(sumaFila);
            if (sumaFilaStr.length()==1){
                System.out.println(ANSI_YELLOW+" ——— Σ -> "+ANSI_GREEN+sumaFila+ANSI_RESET+"  | | |");
            }else {
                System.out.println(ANSI_YELLOW+" ——— Σ -> "+ANSI_GREEN+sumaFila+ANSI_RESET+" | | |");
            }

        }


        System.out.println("| | |"+ANSI_YELLOW+"  ǀ   ǀ   ǀ   ǀ   ǀ              | "+ANSI_RESET+"| | |\n"+"| | |"+ANSI_ORANGE+"  Σ   Σ   Σ   Σ   Σ"+ANSI_YELLOW+"              | "+ANSI_RESET+"| | |\n"+"| | |"+ANSI_YELLOW+"  |   |   |   |   |"+ANSI_ORANGE+"         Σ    "+ANSI_YELLOW+"| "+ANSI_RESET+"| | |\n| | |"+ANSI_YELLOW+"  v   v   v   v   v       "+ANSI_ORANGE+"total"+ANSI_YELLOW+"  v "+ANSI_RESET+"| | |");
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += matriz[i][j];
            }

            String sumaColumnaStr = String.valueOf(sumaColumna);
            if (sumaColumnaStr.length()==1){
                if (j==0){
                    System.out.print("| | |  "+ANSI_GREEN+sumaColumna+ANSI_RESET+"   ");
                }else {
                    System.out.print(ANSI_GREEN+sumaColumna+ANSI_RESET+"   ");
                }
            }else {
                if (j==0){
                    System.out.print("| | |  "+ANSI_GREEN+sumaColumna+ANSI_RESET+"  ");
                }else {
                    System.out.print(ANSI_GREEN+sumaColumna+ANSI_RESET+"  ");
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
            System.out.println(ANSI_YELLOW+"———————-> "+ANSI_PURPLE+sumaTotal+ANSI_RESET+" | | |");
        }else {
            System.out.println(ANSI_YELLOW+"———————-> "+ANSI_PURPLE+sumaTotal+ANSI_RESET+"| | |");
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
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_ORANGE = "\u001B[38;5;208m";

}