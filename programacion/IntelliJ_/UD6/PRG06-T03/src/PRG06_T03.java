import java.util.Arrays;

public class PRG06_T03 {
    public static void main(String[] args) {
        double num = 0;
        int[][] ar1= new int [4][5];


        for (int i=0;i<4;i++){
            num = Math.random()*10;
            int numInt = (int) num;

            if (num == 10){
                i--;
                continue;
            }

            //ar1[i][]=numInt;
        }
        System.out.println("\nArray aleatorio de 20 números (entre 0 y 9): \n"+ Arrays.toString(ar1));


    }
}
