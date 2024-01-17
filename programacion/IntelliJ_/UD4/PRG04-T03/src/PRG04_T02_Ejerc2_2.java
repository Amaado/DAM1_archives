public class PRG04_T02_Ejerc2_2 {
    public static void main(String[] args) {

        int multiplicando;
        int resultado;
        int multiplicador;

        System.out.println("*************************");
        System.out.println("* TABLAS DE MULTIPLICAR *");
        System.out.println("*************************");

        for (multiplicando=0;multiplicando<11;multiplicando++){
            System.out.println("\n------------");
            System.out.println("TABLA DEL "+multiplicando);
            System.out.println("------------");;

            for (multiplicador=0;multiplicador<11;multiplicador++){
                resultado = multiplicando * multiplicador;
                System.out.println(multiplicando+" x "+multiplicador+" = "+resultado);
            }
        }


    }
}
