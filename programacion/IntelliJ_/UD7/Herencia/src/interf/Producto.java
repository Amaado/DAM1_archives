package interf;

public interface Producto {

    //Variables deben ser public, final y static --> constantes
    double IVA_G=0.21;
    double IVA_R=0.10;
    double IVA_SR= 0.04;

    //métodos que deben ser sobrescritos por las clases hijas
    double getPrecio();
    String getNombre();

    //método estático que se invocará directamente desde la interfaz
    public static double getTotal(Producto[] lista){
        double sum=0.0;
        for (Producto p:lista)
            sum+=p.getPrecio();
        return sum;
    }
}
