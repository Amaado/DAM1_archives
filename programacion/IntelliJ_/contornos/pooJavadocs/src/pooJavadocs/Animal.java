package pooJavadocs;

/**
 * Clase que representa un animal genérico.
 * Utiliza encapsulamiento para proteger los atributos y métodos internos.
 */
public class Animal {
    private String nombre; // Encapsulamiento: atributo privado
    private int edad; // Encapsulamiento: atributo privado

    /**
     * Constructor de la clase pooJavadocs.Animal.
     * @param nombre El nombre del animal.
     * @param edad La edad del animal.
     */
    public Animal(String nombre, int edad) { // Constructores
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método que devuelve el sonido del animal.
     * @return El sonido del animal.
     */
    public String hacerSonido() { // Polimorfismo
        return "Haciendo sonido genérico...";
    }

    /**
     * Método que obtiene el nombre del animal.
     * @return El nombre del animal.
     */
    public String getNombre() { // Encapsulamiento: método público para acceder al atributo privado
        return nombre;
    }

    /**
     * Método que obtiene la edad del animal.
     * @return La edad del animal.
     */
    public int getEdad() { // Encapsulamiento: método público para acceder al atributo privado
        return edad;
    }
}