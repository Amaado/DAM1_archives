package src;

public class Complexo {
    private double real;
    private double imax;


    public Complexo (){
        real=0;
        imax=0;
    }
    public Complexo (double real, double imax){
        this.real=real;
        this.imax=imax;
    }
    public double getconsultareal (){
        return real;
    }
    public double getconsultaimax (){
        return imax;
    }
    void setcambiareal (double real){
        this.real=real;
    }

    void setcambiaimax (double imax){
        this.imax=imax;
    }
    
    @Override
    public String toString() {
        return real+imax+"i";
    }
    public void Sumar(Complexo b){
        this.real=this.real+b.real;
        this.imax=this.imax+b.imax;
    }
}