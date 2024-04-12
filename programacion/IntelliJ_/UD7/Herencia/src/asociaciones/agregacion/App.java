package asociaciones.agregacion;

public class App {
    public static void main(String[]args){
        Producto p1=new Producto("Bolígrafo",1.25);
        Producto p2=new Producto("Libreta",3.35);

        Carrito c=new Carrito();
        c.addProducto(p1);
        c.addProducto(p2);

        System.out.println("Productos en mi carro: ");
        for (Producto p: c.getProductos())
            System.out.printf("%s %.2f %n",p.getNombre(),p.getPrecio());


    }
}
