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
public class Comun implements Arma{
    
    ArrayList<Integer> disparos;
    public Comun(){
        disparos=new ArrayList();
    }
    
    @Override
    public ArrayList<Integer> disparos(int x, int y) {
        this.disparos.add(x*10+y);
        return disparos;
    }
}
