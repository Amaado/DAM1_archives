package pooJavadocs;

/**
 * Clase principal que contiene el método main para probar el programa.
 */
public class Main {
    public static void main(String[] args) {
        // Crear instancias de animales
        Animal animalGenerico = new Animal("pooJavadocs.Animal", 5);
        Perro miPerro = new Perro("Fido", 3);
        Gato miGato = new Gato("Garfield", 2);

        // Usar los métodos de cada animal
        System.out.println("Nombre: " + animalGenerico.getNombre() + ", Edad: " + animalGenerico.getEdad() +
                ", Sonido: " + animalGenerico.hacerSonido());
        System.out.println("Nombre: " + miPerro.getNombre() + ", Edad: " + miPerro.getEdad() +
                ", Sonido: " + miPerro.hacerSonido());
        System.out.println("Nombre: " + miGato.getNombre() + ", Edad: " + miGato.getEdad() +
                ", Sonido: " + miGato.hacerSonido());
    }
}