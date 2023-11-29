import javax.swing.*;
import java.awt.*;

public class PRG02_T05_Ejerc4 {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String radioStr = JOptionPane.showInputDialog("Ingrese el valor del radio del círculo:");
            double radio = Double.parseDouble(radioStr);

            double area = Math.PI * Math.pow(radio, 2);

            JOptionPane.showMessageDialog(null, "El área del círculo con radio " + radio + " es: " + area);

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea calcular el área de otro círculo?", "Continuar", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }
    }
}