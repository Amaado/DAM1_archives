import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PRG07_T06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("  ╔════════════════════════════════════════════════════════════════════════════════════════╗     \n" +
                            "  ‖                                                                                        ‖     \n"+
                            "  ‖      $$$$$$$\\  $$$$$$$$\\  $$$$$$\\  $$$$$$\\  $$$$$$\\ $$$$$$$$\\ $$$$$$$\\   $$$$$$\\       ‖ \n" +
                            "  ‖      $$  __$$\\ $$  _____|$$  __$$\\ \\_$$  _|$$  __$$\\\\__$$  __|$$  __$$\\ $$  __$$\\      ‖\n" +
                            "  ‖      $$ |  $$ |$$ |      $$ /  \\__|  $$ |  $$ /  \\__|  $$ |   $$ |  $$ |$$ /  $$ |     ‖\n" +
                            "  ‖      $$$$$$$  |$$$$$\\    $$ |$$$$\\   $$ |  \\$$$$$$\\    $$ |   $$$$$$$  |$$ |  $$ |     ‖\n" +
                            "  ‖      $$  __$$< $$  __|   $$ |\\_$$ |  $$ |   \\____$$\\   $$ |   $$  __$$< $$ |  $$ |     ‖\n" +
                            "  ‖      $$ |  $$ |$$ |      $$ |  $$ |  $$ |  $$\\   $$ |  $$ |   $$ |  $$ |$$ |  $$ |     ‖\n" +
                            "  ‖      $$ |  $$ |$$$$$$$$\\ \\$$$$$$  |$$$$$$\\ \\$$$$$$  |  $$ |   $$ |  $$ | $$$$$$  |     ‖\n" +
                            "  ‖      \\__|  \\__|\\________| \\______/ \\______| \\______/   \\__|   \\__|  \\__| \\______/      ‖\n"+
                            "  ‖                                                                                        ‖\n"+
                            "  ‖                                                                                        ‖");
        System.out.print("  ‖       Cuantos productos quieres añadir? ");
        int numProductos = entrada.nextInt();
        System.out.print("  ‖                                                                                        ‖\n");
        System.out.print("  ‖       ⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻        ‖\n");
        System.out.print("  ‖        ⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻         ‖\n");
        System.out.print("  ‖                                                                                        ‖\n");

        String nombres[] = new String[numProductos];
        int cantidades[] = new int[numProductos];
        float precios[] = new float[numProductos];
        float ventasTotales[] = new float[numProductos];

        for (int i=0;i<numProductos;i++){

            if (i<=9){
                switch (i) {
                    case 0:
                        System.out.println("  ‖                          _                                                             ‖\n" +
                                            "  ‖                         |_) ._ _   _|      _ _|_  _     /|                             ‖\n" +
                                            "  ‖                         |   | (_) (_| |_| (_  |_ (_)     |                             ‖");
                        break;
                    case 1:
                        System.out.println("  ‖                          _                              _                              ‖\n" +
                                            "  ‖                         |_) ._ _   _|      _ _|_  _      )                             ‖\n" +
                                            "  ‖                         |   | (_) (_| |_| (_  |_ (_)    /_                             ‖");
                        break;
                    case 2:
                        System.out.println("  ‖                          _                              _                              ‖\n" +
                                            "  ‖                         |_) ._ _   _|      _ _|_  _     _)                             ‖\n" +
                                            "  ‖                         |   | (_) (_| |_| (_  |_ (_)    _)                             ‖");
                        break;
                    case 3:
                        System.out.println("  ‖                          _                                                              ‖\n" +
                                            "  ‖                         |_) ._ _   _|      _ _|_  _     |_|_                            ‖\n" +
                                            "  ‖                         |   | (_) (_| |_| (_  |_ (_)      |                             ‖");
                        break;
                    case 4:
                        System.out.println("  ‖                          _                               _                              ‖\n" +
                                            "  ‖                         |_) ._ _   _|      _ _|_  _     |_                              ‖\n" +
                                            "  ‖                         |   | (_) (_| |_| (_  |_ (_)     _)                             ‖");
                        break;
                    case 5:
                        System.out.println("  ‖                          _                               _                              ‖\n" +
                                            "  ‖                         |_) ._ _   _|      _ _|_  _     |_                              ‖\n" +
                                            "  ‖                         |   | (_) (_| |_| (_  |_ (_)    |_)                             ‖");
                        break;
                    case 6:
                        System.out.println("  ‖                          _                              __                             ‖\n" +
                                            "  ‖                         |_) ._ _   _|      _ _|_  _      /                             ‖\n" +
                                            "  ‖                         |   | (_) (_| |_| (_  |_ (_)    /                              ‖");
                        break;
                    case 7:
                        System.out.println("  ‖                          _                               _                              ‖\n" +
                                            "  ‖                         |_) ._ _   _|      _ _|_  _     (_)                             ‖\n" +
                                            "  ‖                         |   | (_) (_| |_| (_  |_ (_)    (_)                             ‖");
                        break;
                    case 8:
                        System.out.println("  ‖                          _                               _                              ‖\n" +
                                            "  ‖                         |_) ._ _   _|      _ _|_  _     (_|                             ‖\n" +
                                            "  ‖                         |   | (_) (_| |_| (_  |_ (_)      |                             ‖");
                        break;
                    case 9:
                        System.out.println("  ‖                          _                                  _                              ‖\n" +
                                            "  ‖                         |_) ._ _   _|      _ _|_  _     /| / \\                             ‖\n" +
                                            "  ‖                         |   | (_) (_| |_| (_  |_ (_)     | \\_/                             ‖");
                        break;
                }
            }else {
                System.out.println("\nPRODUCTO "+(i+1));
            }

            entrada.nextLine();

            System.out.println("  ‖                                                                                        ‖");
            System.out.println("  ‖                                                                                        ‖");
            System.out.print("  ‖         • Nombre del producto: ");
            String nombre = entrada.nextLine();
            nombres[i]= nombre;

            System.out.println("  ‖                                                                                        ‖");
            System.out.print("  ‖         • Cantidad de unidades vendidas: ");
            int cantidad = entrada.nextInt();
            cantidades[i]= cantidad;

            System.out.println("  ‖                                                                                        ‖");
            System.out.print("  ‖         • Precio por unidad: ");
            float precio = entrada.nextFloat();
            precios[i]= precio;

        }

        for (int i=0;i<6;i++){
            System.out.println("  ‖                                                                                        ‖");
        }

        System.out.println("  ‖                                                                  █ ▋▋▋█ █ ▋▋█▋▋▋       ‖");
        System.out.println("  ‖                                                                  █ ▋▋▋█ █ ▋▋█▋▋▋       ‖");
        System.out.println("  ‖                                                                                        ‖");
        System.out.println("  ╚════════════════════════════════════════════════════════════════════════════════════════╝     \n\n");



        System.out.println("  ╔════════════════════════════════════════════════════════════════════════════════════════╗\n" +
                            "  ‖                                                                                  ||      @@@@@@@@      |      ‖\n"+
                            "  ‖                                                                                  ||    @          @    |      ‖\n"+
                            "  ‖              $$\\    $$\\ $$$$$$$$\\ $$\\   $$\\ $$$$$$$$\\  $$$$$$\\   $$$$$$\\         ||  @@     @@     @@  |      ‖\n" +
                            "  ‖              $$ |   $$ |$$  _____|$$$\\  $$ |\\__$$  __|$$  __$$\\ $$  __$$\\        ||@@     @@@@@@     @@|      ‖\n" +
                            "  ‖              $$ |   $$ |$$ |      $$$$\\ $$ |   $$ |   $$ /  $$ |$$ /  \\__|       ||@@     @@         @@|      ‖\n" +
                            "  ‖              \\$$\\  $$  |$$$$$\\    $$ $$\\$$ |   $$ |   $$$$$$$$ |\\$$$$$$\\         ||@@       @@       @@|      ‖\n" +
                            "  ‖               \\$$\\$$  / $$  __|   $$ \\$$$$ |   $$ |   $$  __$$ | \\____$$\\        ||@@         @@     @@|      ‖\n" +
                            "  ‖                \\$$$  /  $$ |      $$ |\\$$$ |   $$ |   $$ |  $$ |$$\\   $$ |       ||@@     @@@@@@     @@|      ‖\n" +
                            "  ‖                 \\$  /   $$$$$$$$\\ $$ | \\$$ |   $$ |   $$ |  $$ |\\$$$$$$  |       ||  @@     @@     @@  |      ‖\n" +
                            "  ‖                  \\_/    \\________|\\__|  \\__|   \\__|   \\__|  \\__| \\______/        ||    @@         @    |      ‖\n"+
                            "  ‖                                                                                  ||      @@@@@@@@      |      ‖\n"+
                            "  ‖                                                                                        ‖");

        for (int i=0;i<numProductos;i++){
            ventasTotales[i]= (int) (cantidades[i]*precios[i]);
        }

        System.out.println("  ‖                                                                                        ‖");
        System.out.println("  ‖         Producto\t\t\tCantidad\t\tPrecio por unidad\t\tTotal              ‖");

        for (int i=0;i<numProductos;i++){
            System.out.printf("  ‖         %-19s %-16d$%-23.2f$%-9.2f         ‖ \n", nombres[i], cantidades[i], precios[i], ventasTotales[i]);
        }





    }
}
