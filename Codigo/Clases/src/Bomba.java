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
public class Bomba implements Arma{
    
    ArrayList<Integer> disparos;
    public Bomba(){
        disparos=new ArrayList();
    }
    
    @Override
    public ArrayList<Integer> disparos(int x, int y) {
        for (int i = x - 1; i < x + 1; i++) {
            for (int j = y - 1; j < y + 1; i++) {
                if (i >= 0 && j >= 0 && i <= 9 && j <= 9) {
                    disparos.add(i * 10 + j);
                }
            }
        }
        //res = null;
        return disparos;
    }

}
