import javax.swing.*;

public class PROG02_Ejerc4 {
    public static void main(String[] args){
        int edad= Integer.parseInt(JOptionPane.showInputDialog("Introduce a túa edade: "));
        JOptionPane.showMessageDialog(null, (edad >= 18)?"Eres mayor de edad":"Eres menor de edad");
    }
}
