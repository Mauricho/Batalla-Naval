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
public class jugadorLuck extends Juego{
    private Arma armamento;
    
    public jugadorLuck(){
        super();
        armamento=new Arma();
    }
    
    public ArrayList<Integer> getDisparos(int x, int y){
        return this.armamento.disparos(x, y);
    }
    
    public void setArma(){
        this.armamento.setTipoArma();
    }
}
