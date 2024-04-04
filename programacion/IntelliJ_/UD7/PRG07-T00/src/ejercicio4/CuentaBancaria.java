package ejercicio4;

public class CuentaBancaria {

    private String numCuenta;
    private double saldo;

    public CuentaBancaria(String numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public void depositar (double ingreso){
        saldo += ingreso;
    }

    public void retirar (double retiro){
        if (saldo<=retiro){
            saldo -= retiro;
        }else {
            System.out.println("No puedes retirar! Aquí no hay deudas moroso.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
