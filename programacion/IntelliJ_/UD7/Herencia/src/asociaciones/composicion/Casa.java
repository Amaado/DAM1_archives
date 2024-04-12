package asociaciones.composicion;

public class Casa {
    private Habitacion[] habitaciones;
    private int cantidadHabitaciones;

    public Casa(){
        habitaciones=new Habitacion[6];
        cantidadHabitaciones=0;
    }

    public Casa(int numeroHabitacione){
        habitaciones=new Habitacion[numeroHabitacione];
        cantidadHabitaciones=0;
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void addHabitacion(Habitacion h){
        habitaciones[cantidadHabitaciones++]=h;
    }
}
