package ej3;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Muestra m1=new Muestra();
        System.out.println(Arrays.toString(m1.getNumeros()));

        Muestra m2=new Muestra(3);
        System.out.println(Arrays.toString(m2.getNumeros()));

        Muestra m3=new Muestra(new int[] {1,2,3,4,4,5,6});
        double media=Estadistica.media(m3);
        System.out.println("La media es "+media);


        int moda=Estadistica.moda(m3);
        System.out.println("La moda es "+moda);



    }
}
