package Andres;

public class CuentaCorriente extends CuentaBancaria {
    private String entidadesAutorizadas;

    @Override
    public String DevolverInfoString() {
        return null;
    }

    public String getEntidadesAutorizadas() {
        return entidadesAutorizadas;
    }

    public void setEntidadesAutorizadas(String entidadesAutorizadas) {
        this.entidadesAutorizadas = entidadesAutorizadas;
    }
}
