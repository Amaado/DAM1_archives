package ejercicio3;

public class GerenteRRHH extends  Empleado{
    public GerenteRRHH(int salario){
        super(salario);
    }

    @Override
    public void trabajar() {
        System.out.println("Contratar gente y tratar muy bien a todos");
    }

    public void addEmpleado(){
        System.out.println("Contratando...");
    }
}
