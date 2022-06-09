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

    public void verEstadisticas() {
        modelo.verEstaditicas();
    }

    public void teclaPresionada(String l) {
        modelo.ingresoDeLetra(l);
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
