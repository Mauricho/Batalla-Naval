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
            for (int j=0; j<this.tamanio;i++){
                
            }
        }
    }
    
}
