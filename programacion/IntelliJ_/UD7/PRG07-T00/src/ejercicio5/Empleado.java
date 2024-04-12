package ejercicio5;

public class Empleado extends Persona{
    private int empleadoId;
    private String puesto;

    public Empleado(String firstname, String lastname, int empleadoId, String puesto) {
        super(firstname, lastname);
        this.empleadoId = empleadoId;
        this.puesto = puesto;
    }
    public int getEmpleadoId() {
        return empleadoId;
    }

    @Override
    public String getLastname() {
        return super.getLastname()+", "+puesto;
    }
}
