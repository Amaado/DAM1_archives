import java.util.Random;

public class PRG06_T02 {
    public static void main(String[] args) {
        double num = 0;
        double[] ar1 = new double[20];
        for (int i=0;i<=ar1.length;i++){
            num = Math.random()*100;
            if (num == 100){
                i--;
                continue;
            }

            ar1[i]=num;
        }


    }
}
