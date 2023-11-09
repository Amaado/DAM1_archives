public class Vehiculo {

    int numPasajeros;
    int capDeposito;
    double consumo100KM;

    Vehiculo (int numP, int capD ,double cons){
        numPasajeros=numP;
        capDeposito=capD;
        consumo100KM=cons;
    }
    double autonomia() {
        return capDeposito * 100.0 / consumo100KM;
    }
}