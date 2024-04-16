package Inmobiliaria;


public abstract non-sealed class InmuebleVivienda extends Inmueble{
    private final int minHabitaciones = 3;
    private int numBanhos;
    private int numHabitaciones;
    private Habitacion[] habitaciones;

    public InmuebleVivienda() {
        super();
        habitaciones = new Habitacion[minHabitaciones];
        //numHabitaciones = minHabitaciones;
    }


}
