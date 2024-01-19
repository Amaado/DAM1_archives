import java.util.Scanner;

public class PRG04_T02_Ejerc2_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        String caract;
        System.out.println("Introducir un carácter: ");
        caract = entrada.nextLine();

        while (true){

            String sentencia;
            System.out.println("Escribe lo que quieras: (<> para finalizar)");
            sentencia = entrada.nextLine();

            for (int i = 0; i <= sentencia.length()-1; i++){

                if (sentencia.substring(i,i+1).equals(caract)){
                    contador=contador+1;
                }

            }
            if (sentencia.contains("<>")){
                break;
            }
        }

        System.out.println("Estribiste el caracter \""+caract+"\" un total de "+contador+" veces.");

    }
}
