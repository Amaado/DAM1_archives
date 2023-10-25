import javax.swing.*;

public class PROGT3_Ejerc9 {
    public static void main(String[] args){
        short año= Short.parseShort(JOptionPane.showInputDialog("CALCULADORA DE AÑOS BISIESTOS:\nAÑO: \nBISIESTO\nNO BISIESTO"));
        JOptionPane.showMessageDialog(null, "CALCULADORA DE AÑOS BISIESTOS:\nAÑO: "+año+"\nBISIESTO\nNO BISIESTO");

        if ((año%4==0 && año % 100 != 0) || año % 400 == 0){
            JOptionPane.showMessageDialog(null, "CALCULADORA DE AÑOS BISIESTOS:\nAÑO: "+año+"\nBISIESTO  X\nNO BISIESTO");
        }else{
            JOptionPane.showMessageDialog(null, "CALCULADORA DE AÑOS BISIESTOS:\nAÑO: "+año+"\nBISIESTO\nNO BISIESTO  X");
        }
    }
}
