package alumno;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Superclase Persona de la cual heredará la subclase Alumno
 */
public class Persona {

    /**
     * Constante que se utilizará para saber si una persona es mayor de edad o no
     */
    public static final int INT = 18;
    /**
     * Variable protected que se podrá utilizar en clases del mismo paquete o subclases de otros paquetes
     */
    protected long telefono;
    private String nombre;
    private String dni;
    private LocalDate fechaNacimiento;

    /**
     * Único constructor de la clase Persona
     * @param nombre Nombre de la persona
     * @param dni DNI de la persona
     * @param fechaNacimiento Fecha de nacimiento de la persona
     */
    public Persona(String nombre, String dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene el nombre de la persona
     * @return El nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la persona
     * @param nombre El nombre nuevo de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el dni de la persona
     * @return El dni de la persona
     */
    public String getDni() {
        return dni;
    }

    /**
     * Modifica el dni de una persona
     * @param dni El dni modificado de la persona
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene la fecha de nacimiento de la persona
     * @return La fecha de nacimiento de la persona
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Modifica una fecha de nacimiento de una persona
     * @param fechaNacimiento La fecha de nacimiento modificada de la persona
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Sobreescritura del método toString
     * @return El nuevo método devolverá el siguiente formato: "nombre, dni y fecha de nacimiento".
     */
    @Override
    public String toString() {
        return nombre + ", dni=" + dni + ", fecNac=" + fechaNacimiento+"\n";
    }

    /**
     * Método que comprueba si el dni es correcto
     * @return Devolverá true o false en caso de si es correcto o no.
     */
public boolean comprobarDNI () {
       
       int num=0;
       boolean numeroValido = true;
       
       char letraDNI = Character.toUpperCase(this.dni.charAt(this.dni.length()-1));    
       String numero = this.dni.substring(0,this.dni.length()-1);
       
       char letraCorrecta = getLetraCorrecta();
       
       if (letraDNI == letraCorrecta) return true;
       else return false;
    }

    /**
     * Se asigna una letra al dni de una persona
     */
    public void asignarLetraDNI () {
        char letraCorrecta = getLetraCorrecta();
        if (letraCorrecta != ' ') this.dni+=letraCorrecta;
    }

    /**
     * Método para calcular la letra correcta de un dni
     * @return La letra que debería corresponder al dni de la persona
     */
    private char getLetraCorrecta() {
        int num=0;
        boolean numeroValido = true;
        String numero= this.dni;

        char letraCorrecta = ' ';
        try {
             num = Integer.parseInt(numero);
        } catch (NumberFormatException numberFormatException) { numeroValido = false;}
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        if (numeroValido) {
            letraCorrecta=letras.charAt(num%23);
        }
        return letraCorrecta;
    }

    /**
     * Indica si la persona es mayor de edad o no
     * @return True si es mayor de edad o false si es menor.
     */
    boolean esMayorDeEdad () {
        if (ChronoUnit.YEARS.between(this.getFechaNacimiento(), LocalDate.now()) >= INT)
            return true;
        return false;
    }



}
