package interf;

public class Pelicula implements Producto{

    private  double precio;
    private String titulo;
    private final int duracion;

    public Pelicula(double precio, String titulo, int duracion) {
        this.precio = precio;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getNombre() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }
}
