
package src.controlador;

import src.modelo.Modelo;

public class CtrSeleccionDePosiciones implements Controlador {

    private Modelo modelo;

    public CtrSeleccionDePosiciones() {
        modelo = Modelo.getInstance();
    }

    @Override
    public void posicionar(int x,int y) {
        modelo.posicionar(x,y);
    }

    public void seleccionarFragata(){modelo.getFragata();}

    public void seleccionarDestructor(){
        modelo.getDestructor();
    }

    public void seleccionarSubmarino(){
        modelo.getSubmarino();
    }

    public void seleccionarAcorazado(){
        modelo.getAcorazado();
    }

    public void confirmarPosicion(){
        modelo.confirmar();
    }

    public void cancelarPosicion(){
        modelo.cancelar();
    }

    public void girar(){modelo.girar();}

    @Override
    public void salir() {
        // TODO Auto-generated method stub
    }

    @Override
    public void cerrarVentana() {
        modelo.cerrarPausa();
    }

    public void teclaPresionada(String l) {}

    @Override
    public void iniciar() {}

    @Override
    public void juegoLuck() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void juegoNormal() {}
}
