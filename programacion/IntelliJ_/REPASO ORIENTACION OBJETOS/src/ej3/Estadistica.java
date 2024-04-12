package ej3;

public class Estadistica {
    public static double media(Muestra m){
        double suma=0;
        for(int i = 0; i < m.getCantidadNumeros();i++){
            suma+=m.getNumeros()[i];
        }
        return suma/m.getCantidadNumeros();
    }
    public static int moda(Muestra m){
        int moda=0;
        int maxFrecuencia=0;
        int []numeros=m.getNumeros();
        for (int i=0; i < m.getCantidadNumeros();i++){
            int frecuencia = 0;
            for (int j=0; j < m.getCantidadNumeros();j++){
                if (numeros[j]==numeros[i])
                frecuencia++;
            }

            if (frecuencia>maxFrecuencia){
                maxFrecuencia=frecuencia;
                moda=numeros[i];
            }
        }

        return moda;
    }
}
