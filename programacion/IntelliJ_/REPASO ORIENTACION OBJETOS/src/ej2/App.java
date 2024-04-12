package ej2;

import ej1.Alumno;

public class App {

    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        a1.setNombre("María");
        a1.setApellidos("Fernandez Suárez");
        a1.setEdad(14);
        a1.setEmail("maria@gmail.com");

        Alumno a2 = new Alumno();
        a2.setNombre("Pedro");
        a2.setApellidos("Castro Varela");
        a2.setEdad(21);
        a2.setEmail("pedro@gmail.com");

        Alumno a3 = new Alumno();
        a3.setNombre("Carmen");
        a3.setApellidos("Suárez García");
        a3.setEdad(18);
        a3.setEmail("carmen@gmail.com");

        Alumno a4 = new Alumno();
        a4.setNombre("Rosario");
        a4.setApellidos("Rodriguez Ramallosa");
        a4.setEdad(1);
        a4.setEmail("rosario@gmail.com");

        Alumno a5 = new Alumno();
        a5.setNombre("Carlos");
        a5.setApellidos("Aguijón Punzante");
        a5.setEdad(1);
        a5.setEmail("carlos@gmail.com");

        Alumno[] listaAlumnos  = {a1, a2, a3, a4, a5};

        String solucion = "El alumno más joven es "+listaAlumnos[0].getNombre()+" "+listaAlumnos[0].getApellidos()+" con "+listaAlumnos[0].getEdad()+" años";
        int variable = listaAlumnos[0].getEdad();
        for (Alumno x : listaAlumnos){
            if (x.getEdad()<variable){
                variable = x.getEdad();
                solucion = "El alumno más joven es "+x.getNombre()+" "+x.getApellidos()+" con "+x.getEdad()+" años";
                continue;
            }
            if (x.getEdad()==variable){
                solucion = solucion.replace("El","Los");
                solucion = solucion.replace("alumno","alumnos");
                solucion = solucion.replace("es","son");
                solucion = solucion.replace("joven","jóvenes");
                solucion = solucion.concat(", "+x.getNombre()+" "+x.getApellidos()+" con "+x.getEdad()+" años");

            }
            if (x.getEdad()==1){
                solucion = solucion.replace("años","año");
            }
        }

        System.out.printf(solucion+".");


    }
}
