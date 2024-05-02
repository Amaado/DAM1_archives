package andres_amado_cibreiro;

public class Producto implements Imprimible {

    private static String nombre;
    private static String codigo;
    private static int cantidadDisponible;
    private static double precioUnitario;

    public Producto(String nombre, String codigo, int cantidadDisponible, double precioUnitario) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadDisponible = cantidadDisponible;
        this.precioUnitario = precioUnitario;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public static int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public static double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public String obtenerInfo(){
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", cantidadDisponible=" + cantidadDisponible +
                ", precioUnitario=" + precioUnitario +
                '}';
    }



}
