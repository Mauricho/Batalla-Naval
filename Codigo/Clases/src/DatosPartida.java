/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author f_acu
 */
public class DatosPartida{
    /*
    private ArrayList<Integer[]> disparosAcertados;
    private int barcosSanos;
    private ArrayList<Integer[]> diparosAgua;
    */
    private ArrayList<Integer> disparosEnemigos;
    private ArrayList<Integer> disparosJugador;
    private jugador player;
    private jugador enemigo;
    
    public DatosPartida(){
        /*
        this.disparosAcertados=new ArrayList();
        this.diparosAgua=new ArrayList();
        */
        disparosEnemigos = new ArrayList<>(100);
        disparosJugador = new ArrayList<>(100);
        for(int i=0;i<100;i++){
            disparosEnemigos.add(i);
        }
        Collections.shuffle(disparosEnemigos);
        //disparosAgua.add(new Integer[]{1, 2});
        this.player = new jugador();
        this.enemigo = new jugador();
    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    
    public boolean disparo(int x, int y){
        /* se hace click y va a aca
        una vez click aca se tiene que fijar en el tablero enemigo
        si hay o no un barco
         true = hay uno
         false = no hay uno
        si es true se fija en la condicion del barco en esa posicion
        y le debe devolver si:
        el barco es dañado
        el barco es hundido

        se tiene que fijar que no revise la posicion si ya esta en la lista
        */
        /*
        boolean resultado;
        resultado=this.player.disparo(x, y);
        return resultado;
        */
        if(!(disparosJugador.contains(x*10+y))){
            disparosJugador.add(x*10+y);
            if(this.enemigo.disparo(x,y)){
                //disparosAcertados.add(x*10+y);
                Barco barco = this.enemigo.getBarcoPosicion(x,y);
                String estado = String.valueOf(barco.getCondicion());
                barco.printCasilleros();
                System.out.println("Estado del barco acertado: " + estado);
                //enemigo.setFlota(barco);
            }
            else{
                System.out.println("Disparo al agua");
            }
            return this.enemigo.disparo(x,y);
        }
        else{
            System.out.println("Ya disparaste aqui flaco busca otro");
            return false;
        }
    }

    public boolean disparoE() {
        /*
        boolean resultado;
        resultado=this.enemigo.disparoE();
        return resultado;
        */
        int disparo = disparosEnemigos.get(0);
        disparosEnemigos.remove(0);
        int x = disparo/10;
        int y = disparo%10;
        System.out.println("El enemigo ha disparado en la posicion ("+x+","+y+")");
        if(this.player.disparo(x,y)){
            Barco barco = this.player.getBarcoPosicion(x,y);
            String estado = String.valueOf(barco.getCondicion());
            System.out.println("Barco acertado. Estado: "+estado);
        }
        else{
            System.out.println("Disparo al agua");
        }
        return this.player.disparo(x,y);
    }
    
    public boolean estadoJuego(int j){
        /*
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
        */
        switch(j){
            case 1:
                System.out.println("Al jugador le quedan "+player.barcosDisponibles()+" barcos restantes.");
                if(this.player.areAllHundido()){
                    return true;
                }
                break;
            case 2:
                System.out.println("Al enemigo le quedan "+enemigo.barcosDisponibles()+" barcos restantes.");
                if(this.enemigo.areAllHundido()){
                    return true;
                }
                break;
            default:
                break;
        }
        return false;
    }

    public jugador getPlayer(){return player;}

    /*
    public boolean disparable(int x, int y) {
       /* boolean[][] tablero = this.enemigo.getTablero();
        boolean result;
        tablero
*/
     /*
       return true;
    }

    */

    //--------------------------------------------------------------------------
    //------- SELECCION DE POSICIONES ------------------------------------------
    //--------------------------------------------------------------------------

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

    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------

    public boolean disparable(int x, int y) {
        for(int disp: this.disparosJugador){
            if(disp==(x*10+y)){
                return false;
            }
        }
        return true;
    }
}
