package src;

public class PROGT2_Ejerc1_Persona {
    String nombre;
    int edad;
    float altura;

    PROGT2_Ejerc1_Persona(String nombre, int edad, float altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    String getNombre (){
        return nombre;
    }
    void setNombre (String nom ){
        nombre = nom;
    }

    int getEdad (){
        return edad;
    }
    void setEdad (int ed ){
        edad = ed;
    }

    float getAltura (){
        return altura;
    }
    void setAltura (float alt ) {
        altura = alt;
    }
}
