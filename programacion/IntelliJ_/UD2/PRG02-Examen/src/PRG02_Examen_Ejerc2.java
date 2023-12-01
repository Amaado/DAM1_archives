public class PRG02_Examen_Ejerc2 {
    public enum meses {Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre};
    public static void main(String[] args) {

        meses m = meses.Marzo;
        System.out.println(m);

        m= meses.valueOf("MARZO");
        //Da un error ya que le estamos asignando un valor que no está en la lista enum ("MARZO"!="Marzo"). Si ponemos cualquiera cadena de tecto como "CADENA RANDOM" va a dar el mismo error
    }
}
