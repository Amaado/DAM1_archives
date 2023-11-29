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
    public double getConsultaReal(){
        return real;
    }
    public double getConsultaImax (){
        return imax;
    }
    public void setCambiaReal (double real){
        this.real=real;
    }

    public void setCambiaImax (double imax){
        this.imax=imax;
    }

    @Override
    public String toString() {
        return this.real + " + " + this.imax + "i";
    }
    public void sumar(Complexo b) {
        this.real += b.real;
        this.imax += b.imax;
    }
}