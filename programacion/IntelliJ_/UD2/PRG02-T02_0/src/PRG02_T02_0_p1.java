import java.util.Scanner;

public class PRG02_T02_0_p1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nome;
        String idade;

        System.out.println("Introduce o teu nome ");
        nome=entrada.nextLine();
        System.out.println("Introduce a tá idade ");
        idade=entrada.nextLine();
        int idade2=Integer.parseInt(idade);

        System.out.println( "Ola "+nome+", a túa idade dentro dun ano será "+(idade2+1));
    }
}
