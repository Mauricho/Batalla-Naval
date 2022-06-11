/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import src.BatallaNaval;
import src.InformacionDelJuego;
import src.jugador;
import src.vista.Vista;
import src.vista.VistaSeleccionDePosiciones;

/**
 *
 * @author f_acu
 */
public class Modelo {

    private static Modelo modelo = null;
    private InformacionDelJuego informacionDelJuego;
    private TreeMap<Integer, String> top10;
    private TreeMap<Integer, ArrayList<String>> palabrasJuegoNormal;
    private ArrayList<String> palabrasJuegoRelax;

    private Vista vistaActual;
    private Vista vistaAdicional;
    private Vista vistatercera;
    private Vista vistaSeleccionDePosicion;

    private BatallaNaval juegoActual;
    private boolean disponible;
    private int flag = -1;
    private int puntaje;

    public static Modelo getInstance() {
        if (modelo == null) {
            modelo = new Modelo();
        }
        return modelo;
    }

    private Modelo() {
        informacionDelJuego = new InformacionDelJuego();
        vistaActual = null;
        vistaAdicional = null;
        vistatercera = null;
        vistaSeleccionDePosicion = null;

        juegoActual = null;
        top10 = new TreeMap<Integer, String>();
        palabrasJuegoNormal = new TreeMap<Integer, ArrayList<String>>();
        palabrasJuegoRelax = new ArrayList<String>();
        disponible=false;
    }



    public void posicionar(int x, int y){
        if(jugador.espacioDisponible(x,y)){
            disponible=true;
        }
        else{
            disponible=false;
        }
    }

    public void confirmar(){
        if(disponible){
            jugador.setBarcoSeleccionado();
            disponible=false;
        }
    }

    public void cancelar(){
        disponible=false;
        jugador.devolverBarco();
    }

    public void girar(){
        jugador.girarBarcos();
    }

    public void getFragata(){
        jugador.getFragata();
    }

    public void getDestructor(){
        jugador.getDestructor();
    }

    public void getSubmarino(){
        jugador.getSubmarino();
    }

    public void getAcorazado(){
        jugador.getAcorazado();
    }

    public void setPalabrasJuegoNormal(TreeMap<Integer, ArrayList<String>> lecturaMap_I_Array) {
        this.palabrasJuegoNormal = lecturaMap_I_Array;
    }

    public void setPalabrasJuegoRelax(ArrayList<String> arrayList) {
        this.palabrasJuegoRelax = arrayList;

    }

    public void setTop10(TreeMap<Integer, String> lecturaMap) {
        this.top10 = lecturaMap;
    }

    public void iniciar() {
        if (flag == 2) {
            juegoActual = new JuegoRelax(palabrasJuegoRelax);
        }
        if (flag == 1) {
            juegoActual = new JuegoNormal(palabrasJuegoNormal);
        }

        setInformacionDeJuego();
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

    public void inciarJuegoRelax() {
        flag = 2;
        vistaActual.hacerVisible(false);
        vistaActual = new VistaJuegoRelax(informacionDelJuego);
        vistaActual.hacerVisible(true);
    }

    public void iniciarJuegoNormal() {
        flag = 1;
        vistaActual.hacerVisible(false);
        vistaActual = new VistaSeleccionDePosiciones(informacionDelJuego);
        vistaActual.hacerVisible(true);
    }

    public void cerraVentanaEstadisticas() {
        vistaAdicional.hacerVisible(false);
        vistaAdicional = null;
    }

    public void cerrarVentanaTop10() {
        iniciarVistaMenuPrincipal();
    }

    public void cerrarVentanaJuegoPerdido() {
        iniciarVistaMenuPrincipal();
    }

    public void cerrarVentanaJuegoGanado() {
        iniciarVistaMenuPrincipal();
    }

    public void cerrarPausa() {
        iniciarVistaMenuPrincipal();
    }

    public void verEstaditicas() {
        vistaAdicional = (Vista) new VistaEstadisticas(informacionDelJuego);
        vistaAdicional.hacerVisible(true);
    }

    public void verTop10() {
        vistaActual.hacerVisible(false);
        vistaActual = (Vista) new VistaTop10();
        ((VistaTop10) vistaActual).setTop10(top10);
        vistaActual.hacerVisible(true);
    }

    public void verPausa() {
        vistatercera = (Vista) new VistaPausa();
        vistatercera.hacerVisible(true);
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
        try {
            lectorActual = (Lector) new ArchivoTop10();
            lectorActual.guardarMapATexto(top10);
            lectorActual = null;
        } catch (IOException e) {
        }

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

    public void ingresoDeLetra(String s) {
        juegoActual.ingresoLetra(s.toLowerCase());
        // derrota gral
        if (!juegoActual.alcanzoDerrota()) {
            // victoria palabra
            if (!juegoActual.logroVictoria()) {
                // victoria gral
                if (juegoActual.alcanzoVictoria()) {
                    setInformacionDeJuego();
                    verPausa();
                } else {
                    setInformacionDeJuego();
                }
            } else {
                setInformacionDeJuego();
                verJuegoGanado();
            }
        } else {
            setInformacionDeJuego();
            juegoActual.suspendThread();
            verPedirNombre();
        }
    }

    private void pedirNombre() {
        if (vistaAdicional != null) {
            vistaAdicional.hacerVisible(false);
        }
        vistatercera = (Vista) new VistaGuardarPuntaje();
        vistatercera.hacerVisible(true);
    }

    public void verPedirNombre() {
        leerPuntaje();
        if ((PuntajeAlto() == 1) && (top10.size() != 0)) {
            pedirNombre();
        } else {
            verJuegoPerdido();
        }
    }

    public void ascender(String name) {
        vistatercera.hacerVisible(false);
        top10.put(puntaje, name);
        verTop10();
    }

    private int PuntajeAlto() {
        for (Map.Entry<Integer, String> entry : top10.entrySet()) {
            if (juegoActual.getPuntaje() > entry.getKey()) {
                return 1;
            }
        }
        return 0;
    }

    private void leerPuntaje() {
        puntaje = juegoActual.getPuntaje();
    }

    public void setInformacionDeJuego() {
        informacionDelJuego.actualizar(juegoActual.getNivel(), juegoActual.getPuntaje(),
                juegoActual.getVidas(), juegoActual.getLetrasErroneas(),
                juegoActual.getTiempo(), juegoActual.getLetrasAdivinadas(),
                juegoActual.getPalabrasAdivinadas());
    }

    public void siguientePalabra() {
        vistatercera.hacerVisible(false);
        juegoActual.definirPalabra();
        setInformacionDeJuego();
    }

    public Juego getJuegoActual() {
        return juegoActual;
    }

    public Vista getVistaTercera() {
        return vistatercera;
    }
}
