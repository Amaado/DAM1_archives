package andres_amado_cibreiro;

public class ProductoNoFresco extends Producto{
    private int diasParaConsumo;

    public int getDiasParaConsumo() {
        return diasParaConsumo;
    }

    public ProductoNoFresco(String nombre, String codigo, int cantidadDisponible, double precioUnitario, int diasParaConsumo) {
        super(nombre, codigo, cantidadDisponible, precioUnitario);
        this.diasParaConsumo = diasParaConsumo;
    }

    public void setDiasParaConsumo(int diasParaConsumo) {
        this.diasParaConsumo = diasParaConsumo;
    }

    @Override
    public String toString() {
        return "ProductoNoFresco{" +
                "diasParaConsumo=" + diasParaConsumo +
                '}';
    }
}
