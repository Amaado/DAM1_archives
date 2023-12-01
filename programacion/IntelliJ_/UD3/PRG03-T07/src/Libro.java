public class Libro {
    String titulo;

    String autor;

    String isbn;

    int anoPublicacion;

    Libro (String titulo, String autor, String isbn, int anoPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.anoPublicacion=anoPublicacion;
    }

    public String getTitulo (String titulo){
        return titulo;
    }
    public void setTitulo (String titulo) {
        this.titulo=titulo;
    }
    public String getAutor (String autor){
        return autor;
    }
    public void setAutor (String autor) {
        this.autor=autor;
    }

    public String getIsbn (String isbn){
        return isbn;
    }
    public void setIsbn (String isbn) {
        this.isbn=isbn;
    }
    public int getAnoPublicacion(int anoPublicacion){
        return anoPublicacion;
    }

    public void setAnoPublicacion (){
        this.anoPublicacion=anoPublicacion;
    }

    @Override
    public String toString() {
        return "{título= '"+titulo+"',autor= '"+autor+"',isbn= '"+isbn+"',año de publicación= "+anoPublicacion+" }";
    }
}