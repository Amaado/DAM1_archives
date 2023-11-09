public class t2PROGT1 {
    public static void main(String[] args) {
        import java.util.Scanner;

        public class Persona {
            String nombre;
            int edad;
            float altura;

            // Constructor sin parámetros
            public Persona() {
                this.nombre = "X";
                this.edad = -1;
                this.altura = -1;
            }

            // Constructor con parámetros
            public Persona(String nombre, int edad, float altura) {
                this.nombre = nombre;
                this.edad = edad;
                this.altura = altura;
            }

            // Getters y setters para todos los atributos
            String getNombre() {
                return nombre;
            }

            void setNombre(String nom) {
                nombre = nom;
            }

            int getEdad() {
                return edad;
            }

            void setEdad(int e) {
                edad = e;
            }

            float getAltura() {
                return altura;
            }

            void setAltura(float alt) {
                altura = alt;
            }
        }

        public class PersonaDemo {
            public static void main(String[] args) {
                // Crear objeto Persona con constructor vacío
                Persona persona1 = new Persona();

                // Crear objeto Persona con constructor con parámetros
                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce el nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Introduce la edad: ");
                int edad = scanner.nextInt();

                System.out.print("Introduce la altura: ");
                float altura = scanner.nextFloat();

                Persona persona2 = new Persona(nombre, edad, altura);

                // Mostrar contenido de los atributos por pantalla
                System.out.println("Persona 1:");
                mostrarInformacion(persona1);

                System.out.println("Persona 2:");
                mostrarInformacion(persona2);

                scanner.close();
            }

            // Método para mostrar la información de una persona
            private static void mostrarInformacion(Persona persona) {
                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Edad: " + persona.getEdad());
                System.out.println("Altura: " + persona.getAltura());
                System.out.println();
            }
        }
    }
