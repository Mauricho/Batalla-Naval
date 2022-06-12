/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package src.controlador;

/**
 *
 * @author f_acu
 */
public interface Controlador {

    void juegoNormal();

    void juegoLuck();

    void salir();

    void cerrarVentana();

    void teclaPresionada(String l);

    void iniciar();

    void seleccionarSubmarino();

    void seleccionarFragata();

    void confirmarPosicion();

    void seleccionarAcorazado();
    
    void posicionar(int i, int i1);

    void cancelarPosicion();

    void seleccionarDestructor();

    void girar();
}
