/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 *
 * @author f_acu
 */
public class DatosPartida {

    private final ArrayList<Integer> disparosEnemigos;
    private final ArrayList<Integer> disparosJugador;
    private ArrayList<Integer> alrededor;
    private Juego player;
    private Juego enemigo;
    public Terminal terminal;
    int condicionActual;
    private int tipoJuego = 1;

    private boolean flag;

    public DatosPartida(int tipoJuego) {
        terminal = new Terminal();
        disparosEnemigos = new ArrayList<>(100);
        disparosJugador = new ArrayList<>(100);
        alrededor = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            disparosEnemigos.add(i);
        }
        Collections.shuffle(disparosEnemigos);
        this.tipoJuego = tipoJuego;
        if (this.tipoJuego == 2) {
            this.player = new jugadorLuck();
            this.enemigo = new jugadorLuck();
        } else {
            this.player = new jugador();
            this.enemigo = new jugador();
        }
        flag = false;

        /*observadores = new ArrayList<>();*/
    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    public boolean disparo(int x, int y) {
        if (this.tipoJuego == 1) {
            if (!(disparosJugador.contains(x * 10 + y))) {
                disparosJugador.add(x * 10 + y);
                if (this.enemigo.disparo(x, y)) {
                    Barco barco = this.enemigo.getBarcoPosicion(x, y);
                    String estado = String.valueOf(barco.getCondicion());
                    //barco.printCasilleros();
                    //System.out.println("Estado del barco acertado: " + estado);
                    if (Objects.equals(estado, "HUNDIDO")) {
                        condicionActual = 2;
                    } else {
                        condicionActual = 1;
                    }
                } else {
                    condicionActual = 0;
                    System.out.println("Disparo al agua");
                }
                setTerminal(x,y,condicionActual,"Jugador");
                return this.enemigo.disparo(x, y);
            } else {
                System.out.println("Ya disparaste aqui flaco busca otro");
                return false;
            }
        }

        if (this.tipoJuego == 2) {
            ArrayList<Integer> disp = this.player.getDisparos(x, y);
            int disparando = 0;
            int row,
                    col;
            if (disparosJugador.contains(disparando)) {
                for (int w = 0; w < disp.size(); w++) {
                    disparando = disp.get(w);
                    row = disparando / 10;
                    col = disparando % 10;
                    if (!(disparosJugador.contains(disparando))) {
                        disparosJugador.add(disparando);
                        if (this.enemigo.disparo(row, col)) {
                            Barco barco = this.enemigo.getBarcoPosicion(row, col);
                            String estado = String.valueOf(barco.getCondicion());
                            //barco.printCasilleros();
                            //System.out.println("Estado del barco acertado: " + estado);
                            if (Objects.equals(estado, "HUNDIDO")) {
                                condicionActual = 2;
                            } else {
                                condicionActual = 1;
                            }
                        } else {
                            condicionActual = 0;
                            System.out.println("Disparo al agua");
                        }
                        setTerminal(row,col,condicionActual,"Jugador");

                    }
                }
                return this.enemigo.disparo(x, y);
            } else {
                System.out.println("Ya disparaste aqui flaco busca otro");
                return false;
            }

        }
        return false;
    }

    public boolean disparoE() {
        if (!flag) {
            int disparo = disparosEnemigos.get(0);
            disparosEnemigos.remove(0);
            int x = disparo / 10;
            int y = disparo % 10;
            System.out.println("El enemigo ha disparado en la posicion (" + x + "," + y + ")");
            if (this.player.disparo(x, y)) {
                Barco barco = this.player.getBarcoPosicion(x, y);
                String estado = String.valueOf(barco.getCondicion());
                if (Objects.equals(estado, "HUNDIDO")) {
                    condicionActual = 2;
                } else {
                    condicionActual = 1;
                }
                //System.out.println("Barco acertado. Estado: "+estado);
                if (barco.isAveriado()) {
                    flag = true;
                    buscarAlrededor(disparo);
                }
            } else {
                condicionActual = 0;
                //System.out.println("Disparo al agua");
            }
            setTerminal(x,y,condicionActual,"Enemigo");
            return this.player.disparo(x, y);
        } else {
            int disparo = alrededor.get(0);
            disparosEnemigos.remove(alrededor.remove(0));
            int x = disparo / 10;
            int y = disparo % 10;
            System.out.println("El enemigo ha disparado en la posicion (" + x + "," + y + ")");
            if (this.player.disparo(x, y)) {
                Barco barco = this.player.getBarcoPosicion(x, y);
                String estado = String.valueOf(barco.getCondicion());
                if (Objects.equals(estado, "HUNDIDO")) {
                    condicionActual = 2;
                } else {
                    condicionActual = 1;
                }
                //System.out.println("Barco acertado. Estado: "+estado);
                if (barco.isAveriado()) {
                    flag = true;
                    buscarAlrededor(disparo);
                }
                if (barco.isHundido()) {
                    alrededor.clear();
                    flag = false;
                }
            } else {
                condicionActual = 0;
                System.out.println("Disparo al agua");
            }
            setTerminal(x,y,condicionActual,"Enemigo");
            return this.player.disparo(x, y);

        }
    }

    public void buscarAlrededor(Integer x) {
        for (int i = 0; i < disparosEnemigos.size(); i++) {
            if (disparosEnemigos.get(i) == x + 10) {
                alrededor.add(disparosEnemigos.get(i));
            }
            if (disparosEnemigos.get(i) == x - 10) {
                alrededor.add(disparosEnemigos.get(i));
            }
            if (disparosEnemigos.get(i) == x + 1) {
                alrededor.add(disparosEnemigos.get(i));
            }
            if (disparosEnemigos.get(i) == x - 1) {
                alrededor.add(disparosEnemigos.get(i));
            }
        }
        System.out.println(alrededor);
    }

    public boolean estadoJuego(int j) {
        switch (j) {
            case 1:
                //System.out.println("Al jugador le quedan "+player.barcosDisponibles()+" barcos restantes.");
                if (this.player.areAllHundido()) {
                    return true;
                }
                break;
            case 2:
                //System.out.println("Al enemigo le quedan "+enemigo.barcosDisponibles()+" barcos restantes.");
                if (this.enemigo.areAllHundido()) {
                    return true;
                }
                break;
            default:
                break;
        }
        return false;
    }

    public boolean disparable(int x, int y) {
        /*for(int disp: this.disparosJugador){
            if(disp==(x*10+y)){
                return false;
            }
        }
        return true;*/

        if (disparosJugador.contains(x * 10 + y)) {
            return false;
        }
        return true;

    }

    //--------------------------------------------------------------------------
    //------- SELECCION DE POSICIONES ------------------------------------------
    //--------------------------------------------------------------------------
    public Juego getPlayer() {
        return player;
    }

    public boolean isAllReady() {
        return player.listo();
    }

    public void setEnemigo() {
        enemigo.generarFlotaAleatorio();
    }

    public void setBarcoSeleccionado() {
        player.setBarcoSeleccionado();
    }

    public void setDevolverBarco() {
        player.devolverBarco();
    }

    public boolean isDisponible(int x, int y) {
        return player.espacioDisponible(x, y);
    }

    public void setGirar() {
        player.girar();
    }

    public void setFragata() {
        player.getFragata();
    }

    public void setDestructor() {
        player.getDestructor();
    }

    public void setSubmarino() {
        player.getSubmarino();
    }

    public void setAcorazado() {
        player.getAcorazado();
    }

    public void setTerminal(int dx, int dy, int condicion, String jugador){
        terminal.actualizar(dx,dy,condicion,jugador);
    }

    public boolean checkBarco(int x, int y) {
        return this.player.getTablero()[x][y];
    }

    public void setArmaEnemigo() {
        enemigo.setArma();
    }

    public void setArmaJugador() {
        player.setArma();
    }
    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------
}
