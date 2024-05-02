package andres_amado_cibreiro;

public class ProductoFresco extends Producto{
    private String fechaCaducidad;

    public ProductoFresco(String nombre, String codigo, int cantidadDisponible, double precioUnitario, String fechaCaducidad) {
        super(nombre, codigo, cantidadDisponible, precioUnitario);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" +
                "fechaCaducidad='" + fechaCaducidad + '\'' +
                '}';
    }
}
