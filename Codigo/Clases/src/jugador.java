/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author f_acu
 */
public class jugador {

    private static int cantFragatas; // Fragatas = 1 casillero
    private static int cantDestructores; // Destructores = 2 casilleros
    private static int cantSubmarinos; // submarinos = 3 casilleros
    private static int cantAcorazados; // Acorazados = 4 casilleros
    private static Barco[] flota;
    private static int contador;
    private static int cantBarcos; // Cantidad de barcos vivos en el tablero

    public static final int tamanio=10;

    private static Barco barcoauxiliar;
    private static boolean direccion;
    private static boolean flagSeleccion; // Indica si hay un barco seleccionado

    //Tablero para posicionar los barcos del jugador
    private static boolean[][] TableroJugador = new boolean[tamanio][tamanio];
    private boolean[][] Tablero= new boolean[tamanio][tamanio];
    
    public jugador(){
        cleanTablero();
        cleanTableroJugador();
        cantFragatas=0;
        cantDestructores=0;
        cantSubmarinos=0;
        cantAcorazados=0;

        barcoauxiliar = null;
        direccion = true; // HORIZONTAL = true ; VERTICAL = false
        flagSeleccion = false;
        flota= new Barco[10];
        contador=0;
        cantBarcos=0;
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

    public static boolean listo(){
        if(getCantBarcos()==10){
            return true;
        }
        else{
            return false;
        }
        /*for(int i=0;i<10;i++){
            if(flota[i]==null){
                return false;
            }
        }
        return true;*/
    }

    public boolean disparo(int row, int col){
        boolean resultado=false;
        for(int i=0; i<flota.length;i++){
            /*if (flota[i].){
                
            }
*/
        }
        return resultado;
    }
    
    public boolean disparoE(){
        boolean resultado=false;
        //hay que implementar
        return resultado;
    }

    public static void devolverBarco(){
        barcoauxiliar = null;
        System.out.println("Posicion cancelada");
    }

    public static boolean espacioDisponible(int x, int y){
        try{
            if(barcoauxiliar!=null) {
                barcoauxiliar.setPosicion(x, y);
                int j;
                for (int i : barcoauxiliar.getCasilleros().keySet()) {
                    j = barcoauxiliar.getCasilleros().get(i);
                    if (TableroJugador[i][j]) {
                        System.out.println("Ya hay uno aqui mi rey");
                        return false; // Si hay un barco en la posicion
                    }
                }
                System.out.println(barcoauxiliar.getNombre()+ " ha sido ubicado desde la posicion: ("+x+","+y+")");
                return true;
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("No se puede mi rey");
            return false;// Si esta fuera del tablero
        }
        finally {
            return true;
        }
    }

    public static void setBarcoSeleccionado(){
        if(barcoauxiliar!=null){
            int y;
            for (int x: barcoauxiliar.getCasilleros().keySet()) {
                y = barcoauxiliar.getCasilleros().get(x);
                TableroJugador[x][y]=true;
            }
            flota[cantBarcos]=barcoauxiliar;
            cantBarcos++;
            sumarBarco(barcoauxiliar);
            barcoauxiliar=null;
            System.out.println("Posicion confirmada");
        }
    }

    public static void sumarBarco(Barco barco){
        switch(barco.getNombre()){
            case "FRAGATA":
                cantFragatas++;
            case "DESTRUCTOR":
                cantDestructores++;
            case "SUBMARINO":
                cantSubmarinos++;
            case "ACORAZADO":
                cantAcorazados++;
        }
    }

    public static void girar(){
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

    public static void getAcorazado(){
        if(getCantAcorazados()<1) {
            barcoauxiliar = new Acorazado(direccion);
        }
    }

    public static void getSubmarino(){
        if(getCantSubmarinos()<2) {
            barcoauxiliar = new Submarino(direccion);
        }
    }

    public static void getDestructor(){
        if(getCantDestructores()<3){
            barcoauxiliar = new Destructor(direccion);
        }
    }

    public static void getFragata(){
        if(getCantFragatas()<4){
            barcoauxiliar = new Fragata(direccion);
        }
    }

    public static int getCantFragatas(){return cantFragatas;}

    public static int getCantAcorazados() {return cantAcorazados;}

    public static int getCantDestructores() {return cantDestructores;}

    public static int getCantSubmarinos() {return cantSubmarinos;}

    public static int getCantBarcos(){return cantBarcos;}

    public Barco[] getFlota() {
        return flota;
    }

    public void setFlota(Barco[] flota) {
        this.flota = flota;
    }

    public boolean[][] getTablero() {
        return Tablero;
    }
    /*
    public void setTablero(boolean[][] Tablero) {
        this.Tablero = Tablero;
    }
     */


    public int barcosDisponibles(){
        this.cantBarcos= cantAcorazados+ cantDestructores+ cantFragatas+ cantSubmarinos;
        return this.cantBarcos;
    }

    public static void generarFlotaAleatorio(){
        /*
        barcoauxiliar=new Fragata();
        espacioDisponible(0,0);
        setBarcoSeleccionado();
        barcoauxiliar=new Fragata();
        espacioDisponible(0,1);
        setBarcoSeleccionado();
        barcoauxiliar=new Fragata();
        espacioDisponible(0,2);
        setBarcoSeleccionado();
        barcoauxiliar=new Fragata();
        espacioDisponible(0,3);
        setBarcoSeleccionado();
        barcoauxiliar=new Destructor(false);
        espacioDisponible(2,2);
        setBarcoSeleccionado();
        barcoauxiliar=new Destructor();
        espacioDisponible(2,5);
        setBarcoSeleccionado();
        barcoauxiliar=new Destructor(false);
        espacioDisponible(4,2);
        setBarcoSeleccionado();
        barcoauxiliar=new Submarino(false);
        espacioDisponible(7,5);
        setBarcoSeleccionado();
        barcoauxiliar=new Submarino();
        espacioDisponible(8,1);
        setBarcoSeleccionado();
        barcoauxiliar=new Acorazado();
        espacioDisponible(9,0);
        setBarcoSeleccionado();
        */
    }

        /*ArrayList<Integer> lista = new ArrayList<>(10);
        for(int i=0;i<10;i++){
            int z = generarAleatorio(lista);
            int x = z/10;
            int y = z%10;
            while(barcoauxiliar==null){
                getDestructor();
                getAcorazado();
                getSubmarino();
                getFragata();
                girar();
            }
            while(!(espacioDisponible(x,y))){
                z=generarAleatorio(lista);
                x=z/10;
                y=z%10;
            }
            setBarcoSeleccionado();

        }

    }

    public static int generarAleatorio(ArrayList<Integer> lista){
        Random ra = new Random();

        int a = ra.nextInt(100);
        while(lista.contains(a)){
            a = ra.nextInt(100);
        }
        lista.add(a);
        return a;
    }*/

}
