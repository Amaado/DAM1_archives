package Andres;

public class GestionBiblioteca {
    public static void main(String[] args) {
        //Creamos los objetos
        Pelicula pelicula1 = new Pelicula("El Padrino","Francis Ford Coppola","123-ABC", "1972");
        Pelicula pelicula2 = new Pelicula("INTERSTELLAR","Christopher Nolan","456-DEF", "2014");
        Pelicula pelicula3 = new Pelicula("El gran Lebowski","Joel Coen","789-GHI", "1998");
        Pelicula pelicula4 = new Pelicula("Trainspotting","Danny Boyle","012-JKL", "1996");
        Pelicula pelicula5 = new Pelicula("Blade Runner","Ridley Scott","345-MNO", "1982");

        //Los mostramos en consola
        System.out.println(pelicula1);
        System.out.println(pelicula2);
        System.out.println(pelicula3);
        System.out.println(pelicula4);
        System.out.println(pelicula5);

        //Cabecera
        System.out.println("\nRESULTADOS TRAS REALIZAR OPERACIONES \n---------------------------------------------");


        System.out.println("Código de la película 1 con espacios: " +pelicula1.getCodigo().replace('-',' '));//Utilizamos .replace
        System.out.println("Pasamos a minúsculas: "+pelicula2.getTitulo().substring(0,1).toUpperCase()+pelicula2.getTitulo().substring(1,12).toLowerCase());//Utilizamos toUpperCase
        System.out.println("Extracto del título de la película 3: "+pelicula3.getTitulo().substring(8,15));//Utilizamos substring
        System.out.println("Posición de 'Runner' en el título de la película 5: " +pelicula5.getTitulo().indexOf("Runner")); //Utilizamos .indexOf
        System.out.println("Director de la película 5 eliminando espacios en blanco: "+pelicula5.getDirector().trim());//Utlizamos .trim

    }
}
