import javax.swing.*;

public class PROGT4_Ejerc3 {
    public static void main(String[] args){
        String input;
        String respuesta = JOptionPane.showInputDialog(null, "Quieres que calcule euros a pesetas o viceversa?");
        if (respuesta.equalsIgnoreCase("Euro")
                ||respuesta.equalsIgnoreCase("Euros")
                ||respuesta.equalsIgnoreCase("Euro a peseta")
                ||respuesta.equalsIgnoreCase("Euro a pesetas")
                ||respuesta.equalsIgnoreCase("Euros a peseta")
                ||respuesta.equalsIgnoreCase("Euros a pesetas")){
            input = JOptionPane.showInputDialog("Introduce una cantidad en euros:");
            double cantidadEnEuros = Double.parseDouble(input);
            double tasaCambioEuroAPeseta = 166.386;
            double cantidadEnPesetas = cantidadEnEuros * tasaCambioEuroAPeseta;
            JOptionPane.showMessageDialog(null, cantidadEnEuros + " euros son equivalentes a " + cantidadEnPesetas + " pesetas.");
        }
        if (respuesta.equalsIgnoreCase("Peseta")
                ||respuesta.equalsIgnoreCase("Pesetas")
                ||respuesta.equalsIgnoreCase("Peseta a euro")
                ||respuesta.equalsIgnoreCase("Peseta a euros")
                ||respuesta.equalsIgnoreCase("Pesetas a euro")
                ||respuesta.equalsIgnoreCase("Pesetas a euros")){
            input = JOptionPane.showInputDialog("Introduce una cantidad en pesetas:");
            double cantidadEnPesetas = Double.parseDouble(input);
            double tasaCambioPesetaAEuro = 1 / 166.386;
            double cantidadEnEuros = cantidadEnPesetas * tasaCambioPesetaAEuro;
            JOptionPane.showMessageDialog(null, cantidadEnPesetas + " pesetas son equivalentes a " + cantidadEnEuros + " euros.");
        }

    }
}
