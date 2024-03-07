package org.rosalia.repaso2;

import java.util.Random;
import java.util.Scanner;

public class GeneradorContraseñas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la longitud de la contraseña
        System.out.print("Ingrese la longitud de la contraseña: ");
        int longitud = scanner.nextInt();

        // Generar contraseña
        String contraseña = generarContraseña(longitud);

        // Imprimir la contraseña generada
        System.out.println("La contraseña generada es: " + contraseña);
    }

    // Método para generar una contraseña
    public static String generarContraseña(int longitud) {
        // Definir los caracteres disponibles para la contraseña
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789\\!|\"@·#$%&¬/()=?¿¡^*+][¨{}-_:;<>çÇºª";
        char[] contraseña = new char[longitud];

        Random rand = new Random();
        for (int i = 0; i < longitud; i++) {
            // Seleccionar un carácter aleatorio de la lista de caracteres disponibles
            int indice = rand.nextInt(caracteres.length());
            contraseña[i] = caracteres.charAt(indice);

        }

        return new String(contraseña);
    }
}
