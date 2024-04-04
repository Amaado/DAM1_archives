package ejercicio3;

public class Empleado {
    private  int salario;
    public  Empleado(int salario){
        this.salario=salario;
    }

    public void trabajar(){
        System.out.println("Trabajando como empleado");
    }

    public int getSalario() {
        return salario;
    }
}
