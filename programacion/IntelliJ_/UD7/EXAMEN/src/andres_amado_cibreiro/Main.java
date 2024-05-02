package andres_amado_cibreiro;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);


        System.out.println("1. Agregar un nuevo producto al inventario.");
        System.out.println("2. Ver un listado de todos los productos (código de producto, nombre y cantidad disponible).");
        System.out.println("3. Obtener los detalles de un producto específico.");
        System.out.println("4. Incrementar la cantidad disponible de un producto.");
        System.out.println("5. Decrementar la cantidad disponible de un producto.");
        System.out.println("6. Consultar la cantidad disponible de un producto.");
        System.out.println("7. Salir de la aplicación.");
        int opcion = entrada.nextInt();

        while (true){
            switch (opcion){
                case(1):
                    System.out.println("agregarProductos");
                    //agregarProductos();
                case(2):
                    System.out.println("mostrarProductos");
                    //mostrarProductos();
                case(3):
                    System.out.println("obtenerDetallesProducto");
                    //obtenerDetallesProducto();
                case(4):
                    System.out.println("incrementarCantidadProducto");
                    //incrementarCantidadProducto();
                case(5):
                    System.out.println("decrementarCantidadProducto");
                    //decrementarCantidadProducto();
                case(6):
                    System.out.println("consultarCantidadProducto");
                    //consultarCantidadProducto();
                case(7):
                break;
            }
            break;
        }
        System.out.println("Adios!");


    }
}
