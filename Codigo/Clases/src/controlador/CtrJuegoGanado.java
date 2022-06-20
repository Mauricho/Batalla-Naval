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
public class CtrJuegoGanado implements Controlador {

    private Modelo modelo;

    public CtrJuegoGanado() {
        this.modelo = Modelo.getInstance();
    }
    
    public void volverMenuPrincipal(){
        modelo.iniciarVistaMenuPrincipal();
    }

    @Override
    public void cerrarVentana() {
        // TODO Auto-generated method stub
        modelo.cerrarVentanaJuego();
    }

    @Override
    public void juegoNormal() {
        // TODO Auto-generated method stub

    }

    @Override
    public void salir() {
        // TODO Auto-generated method stub
        this.modelo.salirJuego();
    }

    @Override
    public void iniciar() {

    }

    @Override
    public void posicionar(int x, int y) {

    }

    @Override
    public void juegoLuck() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
