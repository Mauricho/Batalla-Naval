/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;

/**
 *
 * @author f_acu
 */
public class DatosPartida{
    private ArrayList<Integer[]> disparosAcertados;
    private int barcosSanos;
    private ArrayList<Integer[]> diparosAgua;
    private jugador player;
    private jugador enemigo;
    
    public DatosPartida(){
        this.disparosAcertados=new ArrayList();
        this.diparosAgua=new ArrayList();
        this.player = new jugador();
        this.enemigo = new jugador();
    }
    
    public boolean disparo(int x, int y){
        boolean resultado;
        resultado=this.player.disparo(x, y);
        return resultado;
    }

    public boolean disparoE() {
        boolean resultado;
        resultado=this.enemigo.disparoE();
        return resultado;
    }
    
    public boolean estadoJuego(int j){
        switch(j){
            case 1:
                if(this.player.barcosDisponibles()==0){
                    return false;
                }
                break;
            case 2:
                if(this.enemigo.barcosDisponibles()==0){
                    return false;
                }
                break;
            default:
                break;
        }
        return false;
    }
}
