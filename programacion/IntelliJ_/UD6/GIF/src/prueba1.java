public class prueba1 {
    public static void main(String[] args) {
        // Paso 1: Imprimir arte ASCII
        System.out.println("  /$$$$$$  /$$                           /$$");
        System.out.println(" /$$__  $$| $$                          | $$");
        System.out.println("| $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$ | $$");
        System.out.println("| $$      | $$__  $$ /$$__  $$ /$$__  $$| $$");
        System.out.println("| $$      | $$  \\ $$| $$$$$$$$| $$  \\ $$| $$");
        System.out.println("| $$    $$| $$  | $$| $$_____/| $$  | $$| $$");
        System.out.println("|  $$$$$$/| $$  | $$|  $$$$$$$|  $$$$$$/| $$/");
        System.out.println(" \\______/ |__/  |__/ \\_______/ \\______/ |__/");

        // Paso 2: Pausar durante un segundo
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Paso 3: Borrar la pantalla usando códigos de escape ANSI
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}