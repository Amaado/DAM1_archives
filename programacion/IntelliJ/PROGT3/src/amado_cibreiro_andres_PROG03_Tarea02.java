public class PROGT2_Ejerc2 {
    public static void main(String[] args) {

        String cadena = new String (" esto es un ejemplo de una cadena de texto ");

        System.out.println("La longitud de la cadena es: " +cadena.length());
        cadena =cadena.trim();

        System.out.println("La longitud de la cadena sin espacios es: " +cadena.length());

        String cola=cadena.substring(cadena.indexOf("cadena"));

        System.out.println(cola.replace("texto","muestra"));

        String principio=cadena.substring(0,cadena.indexOf("cadena"));

        System.out.println(principio);

        String frase= principio + cola;

        System.out.println(frase);

        System.out.println(frase.substring(0,1).toUpperCase()+frase.substring(1));
    }
}
