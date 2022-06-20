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
public class CtrSeleccionDePosiciones implements Controlador{

    private Modelo modelo;
    
    public CtrSeleccionDePosiciones(){
        super();
        this.modelo = Modelo.getInstance();
    }
    
    @Override
    public void juegoNormal() {
        modelo.iniciarJuegoNormal();
    }

    @Override
    public void juegoLuck() {
        modelo.iniciarJuegoLuck();
    }

    @Override
    public void salir() {}

    @Override
    public void cerrarVentana() {}

    @Override
    public void iniciar() {}

    @Override
    public void posicionar(int x,int y) {modelo.posicionar(x,y);}

    public void seleccionarFragata(){modelo.getFragata();}

    public void seleccionarDestructor(){modelo.getDestructor();}

    public void seleccionarSubmarino(){modelo.getSubmarino();}

    public void seleccionarAcorazado(){modelo.getAcorazado();}

    public void confirmarPosicion(){modelo.confirmar();}

    public void cancelarPosicion(){modelo.cancelar();}

    public void girar(){modelo.girar();}
    
    public void volverMenuPrincipal(){
        modelo.iniciarVistaMenuPrincipal();
    }
    
}
