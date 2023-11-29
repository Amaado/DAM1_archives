public class PRG02_T03_Ejerc1 {
    public static void main(String[] args){
        final short valormax=5000;
        boolean carne=true;
        Byte mes=1;
        String mescadena="Enero";
        String nombre="Andrés";
        String apellido1="Amado";
        String apellido2="Cibreiro";
        char sexo='M';
        long milisegs=System.currentTimeMillis();
        short saldo=17;
        long distancia=590000000l;

        System.out.print("El valor máximo es "+valormax+"\n");
        System.out.print("Tiene carné "+carne+"\n");
        System.out.print("El més del año es el "+mes+"\n");
        System.out.print("El més del año es "+mescadena+"\n");
        System.out.print("El nombre es "+nombre+" "+apellido1+" "+apellido2+"\n");
        System.out.print("Su sexo es "+sexo+"\n");
        System.out.print("Los milisegundos transcurridos desde el 01/01/1970 hasta hoy son "+sexo+"\n");
        System.out.print("Su saldo es "+saldo+"€\n");
        System.out.print("La distancia de la Tierra a Júpiter son "+distancia+"km\n");
    }
}
