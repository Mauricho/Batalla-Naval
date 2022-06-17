/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.modelo;

import src.BatallaNaval;
import src.DatosPartida;
import src.jugador;
import src.vista.SeleccionDePosiciones;
import src.vista.Tablero;
import src.vista.Vista;
import src.vista.VistaJuegoGanado;
import src.vista.VistaJuegoPerdido;
//import src.vista.VistaJuegoPerdido;
import src.vista.VistaMenuPrincipal;
//import src.vista.VistaPausa;

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
        //informacionDelJuego = new DatosPartida();
        vistaActual = null;
        vistaAdicional = null;
        vistatercera = null;
        //juegoActual = null;
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
            vistaActual = new Tablero(/*informacionDelJuego*/);
            //informacionDelJuego = new DatosPartida();
            informacionDelJuego.setEnemigo();
            vistaActual.hacerVisible(true);
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
    }

    //public BatallaNaval getJuegoActual() {
        //return juegoActual;
    //}

    public Vista getVistaTercera() {
        return vistatercera;
    }
    
    public boolean dispararPosicion(int x, int y){
        /*boolean result;
        result=this.informacionDelJuego.disparo(x, y);
        return result;*/
        return this.informacionDelJuego.disparo(x,y);
    }

    public boolean dispararPosicionE() {
        boolean result;
        result=this.informacionDelJuego.disparoE();
        return result;
    }

    public void iniciarSeleccionDePosiciones(int tipo) {
        vistaActual.hacerVisible(false);
        vistaActual = new SeleccionDePosiciones(tipo);
        informacionDelJuego = new DatosPartida();
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

    //public void generarAleatorio(){informacionDelJuego.getPlayer().generarFlotaAleatorio();}

    /*
    public void cerrarPausa() {
        iniciarVistaMenuPrincipal();
    }

    public void verPausa() {
        vistatercera = (Vista) new VistaPausa();
        vistatercera.hacerVisible(true);
    }
*/
}
