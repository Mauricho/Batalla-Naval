package src;


import java.util.HashMap;

public abstract class Barco {
    private final int tamanio;
    private final String nombre;
    private int[][] posicion;
    private boolean direccion;  // true = HORIZONTAL ; false = VERTICAL
    private static HashMap<Integer, Integer> casilleros;//<FILA , COLUMNA>

    public Barco(int tamanio, String nombre){
        this.tamanio=tamanio;
        this.nombre=nombre;
        posicion = new int[jugador.tamanio][jugador.tamanio];
        casilleros = new HashMap<>(tamanio);
        cleanPosicion();
        direccion = true;
    }

    private void cleanPosicion() {
        for(int i=0;i<jugador.tamanio;i++){
            for(int j=0;j<jugador.tamanio;j++){
                posicion[i][j]=0;
            }
        }
    }

    protected void setDireccion(boolean direccion) {
        this.direccion=direccion;
    }

    public void setPosicion(int x, int y){
        cleanPosicion();
        if(direccion){//HORIZONTAL
            for(int i=0;i<tamanio;i++){
                posicion[x][y + i] = 1;
                casilleros.put(x,y+i);
            }
        }
        else{//VERTICAL
            for(int i=0;i<tamanio;i++) {
                posicion[x + i][y] = 1;
                casilleros.put(x+i,y);
            }
        }
    }

    public String getNombre(){return nombre;}

    public int getTamanio(){return tamanio;}

    public HashMap<Integer,Integer> getCasilleros(){return casilleros;}
}
