//: ArrayDemo.java
/**
 * Cuadrados de los 100 primeros números en 10 columnas
 */
class ArrayDemo {
    public static void main(String[] args) {
// creación array
// bucle inicialización
        int[] sq = new int[100];
        for(int i=0; i<100; i++)
            sq[i] = i*i;
        for(int i=0; i<100; i++) // bucle impresión
            System.out.printf("%04d%c", sq[i], ((i+1)%10==0)?'\n':'\t');
    }
}