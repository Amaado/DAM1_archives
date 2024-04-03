package ej1;

public class App {
    public static void main(String[] args) {

         Alumno a1 = new Alumno();
         a1.setNombre("María");
         a1.setApellidos("Fernandez Suárez");
         a1.setEdad(14);
         a1.setEmail("maria@gmail.com");

        System.out.println(a1);

        Alumno a2=new Alumno("María","García Pérez",17);
        a2.setEmail("mariagarcia@gmail.com");
        a2.setTelefono("666777888");

        System.out.println(a2);

        System.out.printf("La alumna %s %s %s es mayor de edad",a2.getNombre(),a2.getApellidos(),a2.mayorEdad() ? "si":"no");

        if (a1.equals(a2)){
            System.out.print("\n"+a1.getNombre() + " y " + a2.getNombre());
            System.out.print(" son el mismo objeto.");
        }else {
            System.out.print("\n"+a1.getNombre() + " y " + a2.getNombre());
            System.out.print(" no son el mismo objeto.");
        }

    }
}
