package Tarea1;

public class App {
    public static void main(String[]args){
        Electrodomestico electrodomestico = new Electrodomestico("Microondas","Vitro",1.2);
        System.out.println(electrodomestico.getTipo()+" "+electrodomestico.getMarca()+" "+electrodomestico.getPotencia()+" kW");

        electrodomestico.setTipo("Horno");
        electrodomestico.setMarca("Volkswagen");
        electrodomestico.setPotencia(1.5);

        int horasFuncionamiento = 2;
        System.out.println("Consumo: "+electrodomestico.getConsumo(horasFuncionamiento)+" kW");
        System.out.println("Coste a pagar por "+horasFuncionamiento+"h: "+electrodomestico.getCosteConsumo(horasFuncionamiento,1.25f)+" €\n");

        Lavadora lavadora = new Lavadora("Bosch", 1.5);
        System.out.println(lavadora.getTipo()+" "+lavadora.getMarca()+" "+lavadora.getPotencia()+" kW");

        System.out.println("Agua fría:");
        System.out.println("Consumo: "+lavadora.getConsumo(10)+" kW");
        System.out.println("Coste a pagar por 10h: "+lavadora.getCosteConsumo(10,2.3f)+" €\n");

        lavadora.setAguaCaliente(true);
        System.out.println("Agua caliente:");
        System.out.println("Consumo: "+lavadora.getConsumo(10)+" kW");
        System.out.println("Coste a pagar por 10h: "+lavadora.getCosteConsumo(10,2.3f)+" €\n");
    }
}
