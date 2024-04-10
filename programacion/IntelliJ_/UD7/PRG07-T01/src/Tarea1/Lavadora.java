package Tarea1;

public class Lavadora extends Electrodomestico{
    private double precio;
    private boolean aguaCaliente;

    public Lavadora(String marca, double potencia) {
        super("Lavadora", marca, potencia);
        aguaCaliente=false;
    }

    public Lavadora(String marca, double potencia, double precio, boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }

    @Override
    public double getConsumo(int horasFuncionamiento) {
        double consumo=0;

        if (aguaCaliente){
            consumo = horasFuncionamiento*(getPotencia()+getPotencia()*0.20);
        }else {
            consumo = horasFuncionamiento*getPotencia();
        }

        return consumo;
    }
}
