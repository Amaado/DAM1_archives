package sealed;

public sealed class Perro extends Animal permits PastorAleman, Buldog, Boxer{

    public Perro(double peso, double estatura, String raza) {
        super(peso, estatura, raza);
    }

    public void ladrar(){
        System.out.println("Guauuguauuuuuguauuuu");
    }
    public void presentar(){
        System.out.printf("Hola soy un perro de raza %s e peso %.2f kilos %n", getRaza(),getPeso());
    }
}
