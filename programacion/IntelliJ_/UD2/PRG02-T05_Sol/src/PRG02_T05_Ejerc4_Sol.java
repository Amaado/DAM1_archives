import javax.swing.JOptionPane;

public class PRG02_T05_Ejerc4_Sol {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            // Paso 1: Solicitar el radio al usuario
            String radioStr = JOptionPane.showInputDialog("Ingrese el valor del radio del círculo:");

            try {
                // Convertir la entrada del usuario a un valor numérico
                double radio = Double.parseDouble(radioStr);

                // Paso 2: Calcular el área del círculo
                double area = Math.PI * Math.pow(radio, 2);

                // Paso 3: Mostrar el resultado en un cuadro de diálogo
                JOptionPane.showMessageDialog(null, "El área del círculo con radio " + radio + " es: " + area);

                // Preguntar al usuario si desea continuar

                int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea calcular el área de otro círculo?", "Continuar", JOptionPane.YES_NO_OPTION);
                //int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea calcular el área de otro círculo?");

                System.out.println(respuesta);
                if (respuesta != JOptionPane.YES_OPTION) {
                    continuar = false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}