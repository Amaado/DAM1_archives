package ejercicio4;

public class CuentaBancariaAhorro extends CuentaBancaria{

    public CuentaBancariaAhorro(String numCuenta, double saldo) {
        super(numCuenta, saldo);
    }

    @Override
    public void retirar(double retiro) {
        if (getSaldo()-retiro>=100){
            super.retirar(retiro);
        }else {
            System.out.println("No puedes retirar! Si gastas tus últimos 100€ que mierda de cuenta ahorro.");
        }
    }
}
