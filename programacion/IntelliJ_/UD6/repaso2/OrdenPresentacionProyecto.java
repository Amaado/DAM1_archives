package org.rosalia.repaso2;

/*
Este programa crea un array con los nombres de los alumnos, luego genera otro array que
contiene los mismos nombres pero en un orden aleatorio utilizando el algoritmo de
Fisher-Yates.
 El algoritmo de Fisher-Yates (o alguna variante del mismo) es el que se usa típicamente
 para barajar en los juegos de azar.

También es el algoritmo que permite recorrer toda una selección
(por ejemplo una lista musical), de forma aleatoria una sola vez (una reproducción por cada
elemento en la lista).
 */
import java.util.Arrays;
import java.util.Random;

public class OrdenPresentacionProyecto {
    public static void main(String[] args) {
        // Array con los nombres de los alumnos
        String[] nombres = {"Juan", "María", "Carlos", "Ana", "Pedro", "Laura", "David", "Sofía"};

        // Crear una copia del array de nombres
        String[] nombresAleatorios = Arrays.copyOf(nombres, nombres.length);

        // Generar orden aleatorio utilizando el algoritmo de Fisher-Yates
        Random rand = new Random();
        for (int i = nombresAleatorios.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            // Intercambiar los elementos en las posiciones i y j
            String temp = nombresAleatorios[i];
            nombresAleatorios[i] = nombresAleatorios[j];
            nombresAleatorios[j] = temp;
        }

        // Imprimir el orden aleatorio de presentación
        System.out.println("Orden aleatorio de presentación del proyecto:");
        for (int i = 0; i < nombresAleatorios.length; i++) {
            System.out.println((i + 1) + ". " + nombresAleatorios[i]);
        }
    }
}

