/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Random;

/**
 *
 * @author f_acu
 */
public class jugador {

    private int cantFragatas; // Fragatas = 1 casillero
    private int cantDestructores; // Destructores = 2 casilleros
    private int cantSubmarinos; // submarinos = 3 casilleros
    private int cantAcorazados; // Acorazados = 4 casilleros
    private ArrayList<Barco> flota = new ArrayList<>(10);
    private int cantBarcos;

    public static final int tamanio=10;

    private Barco barcoauxiliar;
    private boolean direccion;

    private final boolean[][] Tablero = new boolean[tamanio][tamanio];//Tablero para posicionar los barcos del jugador
    
    public jugador(){
        cleanTablero();
        cantFragatas=0;
        cantDestructores=0;
        cantSubmarinos=0;
        cantAcorazados=0;
        barcoauxiliar = null;
        direccion = true; // HORIZONTAL = true ; VERTICAL = false
        cantBarcos=0;
    }

    private void cleanTablero(){
        for (int i=0; i<tamanio;i++){
            for (int j=0; j<tamanio;j++){
                Tablero[i][j]=false;
            }
        }
    }

    public boolean listo(){
        return getCantBarcos() == 10;
    }

    public boolean disparo(int row, int col){

        for(int i=0;i<flota.size();i++){
            if(flota.get(i).getPosicion(row,col)==1){
                flota.get(i).setCasilleros(row,col);
                /*if(flota.get(i).isHundido()){
                    flota.remove(flota.get(i));
                }*/
            }
        }
        return getPosicion(row,col);
    }

    /*public void setFlota(Barco barco){
        flota.remove(barco);
    }*/
    
    /*public boolean disparoE(){
        boolean resultado=false;
        //hay que implementar
        return resultado;
    }*/

    public void devolverBarco(){
        this.barcoauxiliar = null;
        System.out.println("Posicion cancelada");
    }

    public boolean espacioDisponible(int x, int y){
        boolean flag= true;
        try{
            if(barcoauxiliar!=null){
                barcoauxiliar.setPosicion(x,y);
                for(int i=0;i<tamanio;i++){
                    for(int j=0;j<tamanio;j++){
                        if(barcoauxiliar.getPosicion(i,j)==1){
                            if(Tablero[i][j]){

                                flag = false;
                            }
                        }
                    }
                }
                if(flag) System.out.println(barcoauxiliar.getNombre()+ " ha sido ubicado desde la posicion: ("+x+","+y+")");
                else System.out.println("Ya hay uno aqui mi rey");
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("No se puede mi rey");
            flag=false;// Si esta fuera del tablero
        }
        return flag;
    }

    // Confirma posicion del barco
    public void setBarcoSeleccionado(){
        if(this.barcoauxiliar!=null){
            for(int i=0;i<tamanio;i++){
                for(int j=0;j<tamanio;j++){
                    if(this.barcoauxiliar.getPosicion(i,j)==1){
                        Tablero[i][j]=true;
                        System.out.print("("+i+","+j+")");
                    }
                }
            }
            Barco aux = this.barcoauxiliar;
            flota.add(aux);
            cantBarcos++;
            sumarBarco();
            this.barcoauxiliar=null;
            System.out.println("Posicion confirmada");

            for (Barco barco : flota) {
                System.out.print(barco.getNombre() + ": ");
                barco.printPosiciones();
                System.out.println();
            }
        }
    }

    public void sumarBarco(){
        switch(this.barcoauxiliar.getTamanio()){
            case 1:
                cantFragatas++;
                break;
            case 2:
                cantDestructores++;
                break;
            case 3:
                cantSubmarinos++;
                break;
            case 4:
                cantAcorazados++;
                break;
            default:
                System.out.println("Como mierda llegaste aca");
                break;
        }
    }

    public void girar(){
        // Si esta HORIZONTAL cambialo a VERTICAL
        if(direccion){
            direccion=false;
            if(barcoauxiliar!=null){
                barcoauxiliar.setDireccion(false);
            }
            System.out.println("Barcos en vertical");
        }
        // Si esta VERTICAL cambialo a HORIZONTAL
        else{
            direccion=true;
            if(barcoauxiliar!=null){
                barcoauxiliar.setDireccion(true);
            }
            System.out.println("Barcos en horizontal");
        }
    }

    public void getAcorazado(){
        if(getCantAcorazados()<1) {
            this.barcoauxiliar = new Acorazado(direccion);
            System.out.println(barcoauxiliar.getNombre()+" seleccionado");
        }
        else{
            System.out.println("No hay mas acorazados");
        }
    }

    public void getSubmarino(){
        if(getCantSubmarinos()<2) {
            this.barcoauxiliar = new Submarino(direccion);
            System.out.println(barcoauxiliar.getNombre()+" seleccionado");
        }
        else{
            System.out.println("No hay mas submarinos");
        }
    }

    public void getDestructor(){
        if(getCantDestructores()<3){
            this.barcoauxiliar = new Destructor(direccion);
            System.out.println(barcoauxiliar.getNombre()+" seleccionado");
        }
        else{
            System.out.println("No hay mas destructores");
        }
    }

    public void getFragata(){
        if(getCantFragatas()<4){
            this.barcoauxiliar = new Fragata(direccion);
            System.out.println(barcoauxiliar.getNombre()+" seleccionado");
        }
        else{
            System.out.println("No hay mas fragatas");
        }
    }

    public int getCantFragatas(){return cantFragatas;}

    public int getCantAcorazados() {return cantAcorazados;}

    public int getCantDestructores() {return cantDestructores;}

    public int getCantSubmarinos() {return cantSubmarinos;}

    public int getCantBarcos(){return cantBarcos;}

    public ArrayList<Barco> getFlota(){return flota;}

    public boolean[][] getTablero() {
        return Tablero;
    }

    public int barcosDisponibles(){
        //this.cantBarcos= cantAcorazados+ cantDestructores+ cantFragatas+ cantSubmarinos;
        //this.cantBarcos = flota.size();
        return this.cantBarcos;
    }

    public void generarFlotaAleatorio(){
        int z,y,x,w;
        ArrayList<Integer> lista = new ArrayList<>(100);
        for(int i=0;i<100;i++){
            lista.add(i);
        }
        Collections.shuffle(lista); // mezcla el orden de los valores
        //System.out.print(lista);
        for(int j=0;j<lista.size();j++){
            z = lista.get(j);
            x=z/10;
            y=z%10;
            if(getCantAcorazados()<1){
                getAcorazado();
            }
            else if(getCantSubmarinos()<2){
                getSubmarino();
            }
            else if(getCantDestructores()<3){
                getDestructor();
            }
            else if(getCantFragatas()<4){
                getFragata();
            }
            w=lista.size()-1-j;
            if(lista.get(w)%2==1) girar();
            if(espacioDisponible(x,y)) setBarcoSeleccionado();
            if(flota.size()==10) break;
        }
        for (Barco barco : flota) {
            System.out.print(barco.getNombre() + ": ");
            barco.printPosiciones();
            System.out.println();
        }
        printTablero();
    }

    public Barco getBarcoauxiliar(){return barcoauxiliar;}

    public boolean getPosicion(int x, int y){return Tablero[x][y];}

    public Barco getBarcoPosicion(int x, int y){
        Barco aux = new Fragata();
        for (Barco barco: flota) {
            if(barco.getPosicion(x,y)==1){
                aux = barco;
            }
        }
        return aux;
    }

    public void printTablero(){
        for(int i=0;i<tamanio;i++){
            for(int j=0;j<tamanio;j++){
                System.out.print(Tablero[i][j]+" ");
            }
            System.out.println();
        }
    }

    public boolean areAllHundido(){
        cantBarcos=10;
        for(Barco barco : flota){
            if(!(barco.isHundido())){
                cantBarcos--;
            }
        }
        for (Barco barco : flota){
            if(!(barco.isHundido())){
                return false;
            }
        }
        return true;
    }

    public boolean getDireccion(){return direccion;}
}