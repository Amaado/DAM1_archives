package ejercicio6;

public class Camion extends Vehiculo{
    private double capacidadCarga;

    public Camion(String marca, String modelo, int anho, String tipoCombustible, double eficienciaCombustible, double capacidadCarga) {
        super(marca, modelo, anho, tipoCombustible, eficienciaCombustible);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public double calculaEficienciaCombustible() {
        return getEficienciaCombustible()*(1.0/(1.0+(capacidadCarga/1000.0)));
    }

    @Override
    public double calculaDistanciaRecorrida() {
        return calculaEficienciaCombustible()*getEficienciaCombustible();
    }

    @Override
    public double velocidadMax() {
        return 90.0;
    }
}
