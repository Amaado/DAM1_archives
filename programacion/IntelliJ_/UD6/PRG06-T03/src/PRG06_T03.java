import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PRG06_T03 {
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
            System.out.println(" ——— Σ -> " + sumaFila); // Mostrar la suma parcial de la fila
        }

        // Mostrar las sumas de las columnas
        System.out.println("ǀ   ǀ   ǀ   ǀ   ǀ\nΣ   Σ   Σ   Σ   Σ\n|   |   |   |   |\nv   v   v   v   v");
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


        System.out.println(matriz[0][0]);
        System.out.println(matriz[1][0]);






        List<String> lineasCaja = new ArrayList<>();

        // Agrega líneas a la caja
        agregarLineaCaja(Arrays.asList("        ","1","2","3","4","5",""), lineasCaja);
        agregarLineaCaja(Arrays.asList("        ","6","7","8","9","1"," ——— Σ -> 4"), lineasCaja);
        agregarLineaCaja(Arrays.asList("        ","2","3","4","5","6"," ——— Σ -> 5"), lineasCaja);
        agregarLineaCaja(Arrays.asList("        ","7","8","9","1","2"," ——— Σ -> 6"), lineasCaja);
        agregarLineaCaja(Arrays.asList("        ","ǀ","ǀ","ǀ","ǀ","ǀ","          |"), lineasCaja);
        agregarLineaCaja(Arrays.asList("        ","Σ","Σ","Σ","Σ","Σ","          |"), lineasCaja);
        agregarLineaCaja(Arrays.asList("        ","|","|","|","|","|","      Σ   |"), lineasCaja);
        agregarLineaCaja(Arrays.asList("        ","v","v","v","v","v","    total v"), lineasCaja);
        agregarLineaCaja(Arrays.asList("        ","7","8","9","1","2"," —————->"), lineasCaja);


        System.out.println(" .------------------------------------------,\n" +
                "| .---------------------------------------, |\n" +
                "| | _~_                                   | |\n" +
                "| |  \\/  Texas Instruments     T I - 8 6  | |\n" +
                "| | .-----------------------------------, | |\n" +
                "| | |                                   | | |");
        // Imprime la caja
        imprimirCaja(lineasCaja);
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






    //PARTE 2. Sistema de Alineado

    static void agregarLineaCaja(List<String> palabras, List<String> caja) {
        // Convierte la lista de palabras a una sola línea separada por espacios
        String linea = String.join(" ", palabras);

        // Agrega la línea a la lista
        caja.add(linea);
    }

    static void imprimirCaja(List<String> caja) {
        // Encuentra la longitud máxima de todas las líneas
        int longitudMaxima = 0;
        for (String linea : caja) {
            longitudMaxima = Math.max(longitudMaxima, linea.length());
        }

        // Imprime cada línea con barras finales alineadas
        for (String linea : caja) {
            System.out.print("|" + alinearTexto(linea, longitudMaxima) + "|\n");
        }
    }

    static String alinearTexto(String texto, int longitudObjetivo) {
        // Rellena con espacios a la derecha hasta alcanzar la longitud objetivo
        return String.format("%-" + longitudObjetivo + "s", texto);
    }
}