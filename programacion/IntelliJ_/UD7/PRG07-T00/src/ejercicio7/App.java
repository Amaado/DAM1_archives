package ejercicio7;

public class App {
    public static void main(String[]args){
        Manager manager= new Manager("Anuel Brrr","Puerto Rico",10000,"Maleante",420);
        System.out.println(manager.generarInformesRendimiento());
        System.out.println("Bonus del manager: $"+manager.calcularBonus());
        manager.managerProyecto();
        System.out.println("\n\n");

        Developer developer=new Developer("Jhay Cortez", "Colombia", 8000, "Me sigue no me sigue LA PRESION", "Java");
        System.out.println(developer.generarInformesRendimiento());
        System.out.println("Bonus del manager: $"+developer.calcularBonus());
        developer.escribirCodigo();
        System.out.println("\n\n");

        Programmer programmer=new Programmer("Zatu Rey", "Sevilla", 100000, "El encargado del encargo","Java");
        System.out.println(programmer.generarInformesRendimiento());
        System.out.println("Bonus del manager: $"+programmer.calcularBonus());
        programmer.debugCodigo();
        System.out.println("\n\n");



    }
}
