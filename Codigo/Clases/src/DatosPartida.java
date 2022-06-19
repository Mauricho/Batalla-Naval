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
    private final ArrayList<Integer> disparosEnemigos;
    private final ArrayList<Integer> disparosJugador;
    private ArrayList<Integer> alrededor;
    private jugador player;
    private jugador enemigo;
    
    public DatosPartida(){
        disparosEnemigos = new ArrayList<>(100);
        disparosJugador = new ArrayList<>(100);
        alrededor = new ArrayList<>();
        for(int i=0;i<100;i++){
            disparosEnemigos.add(i);
        }
        Collections.shuffle(disparosEnemigos);
        this.player = new jugador();
        this.enemigo = new jugador();
    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    
    public boolean disparo(int x, int y){
        if(!(disparosJugador.contains(x*10+y))){
            disparosJugador.add(x*10+y);
            if(this.enemigo.disparo(x,y)){
                Barco barco = this.enemigo.getBarcoPosicion(x,y);
                String estado = String.valueOf(barco.getCondicion());
                barco.printCasilleros();
                System.out.println("Estado del barco acertado: " + estado);
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
    
    public boolean disparoLuck(int x, int y){
        if(!(disparosJugador.contains(x*10+y))){
            disparosJugador.add(x*10+y);
            if(this.enemigo.disparoLuck(x,y)){
                Barco barco = this.enemigo.getBarcoPosicion(x,y);
                String estado = String.valueOf(barco.getCondicion());
                barco.printCasilleros();
                System.out.println("Estado del barco acertado: " + estado);
            }
            else{
                System.out.println("Disparo al agua");
            }
            return this.enemigo.disparoLuck(x,y);
        }
        else{
            System.out.println("Ya disparaste aqui flaco busca otro");
            return false;
        }
    }

    public boolean disparoE() {
        int disparo = disparosEnemigos.get(0);
        disparosEnemigos.remove(0);
        int x = disparo/10;
        int y = disparo%10;
        System.out.println("El enemigo ha disparado en la posicion ("+x+","+y+")");
        if(this.player.disparo(x,y)){
            Barco barco = this.player.getBarcoPosicion(x,y);
            String estado = String.valueOf(barco.getCondicion());
            System.out.println("Barco acertado. Estado: "+estado);
            if(barco.isAveriado()){
                buscarAlrededor(disparo);
            }
        }
        else{
            System.out.println("Disparo al agua");
        }
        return this.player.disparo(x,y);
    }

    public void buscarAlrededor(Integer x){
        /*if(disparosEnemigos.contains(x+10)){
            alrededor.add(disparosEnemigos.remove(x+10));
        }
        if(disparosEnemigos.contains(x-10)) alrededor.add(disparosEnemigos.remove(x-10));
        if(disparosEnemigos.contains(x+1)) alrededor.add(disparosEnemigos.remove(x+1));
        if(disparosEnemigos.contains(x-1)) alrededor.add(disparosEnemigos.remove(x-1));*/

        for(int i=0;i<disparosEnemigos.size();i++){
            if(disparosEnemigos.get(i)==x+10) alrededor.add(disparosEnemigos.remove(i));
            //disparosEnemigos.remove(i);
            if(disparosEnemigos.get(i)==x-10) alrededor.add(disparosEnemigos.remove(i));
            if(disparosEnemigos.get(i)==x+1) alrededor.add(disparosEnemigos.remove(i));
            if(disparosEnemigos.get(i)==x-1) alrededor.add(disparosEnemigos.remove(i));
        }
        System.out.println(alrededor);
    }
    
    public boolean estadoJuego(int j){
        switch(j){
            case 1:
                //System.out.println("Al jugador le quedan "+player.barcosDisponibles()+" barcos restantes.");
                if(this.player.areAllHundido()){
                    return true;
                }
                break;
            case 2:
                //System.out.println("Al enemigo le quedan "+enemigo.barcosDisponibles()+" barcos restantes.");
                if(this.enemigo.areAllHundido()){
                    return true;
                }
                break;
            default:
                break;
        }
        return false;
    }

    public boolean disparable(int x, int y) {
        for(int disp: this.disparosJugador){
            if(disp==(x*10+y)){
                return false;
            }
        }
        return true;
        /*
        if(disparoJugador.contains(x*10+y) return false
        return true;
         */
    }

    //--------------------------------------------------------------------------
    //------- SELECCION DE POSICIONES ------------------------------------------
    //--------------------------------------------------------------------------

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
    
    public void setArma(){
        this.player.setArma();
        this.enemigo.setArma();
    }
    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------

    
}
