/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author f_acu
 */
public class jugador {
    private List<Barco> flota;
    private int destructores=0;
    private int cruceros=0;
    private int canioneros=0;
    private int submarinos=0;

    private static List<Barco> fragatas;
    private static List<Barco> destructoress;
    private static List<Barco> submarinoss;
    private static List<Barco> acorazados;

    private int cantFragatas=4; // Fragatas = 1 casillero
    private int cantDestructores=3; // Destructores = 2 casilleros
    private int cantSubmarinos=2; // submarinos = 3 casilleros
    private int cantAcorazados=1; // Acorazados = 4 casilleros

    public static final int tamanio=10;

    private static Barco barcoauxiliar;
    private static boolean flagSeleccion; // Indica si hay un barco seleccionado

    //Tablero para posicionar los barcos del jugador
    private static boolean[][] TableroJugador = new boolean[tamanio][tamanio];
    //Tablero para disparar
    private boolean Tablero[][]= new boolean[tamanio][tamanio];
    
    public jugador(){
        for (int i=0; i<this.tamanio;i++){
            for (int j=0; j<this.tamanio;j++){
                this.Tablero[i][j]=false;
            }
        }
        cleanTablero();
        cleanTableroJugador();
        generarFlota();  //Aca se inicializan los barcos pero no se define aun su posicion
        barcoauxiliar = null;
        flagSeleccion = false;
    }

    public static boolean levantarFlag(){return flagSeleccion=true;}

    public static boolean bajarFlag(){return flagSeleccion=false;}
    
    public void disparo(int row, int col){
        if(this.Tablero[row][col]){
            
        }
    }

    public List<Barco> getFlota() {
        return flota;
    }

    public void setFlota(List<Barco> flota) {
        this.flota = flota;
    }

    public int getDestructores() {
        return destructores;
    }

    public void setDestructores(int destructores) {
        this.destructores = destructores;
    }

    public int getCruceros() {
        return cruceros;
    }

    public void setCruceros(int cruceros) {
        this.cruceros = cruceros;
    }

    public int getCanioneros() {
        return canioneros;
    }

    public void setCanioneros(int canioneros) {
        this.canioneros = canioneros;
    }

    public int getSubmarinos() {
        return submarinos;
    }

    public void setSubmarinos(int submarinos) {
        this.submarinos = submarinos;
    }

    public boolean getTablero(int row, int col) {
        return Tablero[row][col];
    }

    public void setTablero(boolean[][] Tablero) {
        this.Tablero = Tablero;
    }

    private void cleanTablero(){
        for (int i=0; i<tamanio;i++){
            for (int j=0; j<tamanio;j++){
                Tablero[i][j]=false;
            }
        }
    }

    private void cleanTableroJugador(){
        for (int i=0; i<tamanio;i++){
            for (int j=0; j<tamanio;j++){
                TableroJugador[i][j]=false;
            }
        }
    }

    public void generarFlota(){
        for(int i=0;i<cantFragatas;i++){
            Fragata fragata = new Fragata();
            fragatas.add(fragata);
        }
        for(int i=0;i<cantDestructores;i++){
            Destructor destructor = new Destructor();
            destructoress.add(destructor);
        }
        for(int i=0;i<cantSubmarinos;i++){
            Submarino submarino = new Submarino();
            submarinoss.add(submarino);
        }
        for(int i=0;i<cantAcorazados;i++){
            Acorazado acorazado = new Acorazado();
            acorazados.add(acorazado);
        }
    }

    public static void getSubmarino(){
        if(barcoauxiliar==null){
            barcoauxiliar=(Submarino) submarinoss.get(0);
            submarinoss.remove(0);
            levantarFlag(); // Me indica que el jugador tiene seleccionado un barco para posicionar
        }
        else{
            if(levantarFlag()){
                devolverBarco();
                barcoauxiliar=(Submarino) submarinoss.get(0);
                submarinoss.remove(0);
            }
        }
    }

    public static void getFragata(){
        if(barcoauxiliar==null){
            barcoauxiliar=(Fragata) fragatas.get(0);
            fragatas.remove(0);
            levantarFlag(); // Me indica que el jugador tiene seleccionado un barco para posicionar
        }
        else{
            if(levantarFlag()){
                devolverBarco();
                barcoauxiliar=(Fragata) fragatas.get(0);
                fragatas.remove(0);
            }
        }
    }

    public static void getAcorazado(){
        if(barcoauxiliar==null){
            barcoauxiliar=(Acorazado) acorazados.get(0);
            acorazados.remove(0);
            levantarFlag(); // Me indica que el jugador tiene seleccionado un barco para posicionar
        }
        else{
            if(levantarFlag()){
                devolverBarco();
                barcoauxiliar=(Acorazado) acorazados.get(0);
                acorazados.remove(0);
            }
        }
    }

    public static void getDestructor(){
        if(barcoauxiliar==null){
            barcoauxiliar=(Destructor) destructoress.get(0);
            destructoress.remove(0);
            levantarFlag(); // Me indica que el jugador tiene seleccionado un barco para posicionar
        }
        else{
            if(levantarFlag()){
                devolverBarco();
                barcoauxiliar=(Destructor) destructoress.get(0);
                destructoress.remove(0);
            }
        }
    }

    public static void devolverBarco(){
        switch (barcoauxiliar.getNombre()){
            case "FRAGATA":
                Fragata fragata = new Fragata();
                fragatas.add(fragata);
                barcoauxiliar=null;
            case "DESTRUCTOR":
                Destructor destructor = new Destructor();
                destructoress.add(destructor);
                barcoauxiliar=null;
            case "SUBMARINO":
                Submarino submarino = new Submarino();
                submarinoss.add(submarino);
                barcoauxiliar=null;
            case "ACORAZADO":
                Acorazado acorazado = new Acorazado();
                acorazados.add(acorazado);
                barcoauxiliar=null;
        }
    }

    public static boolean espacioDisponible(int x, int y){
        if(barcoauxiliar!=null){
            barcoauxiliar.setPosicion(x,y);
            int j;
            for (int i: barcoauxiliar.getCasilleros().keySet()){
                j = barcoauxiliar.getCasilleros().get(x);
                if(TableroJugador[i][j]){
                    return false;
                }
            }
            return true;
        }
        return false;   // Si no hay barco seleccionado devuelve false
    }

    public static void setBarcoSeleccionado(){
        int y;
        Barco aux = barcoauxiliar;
        for (int x: barcoauxiliar.getCasilleros().keySet()) {
            y = barcoauxiliar.getCasilleros().get(x);
            TableroJugador[x][y]=true;
        }
        //flota.add(aux);
        barcoauxiliar=null;
        bajarFlag();
    }

    public static void girarBarcos(){
        barcoauxiliar.girar();
    }
    
}
