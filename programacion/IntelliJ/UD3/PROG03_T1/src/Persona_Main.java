

public class Persona_Main {
    public static void main(String[] args) {
        Persona steven = new Persona();
        System.out.println("STEVEN:");
        System.out.println("Nombre: " + steven.getNombre());
        System.out.println("Edad: " + steven.getEdad());
        System.out.println("Altura: " + steven.getAltura());

        System.out.println("--------------");

        Persona mike = new Persona("Mike", 10, 1.5f);
        System.out.println("MIKE:");
        System.out.println("Nombre: " + mike.getNombre());
        System.out.println("Edad: " + mike.getEdad());
        System.out.println("Altura: " + mike.getAltura());
    }
}