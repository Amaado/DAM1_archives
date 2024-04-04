package ejercicio7;

public class Manager extends Employee{
    public Manager(String nombre, String direccion, double salario, String cargo, int subordinados) {
        super(nombre, direccion, salario, cargo);
        this.subordinados = subordinados;
    }

    private int subordinados;

    public int getSubordinados() {
        return subordinados;
    }

    @Override
    public double calcularBonus() {
        return getSalario()*0.15;
    }

    @Override
    public String generarInformesRendimiento() {
        return "El informe de rendimiento para Manager "+getNombre()+": Good";
    }

    public void managerProyecto(){
        System.out.println("Manager "+getNombre()+" está tranbajando en el proyecto");
    }
}
