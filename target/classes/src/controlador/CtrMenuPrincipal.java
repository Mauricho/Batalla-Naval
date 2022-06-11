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
public class CtrMenuPrincipal implements Controlador {

    private static Modelo modelo;

    public CtrMenuPrincipal() {
        super();
        this.modelo = Modelo.getInstance();
    }

    public void salir() {
        modelo.salirJuego();
    }

    @Override
    public void cerrarVentana() {
        // TODO Auto-generated method stub

    }

    @Override
    public void iniciar() {

    }

    @Override
    public void juegoLuck() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void SeleccionDPosiciones(int tipo) {
        modelo.iniciarSeleccionDePosiciones(tipo);
    }

    @Override
    public void juegoNormal() {
        
    }
}
