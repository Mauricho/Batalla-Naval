/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;
import src.controlador.CtrJuegoNormal;

/**
 *
 * @author f_acu
 */
public class Tablero extends javax.swing.JFrame implements Vista {

    private static CtrJuegoNormal control;
    boolean result = false;
    JButton[][] botones=new JButton[10][10];
    JButton posJug[][]=new JButton[10][10];

    public Tablero() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.control = new CtrJuegoNormal();
        crear_tablero();
        pos_jug();
    }
    
    public void crear_tablero(){
        for (int i=0; i<10; i++){
            for (int j=0; j<10 ; j++){
                JButton btn_tablero=new JButton("");
                btn_tablero.setBounds(80*i, 57*j, 80, 57);
                btn_tablero.setBackground(Color.gray);
                btn_tablero.putClientProperty("x", i);
                btn_tablero.putClientProperty("y", j);
                btn_tablero.addActionListener(new java.awt.event.ActionListener() {                    
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (control.disparable((Integer)((JButton)e.getSource()).getClientProperty("x"), (Integer)((JButton)e.getSource()).getClientProperty("y"))){
                            if(control.generarDisparoJugador((Integer)((JButton)e.getSource()).getClientProperty("x"), (Integer)((JButton)e.getSource()).getClientProperty("y"))){
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
                panel1.add(botones[i][j]);
                panel1.repaint();
            }
        }
    }
    
    public void pos_jug(){
        for (int i=0; i<10; i++){
            for (int j=0; j<10 ; j++){
                JButton tab=new JButton();
                tab.setBounds(42*j, 28*i, 42, 28);
                tab.setBackground(Color.gray);
                
                this.posJug[i][j]=tab;
            }
        }
        for (int i=0; i<10; i++){
            for (int j=0; j<10 ; j++){
                panel2.add(posJug[i][j]);
                panel2.repaint();
            }
        }
    }
    

    public void cargarImagenes() {
        //Cargar imagenes de los casilleros y los botones
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        panel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("BatallaNaval");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        panel1.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    public boolean lugarDisparado(int x, int y) {
        boolean resultado = control.generarDisparoJugador(x, y);
        return resultado;
    }

    public void revisarEstado() {
        if (control.estadoJuego(2)) {
            control.partidaGanada();
        }
        control.generarDisparoEnemigo();
        if (control.estadoJuego(1)) {
            control.partidaPerdida();
        }
    }

    public void resultadoDisparo(boolean res) {

    }

    @Override
    public void hacerVisible(boolean b) {
        setVisible(b);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    // End of variables declaration//GEN-END:variables

}
