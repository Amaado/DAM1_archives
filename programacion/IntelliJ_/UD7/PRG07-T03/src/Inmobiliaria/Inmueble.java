package Inmobiliaria;

import java.util.Objects;

public abstract sealed class Inmueble permits Local, InmuebleVivienda {
    protected int id;
    protected String direccion;
    protected double precio;
    protected double m2;

    public Inmueble(int id, String direccion, double precio, double m2) {
        this.id = id;
        this.direccion = direccion;
        this.precio = precio;
        this.m2 = m2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inmueble inmueble = (Inmueble) o;
        return id == inmueble.id && Double.compare(precio, inmueble.precio) == 0 && Double.compare(m2, inmueble.m2) == 0 && Objects.equals(direccion, inmueble.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, direccion, precio, m2);
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", precio=" + precio +
                ", m2=" + m2 +
                '}';
    }
}
