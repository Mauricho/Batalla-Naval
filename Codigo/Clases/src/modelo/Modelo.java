/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.modelo;

import src.*;
import src.vista.*;

/**
 *
 * @author f_acu
 */
public class Modelo {

    private static Modelo modelo = null;
    private DatosPartida informacionDelJuego;
    //private jugador player;
    private Vista vistaActual;
    private Vista vistaAdicional;
    private Vista vistatercera;
    private int flag = -1;
    private boolean disponible;

    public static Modelo getInstance() {
        if (modelo == null) {
            modelo = new Modelo();
        }
        return modelo;
    }

    private Modelo() {
        vistaActual = null;
        vistaAdicional = null;
        vistatercera = null;
        disponible=false;

    }

    /*    public void iniciar() {
        if (flag == 2) {
            juegoActual = new JuegoRelax(palabrasJuegoRelax);
        }
        if (flag == 1) {
            juegoActual = new JuegoNormal(palabrasJuegoNormal);
        }

        setInformacionDeJuego();
    }
     */
    public void iniciar() {

    }

    public void iniciarVistaMenuPrincipal() {
        if (vistaActual != null) {
            vistaActual.hacerVisible(false);
        }
        if (vistaAdicional != null) {
            vistaAdicional.hacerVisible(false);
        }
        if (vistatercera != null) {
            vistatercera.hacerVisible(false);
        }
        vistaActual = null;
        vistaAdicional = null;
        vistatercera = null;

        vistaActual = (Vista) new VistaMenuPrincipal();
        vistaActual.hacerVisible(true);
    }

    /*   public void inciarJuegoLuck() {
        flag = 2;
        vistaActual.hacerVisible(false);
        vistaActual = new VistaJuegoLuck(informacionDelJuego);
        vistaActual.hacerVisible(true);
    }
     */
    
    public void selectTab(int tipo){
        this.flag=tipo;
        vistaActual.hacerVisible(false);
        vistaActual = (Vista) new SeleccionDePosiciones(flag);
        vistaActual.hacerVisible(true);
    }
    
    public void iniciarJuegoNormal() {

        if(informacionDelJuego.isAllReady()) {
            vistaActual.hacerVisible(false);
            vistaActual = new Tablero(informacionDelJuego.terminal);
            informacionDelJuego.setEnemigo();
            vistaActual.hacerVisible(true);
        }
        else{
            informacionDelJuego.getPlayer().printTablero();
        }
    }
    
    public void iniciarJuegoLuck() {
        /*
        if(jugador.listo()) {
            vistaActual.hacerVisible(false);
            vistaActual = new Tablero(/*informacionDelJuego*//*);
        informacionDelJuego = new DatosPartida();
        vistaActual.hacerVisible(true);
    }
    */
        if(informacionDelJuego.isAllReady()) {
            vistaActual.hacerVisible(false);
            vistaActual = new TableroLuck(informacionDelJuego.terminal);
            /*
            informacionDelJuego = new DatosPartida();
             */
            informacionDelJuego.setEnemigo();
            vistaActual.hacerVisible(true);
            //vistaActual.jTextArea1.append("Holaaaa");
        }
        else{
            informacionDelJuego.getPlayer().printTablero();
        }
    }

    public void cerrarVentanaJuegoPerdido() {
        iniciarVistaMenuPrincipal();
    }

    public void cerrarVentanaJuegoGanado() {
        iniciarVistaMenuPrincipal();
    }

    public void verJuegoPerdido() {
        vistatercera = (Vista) new VistaJuegoPerdido();
        vistatercera.hacerVisible(true);
    }

    public void verJuegoGanado() {
        vistatercera = (Vista) new VistaJuegoGanado();
        vistatercera.hacerVisible(true);
    }

    public Vista getVistaActual() {
        return vistaActual;
    }

    public Vista getVistaAdicional() {
        return vistaActual;
    }

    public void salirJuego() {

        vistaActual.hacerVisible(false);

        if (vistaAdicional != null) {
            vistaAdicional.hacerVisible(false);
        }
        if (vistatercera != null) {
            vistatercera.hacerVisible(false);
        }

        vistaActual = null;
        vistaAdicional = null;
        vistatercera = null;
        modelo = null;
        System.exit(0);
    }

    //public BatallaNaval getJuegoActual() {
        //return juegoActual;
    //}

    public Vista getVistaTercera() {
        return vistatercera;
    }
    
    public boolean dispararPosicion(int x, int y){
        return this.informacionDelJuego.disparo(x,y);
    }

    public boolean dispararPosicionE() {
        return informacionDelJuego.disparoE();
    }

    public void iniciarSeleccionDePosiciones(int tipo) {
        vistaActual.hacerVisible(false);
        vistaActual = new SeleccionDePosiciones(tipo);
        informacionDelJuego = new DatosPartida(tipo);
        vistaActual.hacerVisible(true);
    }

    public void posicionar(int x, int y){
        disponible = informacionDelJuego.isDisponible(x, y);
    }

    public void confirmar(){
        if(disponible){
            informacionDelJuego.setBarcoSeleccionado();
            disponible=false;
        }
    }

    public void cancelar(){
        disponible=false;
        informacionDelJuego.setDevolverBarco();
    }
    
    public boolean estadoJuego(int j){
        return this.informacionDelJuego.estadoJuego(j);
    }

    public void girar(){
        informacionDelJuego.setGirar();
    }

    public void getFragata(){
        informacionDelJuego.setFragata();
    }

    public void getDestructor(){
        informacionDelJuego.setDestructor();
    }

    public void getSubmarino(){
        informacionDelJuego.setSubmarino();
    }

    public void getAcorazado(){
        informacionDelJuego.setAcorazado();
    }

    public DatosPartida getInformacionDelJuego(){return informacionDelJuego;}

    public boolean disparable(int x, int y) {
        return this.informacionDelJuego.disparable(x, y);
    }
    
    public boolean checkBarco(int x, int y){
        return this.informacionDelJuego.checkBarco(x, y);
    }
    
    public void setArmaEnemigo(){
        this.informacionDelJuego.setArmaEnemigo();
    }
    
    public void setArmaJugador(){
        this.informacionDelJuego.setArmaJugador();
    }
}
