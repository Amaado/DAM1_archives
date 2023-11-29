class Cuenta {
    private String titular;
    private double cantidad;

    // Constructor con cantidad opcional
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Constructor sin cantidad (inicializada por defecto a 0)
    public Cuenta(String titular) {
        this(titular, 0.0);
    }

    // Métodos get y set
    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Método toString
    @Override
    public String toString() {
        return "El titular " + titular + " tiene " + cantidad + " euros en la cuenta";
    }

    // Métodos especiales
    public void ingresar(double cantidad) {
        this.cantidad += cantidad;
    }

    public void retirar(double cantidad) {
        this.cantidad -= cantidad;
    }
}