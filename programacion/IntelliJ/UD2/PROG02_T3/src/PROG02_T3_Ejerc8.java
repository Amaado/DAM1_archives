import javax.swing.*;

public class PROGT3_Ejerc8 {
    public static void main(String[] args){
        int Programacion=119;
        int Entornos=40;
        int BaseDatos=75;
        int AlumnosTotales;
        double porcProgramacion;
        double porcEntornos;
        double porcBaseDatos;

        AlumnosTotales=Programacion+Entornos+BaseDatos;

        porcProgramacion=(Programacion*100)/AlumnosTotales;
        porcEntornos=(Entornos*100)/AlumnosTotales;
        porcBaseDatos=(BaseDatos*100)/AlumnosTotales;

        JOptionPane.showMessageDialog(null, porcProgramacion+"% --> Alumnos matriculados en Programación.\n"+porcEntornos+"% --> Alumnos matriculados en Entornos.\n"+porcBaseDatos+"% --> Alumnos matriculados en Bases de Datos.\n");
    }
}
