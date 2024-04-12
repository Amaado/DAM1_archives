package asociaciones.composicion;

public class App {
    public static void main(String[]args){
        Casa miCasa=new Casa();
        miCasa.addHabitacion(new Habitacion(1,"Dormitorio"));
        miCasa.addHabitacion(new Habitacion(2,"Baño"));
        miCasa.addHabitacion(new Habitacion(3,"Salón"));
        miCasa.addHabitacion(new Habitacion(4,"Cocina"));
        miCasa.addHabitacion(new Habitacion(5,"Salita"));
        miCasa.addHabitacion(new Habitacion(6,"Ático"));

        System.out.println("Mi casa tiene las siguientes habitaciones:");
        for (Habitacion h: miCasa.getHabitaciones())
            System.out.printf("%s %n",h.getTipo());
    }
}
