package ejercicio7;

public class Programmer extends Developer{
    public Programmer(String nombre, String direccion, double salario, String cargo, String lenguajeProgramacion) {
        super(nombre, direccion, salario, cargo, lenguajeProgramacion);
    }

    @Override
    public double calcularBonus() {
        return getSalario()*0.25;
    }

    @Override
    public String generarInformesRendimiento() {
        return "Informe de rendimiento para Programador "+getNombre()+": Muy bien";
    }
    public void debugCodigo(){
        System.out.println("Programador "+getNombre()+" está debugeando código en "+getLenguajeProgramacion());
    }
}
