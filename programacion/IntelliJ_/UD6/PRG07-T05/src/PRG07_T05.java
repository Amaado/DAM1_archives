import java.util.Scanner;

public class PRG07_T05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("  ╔════════════════════════════════════════════════════════════════════════════════════════╗     \n" +
                            "  ‖                                                                                        ‖     \n"+
                            "  ‖      "+ANSI_ORANGE+"$$$$$$$\\  $$$$$$$$\\  $$$$$$\\  $$$$$$\\  $$$$$$\\ $$$$$$$$\\ $$$$$$$\\   $$$$$$\\"+ANSI_RESET+"       ‖ \n" +
                            "  ‖      "+ANSI_ORANGE+"$$  __$$\\ $$  _____|$$  __$$\\ \\_$$  _|$$  __$$\\\\__$$  __|$$  __$$\\ $$  __$$\\"+ANSI_RESET+"      ‖\n" +
                            "  ‖      "+ANSI_ORANGE+"$$ |  $$ |$$ |      $$ /  \\__|  $$ |  $$ /  \\__|  $$ |   $$ |  $$ |$$ /  $$ |"+ANSI_RESET+"     ‖\n" +
                            "  ‖      "+ANSI_ORANGE+"$$$$$$$  |$$$$$\\    $$ |$$$$\\   $$ |  \\$$$$$$\\    $$ |   $$$$$$$  |$$ |  $$ |"+ANSI_RESET+"     ‖\n" +
                            "  ‖      "+ANSI_ORANGE+"$$  __$$< $$  __|   $$ |\\_$$ |  $$ |   \\____$$\\   $$ |   $$  __$$< $$ |  $$ |"+ANSI_RESET+"     ‖\n" +
                            "  ‖      "+ANSI_ORANGE+"$$ |  $$ |$$ |      $$ |  $$ |  $$ |  $$\\   $$ |  $$ |   $$ |  $$ |$$ |  $$ |"+ANSI_RESET+"     ‖\n" +
                            "  ‖      "+ANSI_ORANGE+"$$ |  $$ |$$$$$$$$\\ \\$$$$$$  |$$$$$$\\ \\$$$$$$  |  $$ |   $$ |  $$ | $$$$$$  |"+ANSI_RESET+"     ‖\n" +
                            "  ‖      "+ANSI_ORANGE+"\\__|  \\__|\\________| \\______/ \\______| \\______/   \\__|   \\__|  \\__| \\______/"+ANSI_RESET+"      ‖\n"+
                            "  ‖                                                                                        ‖\n"+
                            "  ‖                                                                                        ‖");
        System.out.print("  ‖       Cuantos productos quieres añadir? ");
        int numProductos = entrada.nextInt();
        System.out.print("  ‖                                                                                        ‖\n");
        System.out.print("  ‖"+ANSI_GREY+"       ⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻      "+ANSI_RESET+"‖\n");
        System.out.print("  ‖"+ANSI_GREY+"         ⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻         "+ANSI_RESET+"‖\n");
        System.out.print("  ‖                                                                                        ‖\n");
        System.out.print("  ‖                                                                                        ‖\n");

        String nombres[] = new String[numProductos];
        int cantidades[] = new int[numProductos];
        float precios[] = new float[numProductos];
        float total[] = new float[numProductos];
        float ventasTotales = 0;

        for (int i=0;i<numProductos;i++){
            if (i!=0){
                System.out.print("  ‖                                                                                        ‖\n");
                System.out.print("  ‖                                                                                        ‖\n");
                System.out.print("  ‖                                                                                        ‖\n");
                System.out.print("  ‖                                                                                        ‖\n");
                System.out.print("  ‖"+ANSI_GREY+"                           ⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻                               "+ANSI_RESET+"‖\n");
                System.out.print("  ‖                                                                                        ‖\n");
                System.out.print("  ‖                                                                                        ‖\n");
            }
            if (i<=9){
                switch (i) {
                    case 0:
                        System.out.println("  ‖"+ANSI_BLUE+"                          _                                                             "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |_) ._ _   _|      _ _|_  _     /|                             "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |   | (_) (_| |_| (_  |_ (_)     |                             "+ANSI_RESET+"‖");
                        break;
                    case 1:
                        System.out.println("  ‖"+ANSI_BLUE+"                          _                              _                              "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |_) ._ _   _|      _ _|_  _      )                             "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |   | (_) (_| |_| (_  |_ (_)    /_                             "+ANSI_RESET+"‖");
                        break;
                    case 2:
                        System.out.println("  ‖"+ANSI_BLUE+"                          _                              _                              "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |_) ._ _   _|      _ _|_  _     _)                             "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |   | (_) (_| |_| (_  |_ (_)    _)                             "+ANSI_RESET+"‖");
                        break;
                    case 3:
                        System.out.println("  ‖"+ANSI_BLUE+"                          _                                                             "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |_) ._ _   _|      _ _|_  _     |_|_                           "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |   | (_) (_| |_| (_  |_ (_)      |                            "+ANSI_RESET+"‖");
                        break;
                    case 4:
                        System.out.println("  ‖"+ANSI_BLUE+"                          _                               _                             "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |_) ._ _   _|      _ _|_  _     |_                             "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |   | (_) (_| |_| (_  |_ (_)     _)                            "+ANSI_RESET+"‖");
                        break;
                    case 5:
                        System.out.println("  ‖"+ANSI_BLUE+"                          _                               _                             "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |_) ._ _   _|      _ _|_  _     |_                             "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |   | (_) (_| |_| (_  |_ (_)    |_)                            "+ANSI_RESET+"‖");
                        break;
                    case 6:
                        System.out.println("  ‖"+ANSI_BLUE+"                          _                              __                             "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |_) ._ _   _|      _ _|_  _      /                             "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |   | (_) (_| |_| (_  |_ (_)    /                              "+ANSI_RESET+"‖");
                        break;
                    case 7:
                        System.out.println("  ‖"+ANSI_BLUE+"                          _                               _                             "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |_) ._ _   _|      _ _|_  _     (_)                            "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |   | (_) (_| |_| (_  |_ (_)    (_)                            "+ANSI_RESET+"‖");
                        break;
                    case 8:
                        System.out.println("  ‖"+ANSI_BLUE+"                          _                               _                             "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |_) ._ _   _|      _ _|_  _     (_|                            "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |   | (_) (_| |_| (_  |_ (_)      |                            "+ANSI_RESET+"‖");
                        break;
                    case 9:
                        System.out.println("  ‖"+ANSI_BLUE+"                          _                                  _                          "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |_) ._ _   _|      _ _|_  _     /| / \\                         "+ANSI_RESET+"‖\n" +
                                            "  ‖"+ANSI_BLUE+"                         |   | (_) (_| |_| (_  |_ (_)     | \\_/                         "+ANSI_RESET+"‖");
                        break;
                }
            }else {
                System.out.print("  ‖"+ANSI_BLUE+"                                     PRODUCTO "+(i+1)+ANSI_RESET+"                                        ‖\n");
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
        System.out.println("  ╚════════════════════════════════════════════════════════════════════════════════════════╝     \n\n"+ANSI_RESET);



        System.out.println("  ╔════════════════════════════════════════════════════════════════════════════════════════╗\n" +
                            "  ‖                                                                                        ‖\n"+
                            "  ‖                                                                                        ‖\n"+
                            "  ‖      "+ANSI_DARK_GREEN+"▓▓"+ANSI_GREEN+"     $$\\    $$\\ $$$$$$$$\\ $$\\   $$\\ $$$$$$$$\\  $$$$$$\\   $$$$$$\\       "+ANSI_DARK_GREEN+"▓▓"+ANSI_RESET+"       ‖\n" +
                            "  ‖    "+ANSI_DARK_GREEN+"▓▓▓▓▓▓"+ANSI_GREEN+"   $$ |   $$ |$$  _____|$$$\\  $$ |\\__$$  __|$$  __$$\\ $$  __$$\\    "+ANSI_DARK_GREEN+"▓▓▓▓▓▓"+ANSI_RESET+"     ‖\n" +
                            "  ‖    "+ANSI_DARK_GREEN+"▓▓"+ANSI_GREEN+"       $$ |   $$ |$$ |      $$$$\\ $$ |   $$ |   $$ /  $$ |$$ /  \\__|   "+ANSI_DARK_GREEN+"▓▓"+ANSI_RESET+"         ‖\n" +
                            "  ‖      "+ANSI_DARK_GREEN+"▓▓"+ANSI_GREEN+"     \\$$\\  $$  |$$$$$\\    $$ $$\\$$ |   $$ |   $$$$$$$$ |\\$$$$$$\\       "+ANSI_DARK_GREEN+"▓▓"+ANSI_RESET+"       ‖\n" +
                            "  ‖        "+ANSI_DARK_GREEN+"▓▓"+ANSI_GREEN+"    \\$$\\$$  / $$  __|   $$ \\$$$$ |   $$ |   $$  __$$ | \\____$$\\        "+ANSI_DARK_GREEN+"▓▓"+ANSI_RESET+"     ‖\n" +
                            "  ‖    "+ANSI_DARK_GREEN+"▓▓▓▓▓▓"+ANSI_GREEN+"     \\$$$  /  $$ |      $$ |\\$$$ |   $$ |   $$ |  $$ |$$\\   $$     "+ANSI_DARK_GREEN+"▓▓▓▓▓▓"+ANSI_RESET+"     ‖\n" +
                            "  ‖      "+ANSI_DARK_GREEN+"▓▓"+ANSI_GREEN+"        \\$  /   $$$$$$$$\\ $$ | \\$$ |   $$ |   $$ |  $$ |\\$$$$$$        "+ANSI_DARK_GREEN+"▓▓"+ANSI_RESET+"       ‖\n" +
                            "  ‖                 "+ANSI_GREEN+"\\_/    \\________|\\__|  \\__|   \\__|   \\__|  \\__| \\______/"+ANSI_RESET+"               ‖\n"+
                            "  ‖                                                                                        ‖\n"+
                            "  ‖                                                                                        ‖");

        for (int i=0;i<numProductos;i++){
            total[i]= (int) (cantidades[i]*precios[i]);
        }
        for (int i=0;i<numProductos;i++){
            ventasTotales += total[i];
        }

        System.out.println("  ‖                                                                                        ‖");
        System.out.println("  ‖"+ANSI_GREY+"          ⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻               "+ANSI_RESET+"‖");
        System.out.println("  ‖                                                                                        ‖");
        System.out.println("  ‖         Producto\t\t\tCantidad\t\tPrecio por unidad\t\tTotal              ‖");

        for (int i=0;i<numProductos;i++){
            System.out.printf("  ‖         %-19s %-16d$%-23.2f$%-9.2f         ‖ \n", nombres[i], cantidades[i], precios[i], total[i]);
        }

        System.out.println("  ‖                                                                                        ‖");
        System.out.println("  ‖                                                                                        ‖");
        System.out.println("  ‖"+ANSI_GREY+"          ⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻               "+ANSI_RESET+"‖");
        System.out.println("  ‖                                                                                        ‖");
        System.out.printf("  ‖             Ventas totales: $%-35.2f                       ‖\n", ventasTotales);

        System.out.println("  ‖"+ANSI_GREY+"              ⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻                                                      "+ANSI_RESET+"‖");
        for (int i=0;i<6;i++){
            System.out.println("  ‖                                                                                        ‖");
        }

        System.out.println("  ‖                                                                  ▋▋▋█▋▋ █ █▋▋▋ █       ‖");
        System.out.println("  ‖                                                                  ▋▋▋█▋▋ █ █▋▋▋ █       ‖");
        System.out.println("  ‖                                                                                        ‖");
        System.out.println("  ╚════════════════════════════════════════════════════════════════════════════════════════╝     \n\n");




    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[38;2;135;203;135m";
    public static final String ANSI_DARK_GREEN = "\u001B[38;2;41;91;41m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[38;2;174;241;242m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_ORANGE = "\u001B[38;2;205;163;89m";
    public static final String ANSI_GREY = "\u001B[38;2;104;104;107m";
}
