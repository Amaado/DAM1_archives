package Tarea2;

public class App {
    public static void main(String[]args){

        Superheroe superheroe = new Superheroe("Doctor Strange");
        superheroe.setNombre("Doctor Estraño");
        superheroe.setDescripcion("El Doctor Strange en reparto desde Latinoamérica");
        superheroe.setCapa(true);

        Superheroe superheroe2 = new Superheroe("Batman");
        superheroe2.setNombre("El señor de la noche");
        superheroe2.setDescripcion("El rey del bailoteo y de la nocturnidad");
        superheroe2.setCapa(false);

        System.out.println(superheroe2);

        Dimension dimension = new Dimension(20, 5,3);
        Figura figura1 = new Figura("001", 34.0,dimension,superheroe);
        System.out.println(figura1);
        figura1.subirPrecio(7);

        Coleccion coleccion = new Coleccion("Coleccion1");
        //coleccion.addF
        //coleccion.toString();

    }
}
