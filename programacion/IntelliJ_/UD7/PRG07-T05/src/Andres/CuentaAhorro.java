package Andres;

public class CuentaAhorro extends CuentaBancaria {
    private double TipoInteresAnual;

    @Override
    public String DevolverInfoString() {
        return null;
    }

    public double getTipoInteresAnual() {
        return TipoInteresAnual;
    }

    public void setTipoInteresAnual(double tipoInteresAnual) {
        TipoInteresAnual = tipoInteresAnual;
    }
}
