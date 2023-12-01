public class DemoNum {
    public static void main(String[] args) {
        // Crear objetos Complexo y probar métodos
        Complexo num1 = new Complexo();
        Complexo num2 = new Complexo(3, 4);

        System.out.println("Número 1: " + num1.toString());
        System.out.println("Número 2: " + num2.toString());

        // Modificar partes real e imaginaria del número 1
        num1.setCambiaReal(5);
        num1.setCambiaImax(2);

        System.out.println("Número 1 modificado: " + num1.toString());

        // Sumar dos números complejos
        num1.sumar(num2);

        System.out.println("Suma de Número 1 y Número 2: " + num1.toString());
    }
}