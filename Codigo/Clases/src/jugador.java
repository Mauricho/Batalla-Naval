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
    private static List<Barco> fragatas;
    private static List<Barco> destructores;
    private static List<Barco> submarinos;
    private static List<Barco> acorazados;
    private static List<Barco> flota;

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
    private static boolean[][] Tablero = new boolean[tamanio][tamanio];
    
    public jugador(){
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
            destructores.add(destructor);
        }
        for(int i=0;i<cantSubmarinos;i++){
            Submarino submarino = new Submarino();
            submarinos.add(submarino);
        }
        for(int i=0;i<cantAcorazados;i++){
            Acorazado acorazado = new Acorazado();
            acorazados.add(acorazado);
        }
    }

    public static void getSubmarino(){
        if(barcoauxiliar==null){
            barcoauxiliar=(Submarino) submarinos.get(0);
            submarinos.remove(0);
            levantarFlag(); // Me indica que el jugador tiene seleccionado un barco para posicionar
        }
        else{
            if(levantarFlag()){
                devolverBarco();
                barcoauxiliar=(Submarino) submarinos.get(0);
                submarinos.remove(0);
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
            barcoauxiliar=(Destructor) destructores.get(0);
            destructores.remove(0);
            levantarFlag(); // Me indica que el jugador tiene seleccionado un barco para posicionar
        }
        else{
            if(levantarFlag()){
                devolverBarco();
                barcoauxiliar=(Destructor) destructores.get(0);
                destructores.remove(0);
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
                destructores.add(destructor);
                barcoauxiliar=null;
            case "SUBMARINO":
                Submarino submarino = new Submarino();
                submarinos.add(submarino);
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
        for (int x: barcoauxiliar.getCasilleros().keySet()) {
            y = barcoauxiliar.getCasilleros().get(x);
            TableroJugador[x][y]=true;
        }
        bajarFlag();
    }

    public static void girarBarcos(){}
    
}
