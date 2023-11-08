class VehiculoDemo {
    public static void main(String[] args) {
// Creamos dos nuevas instancias de la clase Vehiculo
        Vehiculo miCoche = new Vehiculo();
        Vehiculo furgoPepe = new Vehiculo();

        final int DIST_SCQ_MAD=600;
// asignamos valores a los atributos de miCoche
        miCoche.numPasajeros = 5;
        miCoche.capDeposito = 45;
        miCoche.consumo100KM = 6.8;
// asignamos valores a los atributos de furgoPepe
        furgoPepe.numPasajeros = 7;
        furgoPepe.capDeposito = 85;
        furgoPepe.consumo100KM = 7.25;

        System.out.print("miCoche puede llevar " + miCoche.numPasajeros + " per. ");
        miCoche.autonomia();    
        System.out.print("furgoPepe puede llevar " + furgoPepe.numPasajeros + " per. ");
        miCoche.autonomia();
    }
}
