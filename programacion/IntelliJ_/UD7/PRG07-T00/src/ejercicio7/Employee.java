package ejercicio7;

public class Employee {
        private String nombre;
        private String direccion;
        private double salario;
        private String cargo;

    public Employee(String nombre, String direccion, double salario, String cargo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public double calcularBonus(){
        return 0.0;
    }

    public String generarInformesRendimiento(){
        return "Ningun informe de rendimiento disponible";
    }
}
