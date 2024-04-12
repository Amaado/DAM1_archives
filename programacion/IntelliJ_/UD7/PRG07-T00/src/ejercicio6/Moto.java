package ejercicio6;

public class Moto extends Vehiculo{
    private double cilindrada;

    public Moto(String marca, String modelo, int anho, String tipoCombustible, double eficienciaCombustible, double cilindrada) {
        super(marca, modelo, anho, tipoCombustible, eficienciaCombustible);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    @Override
    public double calculaEficienciaCombustible() {
        return getEficienciaCombustible()*(1.0/(1.0+(cilindrada/1000.0)));
    }

    @Override
    public double calculaDistanciaRecorrida() {
        return calculaEficienciaCombustible()*getEficienciaCombustible();
    }

    @Override
    public double velocidadMax() {
        return 80;
    }
}
