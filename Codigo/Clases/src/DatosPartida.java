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
    private ArrayList<Integer> disparosAcertados;
    //private int barcosSanos;
    private ArrayList<Integer> disparosAgua;
    private jugador player;
    private jugador enemigo;
    
    public DatosPartida(){
        this.disparosAcertados=new ArrayList<Integer>();
        this.disparosAgua=new ArrayList<Integer>();
        //disparosAgua.add(new Integer[]{1, 2});
        this.player = new jugador();
        this.enemigo = new jugador();
    }
    
    public boolean disparo(int x, int y){
        /*boolean resultado;
        resultado=this.enemigo.disparo(x, y);
        return resultado;*/
        boolean resultado = this.enemigo.disparo(x,y);
        if(resultado){
            disparosAgua.add(x*10+y);
        }
        return resultado;
    }

    public boolean disparoE() {
        boolean resultado;
        resultado=this.player.disparoE();
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
    public jugador getPlayer(){return player;}

    public boolean isAllReady(){return player.listo();}

    public void setEnemigo(){enemigo.generarFlotaAleatorio();}

    public void setBarcoSeleccionado(){player.setBarcoSeleccionado();}

    public void setDevolverBarco(){player.devolverBarco();}

    public boolean isDisponible(int x, int y){return player.espacioDisponible(x,y);}

    public void setGirar(){player.girar();}

    public void setFragata(){player.getFragata();}

    public void setDestructor(){player.getDestructor();}

    public void setSubmarino(){player.getSubmarino();}

    public void setAcorazado(){player.getAcorazado();}
}
