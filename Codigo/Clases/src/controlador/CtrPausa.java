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
public class CtrPausa implements Controlador{

    private Modelo modelo;

    public CtrPausa() {
        modelo = Modelo.getInstance();
    }

    @Override
    public void juegoNormal() {
        // TODO Auto-generated method stub
    }

    @Override
    public void salir() {
        // TODO Auto-generated method stub
    }

    @Override
    public void cerrarVentana() {
        modelo.cerrarPausa();
    }

    @Override
    public void teclaPresionada(String l) {

    }

    @Override
    public void iniciar() {

    }

    public void juegoLuck() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void seleccionarSubmarino() {

    }

    @Override
    public void seleccionarFragata() {

    }

    @Override
    public void confirmarPosicion() {

    }

    @Override
    public void seleccionarAcorazado() {

    }

    @Override
    public void posicionar(int i, int i1) {

    }

    @Override
    public void cancelarPosicion() {

    }

    @Override
    public void seleccionarDestructor() {

    }

    @Override
    public void girar() {

    }
}
