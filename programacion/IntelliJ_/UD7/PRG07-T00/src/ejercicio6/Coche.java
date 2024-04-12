package ejercicio6;

public class Coche extends Vehiculo{

    private int numAsientos;

    public Coche(String marca, String modelo, int anho, String tipoCombustible, double eficienciaCombustible, int numAsientos) {
        super(marca, modelo, anho, tipoCombustible, eficienciaCombustible);
        this.numAsientos = numAsientos;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    @Override
    public double calculaEficienciaCombustible() {
        //Implementación de la eficiencia de combustible para coches
        return getEficienciaCombustible()*(1.0/(1.0 + (numAsientos/5.0)));
    }

    @Override
    public double calculaDistanciaRecorrida() {
        //Implementación de la distancia recorrida para coches
        return calculaEficienciaCombustible()*getEficienciaCombustible();
    }

    @Override
    public double velocidadMax() {
        //Implementación de la velocidad máxima para coches
        return 120.0;
    }
}
