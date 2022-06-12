/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import src.controlador.Controlador;
import src.controlador.CtrPausa;

/**
 *
 * @author f_acu
 */
public class VistaSeleccionDePosiciones extends javax.swing.JFrame implements Vista{

    public static Controlador controlador;

    public VistaSeleccionDePosiciones() {
        initComponents();
        this.setLocationRelativeTo(null);

        controlador = new CtrPausa();
    }

    public void hacerVisible(boolean b){
        setVisible(b);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton101 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jPanel41 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        jButton24 = new javax.swing.JButton();
        jPanel44 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        jPanel46 = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        jPanel47 = new javax.swing.JPanel();
        jButton28 = new javax.swing.JButton();
        jPanel48 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jPanel49 = new javax.swing.JPanel();
        jButton31 = new javax.swing.JButton();
        jPanel50 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jButton32 = new javax.swing.JButton();
        jPanel52 = new javax.swing.JPanel();
        jButton33 = new javax.swing.JButton();
        jPanel53 = new javax.swing.JPanel();
        jButton34 = new javax.swing.JButton();
        jPanel54 = new javax.swing.JPanel();
        jButton35 = new javax.swing.JButton();
        jPanel55 = new javax.swing.JPanel();
        jButton37 = new javax.swing.JButton();
        jPanel56 = new javax.swing.JPanel();
        jButton36 = new javax.swing.JButton();
        jPanel57 = new javax.swing.JPanel();
        jButton38 = new javax.swing.JButton();
        jPanel58 = new javax.swing.JPanel();
        jButton39 = new javax.swing.JButton();
        jPanel59 = new javax.swing.JPanel();
        jButton40 = new javax.swing.JButton();
        jPanel60 = new javax.swing.JPanel();
        jButton41 = new javax.swing.JButton();
        jPanel61 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jButton42 = new javax.swing.JButton();
        jPanel63 = new javax.swing.JPanel();
        jButton43 = new javax.swing.JButton();
        jPanel64 = new javax.swing.JPanel();
        jButton44 = new javax.swing.JButton();
        jPanel65 = new javax.swing.JPanel();
        jButton45 = new javax.swing.JButton();
        jPanel66 = new javax.swing.JPanel();
        jButton46 = new javax.swing.JButton();
        jPanel67 = new javax.swing.JPanel();
        jButton47 = new javax.swing.JButton();
        jPanel68 = new javax.swing.JPanel();
        jButton48 = new javax.swing.JButton();
        jPanel69 = new javax.swing.JPanel();
        jButton49 = new javax.swing.JButton();
        jPanel70 = new javax.swing.JPanel();
        jButton50 = new javax.swing.JButton();
        jPanel71 = new javax.swing.JPanel();
        jButton51 = new javax.swing.JButton();
        jPanel72 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        jButton52 = new javax.swing.JButton();
        jPanel74 = new javax.swing.JPanel();
        jButton53 = new javax.swing.JButton();
        jPanel75 = new javax.swing.JPanel();
        jButton54 = new javax.swing.JButton();
        jPanel76 = new javax.swing.JPanel();
        jButton56 = new javax.swing.JButton();
        jPanel77 = new javax.swing.JPanel();
        jButton57 = new javax.swing.JButton();
        jPanel78 = new javax.swing.JPanel();
        jButton30 = new javax.swing.JButton();
        jPanel79 = new javax.swing.JPanel();
        jButton58 = new javax.swing.JButton();
        jPanel80 = new javax.swing.JPanel();
        jButton59 = new javax.swing.JButton();
        jPanel81 = new javax.swing.JPanel();
        jButton60 = new javax.swing.JButton();
        jPanel82 = new javax.swing.JPanel();
        jButton61 = new javax.swing.JButton();
        jPanel83 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jPanel84 = new javax.swing.JPanel();
        jButton62 = new javax.swing.JButton();
        jPanel85 = new javax.swing.JPanel();
        jButton63 = new javax.swing.JButton();
        jPanel86 = new javax.swing.JPanel();
        jButton64 = new javax.swing.JButton();
        jPanel87 = new javax.swing.JPanel();
        jButton65 = new javax.swing.JButton();
        jPanel88 = new javax.swing.JPanel();
        jButton67 = new javax.swing.JButton();
        jPanel89 = new javax.swing.JPanel();
        jButton66 = new javax.swing.JButton();
        jPanel90 = new javax.swing.JPanel();
        jButton68 = new javax.swing.JButton();
        jPanel91 = new javax.swing.JPanel();
        jButton69 = new javax.swing.JButton();
        jPanel92 = new javax.swing.JPanel();
        jButton70 = new javax.swing.JButton();
        jPanel93 = new javax.swing.JPanel();
        jButton71 = new javax.swing.JButton();
        jPanel94 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jPanel95 = new javax.swing.JPanel();
        jButton72 = new javax.swing.JButton();
        jPanel96 = new javax.swing.JPanel();
        jButton73 = new javax.swing.JButton();
        jPanel97 = new javax.swing.JPanel();
        jButton74 = new javax.swing.JButton();
        jPanel98 = new javax.swing.JPanel();
        jButton75 = new javax.swing.JButton();
        jPanel99 = new javax.swing.JPanel();
        jButton76 = new javax.swing.JButton();
        jPanel100 = new javax.swing.JPanel();
        jButton77 = new javax.swing.JButton();
        jPanel101 = new javax.swing.JPanel();
        jButton78 = new javax.swing.JButton();
        jPanel102 = new javax.swing.JPanel();
        jButton79 = new javax.swing.JButton();
        jPanel103 = new javax.swing.JPanel();
        jButton80 = new javax.swing.JButton();
        jPanel104 = new javax.swing.JPanel();
        jButton81 = new javax.swing.JButton();
        jPanel105 = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        jPanel106 = new javax.swing.JPanel();
        jButton82 = new javax.swing.JButton();
        jPanel107 = new javax.swing.JPanel();
        jButton83 = new javax.swing.JButton();
        jPanel108 = new javax.swing.JPanel();
        jButton84 = new javax.swing.JButton();
        jPanel109 = new javax.swing.JPanel();
        jButton85 = new javax.swing.JButton();
        jPanel110 = new javax.swing.JPanel();
        jButton86 = new javax.swing.JButton();
        jPanel111 = new javax.swing.JPanel();
        jButton87 = new javax.swing.JButton();
        jPanel112 = new javax.swing.JPanel();
        jButton88 = new javax.swing.JButton();
        jPanel113 = new javax.swing.JPanel();
        jButton89 = new javax.swing.JButton();
        jPanel114 = new javax.swing.JPanel();
        jButton90 = new javax.swing.JButton();
        jPanel115 = new javax.swing.JPanel();
        jButton91 = new javax.swing.JButton();
        jPanel116 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jPanel117 = new javax.swing.JPanel();
        jButton92 = new javax.swing.JButton();
        jPanel118 = new javax.swing.JPanel();
        jButton93 = new javax.swing.JButton();
        jPanel119 = new javax.swing.JPanel();
        jButton94 = new javax.swing.JButton();
        jPanel120 = new javax.swing.JPanel();
        jButton95 = new javax.swing.JButton();
        jPanel121 = new javax.swing.JPanel();
        jButton96 = new javax.swing.JButton();
        jPanel122 = new javax.swing.JPanel();
        jButton97 = new javax.swing.JButton();
        jPanel123 = new javax.swing.JPanel();
        jButton98 = new javax.swing.JButton();
        jPanel124 = new javax.swing.JPanel();
        jButton99 = new javax.swing.JButton();
        jPanel125 = new javax.swing.JPanel();
        jButton100 = new javax.swing.JButton();
        jPanel126 = new javax.swing.JPanel();
        jButton55 = new javax.swing.JButton();
        jPanel127 = new javax.swing.JPanel();
        jButton106 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        jButton108 = new javax.swing.JButton();
        jButton109 = new javax.swing.JButton();
        jButton110 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccion de Posiciones");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jPanel3.setLayout(new java.awt.GridLayout(11, 11, 2, 2));

        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton101.setText("Salir");
        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton101ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton101, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("1");
        jPanel7.add(jLabel104, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("2");
        jPanel8.add(jLabel105, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel8);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("3");
        jPanel9.add(jLabel106, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel9);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("4");
        jPanel10.add(jLabel107, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel10);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("5");
        jPanel11.add(jLabel108, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel11);

        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setText("6");
        jPanel12.add(jLabel109, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel12);

        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setText("7");
        jPanel13.add(jLabel110, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel13);

        jPanel14.setLayout(new java.awt.BorderLayout());

        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("8");
        jPanel14.add(jLabel111, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel14);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setText("9");
        jPanel15.add(jLabel112, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel15);

        jPanel16.setLayout(new java.awt.BorderLayout());

        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel113.setText("10");
        jPanel16.add(jLabel113, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel16);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("A");
        jPanel17.add(jLabel115, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel17);

        jPanel18.setLayout(new java.awt.BorderLayout());

        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel18);

        jPanel19.setLayout(new java.awt.BorderLayout());

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel19);

        jPanel20.setLayout(new java.awt.BorderLayout());

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel20);

        jPanel21.setLayout(new java.awt.BorderLayout());

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel21);

        jPanel22.setLayout(new java.awt.BorderLayout());

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel22);

        jPanel23.setLayout(new java.awt.BorderLayout());

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel23);

        jPanel24.setLayout(new java.awt.BorderLayout());

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel24);

        jPanel25.setLayout(new java.awt.BorderLayout());

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel25);

        jPanel26.setLayout(new java.awt.BorderLayout());

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel26);

        jPanel27.setLayout(new java.awt.BorderLayout());

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel27.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel27);

        jPanel28.setLayout(new java.awt.BorderLayout());

        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText("B");
        jPanel28.add(jLabel114, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel28);

        jPanel29.setLayout(new java.awt.BorderLayout());

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel29.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel29);

        jPanel30.setLayout(new java.awt.BorderLayout());

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton13, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel30);

        jPanel31.setLayout(new java.awt.BorderLayout());

        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel31.add(jButton14, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel31);

        jPanel32.setLayout(new java.awt.BorderLayout());

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton15, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel32);

        jPanel33.setLayout(new java.awt.BorderLayout());

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel33.add(jButton12, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel33);

        jPanel34.setLayout(new java.awt.BorderLayout());

        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel34.add(jButton16, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel34);

        jPanel35.setLayout(new java.awt.BorderLayout());

        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel35.add(jButton17, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel35);

        jPanel36.setLayout(new java.awt.BorderLayout());

        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel36.add(jButton18, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel36);

        jPanel37.setLayout(new java.awt.BorderLayout());

        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel37.add(jButton19, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel37);

        jPanel38.setLayout(new java.awt.BorderLayout());

        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel38.add(jButton20, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel38);

        jPanel39.setLayout(new java.awt.BorderLayout());

        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("C");
        jPanel39.add(jLabel116, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel39);

        jPanel40.setLayout(new java.awt.BorderLayout());

        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel40.add(jButton21, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel40);

        jPanel41.setLayout(new java.awt.BorderLayout());

        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel41.add(jButton22, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel41);

        jPanel42.setLayout(new java.awt.BorderLayout());

        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel42.add(jButton23, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel42);

        jPanel43.setLayout(new java.awt.BorderLayout());

        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel43.add(jButton24, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel43);

        jPanel44.setLayout(new java.awt.BorderLayout());

        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel44.add(jButton25, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel44);

        jPanel45.setLayout(new java.awt.BorderLayout());

        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel45.add(jButton26, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel45);

        jPanel46.setLayout(new java.awt.BorderLayout());

        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel46.add(jButton27, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel46);

        jPanel47.setLayout(new java.awt.BorderLayout());

        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel47.add(jButton28, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel47);

        jPanel48.setLayout(new java.awt.BorderLayout());

        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel48.add(jButton29, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel48);

        jPanel49.setLayout(new java.awt.BorderLayout());

        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel49.add(jButton31, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel49);

        jPanel50.setLayout(new java.awt.BorderLayout());

        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("D");
        jPanel50.add(jLabel117, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel50);

        jPanel51.setLayout(new java.awt.BorderLayout());

        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel51.add(jButton32, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel51);

        jPanel52.setLayout(new java.awt.BorderLayout());

        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel52.add(jButton33, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel52);

        jPanel53.setLayout(new java.awt.BorderLayout());

        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel53.add(jButton34, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel53);

        jPanel54.setLayout(new java.awt.BorderLayout());

        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel54.add(jButton35, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel54);

        jPanel55.setLayout(new java.awt.BorderLayout());

        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel55.add(jButton37, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel55);

        jPanel56.setLayout(new java.awt.BorderLayout());

        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel56.add(jButton36, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel56);

        jPanel57.setLayout(new java.awt.BorderLayout());

        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel57.add(jButton38, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel57);

        jPanel58.setLayout(new java.awt.BorderLayout());

        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel58.add(jButton39, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel58);

        jPanel59.setLayout(new java.awt.BorderLayout());

        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel59.add(jButton40, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel59);

        jPanel60.setLayout(new java.awt.BorderLayout());

        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel60.add(jButton41, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel60);

        jPanel61.setLayout(new java.awt.BorderLayout());

        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel118.setText("E");
        jPanel61.add(jLabel118, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel61);

        jPanel62.setLayout(new java.awt.BorderLayout());
        jPanel62.add(jButton42, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel62);

        jPanel63.setLayout(new java.awt.BorderLayout());
        jPanel63.add(jButton43, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel63);

        jPanel64.setLayout(new java.awt.BorderLayout());
        jPanel64.add(jButton44, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel64);

        jPanel65.setLayout(new java.awt.BorderLayout());
        jPanel65.add(jButton45, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel65);

        jPanel66.setLayout(new java.awt.BorderLayout());
        jPanel66.add(jButton46, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel66);

        jPanel67.setLayout(new java.awt.BorderLayout());
        jPanel67.add(jButton47, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel67);

        jPanel68.setLayout(new java.awt.BorderLayout());
        jPanel68.add(jButton48, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel68);

        jPanel69.setLayout(new java.awt.BorderLayout());
        jPanel69.add(jButton49, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel69);

        jPanel70.setLayout(new java.awt.BorderLayout());
        jPanel70.add(jButton50, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel70);

        jPanel71.setLayout(new java.awt.BorderLayout());
        jPanel71.add(jButton51, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel71);

        jPanel72.setLayout(new java.awt.BorderLayout());

        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel119.setText("F");
        jPanel72.add(jLabel119, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel72);

        jPanel73.setLayout(new java.awt.BorderLayout());
        jPanel73.add(jButton52, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel73);

        jPanel74.setLayout(new java.awt.BorderLayout());
        jPanel74.add(jButton53, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel74);

        jPanel75.setLayout(new java.awt.BorderLayout());
        jPanel75.add(jButton54, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel75);

        jPanel76.setLayout(new java.awt.BorderLayout());
        jPanel76.add(jButton56, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel76);

        jPanel77.setLayout(new java.awt.BorderLayout());
        jPanel77.add(jButton57, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel77);

        jPanel78.setLayout(new java.awt.BorderLayout());
        jPanel78.add(jButton30, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel78);

        jPanel79.setLayout(new java.awt.BorderLayout());
        jPanel79.add(jButton58, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel79);

        jPanel80.setLayout(new java.awt.BorderLayout());
        jPanel80.add(jButton59, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel80);

        jPanel81.setLayout(new java.awt.BorderLayout());
        jPanel81.add(jButton60, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel81);

        jPanel82.setLayout(new java.awt.BorderLayout());
        jPanel82.add(jButton61, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel82);

        jPanel83.setLayout(new java.awt.BorderLayout());

        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel120.setText("G");
        jPanel83.add(jLabel120, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel83);

        jPanel84.setLayout(new java.awt.BorderLayout());
        jPanel84.add(jButton62, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel84);

        jPanel85.setLayout(new java.awt.BorderLayout());
        jPanel85.add(jButton63, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel85);

        jPanel86.setLayout(new java.awt.BorderLayout());
        jPanel86.add(jButton64, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel86);

        jPanel87.setLayout(new java.awt.BorderLayout());
        jPanel87.add(jButton65, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel87);

        jPanel88.setLayout(new java.awt.BorderLayout());
        jPanel88.add(jButton67, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel88);

        jPanel89.setLayout(new java.awt.BorderLayout());
        jPanel89.add(jButton66, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel89);

        jPanel90.setLayout(new java.awt.BorderLayout());
        jPanel90.add(jButton68, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel90);

        jPanel91.setLayout(new java.awt.BorderLayout());
        jPanel91.add(jButton69, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel91);

        jPanel92.setLayout(new java.awt.BorderLayout());
        jPanel92.add(jButton70, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel92);

        jPanel93.setLayout(new java.awt.BorderLayout());
        jPanel93.add(jButton71, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel93);

        jPanel94.setLayout(new java.awt.BorderLayout());

        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel121.setText("H");
        jPanel94.add(jLabel121, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel94);

        jPanel95.setLayout(new java.awt.BorderLayout());
        jPanel95.add(jButton72, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel95);

        jPanel96.setLayout(new java.awt.BorderLayout());
        jPanel96.add(jButton73, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel96);

        jPanel97.setLayout(new java.awt.BorderLayout());
        jPanel97.add(jButton74, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel97);

        jPanel98.setLayout(new java.awt.BorderLayout());
        jPanel98.add(jButton75, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel98);

        jPanel99.setLayout(new java.awt.BorderLayout());
        jPanel99.add(jButton76, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel99);

        jPanel100.setLayout(new java.awt.BorderLayout());
        jPanel100.add(jButton77, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel100);

        jPanel101.setLayout(new java.awt.BorderLayout());
        jPanel101.add(jButton78, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel101);

        jPanel102.setLayout(new java.awt.BorderLayout());
        jPanel102.add(jButton79, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel102);

        jPanel103.setLayout(new java.awt.BorderLayout());
        jPanel103.add(jButton80, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel103);

        jPanel104.setLayout(new java.awt.BorderLayout());
        jPanel104.add(jButton81, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel104);

        jPanel105.setLayout(new java.awt.BorderLayout());

        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel122.setText("I");
        jPanel105.add(jLabel122, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel105);

        jPanel106.setLayout(new java.awt.BorderLayout());
        jPanel106.add(jButton82, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel106);

        jPanel107.setLayout(new java.awt.BorderLayout());
        jPanel107.add(jButton83, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel107);

        jPanel108.setLayout(new java.awt.BorderLayout());
        jPanel108.add(jButton84, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel108);

        jPanel109.setLayout(new java.awt.BorderLayout());
        jPanel109.add(jButton85, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel109);

        jPanel110.setLayout(new java.awt.BorderLayout());
        jPanel110.add(jButton86, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel110);

        jPanel111.setLayout(new java.awt.BorderLayout());
        jPanel111.add(jButton87, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel111);

        jPanel112.setLayout(new java.awt.BorderLayout());
        jPanel112.add(jButton88, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel112);

        jPanel113.setLayout(new java.awt.BorderLayout());
        jPanel113.add(jButton89, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel113);

        jPanel114.setLayout(new java.awt.BorderLayout());
        jPanel114.add(jButton90, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel114);

        jPanel115.setLayout(new java.awt.BorderLayout());
        jPanel115.add(jButton91, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel115);

        jPanel116.setLayout(new java.awt.BorderLayout());

        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("J");
        jPanel116.add(jLabel102, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel116);

        jPanel117.setLayout(new java.awt.BorderLayout());
        jPanel117.add(jButton92, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel117);

        jPanel118.setLayout(new java.awt.BorderLayout());
        jPanel118.add(jButton93, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel118);

        jPanel119.setLayout(new java.awt.BorderLayout());

        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });
        jPanel119.add(jButton94, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel119);

        jPanel120.setLayout(new java.awt.BorderLayout());

        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });
        jPanel120.add(jButton95, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel120);

        jPanel121.setLayout(new java.awt.BorderLayout());
        jPanel121.add(jButton96, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel121);

        jPanel122.setLayout(new java.awt.BorderLayout());
        jPanel122.add(jButton97, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel122);

        jPanel123.setLayout(new java.awt.BorderLayout());
        jPanel123.add(jButton98, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel123);

        jPanel124.setLayout(new java.awt.BorderLayout());
        jPanel124.add(jButton99, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel124);

        jPanel125.setLayout(new java.awt.BorderLayout());
        jPanel125.add(jButton100, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel125);

        jPanel126.setLayout(new java.awt.BorderLayout());
        jPanel126.add(jButton55, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel126);

        jButton106.setText("Fragata");
        jButton106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton106ActionPerformed(evt);
            }
        });

        jButton107.setText("Acorazado");
        jButton107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton107ActionPerformed(evt);
            }
        });

        jButton108.setText("Destructor");
        jButton108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton108ActionPerformed(evt);
            }
        });

        jButton109.setText("Submarino");
        jButton109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton109ActionPerformed(evt);
            }
        });

        jButton110.setText("Confirmar");
        jButton110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton110ActionPerformed(evt);
            }
        });

        jButton111.setText("Cancelar");
        jButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton111ActionPerformed(evt);
            }
        });

        jButton112.setText("Girar");
        jButton112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton112ActionPerformed(evt);
            }
        });

        jButton113.setText("Iniciar");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡Posiciona tus barcos!");

        javax.swing.GroupLayout jPanel127Layout = new javax.swing.GroupLayout(jPanel127);
        jPanel127.setLayout(jPanel127Layout);
        jPanel127Layout.setHorizontalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel127Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel127Layout.createSequentialGroup()
                        .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel127Layout.createSequentialGroup()
                                .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton109, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel127Layout.createSequentialGroup()
                                .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68))
        );
        jPanel127Layout.setVerticalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel127Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel127, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel127, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton106ActionPerformed(java.awt.event.ActionEvent evt) {controlador.seleccionarFragata();}

    private void jButton108ActionPerformed(java.awt.event.ActionEvent evt) {controlador.seleccionarDestructor();}

    private void jButton109ActionPerformed(java.awt.event.ActionEvent evt) {controlador.seleccionarSubmarino();}

    private void jButton107ActionPerformed(java.awt.event.ActionEvent evt) {controlador.seleccionarAcorazado();}

    private void jButton110ActionPerformed(java.awt.event.ActionEvent evt) {controlador.confirmarPosicion();}

    private void jButton111ActionPerformed(java.awt.event.ActionEvent evt) {controlador.cancelarPosicion();}

    private void jButton112ActionPerformed(java.awt.event.ActionEvent evt) {controlador.girar();}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {controlador.posicionar(0, 0);}

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {controlador.posicionar(0, 1);}

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {controlador.posicionar(0, 2);}

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {controlador.posicionar(0, 3);}

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {controlador.posicionar(0, 4);}

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {controlador.posicionar(0, 5);}

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {controlador.posicionar(0, 6);}

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {controlador.posicionar(0, 7);}

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {controlador.posicionar(0, 8);}

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {controlador.posicionar(0, 9);}

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {controlador.posicionar(1, 0);}

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {controlador.posicionar(1, 1);}

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {controlador.posicionar(1, 2);}

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {controlador.posicionar(1, 3);}

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        controlador.posicionar(1, 4);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        controlador.posicionar(1, 5);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        controlador.posicionar(1, 6);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        controlador.posicionar(1, 7);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        controlador.posicionar(1, 8);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        controlador.posicionar(1, 9);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        controlador.posicionar(2, 0);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        controlador.posicionar(2, 1);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        controlador.posicionar(2, 2);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        controlador.posicionar(2, 3);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        controlador.posicionar(2, 4);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        controlador.posicionar(2, 5);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        controlador.posicionar(2, 6);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        controlador.posicionar(2, 7);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        controlador.posicionar(2, 8);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {
        controlador.posicionar(2, 9);
    }

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        controlador.posicionar(3, 0);
    }//GEN-LAST:event_jButton32ActionPerformed

    
    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirma si queres salir", "Batalla Naval", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        controlador.posicionar(3, 1);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        controlador.posicionar(3, 2);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        controlador.posicionar(3, 3);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        controlador.posicionar(3, 4);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        controlador.posicionar(3, 5);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        controlador.posicionar(3, 6);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        controlador.posicionar(3, 7);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        controlador.posicionar(3, 8);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        controlador.posicionar(3, 9);
    }//GEN-LAST:event_jButton41ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VistaSeleccionDePosiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VistaSeleccionDePosiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VistaSeleccionDePosiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VistaSeleccionDePosiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaSeleccionDePosiciones().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton108;
    private javax.swing.JButton jButton109;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton110;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    // End of variables declaration//GEN-END:variables
}
