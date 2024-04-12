/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Clase principal para poder probar las funcionalidades del programa.
 * @author Usuario
 */
public class Main {

    /**
     * Clase estática main para hacer que el programa compile
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso)
     */
    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Alumno("pepe", "12345678", LocalDate.parse("2003-06-22")));
        lista.add(new Alumno("ana",  "87654321X", LocalDate.parse("1999-01-11")));
        lista.add(new Alumno("luis", "00000000T", LocalDate.parse("2002-02-28")));
        lista.get(0).asignarLetraDNI();
        System.out.println("Lista inicial:\n"+lista);
        Collections.sort(lista, new PersonaComparator());
        System.out.println("Lista ordenada por edad:\n"+lista);
    }

    /**
     * Clase estática para comparar dos objetos de clase "Persona" con la interfaz "Comparator"
     */
    private static class PersonaComparator implements Comparator<Persona> {
        /**
         * @param p1 Primer objeto Persona para ser comparado.
         * @param p2 Segundo objecto Persona para ser comparado.
         * @return Devuelve un número entero negativo si p1 es más joven y uno positivo si p2 es más joven.
         */
        @Override
        public int compare(Persona p1, Persona p2) {
            return (int) ChronoUnit.DAYS.between(p2.getFechaNacimiento(), p1.getFechaNacimiento());
        }
    }
}
