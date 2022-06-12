/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.vista;

import src.controlador.CtrMenuPrincipal;

/**
 *
 * @author f_acu
 */
public class VistaMenuPrincipal extends javax.swing.JFrame implements Vista {

    /**
     * Creates new form VistaMenuPrincipal
     */
    CtrMenuPrincipal control;
    
    public VistaMenuPrincipal() {
        initComponents();
        this.control = new CtrMenuPrincipal();
    }

    @Override
    public void hacerVisible(boolean b) {
        setVisible(b);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        botonNormal = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        botonLuckyShot = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        botonSalida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Batalla Naval");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.GridLayout(3, 0, 10, 5));

        jPanel4.setLayout(new java.awt.BorderLayout());

        botonNormal.setText("Partida Normal");
        botonNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNormalActionPerformed(evt);
            }
        });
        jPanel4.add(botonNormal, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        botonLuckyShot.setText("LuckyShot");
        jPanel5.add(botonLuckyShot, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        botonSalida.setText("Salir");
        botonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalidaActionPerformed(evt);
            }
        });
        jPanel6.add(botonSalida, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(513, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(483, 483, 483))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNormalActionPerformed
        // TODO add your handling code here:
        control.SeleccionDPosiciones(1);
    }//GEN-LAST:event_botonNormalActionPerformed

    private void botonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalidaActionPerformed
        // TODO add your handling code here:
        control.salir();
    }//GEN-LAST:event_botonSalidaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLuckyShot;
    private javax.swing.JButton botonNormal;
    private javax.swing.JButton botonSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}