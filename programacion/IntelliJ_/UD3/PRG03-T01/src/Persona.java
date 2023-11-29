// CLASE
public class Persona {
    // ATRIBUTOS / PROPIEDADES
    private String nombre;
    private int edad;
    private float altura;

    // CONSTRUCTOR/ES
    // public Person(PARÁMETROS)
    // Constructor vacio = NO PARAMETROS
    public Persona() {
        nombre = "X";
        edad = -1;
        altura = -1;
    }

    public Persona(String nombre, int edad, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // GETTERS Y SETTERS
    // public... <lo que devuelves> <nombre del método>() {}
    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getAltura(){return altura;}

    // SETTERS
    // public... void <nombre del método>(<parametros para asignar>) {}
    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // MÉTODOS / FUNCIONES
}
