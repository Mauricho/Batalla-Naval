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

    @Override
    public void cerrarVentana() {
        // TODO Auto-generated method stub
        modelo.cerrarVentanaJuegoGanado();
    }

    @Override
    public void juegoNormal() {
        // TODO Auto-generated method stub

    }

    @Override
    public void salir() {
        // TODO Auto-generated method stub

    }

    public void teclaPresionada(String l) {

    }

    @Override
    public void iniciar() {

    }

    @Override
    public void juegoLuck() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
