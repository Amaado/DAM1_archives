public class imprimeTextoNota {
    public static void imprimeTextoNota(int nota) {
        switch (nota) {
            case 10:
                System.out.println("Sobresaliente");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 8:
                System.out.println("Notable");
                break;
            case 7:
                System.out.println("Notable");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            case 4:
                System.out.println("Insuficiente");
                break;
            case 3:
                System.out.println("Muy deficiente");
                break;
            case 2:
                System.out.println("Muy deficiente");
                break;
            case 1:
                System.out.println("Muy deficiente");
                break;
            case 0:
                System.out.println("Muy deficiente");
                break;
            default:
                System.out.println("Nota no válida");
        }
    }
}