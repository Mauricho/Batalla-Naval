package rsc;


public abstract class Barco {
    int tamanio;
    String nombre;
    int[][] posicion;
    boolean direccion;  // true = HORIZONTAL ; false = VERTICAL

    public Barco(int tamanio, String nombre){
        this.tamanio=tamanio;
        this.nombre=nombre;
        cleanPosicion();

        direccion = true;
    }

    public void girar(){
        for(int i=0;i<jugador.tamanio;i++){
            for(int j=0;j<jugador.tamanio;j++){
                if(posicion[i][j]==1){
                    posicion[j][i] = posicion [i][j];
                }
            }
        }
        setDireccion();
    }

    private void setDireccion() {
        if(direccion){
            direccion = false; // si es HORIZONTAL entonces cambialo a VERTICAL
        }
        else{
            direccion = true;  // si es VERTICAL entonces cambialo a HORIZONTAL
        }
    }

    public void setPosicion(int x, int y){
        cleanPosicion();
        if(direccion){
            for(int i=0;i<tamanio;i++){
                posicion[x][y + i] = 1;
            }
        }
        else{
            for(int i=0;i<tamanio;i++) {
                posicion[x + i][y] = 1;
            }
        }
    }

    private void cleanPosicion() {
        for(int i=0;i<jugador.tamanio;i++){
            for(int j=0;j<jugador.tamanio;j++){
                posicion[i][j]=0;
            }
        }
    }
}
