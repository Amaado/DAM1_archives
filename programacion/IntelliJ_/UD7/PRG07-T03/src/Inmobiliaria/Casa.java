package Inmobiliaria;

import java.util.Objects;

public class Casa extends InmuebleVivienda{
    private int numPisos;

    public Casa(int numPisos) {
        this.numPisos = numPisos;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Casa casa = (Casa) o;
        return numPisos == casa.numPisos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numPisos);
    }

    @Override
    public String toString() {
        return "Casa{" +
                "numPisos=" + numPisos +
                '}';
    }
}
