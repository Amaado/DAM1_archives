package ejercicio7;

public class App {
    public static void main(String[]args){
        Manager manager= new Manager("Anuel Brrr","Puerto Rico",10000,"Maleante",420);
        Developer developer=new Developer("Jhay Cortez", "Colombia", 8000, "Me sigue no me sigue LA PRESION", "Java");
        Programmer programmer=new Programmer("Zatu Rey", "Sevilla", 100000, "El encargado del encargo","Java");

        System.out.println("Bonus del manager: $"+manager.calcularBonus());
        System.out.println("Bonus del manager: $"+developer.calcularBonus());
        System.out.println("Bonus del manager: $"+programmer.calcularBonus());

        System.out.println(manager.generarInformesRendimiento());
        System.out.println(developer.generarInformesRendimiento());
        System.out.println(programmer.generarInformesRendimiento());


        manager.managerProyecto();
        developer.escribirCodigo();
        programmer.debugCodigo();

    }
}
