import javax.swing.*;
import java.text.DecimalFormat;

public class PROGT3_Ejerc7 {
    public static void main(String[] args){
        double resultado;

        String A=JOptionPane.showInputDialog("CALCULADORA DA ECUACIONÓN: Ax + B = 0\nValor A= ");
        String B=JOptionPane.showInputDialog("CALCULADORA DA ECUACIONÓN: Ax + B = 0\nValor A=  "+A+"\nValor B=  ");
        JOptionPane.showMessageDialog(null, "CALCULADORA DA ECUACIONÓN: Ax + B = 0\nValor A=  "+A+"\nValor B=  "+B+"\n ");

        resultado=-(double)( Integer.parseInt(B) )/Integer.parseInt(A);

        DecimalFormat df = new DecimalFormat("#0.0000");
        JOptionPane.showMessageDialog(null, df.format(resultado));

    }
}
