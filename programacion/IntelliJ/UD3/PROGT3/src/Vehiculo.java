public class Vehiculo {

    int numPasajeros;
    int capDeposito;
    double consumo100KM;

    double autonomia() {
        return capDeposito * 100.0 / consumo100KM;
    }

}