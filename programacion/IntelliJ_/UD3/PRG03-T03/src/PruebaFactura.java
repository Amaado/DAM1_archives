public class PruebaFactura {
    public static void main(String[] args) {
        // Crear instancias de Factura
        Factura factura1 = new Factura("M00143", "Tornillo M3x10mm", 50, 0.05);
        Factura factura2 = new Factura("M00242", "Arandela M3 inox", 100, 0.02);
        Factura factura3 = new Factura("M00235", "Tuerca M3", 100, 0.04);

        // Imprimir encabezado
        System.out.println("        I M P O R T E S");
        System.out.println("        ---------------");

        // Imprimir detalles de la factura
        System.out.println("REF    DESCRIPCION               UNIDADES     PRECIO    IMPORTE");
        System.out.println(factura1.getNumeroRef() + " " + factura1.getDescripcion() + "            " + factura1.getCantidad() + "          " + factura1.getPrecio() + "€       " + factura1.obtenerMontoFactura() + "€");
        System.out.println(factura2.getNumeroRef() + " " + factura2.getDescripcion() + "         " + factura2.getCantidad() + "          " + factura2.getPrecio() + "€       " + factura2.obtenerMontoFactura() + "€");
        System.out.println(factura3.getNumeroRef() + " " + factura3.getDescripcion() + "                " + factura3.getCantidad() + "          " + factura3.getPrecio() + "€       " + factura3.obtenerMontoFactura() + "€");
    }
}