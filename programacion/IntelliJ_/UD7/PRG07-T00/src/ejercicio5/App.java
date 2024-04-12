package ejercicio5;

public class App {
    public static void main(String[]args){
        Persona persona=new Persona("Paquita","Salas");
        System.out.println(persona.getFirstname()+" "+persona.getLastname());

        Empleado empleado1=new Empleado("Eddie", "Vedder", 1234,"Jefe administrativo del Área 51");
        System.out.println(empleado1.getFirstname()+" "+empleado1.getLastname()+" ("+empleado1.getEmpleadoId()+")");

        Empleado empleado2=new Empleado("Francisco", "Francotirador", 4321,"Caudillo de Spaa Ñah");
        System.out.println(empleado2.getFirstname()+" "+empleado2.getLastname()+" ("+empleado2.getEmpleadoId()+")");
    }
}
