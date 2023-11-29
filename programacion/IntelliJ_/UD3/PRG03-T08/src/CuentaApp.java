public class CuentaApp {
    public static void main(String[] args) {
        // Crear dos objetos de la clase Cuenta
        Cuenta cuenta1 = new Cuenta("PJ Harvey");
        Cuenta cuenta2 = new Cuenta("Janis Joplin", 300.0);

        // Mostrar estado inicial de las cuentas
        System.out.println("****ESTADO INICIAL DE LAS CUENTAS****");
        System.out.println(cuenta1);
        System.out.println(cuenta2);

        // Realizar operaciones de ingreso y retirada
        cuenta1.retirar(200.0);
        cuenta2.ingresar(300.0);

        // Mostrar estado de las cuentas tras las operaciones
        System.out.println("\n****ESTADO DE LAS CUENTAS TRAS LAS OPERACIONES DE INGRESO Y RETIRADA****");
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}