package andres_amado_cibreiro;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> listaProductos;
    private int contadorProductos;
    public void agregarProductos(){
        listaProductos = new ArrayList<>();
    }

    public void mostrarProductos(){
        Imprimible.obtenerInfo();
    }

    public void obtenerDetallesProducto(){
        Producto.getNombre();
        Producto.getCodigo();
        Producto.getCantidadDisponible();
        Producto.getPrecioUnitario();
    }

    public void incrementarCantidadProducto(){

    }

    public void decrementarCantidadProducto(){

    }

    public void consultarCantidadProducto(){

    }
}
