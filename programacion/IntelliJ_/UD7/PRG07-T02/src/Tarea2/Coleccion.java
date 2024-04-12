package Tarea2;

import java.util.ArrayList;
import java.util.Arrays;

public class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        listaFiguras = new ArrayList<>();
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public void anhadirFigura(Figura fig){
        listaFiguras.add(fig);
    }

    public void subirPrecio(double cantidad, String id){
        int indice = listaFiguras.indexOf(listaFiguras.contains(id));
        listaFiguras.get(indice).setPrecio(listaFiguras.get(indice).getPrecio() + cantidad);

        //Otra manera más legible
        /*
        for (Figura f:listaFiguras){
            if (f.getCodigo().equals(id)){
                f.subirPrecio(cantidad);
            }
        }*/
    }

    @Override
    public String toString() {
        String cadena = "Colección"+nombreColeccion+"\n***************\n";
        for (Figura f:listaFiguras){
            cadena+=f+"\n";
        }
        return cadena;
    }

    public String conCapa(){
        String cadena="Figuras con capa: \n***************\n";
        for (Figura f: listaFiguras){
            if (f.getSuperheroe().isCapa()){
                cadena+=f+"\n";
            }
        }
        return cadena;
    }

    public Figura masValiosa(){
        double precioMayor=0;
        Figura fMayor=null;

        for (Figura f: listaFiguras){
            if (f.getPrecio()>precioMayor){
                precioMayor=f.getPrecio();
                fMayor=f;
            }
        }
        return fMayor;
    }

    public double getValorColeccion(){
        double valor=0;
        for (Figura f:listaFiguras){
            valor += f.getPrecio();
        }
        return valor;
    }

    public double getVolumenColeccion(){
        double vol=0;
        for (Figura f:listaFiguras){
            vol+=f.getDimension().getVolumen();
        }
        return vol+200;
    }
}
