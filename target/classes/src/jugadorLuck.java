/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author f_acu
 */
public class jugadorLuck extends Juego{
    private Arma armamento;
    
    public jugadorLuck(){
        super();
        this.setArma();
    }
    
    public ArrayList<Integer> getDisparos(int x, int y){
        return this.armamento.disparos(x, y);
    }
    
    public void setArma() {
        Random rand = new Random();
        int ran = rand.nextInt(20);
        if (ran == 7 || ran == 9 || ran == 11 || ran == 13) {
            this.armamento=new AvionFurtivo();
            System.out.println("disparo Avion");
        }/*else if(ran%2!=0){
            this.tipoArma=1;
        }*/ else if (ran == 13 || ran == 17 || ran == 19) {
            this.armamento=new Bomba();
            System.out.println("disparo Bomba");
        } else {
            this.armamento=new Comun();
            System.out.println("disparo Comun");
        }
    }
}
