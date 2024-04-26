package pooJavadocs;

/**
 * Clase que representa un gato.
 * Hereda de la clase pooJavadocs.Animal.
 */
public class Gato extends Animal {
    /**
     * Constructor de la clase pooJavadocs.Gato.
     * @param nombre El nombre del gato.
     * @param edad La edad del gato.
     */
    public Gato(String nombre, int edad) { // Constructores
        super(nombre, edad); // Llamada al constructor de la clase base
    }

    /**
     * Método que devuelve el sonido del gato.
     * @return El maullido del gato.
     */
    @Override
    public String hacerSonido() { // Polimorfismo
        return "Miau";
    }
}
