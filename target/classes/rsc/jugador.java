/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rsc;

import java.util.List;

/**
 *
 * @author f_acu
 */
public class jugador {
    private List<Barco> flota;
    private int destructores=0;
    private int cruceros=0;
    private int canioneros=0;
    private int submarinos=0;
    private static final int tamanio=10;
    
    private boolean Tablero[][]= new boolean[tamanio][tamanio];
    
    public jugador(){
        for (int i=0; i<this.tamanio;i++){
            for (int j=0; j<this.tamanio;j++){
                this.Tablero[i][j]=false;
            }
        }
    }
    
    public void disparo(int row, int col){
        if(this.Tablero[row][col]){
            
        }
    }

    public List<Barco> getFlota() {
        return flota;
    }

    public void setFlota(List<Barco> flota) {
        this.flota = flota;
    }

    public int getDestructores() {
        return destructores;
    }

    public void setDestructores(int destructores) {
        this.destructores = destructores;
    }

    public int getCruceros() {
        return cruceros;
    }

    public void setCruceros(int cruceros) {
        this.cruceros = cruceros;
    }

    public int getCanioneros() {
        return canioneros;
    }

    public void setCanioneros(int canioneros) {
        this.canioneros = canioneros;
    }

    public int getSubmarinos() {
        return submarinos;
    }

    public void setSubmarinos(int submarinos) {
        this.submarinos = submarinos;
    }

    public boolean getTablero(int row, int col) {
        return Tablero[row][col];
    }

    public void setTablero(boolean[][] Tablero) {
        this.Tablero = Tablero;
    }
    
}
