import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PRG02_T2_0_p3 {
    public static void main(String[] args){
        double resultado;
        String num=JOptionPane.showInputDialog("Introduce un número ");

        resultado=Math.sqrt(Integer.parseInt(num));

        DecimalFormat df = new DecimalFormat("#.0000");
        JOptionPane.showMessageDialog(null, "Raíz cuadrada de "+num+" es "+df.format(resultado));
    }
}
