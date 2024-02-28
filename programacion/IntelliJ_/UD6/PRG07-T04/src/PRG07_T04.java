import java.util.Scanner;

public class PRG07_T04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String [][] tablero = new String[8][8];
        String negro = "░░";
        String blanco = "▓▓";
        String dama = "♛";
        System.out.println("  ╭—————————————————————————╮");
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if (j==0){
                    System.out.print(8-i+" │ ");
                }
                if (j==7 && i==0){
                    tablero[i][j]=blanco;
                    System.out.print(tablero[i][j]+" │");
                }else {
                    if(j==7){
                        if ((i+j) % 2 ==0){
                            tablero[i][j]=negro;
                            System.out.print(tablero[i][j]+" │");
                        }else {
                            tablero[i][j]=blanco;
                            System.out.print(tablero[i][j]+" │");
                        }
                    }else {
                        if ((i+j) % 2 ==0){
                            tablero[i][j]=negro;
                            System.out.print(tablero[i][j]+" ");
                        }else {
                            tablero[i][j]=blanco;
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

        System.out.println("\nA que posicion quieres que mueva la reina?");
        String posicion = entrada.nextLine();
        posicion = posicion.toLowerCase();

        String posicionNum = posicion.substring(1);
        int numColumna = posicion.charAt(0)-97;
        int numFila = 8 - Integer.parseInt(posicionNum);

        System.out.println("  ╭—————————————————————————╮");
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){

                if (i==numFila && j==numColumna){
                    tablero[i][j] = dama;
                    if (j==0){
                        System.out.print(8-i+" │ ");
                    }
                    System.out.print(tablero[i][j]+" ");
                    continue;
                }
                if (j==0){
                    System.out.print(8-i+" │ ");
                }
                if (j==7 && i==0){
                    tablero[i][j]=blanco;
                    System.out.print(tablero[i][j]+" │");
                }else {
                    if(j==7){
                        if ((i+j) % 2 ==0){
                            tablero[i][j]=negro;
                            System.out.print(tablero[i][j]+" │");
                        }else {
                            tablero[i][j]=blanco;
                            System.out.print(tablero[i][j]+" │");
                        }
                    }else {
                        if ((i+j) % 2 ==0){
                            tablero[i][j]=negro;
                            System.out.print(tablero[i][j]+" ");
                        }else {
                            tablero[i][j]=blanco;
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
}
