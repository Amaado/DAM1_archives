package facturacion;

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

    private void obtenerMontoFactura() {
        System.out.println("   IMPORTES");
        System.out.println("   --------");
        System.out.println("REF    DESCRIPCIÓN    UNIDADES    PRECIO    IMPORTE");
        System.out.println(numeroRef+" "+descripcion+"     "+cantidad+"  "+precio+"  "+(precio*cantidad));
    }

}
