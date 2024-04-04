package ejercicio6;

public class App {
    public static void main(String[]args){

        Coche coche=new Coche("Renault","Laguna",2005,"Gasolina",6.77, 5);
        Camion camion=new Camion("Mercedes","T4",2012,"Gasoil",4.5, 5.7);
        Moto moto=new Moto("Yamaha","X2 Neo", 2019,"Diesel",2.1,250);

        System.out.println("  -- COCHE --\n");
        System.out.println("Marca: "+coche.getMarca());
        System.out.println("Modelo: "+coche.getModelo());
        System.out.println("Año: "+coche.getAnho());
        System.out.println("Tipo de combustible: "+coche.getTipoCombustible());
        System.out.println("Eficiencia del combustible: "+coche.getEficienciaCombustible()+" km/litro");
        System.out.println("Numero de asientos: "+coche.getNumAsientos());
        System.out.println("Cálculo de eficiencia de combustible: "+coche.calculaEficienciaCombustible());
        System.out.println("Distancia recorrida: "+coche.calculaDistanciaRecorrida());
        System.out.println("Velocidad máxima: "+coche.velocidadMax()+" km/h");

        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------\n");


        System.out.println("  -- CAMIÓN --\n");
        System.out.println("Marca: "+camion.getMarca());
        System.out.println("Modelo: "+camion.getModelo());
        System.out.println("Año: "+camion.getAnho());
        System.out.println("Tipo de combustible: "+camion.getTipoCombustible());
        System.out.println("Eficiencia del combustible: "+camion.getEficienciaCombustible()+" km/litro");
        System.out.println("Capacidad de carga: "+camion.getCapacidadCarga());
        System.out.println("Cálculo de eficiencia de combustible: "+camion.calculaEficienciaCombustible());
        System.out.println("Distancia recorrida: "+camion.calculaDistanciaRecorrida());
        System.out.println("Velocidad máxima: "+camion.velocidadMax()+" km/h");

        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------\n");

        System.out.println("  -- MOTO --\n");
        System.out.println("Marca: "+moto.getMarca());
        System.out.println("Modelo: "+moto.getModelo());
        System.out.println("Año: "+moto.getAnho());
        System.out.println("Tipo de combustible: "+moto.getTipoCombustible());
        System.out.println("Eficiencia del combustible: "+moto.getEficienciaCombustible()+" km/litro");
        System.out.println("Cilindrada: "+moto.getCilindrada());
        System.out.println("Cálculo de eficiencia de combustible: "+moto.calculaEficienciaCombustible());
        System.out.println("Distancia recorrida: "+moto.calculaDistanciaRecorrida());
        System.out.println("Velocidad máxima: "+moto.velocidadMax()+" km/h");

    }
}
