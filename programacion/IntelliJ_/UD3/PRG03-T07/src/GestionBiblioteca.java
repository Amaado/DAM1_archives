public class GestionBiblioteca {
    public static void main (String[]Args) {
        Libro Libro1 = new Libro("1984", "George Orwell", "978.84.99890.94.4", 1949);
        Libro Libro2 = new Libro("SING BACKWARDS AND WEEP", "Mark Lanegan", "978.84.18282.84.3", 2022);
        Libro Libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978.84.97592.20.8", 1967);
        Libro Libro4 = new Libro("El pescador de demonios", "Steve Redwood", "978.84.96693.18.0", 2008);
        Libro Libro5 = new Libro("La senda del perdedor", " Charles Bukowski ", "978.84.33914.69.9", 1982);

        System.out.println(Libro1);
        System.out.println(Libro2);
        System.out.println(Libro3);
        System.out.println(Libro4);
        System.out.println(Libro5+"\n");

        System.out.println("RESULTADOS TRAS REALIZAR OPERACIÓNS");
        System.out.println("---------------------------------------------");
        System.out.println("ISBN del libro 1 con guiones: "+Libro1.isbn.replace(".","-"));
        System.out.println("Pasamos a minúsculas: "+Libro2.titulo.charAt(0)+Libro2.titulo.substring(1).toLowerCase());
        System.out.println("Extracto del título del libro 3: "+Libro3.titulo.substring(5,12));
        System.out.println("Posición de 'de' en el título del libro 4: "+Libro4.titulo.indexOf("de"));
        System.out.println("Autor del libro 5 eliminando espacios en blanco: "+Libro5.autor.trim());
    }
}