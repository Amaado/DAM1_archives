public class ArrayRef {
    public static void main(String[] args) {
        int[] ar1= {1,2,3,4,5};
        int[] ar2 = ar1;
        initArray(ar2, -1);
        ar2[2] = 99;
        for (int n: ar1) //bucle impresión
            System.out.print(n+" ");
    }

    private static void initArray(int[] a,int n){
        for(int i=0; i<a.length;i++) a[i] = n; //bucle inicialización
    }
}
/* output:
-1 -1 99 -1 -1
*/