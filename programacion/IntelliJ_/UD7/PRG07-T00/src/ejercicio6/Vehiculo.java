package ejercicio6;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anho;
    private String tipoCombustible;
    private double eficienciaCombustible;

    public Vehiculo(String marca, String modelo, int anho, String tipoCombustible, double eficienciaCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.tipoCombustible = tipoCombustible;
        this.eficienciaCombustible = eficienciaCombustible;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnho() {
        return anho;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public double getEficienciaCombustible() {
        return eficienciaCombustible;
    }

    public abstract double calculaEficienciaCombustible();
    public abstract double calculaDistanciaRecorrida();
    public abstract double velocidadMax();

}
