public class Factura {
    private String numeroRef;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura(String numeroRef, String descripcion, int cantidad, double precio) {
        this.numeroRef = numeroRef;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNumeroRef() {
        return numeroRef;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNumeroRef(String numeroRef) {
        this.numeroRef = numeroRef;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double obtenerMontoFactura() {
        return cantidad * precio;
    }

}