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
public class AvionFurtivo implements Arma{
    
    ArrayList<Integer> disparos;
    public AvionFurtivo(){
        disparos=new ArrayList();
    }
    
    
    @Override
    public ArrayList<Integer> disparos(int x, int y) {
        for (int i = x - 2; i < x + 2; i++) {
            if (i <= 9 && i >= 0) {
                disparos.add(i * 10 + y);
            }
        }
        //res = null;
        return disparos;
    }
}
