package src;


import java.util.ArrayList;

public abstract class Barco {
    private int tamanio;
    private String nombre;
    private int[][] posicion;
    private boolean direccion;  // true = HORIZONTAL ; false = VERTICAL
    private Condicion condicion;
    private ArrayList<Integer> casilleros;
    /*
    private HashMap<Integer, Integer> casilleros;//<FILA , COLUMNA>
    */
    public Barco(int tamanio, String nombre){
        this.tamanio=tamanio;
        this.nombre=nombre;
        condicion = Condicion.SANO;
        posicion = new int[jugador.tamanio][jugador.tamanio];
        casilleros = new ArrayList<>(tamanio);
        cleanPosicion();
        direccion = true;
    }

    private void cleanPosicion() {
        casilleros.clear();
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
                casilleros.add(x*10+(y+i));
            }
        }
        else{//VERTICAL
            for(int i=0;i<tamanio;i++) {
                posicion[x + i][y] = 1;
                casilleros.add((x+i)*10+y);
            }
        }
    }

    public String getNombre(){return nombre;}

    public int getTamanio(){return tamanio;}

    public int getPosicion(int x, int y){return posicion[x][y];}

    public void printPosiciones(){
        for(int i=0;i<jugador.tamanio;i++){
            for(int j=0;j<jugador.tamanio;j++){
                if(posicion[i][j]==1){
                    System.out.print("("+i+","+j+") ");
                }
            }
        }
        System.out.println();
    }

    public Condicion getCondicion(){
        return condicion;
    }

    public void setAveriado(){
        condicion=Condicion.AVERIADO;
    }

    public void setHundido(){
        condicion=Condicion.HUNDIDO;
    }

    public boolean isAveriado(){
        return condicion == Condicion.AVERIADO;
    }

    public boolean isHundido(){
        return condicion == Condicion.HUNDIDO;
    }

    public ArrayList<Integer> getCasilleros(){
        return casilleros;
    }

    public void setCasilleros(int x,int y){
        Integer aux = x*10+y;
        casilleros.remove(aux);
        if(casilleros.isEmpty()) setHundido();
        else setAveriado();
        //printCasilleros();
    }

    public void printCasilleros(){
        for(int x : casilleros){
            System.out.println("("+x/10+","+x%10+")");
        }
    }

    /*
    public HashMap<Integer,Integer> getCasilleros(){return casilleros;}
     */
}
