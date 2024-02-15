
import javax.swing.*;
import java.io.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        String rutaArchivo = "datos_vehiculos.txt";

        while (true) {
            String matricula = JOptionPane.showInputDialog("Ingrese la matrícula del vehículo:");
            String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
            double tamanoDeposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño del depósito del vehículo (litros):"));
            String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");

            // Escribir los datos en el archivo
            escribirDatosEnArchivo(rutaArchivo, matricula, marca, tamanoDeposito, modelo);

            // Preguntar al usuario si desea ingresar otro vehículo
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro vehículo?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion != JOptionPane.YES_OPTION) {
                break;
            }
        }

        // Leer y mostrar los datos de los vehículos
        leerYMostrarDatosDeArchivo(rutaArchivo);
    }

    private static void escribirDatosEnArchivo(String rutaArchivo, String matricula, String marca, double tamanoDeposito, String modelo) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(rutaArchivo, true))) {
            dataOutputStream.writeUTF(matricula);
            dataOutputStream.writeUTF(marca);
            dataOutputStream.writeDouble(tamanoDeposito);
            dataOutputStream.writeUTF(modelo);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void leerYMostrarDatosDeArchivo(String rutaArchivo) {
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(rutaArchivo))) {
            while (dataInputStream.available() > 0) {
                String matricula = dataInputStream.readUTF();
                String marca = dataInputStream.readUTF();
                double tamanoDeposito = dataInputStream.readDouble();
                String modelo = dataInputStream.readUTF();

                // Mostrar los datos en un cuadro de diálogo
                JOptionPane.showMessageDialog(null, "Matrícula: " + matricula + "\nMarca: " + marca + "\nTamaño del depósito: " + tamanoDeposito + " litros\nModelo: " + modelo, "Datos del Vehículo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

