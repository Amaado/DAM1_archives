package Andres;

public class Pelicula {
    //Variables
    String titulo;
    String director;
    String codigo;
    int añoEstreno;

    //Constructor
    public Pelicula(String titulo, String director, String codigo, String añoEstreno) {
        this.titulo = titulo;
        this.director = director;
        this.codigo = codigo;
        this.añoEstreno = Integer.parseInt(añoEstreno);
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    //Setters

    public void setTitulo() {
        this.titulo = titulo;
    }

    public void setDirector() {
        this.director = director;
    }

    public void setCodigo() {
        this.codigo = codigo;
    }

    public void setAñoEstreno() {
        this.añoEstreno = añoEstreno;
    }

    //Método toString
    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", codigo='" + codigo + '\'' +
                ", añoEstreno=" + añoEstreno +
                '}';
    }
}
