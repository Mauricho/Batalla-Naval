package rsc;

public abstract class Barco {
    int tamanio;
    String nombre;
    int[][] posicion;

    public Barco(int tamanio, String nombre){
        this.tamanio=tamanio;
        this.nombre=nombre;
    }

    public void girar(){
    }

    public void setPosicion(){}
}
