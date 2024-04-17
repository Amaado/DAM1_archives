import java.util.Objects;

public final class Habitacion {

    private String uso;
    private double m2;
    private int numVentanas;

    public Habitacion(String uso, double m2, int numVentanas) {
        this.uso = uso;
        this.m2 = m2;
        this.numVentanas = numVentanas;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public int getNumVentanas() {
        return numVentanas;
    }

    public void setNumVentanas(int numVentanas) {
        this.numVentanas = numVentanas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habitacion that = (Habitacion) o;
        return Double.compare(m2, that.m2) == 0 && numVentanas == that.numVentanas && Objects.equals(uso, that.uso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uso, m2, numVentanas);
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "uso='" + uso + '\'' +
                ", m2=" + m2 +
                ", numVentanas=" + numVentanas +
                '}';
    }
}
