/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;
import src.modelo.Modelo;
/**
 *
 * @author f_acu
 */
public class CtrJuegoNormal implements Controlador {

    private static Modelo modelo;
    JPanel panelTab;
    JPanel panelTxt;
    JPanel panelJugador;
    JButton[][] botones= new JButton[10][10];
    JLabel turno;

    public CtrJuegoNormal(JPanel panelTab, JPanel panelTxt, JPanel panelJugador, JLabel turno) {
        super();
        this.panelTab = panelTab;
        this.panelTxt = panelTxt;
        this.panelJugador = panelJugador;
        this.modelo = Modelo.getInstance();
        this.turno=turno;
        crear_tablero();
    }
    
    public void crear_tablero(){
        for (int i=0; i<10; i++){
            for (int j=0; j<10 ; j++){
                JButton btn_tablero=new JButton(".");
                btn_tablero.setBounds(60*j, 60*i, 60, 60);
                btn_tablero.setBackground(Color.gray);
                btn_tablero.putClientProperty("x", i);
                btn_tablero.putClientProperty("y", j);
                btn_tablero.addActionListener(new java.awt.event.ActionListener() {                    
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (disparable((Integer)((JButton)e.getSource()).getClientProperty("x"), (Integer)((JButton)e.getSource()).getClientProperty("y"))){
                            if(generarDisparoJugador((Integer)((JButton)e.getSource()).getClientProperty("x"), (Integer)((JButton)e.getSource()).getClientProperty("y"))){
                                btn_tablero.setBackground(Color.red);
                            }else{
                                btn_tablero.setBackground(Color.blue);
                            }
                        } 
                    }
                });
                
                botones[i][j]=btn_tablero;
            }
        }
        for (int i=0; i<10; i++){
            for (int j=0; j<10 ; j++){
                panelTab.add(botones[i][j]);
                panelTab.repaint();
            }
        }
    }
    
    public boolean generarDisparoJugador(int x, int y){
        /*
        boolean succes;
        succes=modelo.dispararPosicion(x, y);
        return succes;
        */
        return modelo.dispararPosicion(x,y);
    }
    
    public boolean generarDisparoEnemigo(){
        return modelo.dispararPosicionE();//aca tiene que ir el codigo de disparo aleatorio
    }

    public boolean estadoJuego(int j){
        return modelo.estadoJuego(j);
    }
    
    public void partidaGanada(){
        modelo.verJuegoGanado();
    }
    
    public void partidaPerdida(){
        modelo.verJuegoPerdido();
    }
    @Override
    public void iniciar() {
        modelo.iniciar();
    }

    @Override
    public void posicionar(int x, int y) {

    }

    @Override
    public void juegoNormal() {
    }

    @Override
    public void salir() {
    }

    @Override
    public void cerrarVentana() {
    }

    @Override
    public void juegoLuck() {
    }

    public boolean disparable(int x, int y) {
        return modelo.disparable(x, y);
    }
}
