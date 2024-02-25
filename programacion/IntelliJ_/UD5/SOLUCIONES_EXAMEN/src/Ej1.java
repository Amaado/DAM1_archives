
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej1 {
    public static void main(String[] args) {
        String archivoEntrada = "entrada.txt";
        String archivoSalida = "salida.txt";

        // Definir as constantes para representar valores mínimo e máximo dun enteiro de 32 bits
        final int VALOR_MINIMO = -2147483648;
        final int VALOR_MAXIMO = 2147483647;

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida));

            int sumaTotal = 0;
            int cantidadTotalNumeros = 0;
            int maximoGlobal = VALOR_MINIMO; // Inicializar con valor mínimo
            int minimoGlobal = VALOR_MAXIMO; // Inicializar con valor máximo

            String linea;
            while ((linea = br.readLine()) != null) {
                int suma = 0;
                int cantidad = 0;
                int maximo = VALOR_MINIMO; // Inicializar con valor mínimo
                int minimo = VALOR_MAXIMO; // Inicializar con valor máximo

                String numeroActual = "";
                for (int i = 0; i < linea.length(); i++) {
                    char c = linea.charAt(i);
                    if (c == ',') {
                        int num = Integer.parseInt(numeroActual.trim());
                        suma += num;
                        cantidad++;
                        maximo = Math.max(maximo, num);
                        minimo = Math.min(minimo, num);
                        maximoGlobal = Math.max(maximoGlobal, num);
                        minimoGlobal = Math.min(minimoGlobal, num);
                        numeroActual="";
                    } else {
                        numeroActual+= c;
                    }
                }
                // Procesar o último número da liña se non termina con ','
                if (numeroActual.length() > 0) {
                    int num = Integer.parseInt(numeroActual.trim());
                    suma += num;
                    cantidad++;
                    maximo = Math.max(maximo, num);
                    minimo = Math.min(minimo, num);
                    maximoGlobal = Math.max(maximoGlobal, num);
                    minimoGlobal = Math.min(minimoGlobal, num);
                }

                bw.write("Suma: " + suma + ", Cantidad: " + cantidad +
                        ", Máximo: " + maximo + ", Mínimo: " + minimo);
                bw.newLine();
                sumaTotal += suma;
                cantidadTotalNumeros += cantidad;
            }

            bw.newLine();
            bw.write("Suma Total: " + sumaTotal + ", Cantidad Total: " + cantidadTotalNumeros +
                    ", Máximo Global: " + maximoGlobal + ", Mínimo Global: " + minimoGlobal);

            br.close();
            bw.close();

            System.out.println("Procesamiento completado. Resultados escritos en '" + archivoSalida + "'.");
        } catch (IOException e) {
            System.err.println("Error al procesar los archivos: " + e.getMessage());
        }
    }
}

