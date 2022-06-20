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
public class Arma {

    private int tipoArma = 0;

    public Arma() {

    }

    public void setTipoArma() {
        Random rand = new Random();
        int ran = rand.nextInt(20);
        if (ran == 11 || ran == 13) {
            this.tipoArma = 2;
            System.out.println("disparo Avion");
        }/*else if(ran%2!=0){
            this.tipoArma=1;
        }*/ else if (ran == 19) {
            this.tipoArma = 3;
            System.out.println("disparo Bomba");
        } else {
            this.tipoArma = 0;
            System.out.println("disparo Comun");
        }
    }

    public ArrayList disparos(int x, int y) {
        ArrayList<Integer> res = new ArrayList();
        if (this.tipoArma == 2) {
            System.out.println("disparo Avion");
            return disparoAvion(x, y);
        } else if (this.tipoArma == 3) {

            System.out.println("disparo Bomba");
            return disparoBomba(x, y);
        } else {
            int i = x * 10 + y;
            res.add(i);
            System.out.println("disparo Comun");
            return res;
        }
    }

    public ArrayList disparoBomba(int x, int y) {
        int inicial = x * 10 + y;
        int count = 0;
        ArrayList<Integer> res = new ArrayList();
        for (int i = x - 1; i < x + 1; i++) {
            for (int j = y - 1; j < y + 1; i++) {
                if (i >= 0 && j >= 0 && i <= 9 && j <= 9) {
                    res.add(i * 10 + j);
                }
            }
        }
        res = null;
        return res;
    }

    public ArrayList disparoAvion(int x, int y) {
        int inicial = x * 10 + y;
        int count = 0;
        ArrayList<Integer> res = new ArrayList();
        for (int i = x - 2; i < x + 2; i++) {
            if (i <= 9 && i >= 0) {
                res.add(i * 10 + y);
            }
        }
        res = null;
        return res;
    }
}
