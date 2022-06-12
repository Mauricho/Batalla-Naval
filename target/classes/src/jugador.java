/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.List;

/**
 *
 * @author f_acu
 */
public class jugador {
    private Barco[] flota;
    private int acorazado=0;
    private int submarinos=0;
    private int destructores=0;
    private int fragatas=0;
    public static final int tamanio=10;
    
    private boolean Tablero[][]= new boolean[tamanio][tamanio];
    
    public jugador(){
        for (int i=0; i<this.tamanio;i++){
            for (int j=0; j<this.tamanio;j++){
                this.Tablero[i][j]=false;
            }
        }
        flota= new Barco[10];
    }
    
    public boolean disparo(int row, int col){
        boolean resultado=false;
        for(int i=0; i<flota.length;i++){
            /*if (flota[i].){
                
            }
*/
        }
        return resultado;
    }
    
    public boolean disparoE(){
        boolean resultado=false;
        //hay que implementar
        return resultado;
    }

    public Barco[] getFlota() {
        return flota;
    }

    public void setFlota(Barco[] flota) {
        this.flota = flota;
    }

    public int getAcorazado() {
        return acorazado;
    }

    public void setAcorazado(int acorazado) {
        this.acorazado = acorazado;
    }

    public int getSubmarinos() {
        return submarinos;
    }

    public void setSubmarinos(int submarinos) {
        this.submarinos = submarinos;
    }

    public int getDestructores() {
        return destructores;
    }

    public void setDestructores(int destructores) {
        this.destructores = destructores;
    }

    public int getFragatas() {
        return fragatas;
    }

    public void setFragatas(int fragatas) {
        this.fragatas = fragatas;
    }

    public boolean[][] getTablero() {
        return Tablero;
    }

    public void setTablero(boolean[][] Tablero) {
        this.Tablero = Tablero;
    }

}
