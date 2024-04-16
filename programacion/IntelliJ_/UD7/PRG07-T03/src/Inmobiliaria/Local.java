package Inmobiliaria;

import java.util.Objects;

public final class Local extends Inmueble{

    private boolean salidaHumos;

    public Local(int id, String direccion, double precio, double m2, boolean salidaHumos) {
        super(id, direccion, precio, m2);
        this.salidaHumos = salidaHumos;
    }

    public boolean isSalidaHumos() {
        return salidaHumos;
    }

    public void setSalidaHumos(boolean salidaHumos) {
        this.salidaHumos = salidaHumos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Local local = (Local) o;
        return salidaHumos == local.salidaHumos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salidaHumos);
    }

    @Override
    public String toString() {
        return "Local{" +
                "salidaHumos=" + salidaHumos +
                '}';
    }
}
