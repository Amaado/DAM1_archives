public class EstructuraFor {
    public static void main(String[] args){

        int num;
        double raiz,erro;
        for (num=100;num<101;num++){
            raiz=Math.sqrt(num);
            erro=num-(raiz*raiz);
            System.out.println("A raíz de "+num+" é: "+raiz);
            System.out.println("O erro de redondeo é: "+erro);
        }

    }
}
