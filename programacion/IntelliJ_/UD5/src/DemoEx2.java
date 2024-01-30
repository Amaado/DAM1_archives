import java.util.Scanner;
import java.util.InputMismatchException;

public class DemoEx2 {
    public static void main(String[] args) {
        int[] numer = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int[] denom = { 2, 0, 4, 4, 0, 8 };
        try { // try externo
            for(int i=0; i<numer.length; i++) {
                try { // try interno
                    System.out.println(numer[i]+"/"+denom[i]+"="+(numer[i]/denom[i]));
                }
                catch(AritmeticException e) { System.out.println(e); }
            }
        }
        catch(IndexOutOfBoundsException e) { System.out.println(e); }
    }
}
