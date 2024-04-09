package sealed;

public class Animal {
    private double peso;
    private  double estatura;
    private  String raza;

    public Animal(double peso, double estatura, String raza) {
        this.peso = peso;
        this.estatura = estatura;
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "peso=" + peso +
                ", estatura=" + estatura +
                ", raza='" + raza + '\'' +
                '}';
    }
}
