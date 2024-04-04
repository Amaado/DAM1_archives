package ejercicio7;

public class Developer extends Employee{
    private String LenguajeProgramacion;

    public Developer(String nombre, String direccion, double salario, String cargo, String lenguajeProgramacion) {
        super(nombre, direccion, salario, cargo);
        LenguajeProgramacion = lenguajeProgramacion;
    }

    public String getLenguajeProgramacion() {
        return LenguajeProgramacion;
    }

    @Override
    public double calcularBonus() {
        return getSalario()*0.20;
    }

    @Override
    public String generarInformesRendimiento() {
        return "Informe de rendimiento para Desarroyador "+getNombre()+": Excelente";
    }
    public void escribirCodigo(){
        System.out.println("Desarroyador "+getNombre()+" está escribiendo código en "+LenguajeProgramacion);
    }
}
