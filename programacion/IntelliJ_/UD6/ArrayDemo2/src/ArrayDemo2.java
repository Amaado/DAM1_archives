public class ArrayDemo2 {
    public static void main(String[] args) {
        int nums[] = {2, 4, 7, 1, 5 },sum =0;
        double media;
        for(int n: nums){ //Bucle for-each
            sum += n;//n <-- cada elemento de la colección nums
            media = (double)sum/ nums.length;
            System.out.printf("La suma es: %d y media es: %.2f%n", sum, media);
        }
    }
}
