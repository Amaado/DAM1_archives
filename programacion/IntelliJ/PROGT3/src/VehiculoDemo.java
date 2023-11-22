class VehiculoDemo {
    public static void main(String[] args) {
// Creamos dos nuevas instancias de la clase Vehiculo
        Vehiculo miCoche = new Vehiculo();
        Vehiculo furgoPepe = new Vehiculo();
// asignamos valores a los atributos de miCoche
        miCoche.numPasajeros = 5;
        miCoche.capDeposito = 45;
        miCoche.consumo100KM = 6.8;
// asignamos valores a los atributos de furgoPepe
        furgoPepe.numPasajeros = 7;
        furgoPepe.capDeposito = 85;
        furgoPepe.consumo100KM = 7.25;
// calculamos la distancia máxima que puede recorrer
        double dist1 = miCoche.capDeposito * 100.0 / miCoche.consumo100KM;
        double dist2 = furgoPepe.capDeposito * 100.0 / furgoPepe.consumo100KM;
        System.out.printf("miCoche puede llevar %d ", miCoche.numPasajeros);
        System.out.printf("personas hasta %.2f kms%n", dist1);
        System.out.printf("furgoPepe puede llevar %d ", furgoPepe.numPasajeros);
        System.out.printf("personas hasta %.2f kms%n", dist2);
    }
}