package Tarea1;

public class Electrodomestico {
    private String tipo;
    private String marca;
    private double potencia;

    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }


    @Override
    public String toString() {
        return "Electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }

    public double getConsumo(int horasFuncionamiento){
        double consumo=0;
        consumo = potencia*horasFuncionamiento;
        return consumo;
    }

    public double getCosteConsumo(int horasFuncionamiento, float costeHora){
        double costeConsumo=0;
        costeConsumo = costeHora*getConsumo(horasFuncionamiento);
        return costeConsumo;
    }
}
