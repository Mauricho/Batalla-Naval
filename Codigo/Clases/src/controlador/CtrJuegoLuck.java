/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.controlador;

import javax.swing.JTextArea;
import src.modelo.Modelo;

/**
 *
 * @author f_acu
 */
public class CtrJuegoLuck implements Controlador {

    private static Modelo modelo;

    public CtrJuegoLuck() {
        super();
        this.modelo = Modelo.getInstance();
    }

    public boolean generarDisparoJugador(int x, int y){
        return modelo.dispararPosicion(x, y);
    }
    
    public boolean generarDisparoEnemigo(){
        return modelo.dispararPosicionE();//aca tiene que ir el codigo de disparo aleatorio
    }
    
    @Override
    public void juegoNormal() {
    }

    @Override
    public void salir() {
    }

    @Override
    public void cerrarVentana() {
    }

    @Override
    public void iniciar() {
        modelo.iniciar();

    }

    @Override
    public void posicionar(int x, int y) {

    }

    @Override
    public void juegoLuck() {
    
    }
    
    public boolean estadoJuego(int j){
        return modelo.estadoJuego(j);
    }
    
    public void partidaGanada(){
        modelo.verJuegoGanado();
    }
    
    public void partidaPerdida(){
        modelo.verJuegoPerdido();
    }
    
    public boolean disparable(int x, int y) {
        return modelo.disparable(x, y);
    }
    
    public boolean checkBarco(int x, int y){
        return modelo.checkBarco(x, y);
    }
    
    public void setArmaEnemigo(){
        modelo.setArmaEnemigo();
    }
    
    public void setArmaJugador(){
        modelo.setArmaJugador();
    }
    
    public void volverMenuPrincipal(){
        modelo.iniciarVistaMenuPrincipal();
    }
}
