package Andres;

public class CuentaCorrienteEmpresa extends CuentaCorriente{
    private double tipoInteresesDescubierto;
    private double comisionFijaDescuento;
    private double maxDescuentoPermitido;

    public double getTipoInteresesDescubierto() {
        return tipoInteresesDescubierto;
    }

    public void setTipoInteresesDescubierto(double tipoInteresesDescubierto) {
        this.tipoInteresesDescubierto = tipoInteresesDescubierto;
    }

    public double getComisionFijaDescuento() {
        return comisionFijaDescuento;
    }

    public void setComisionFijaDescuento(double comisionFijaDescuento) {
        this.comisionFijaDescuento = comisionFijaDescuento;
    }

    public double getMaxDescuentoPermitido() {
        return maxDescuentoPermitido;
    }

    public void setMaxDescuentoPermitido(double maxDescuentoPermitido) {
        this.maxDescuentoPermitido = maxDescuentoPermitido;
    }
}
