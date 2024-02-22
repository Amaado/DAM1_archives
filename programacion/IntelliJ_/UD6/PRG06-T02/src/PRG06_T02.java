import java.util.Arrays;
import java.util.Random;

public class PRG06_T02 {
    public static void main(String[] args) {
        double num = 0;
        int[] ar1 = new int[20];
        for (int i=0;i<ar1.length;i++){
            num = Math.random()*100;
            if (num == 100){
                i--;
                continue;
            }
            int numInt = (int) num;
            ar1[i]=numInt;


        }
        System.out.println(Arrays.toString(ar1));

    }
}
