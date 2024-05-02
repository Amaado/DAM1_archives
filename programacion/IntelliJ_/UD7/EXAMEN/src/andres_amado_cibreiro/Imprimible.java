package andres_amado_cibreiro;

public interface Imprimible {

    public static String obtenerInfo(){
        return "Producto{" +
                "nombre='" + Producto.getNombre() + '\'' +
                ", codigo='" + Producto.getCodigo() + '\'' +
                ", cantidadDisponible=" + Producto.getCantidadDisponible() +
                ", precioUnitario=" + Producto.getPrecioUnitario() +
                '}';
    }

}
