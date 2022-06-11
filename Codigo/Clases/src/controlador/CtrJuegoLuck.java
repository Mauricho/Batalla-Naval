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
public class CtrJuegoLuck implements Controlador {

    private static Modelo modelo;

    public CtrJuegoLuck() {
        super();
        this.modelo = Modelo.getInstance();
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
    public void juegoLuck() {
    
    }
}
