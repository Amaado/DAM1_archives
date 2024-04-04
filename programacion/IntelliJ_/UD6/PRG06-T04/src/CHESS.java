import java.util.Scanner;

public class CHESS {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String [][] tablero = new String[8][8];
        final String negro = "░░";
        final String blanco = "▓▓";
        final String reyB = "♔";
        final String reyN = "♚";
        final String reinaB = "♕";
        final String reinaN = "♛";
        final String torreB = "♖";
        final String torreN = "♜";
        final String alfilB = "♗";
        final String alfilN = "♝";
        final String caballoB = "♘";
        final String caballoN = "♞";
        final String peonB = "♙";
        final String peonN = "♟";


        System.out.println("  ╭—————————————————————————╮");
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if (j==0) {//Imprime los números
                    System.out.print(8 - i + " │ ");
                }
                if (j==7 && i==0){//Arregla un problema cuando la reina ocupa la última posición
                    tablero[i][j]=negro;
                    System.out.print(tablero[i][j]+" │");
                }else {//Imprime tablero
                    if(j==7){
                        if ((i+j) % 2 ==0){
                            tablero[i][j]=blanco;
                            System.out.print(tablero[i][j]+" │");
                        }else {
                            tablero[i][j]=negro;
                            System.out.print(tablero[i][j]+" │");
                        }
                    }else {
                        if ((i+j) % 2 ==0){
                            tablero[i][j]=blanco;
                            System.out.print(tablero[i][j]+" ");
                        }else {
                            tablero[i][j]=negro;
                            System.out.print(tablero[i][j]+" ");
                        }
                    }
                }
            }
            System.out.print("\n");
        }

        System.out.println("  ╰—————————————————————————╯");

        for (char letra='A';letra<='H';letra++){
            if (letra == 'A'){
                System.out.print("    "+letra+"  ");
            }else {
                System.out.print(letra+"  ");
            }

        }



        while (true){
            System.out.println("\nA que posicion quieres que mueva la reina? ( . para salir)");
            String posicion = entrada.nextLine();

            if (posicion.equals(".")){
                break;
            }


            posicion = posicion.toLowerCase();
            String posicionNum = posicion.substring(1);
            int numColumna = posicion.charAt(0)-97;
            int numFila = 8 - Integer.parseInt(posicionNum);

            System.out.println("  ╭—————————————————————————╮");
            for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){

                    if (i==numFila && j==numColumna){//Imprime la reina en la posición correcta
                        tablero[i][j] = reinaB;
                        if (j==0){
                            System.out.print(8-i+" │ ");
                        }
                        System.out.print(tablero[i][j]+"   ");
                        if (j==7){
                            System.out.print("│");
                        }
                        continue;
                    }

                    if (j==0){//Imprime los números
                        System.out.print(8-i+" │ ");
                    }
                    if (j==7 && i==0){//Arregla un problema cuando la reina ocupa la última posición
                        tablero[i][j]=negro;
                        System.out.print(tablero[i][j]+" │");
                    }else {
                        if(j==7){//Imprime tablero
                            if ((i+j) % 2 ==0){
                                tablero[i][j]=blanco;
                                System.out.print(tablero[i][j]+" │");
                            }else {
                                tablero[i][j]=negro;
                                System.out.print(tablero[i][j]+" │");
                            }
                        }else {
                            if ((i+j) % 2 ==0){
                                tablero[i][j]=blanco;
                                System.out.print(tablero[i][j]+" ");
                            }else {
                                tablero[i][j]=negro;
                                System.out.print(tablero[i][j]+" ");
                            }
                        }
                    }


                }
                System.out.print("\n");
            }

            System.out.println("  ╰—————————————————————————╯");

            for (char letra='A';letra<='H';letra++){
                if (letra == 'A'){
                    System.out.print("    "+letra+"  ");
                }else {
                    System.out.print(letra+"  ");
                }

            }
        }

        System.out.println("Adiós!");


    }
}
