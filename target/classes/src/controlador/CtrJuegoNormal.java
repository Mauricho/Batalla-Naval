/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.controlador;

import src.modelo.Modelo;

/**
 *
 * @author f_acu
 */
public class CtrJuegoNormal implements Controlador {

    private static Modelo modelo;

    public CtrJuegoNormal() {
        super();
        this.modelo = Modelo.getInstance();
    }
    
    public boolean generarDisparoJugador(int x, int y){
        boolean succes;
        succes=modelo.dispararPosicion(x, y);
        return succes;
    }
    
    public boolean generarDisparoEnemigo(){
        boolean succes=false;
        //aca tiene que ir el codigo de disparo aleatorio
        return succes;
    }

    @Override
    public void iniciar() {
        modelo.iniciar();
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
    public void juegoLuck() {
    }
}
