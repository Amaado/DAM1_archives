package alumno;

import java.time.LocalDate;

/**
 * Subclase de persona (Alumno)
 */
public class Alumno extends Persona {

    private String curso;

    /**
     * Constructor de la clase Alumno
     * @param nombre El nombre del alumno
     * @param dni El dni del alumno
     * @param fechaNacimiento La fecha de nacimiento del alumno (con LocalDate)
     */
    public Alumno(String nombre, String dni, LocalDate fechaNacimiento) {
        super(nombre, dni, fechaNacimiento);
    }

    /**
     * Obtiene el curso actual del alumno
     * @return El curso del alumno
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Modifica o establece un nuevo curso para el alumno
     * @param curso El nuevo curso del alumno
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Obtiene el número de teléfono del alumno
     * @return el número de teléfono del alumno
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     * Modifica o establece un nuevo número de teléfono para el alumno
     * @param telefono El nuevo número de teléfono del alumno
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

}
