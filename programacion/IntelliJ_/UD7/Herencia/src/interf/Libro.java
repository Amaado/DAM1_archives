package interf;

public class Libro implements Producto{
    private final double precio;
    private final String titulo;
    private final int paginas;

    public Libro(double precio, String titulo, int paginas) {
        this.precio = precio;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getNombre() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }
}
