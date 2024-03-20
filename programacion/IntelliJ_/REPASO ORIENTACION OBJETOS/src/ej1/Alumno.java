package ej1;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String email;
    private int edad;
    private String telefono;

    public Alumno(String nombre, String apellidos, String email, int edad, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Alumno() {

    }

    public Alumno(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return edad == alumno.edad && Objects.equals(nombre, alumno.nombre) && Objects.equals(apellidos, alumno.apellidos) && Objects.equals(email, alumno.email) && Objects.equals(telefono, alumno.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, email, edad, telefono);
    }

    public boolean mayorEdad(){
        return(edad>=18);
    }


}