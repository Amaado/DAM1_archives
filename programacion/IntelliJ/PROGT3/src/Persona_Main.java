package src;

public class Persona_Main {
    public static void main(String[] args) {
        Persona steven = new Persona();
        System.out.println("Nombre: " + steven.getNombre());
        System.out.println("Edad: " + steven.getEdad());
        System.out.println("Altura: " + steven.getAltura());
    }
}