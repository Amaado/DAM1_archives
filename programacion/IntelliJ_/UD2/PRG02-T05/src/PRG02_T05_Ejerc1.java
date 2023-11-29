public class PRG02_T05_Ejerc1 {
    public enum dias{Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo}
    public static void main(String[] args) {
        dias diaactual=dias.Martes;
        dias diasiguiente=dias.Miercoles;

        System.out.println("Hoy es: "+diaactual);
        System.out.println("Mañana\nes\n"+diasiguiente);
    }
}
