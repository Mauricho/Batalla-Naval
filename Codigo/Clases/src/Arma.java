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
public class Arma {
    private int tipoArma;
    private float probabilida;
    
    public Arma(){
        
    }
    
    public ArrayList disparoBomba(int x, int y){
        int inicial =x*10 + y;
        int count=0;
        ArrayList<Integer> res=new ArrayList();
        for (int i=x-1; i<x+1;i++){
            for (int j=y-1;j<y+1;i++){
                if(i>=0 && j>=0 && i<=9 && j<=9){
                    res.add(i*10+j);
                }
            }
        }
        res= null;
        return res;
    }
}
