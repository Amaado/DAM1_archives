package ejercicio3;

public class App {
    public static void main(String[]args){

        Empleado emp=new Empleado(50000);
        GerenteRRHH ger=new GerenteRRHH(80000);

        emp.trabajar();
        System.out.println("Salario de empleado: "+emp.getSalario());

        ger.trabajar();
        System.out.println("Salario de gerente de RRHH: "+ger.getSalario());
        ger.addEmpleado();
    }
}
