import javax.swing.*;

public class PRG02_T03_Ejerc5 {
public static void main(String[] args){
        int segundos=Integer.parseInt(JOptionPane.showInputDialog("Introduce os segundos: "));
        int minutos=segundos/60;
        int horas=minutos/60;
        int dias=horas/24;
        int segundos2;

        segundos2=segundos%60;
        minutos=minutos%60;
        horas=horas%24;

        JOptionPane.showMessageDialog(null, segundos+" segundos son "+segundos2+" segundos, "+minutos+" minutos, "+horas+" horas, "+dias+" días.");
        }
        }
