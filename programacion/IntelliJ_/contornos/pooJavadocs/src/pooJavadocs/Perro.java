package pooJavadocs;

/**
 * Clase que representa un perro.
 * Hereda de la clase pooJavadocs.Animal.
 */
public class Perro extends Animal {
    /**
     * Constructor de la clase pooJavadocs.Perro.
     * @param nombre El nombre del perro.
     * @param edad La edad del perro.
     */
    public Perro(String nombre, int edad) { // Constructores
        super(nombre, edad); // Llamada al constructor de la clase base
    }

    /**
     * Método que devuelve el sonido del perro.
     * @return El ladrido del perro.
     */
    @Override
    public String hacerSonido() { // Polimorfismo
        return "Guau guau";
    }
}