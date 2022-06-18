/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.vista;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import src.controlador.CtrJuegoNormal;
import src.jugador;

/**
 *
 * @author f_acu
 */
public class Tablero extends javax.swing.JFrame implements Vista {

    private jugador player = new jugador();
    private static CtrJuegoNormal control;
    boolean result = false;

    public Tablero() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.control = new CtrJuegoNormal();
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
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
        btn1 = new javax.swing.JToggleButton();
        jPanel19 = new javax.swing.JPanel();
        btn2 = new javax.swing.JToggleButton();
        jPanel20 = new javax.swing.JPanel();
        btn3 = new javax.swing.JToggleButton();
        jPanel21 = new javax.swing.JPanel();
        btn4 = new javax.swing.JToggleButton();
        jPanel22 = new javax.swing.JPanel();
        btn5 = new javax.swing.JToggleButton();
        jPanel23 = new javax.swing.JPanel();
        btn6 = new javax.swing.JToggleButton();
        jPanel24 = new javax.swing.JPanel();
        btn7 = new javax.swing.JToggleButton();
        jPanel25 = new javax.swing.JPanel();
        btn8 = new javax.swing.JToggleButton();
        jPanel26 = new javax.swing.JPanel();
        btn9 = new javax.swing.JToggleButton();
        jPanel27 = new javax.swing.JPanel();
        btn10 = new javax.swing.JToggleButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        btn11 = new javax.swing.JToggleButton();
        jPanel30 = new javax.swing.JPanel();
        btn12 = new javax.swing.JToggleButton();
        jPanel31 = new javax.swing.JPanel();
        btn13 = new javax.swing.JToggleButton();
        jPanel32 = new javax.swing.JPanel();
        btn14 = new javax.swing.JToggleButton();
        jPanel33 = new javax.swing.JPanel();
        btn15 = new javax.swing.JToggleButton();
        jPanel34 = new javax.swing.JPanel();
        btn16 = new javax.swing.JToggleButton();
        jPanel35 = new javax.swing.JPanel();
        btn17 = new javax.swing.JToggleButton();
        jPanel36 = new javax.swing.JPanel();
        btn18 = new javax.swing.JToggleButton();
        jPanel37 = new javax.swing.JPanel();
        btn19 = new javax.swing.JToggleButton();
        jPanel38 = new javax.swing.JPanel();
        btn20 = new javax.swing.JToggleButton();
        jPanel39 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        btn21 = new javax.swing.JToggleButton();
        jPanel41 = new javax.swing.JPanel();
        btn22 = new javax.swing.JToggleButton();
        jPanel42 = new javax.swing.JPanel();
        btn23 = new javax.swing.JToggleButton();
        jPanel43 = new javax.swing.JPanel();
        btn24 = new javax.swing.JToggleButton();
        jPanel44 = new javax.swing.JPanel();
        btn25 = new javax.swing.JToggleButton();
        jPanel45 = new javax.swing.JPanel();
        btn26 = new javax.swing.JToggleButton();
        jPanel46 = new javax.swing.JPanel();
        btn27 = new javax.swing.JToggleButton();
        jPanel47 = new javax.swing.JPanel();
        btn28 = new javax.swing.JToggleButton();
        jPanel48 = new javax.swing.JPanel();
        btn29 = new javax.swing.JToggleButton();
        jPanel49 = new javax.swing.JPanel();
        btn30 = new javax.swing.JToggleButton();
        jPanel50 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        btn31 = new javax.swing.JToggleButton();
        jPanel52 = new javax.swing.JPanel();
        btn32 = new javax.swing.JToggleButton();
        jPanel53 = new javax.swing.JPanel();
        btn33 = new javax.swing.JToggleButton();
        jPanel54 = new javax.swing.JPanel();
        btn34 = new javax.swing.JToggleButton();
        jPanel55 = new javax.swing.JPanel();
        btn35 = new javax.swing.JToggleButton();
        jPanel56 = new javax.swing.JPanel();
        btn36 = new javax.swing.JToggleButton();
        jPanel57 = new javax.swing.JPanel();
        btn37 = new javax.swing.JToggleButton();
        jPanel58 = new javax.swing.JPanel();
        btn38 = new javax.swing.JToggleButton();
        jPanel59 = new javax.swing.JPanel();
        btn39 = new javax.swing.JToggleButton();
        jPanel60 = new javax.swing.JPanel();
        btn40 = new javax.swing.JToggleButton();
        jPanel61 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        btn41 = new javax.swing.JToggleButton();
        jPanel63 = new javax.swing.JPanel();
        btn42 = new javax.swing.JToggleButton();
        jPanel64 = new javax.swing.JPanel();
        btn43 = new javax.swing.JToggleButton();
        jPanel65 = new javax.swing.JPanel();
        btn44 = new javax.swing.JToggleButton();
        jPanel66 = new javax.swing.JPanel();
        btn45 = new javax.swing.JToggleButton();
        jPanel67 = new javax.swing.JPanel();
        btn46 = new javax.swing.JToggleButton();
        jPanel68 = new javax.swing.JPanel();
        btn47 = new javax.swing.JToggleButton();
        jPanel69 = new javax.swing.JPanel();
        btn48 = new javax.swing.JToggleButton();
        jPanel70 = new javax.swing.JPanel();
        btn49 = new javax.swing.JToggleButton();
        jPanel71 = new javax.swing.JPanel();
        btn50 = new javax.swing.JToggleButton();
        jPanel72 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        btn51 = new javax.swing.JToggleButton();
        jPanel74 = new javax.swing.JPanel();
        btn52 = new javax.swing.JToggleButton();
        jPanel75 = new javax.swing.JPanel();
        btn53 = new javax.swing.JToggleButton();
        jPanel76 = new javax.swing.JPanel();
        btn54 = new javax.swing.JToggleButton();
        jPanel77 = new javax.swing.JPanel();
        btn55 = new javax.swing.JToggleButton();
        jPanel78 = new javax.swing.JPanel();
        btn56 = new javax.swing.JToggleButton();
        jPanel79 = new javax.swing.JPanel();
        btn57 = new javax.swing.JToggleButton();
        jPanel80 = new javax.swing.JPanel();
        btn58 = new javax.swing.JToggleButton();
        jPanel81 = new javax.swing.JPanel();
        btn59 = new javax.swing.JToggleButton();
        jPanel82 = new javax.swing.JPanel();
        btn60 = new javax.swing.JToggleButton();
        jPanel83 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jPanel84 = new javax.swing.JPanel();
        btn61 = new javax.swing.JToggleButton();
        jPanel85 = new javax.swing.JPanel();
        btn62 = new javax.swing.JToggleButton();
        jPanel86 = new javax.swing.JPanel();
        btn63 = new javax.swing.JToggleButton();
        jPanel87 = new javax.swing.JPanel();
        btn64 = new javax.swing.JToggleButton();
        jPanel88 = new javax.swing.JPanel();
        btn65 = new javax.swing.JToggleButton();
        jPanel89 = new javax.swing.JPanel();
        btn66 = new javax.swing.JToggleButton();
        jPanel90 = new javax.swing.JPanel();
        btn67 = new javax.swing.JToggleButton();
        jPanel91 = new javax.swing.JPanel();
        btn68 = new javax.swing.JToggleButton();
        jPanel92 = new javax.swing.JPanel();
        btn69 = new javax.swing.JToggleButton();
        jPanel93 = new javax.swing.JPanel();
        btn70 = new javax.swing.JToggleButton();
        jPanel94 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jPanel95 = new javax.swing.JPanel();
        btn71 = new javax.swing.JToggleButton();
        jPanel96 = new javax.swing.JPanel();
        btn72 = new javax.swing.JToggleButton();
        jPanel97 = new javax.swing.JPanel();
        btn73 = new javax.swing.JToggleButton();
        jPanel98 = new javax.swing.JPanel();
        btn74 = new javax.swing.JToggleButton();
        jPanel99 = new javax.swing.JPanel();
        btn75 = new javax.swing.JToggleButton();
        jPanel100 = new javax.swing.JPanel();
        btn76 = new javax.swing.JToggleButton();
        jPanel101 = new javax.swing.JPanel();
        btn77 = new javax.swing.JToggleButton();
        jPanel102 = new javax.swing.JPanel();
        btn78 = new javax.swing.JToggleButton();
        jPanel103 = new javax.swing.JPanel();
        btn79 = new javax.swing.JToggleButton();
        jPanel104 = new javax.swing.JPanel();
        btn80 = new javax.swing.JToggleButton();
        jPanel105 = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        jPanel106 = new javax.swing.JPanel();
        btn81 = new javax.swing.JToggleButton();
        jPanel107 = new javax.swing.JPanel();
        btn82 = new javax.swing.JToggleButton();
        jPanel108 = new javax.swing.JPanel();
        btn83 = new javax.swing.JToggleButton();
        jPanel109 = new javax.swing.JPanel();
        btn84 = new javax.swing.JToggleButton();
        jPanel110 = new javax.swing.JPanel();
        btn85 = new javax.swing.JToggleButton();
        jPanel111 = new javax.swing.JPanel();
        btn86 = new javax.swing.JToggleButton();
        jPanel112 = new javax.swing.JPanel();
        btn87 = new javax.swing.JToggleButton();
        jPanel113 = new javax.swing.JPanel();
        btn88 = new javax.swing.JToggleButton();
        jPanel114 = new javax.swing.JPanel();
        btn89 = new javax.swing.JToggleButton();
        jPanel115 = new javax.swing.JPanel();
        btn90 = new javax.swing.JToggleButton();
        jPanel116 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jPanel117 = new javax.swing.JPanel();
        btn91 = new javax.swing.JToggleButton();
        jPanel118 = new javax.swing.JPanel();
        btn92 = new javax.swing.JToggleButton();
        jPanel119 = new javax.swing.JPanel();
        btn93 = new javax.swing.JToggleButton();
        jPanel120 = new javax.swing.JPanel();
        btn94 = new javax.swing.JToggleButton();
        jPanel121 = new javax.swing.JPanel();
        btn95 = new javax.swing.JToggleButton();
        jPanel122 = new javax.swing.JPanel();
        btn96 = new javax.swing.JToggleButton();
        jPanel123 = new javax.swing.JPanel();
        btn97 = new javax.swing.JToggleButton();
        jPanel124 = new javax.swing.JPanel();
        btn98 = new javax.swing.JToggleButton();
        jPanel125 = new javax.swing.JPanel();
        btn99 = new javax.swing.JToggleButton();
        jPanel126 = new javax.swing.JPanel();
        btn100 = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel127 = new javax.swing.JPanel();
        jPanel128 = new javax.swing.JPanel();
        jPanel129 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jPanel130 = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        jPanel131 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        jPanel132 = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jPanel133 = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        jPanel134 = new javax.swing.JPanel();
        jLabel128 = new javax.swing.JLabel();
        jPanel135 = new javax.swing.JPanel();
        jLabel129 = new javax.swing.JLabel();
        jPanel136 = new javax.swing.JPanel();
        jLabel130 = new javax.swing.JLabel();
        jPanel137 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        jPanel138 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jPanel139 = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        jPanel140 = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        jPanel141 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel142 = new javax.swing.JPanel();
        jPanel143 = new javax.swing.JPanel();
        jPanel144 = new javax.swing.JPanel();
        jPanel145 = new javax.swing.JPanel();
        jPanel146 = new javax.swing.JPanel();
        jPanel147 = new javax.swing.JPanel();
        jPanel148 = new javax.swing.JPanel();
        jPanel149 = new javax.swing.JPanel();
        jPanel150 = new javax.swing.JPanel();
        jPanel151 = new javax.swing.JPanel();
        jLabel135 = new javax.swing.JLabel();
        jPanel152 = new javax.swing.JPanel();
        jButton113 = new javax.swing.JButton();
        jPanel153 = new javax.swing.JPanel();
        jButton114 = new javax.swing.JButton();
        jPanel154 = new javax.swing.JPanel();
        jButton115 = new javax.swing.JButton();
        jPanel155 = new javax.swing.JPanel();
        jButton116 = new javax.swing.JButton();
        jPanel156 = new javax.swing.JPanel();
        jButton117 = new javax.swing.JButton();
        jPanel157 = new javax.swing.JPanel();
        jButton118 = new javax.swing.JButton();
        jPanel158 = new javax.swing.JPanel();
        jButton119 = new javax.swing.JButton();
        jPanel159 = new javax.swing.JPanel();
        jButton120 = new javax.swing.JButton();
        jPanel160 = new javax.swing.JPanel();
        jButton121 = new javax.swing.JButton();
        jPanel161 = new javax.swing.JPanel();
        jButton122 = new javax.swing.JButton();
        jPanel162 = new javax.swing.JPanel();
        jLabel136 = new javax.swing.JLabel();
        jPanel163 = new javax.swing.JPanel();
        jButton123 = new javax.swing.JButton();
        jPanel164 = new javax.swing.JPanel();
        jButton124 = new javax.swing.JButton();
        jPanel165 = new javax.swing.JPanel();
        jButton125 = new javax.swing.JButton();
        jPanel166 = new javax.swing.JPanel();
        jButton126 = new javax.swing.JButton();
        jPanel167 = new javax.swing.JPanel();
        jButton127 = new javax.swing.JButton();
        jPanel168 = new javax.swing.JPanel();
        jButton128 = new javax.swing.JButton();
        jPanel169 = new javax.swing.JPanel();
        jButton129 = new javax.swing.JButton();
        jPanel170 = new javax.swing.JPanel();
        jButton130 = new javax.swing.JButton();
        jPanel171 = new javax.swing.JPanel();
        jButton131 = new javax.swing.JButton();
        jPanel172 = new javax.swing.JPanel();
        jButton132 = new javax.swing.JButton();
        jPanel173 = new javax.swing.JPanel();
        jLabel137 = new javax.swing.JLabel();
        jPanel174 = new javax.swing.JPanel();
        jButton133 = new javax.swing.JButton();
        jPanel175 = new javax.swing.JPanel();
        jButton134 = new javax.swing.JButton();
        jPanel176 = new javax.swing.JPanel();
        jButton135 = new javax.swing.JButton();
        jPanel177 = new javax.swing.JPanel();
        jButton136 = new javax.swing.JButton();
        jPanel178 = new javax.swing.JPanel();
        jButton137 = new javax.swing.JButton();
        jPanel179 = new javax.swing.JPanel();
        jButton138 = new javax.swing.JButton();
        jPanel180 = new javax.swing.JPanel();
        jButton139 = new javax.swing.JButton();
        jPanel181 = new javax.swing.JPanel();
        jButton140 = new javax.swing.JButton();
        jPanel182 = new javax.swing.JPanel();
        jButton141 = new javax.swing.JButton();
        jPanel183 = new javax.swing.JPanel();
        jButton142 = new javax.swing.JButton();
        jPanel184 = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        jPanel185 = new javax.swing.JPanel();
        jButton143 = new javax.swing.JButton();
        jPanel186 = new javax.swing.JPanel();
        jButton144 = new javax.swing.JButton();
        jPanel187 = new javax.swing.JPanel();
        jButton145 = new javax.swing.JButton();
        jPanel188 = new javax.swing.JPanel();
        jButton146 = new javax.swing.JButton();
        jPanel189 = new javax.swing.JPanel();
        jButton147 = new javax.swing.JButton();
        jPanel190 = new javax.swing.JPanel();
        jButton148 = new javax.swing.JButton();
        jPanel191 = new javax.swing.JPanel();
        jButton149 = new javax.swing.JButton();
        jPanel192 = new javax.swing.JPanel();
        jButton150 = new javax.swing.JButton();
        jPanel193 = new javax.swing.JPanel();
        jButton151 = new javax.swing.JButton();
        jPanel194 = new javax.swing.JPanel();
        jButton152 = new javax.swing.JButton();
        jPanel195 = new javax.swing.JPanel();
        jLabel139 = new javax.swing.JLabel();
        jPanel196 = new javax.swing.JPanel();
        jButton153 = new javax.swing.JButton();
        jPanel197 = new javax.swing.JPanel();
        jButton154 = new javax.swing.JButton();
        jPanel198 = new javax.swing.JPanel();
        jButton155 = new javax.swing.JButton();
        jPanel199 = new javax.swing.JPanel();
        jButton156 = new javax.swing.JButton();
        jPanel200 = new javax.swing.JPanel();
        jButton157 = new javax.swing.JButton();
        jPanel201 = new javax.swing.JPanel();
        jButton158 = new javax.swing.JButton();
        jPanel202 = new javax.swing.JPanel();
        jButton159 = new javax.swing.JButton();
        jPanel203 = new javax.swing.JPanel();
        jButton160 = new javax.swing.JButton();
        jPanel204 = new javax.swing.JPanel();
        jButton161 = new javax.swing.JButton();
        jPanel205 = new javax.swing.JPanel();
        jButton162 = new javax.swing.JButton();
        jPanel206 = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        jPanel207 = new javax.swing.JPanel();
        jButton163 = new javax.swing.JButton();
        jPanel208 = new javax.swing.JPanel();
        jButton164 = new javax.swing.JButton();
        jPanel209 = new javax.swing.JPanel();
        jButton165 = new javax.swing.JButton();
        jPanel210 = new javax.swing.JPanel();
        jButton166 = new javax.swing.JButton();
        jPanel211 = new javax.swing.JPanel();
        jButton167 = new javax.swing.JButton();
        jPanel212 = new javax.swing.JPanel();
        jButton168 = new javax.swing.JButton();
        jPanel213 = new javax.swing.JPanel();
        jButton169 = new javax.swing.JButton();
        jPanel214 = new javax.swing.JPanel();
        jButton170 = new javax.swing.JButton();
        jPanel215 = new javax.swing.JPanel();
        jButton171 = new javax.swing.JButton();
        jPanel216 = new javax.swing.JPanel();
        jButton172 = new javax.swing.JButton();
        jPanel217 = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        jPanel218 = new javax.swing.JPanel();
        jButton173 = new javax.swing.JButton();
        jPanel219 = new javax.swing.JPanel();
        jButton174 = new javax.swing.JButton();
        jPanel220 = new javax.swing.JPanel();
        jButton175 = new javax.swing.JButton();
        jPanel221 = new javax.swing.JPanel();
        jButton176 = new javax.swing.JButton();
        jPanel222 = new javax.swing.JPanel();
        jButton177 = new javax.swing.JButton();
        jPanel223 = new javax.swing.JPanel();
        jButton178 = new javax.swing.JButton();
        jPanel224 = new javax.swing.JPanel();
        jButton179 = new javax.swing.JButton();
        jPanel225 = new javax.swing.JPanel();
        jButton180 = new javax.swing.JButton();
        jPanel226 = new javax.swing.JPanel();
        jButton181 = new javax.swing.JButton();
        jPanel227 = new javax.swing.JPanel();
        jButton182 = new javax.swing.JButton();
        jPanel228 = new javax.swing.JPanel();
        jLabel142 = new javax.swing.JLabel();
        jPanel229 = new javax.swing.JPanel();
        jButton183 = new javax.swing.JButton();
        jPanel230 = new javax.swing.JPanel();
        jButton184 = new javax.swing.JButton();
        jPanel231 = new javax.swing.JPanel();
        jButton185 = new javax.swing.JButton();
        jPanel232 = new javax.swing.JPanel();
        jButton186 = new javax.swing.JButton();
        jPanel233 = new javax.swing.JPanel();
        jButton187 = new javax.swing.JButton();
        jPanel234 = new javax.swing.JPanel();
        jButton188 = new javax.swing.JButton();
        jPanel235 = new javax.swing.JPanel();
        jButton189 = new javax.swing.JButton();
        jPanel236 = new javax.swing.JPanel();
        jButton190 = new javax.swing.JButton();
        jPanel237 = new javax.swing.JPanel();
        jButton191 = new javax.swing.JButton();
        jPanel238 = new javax.swing.JPanel();
        jButton192 = new javax.swing.JButton();
        jPanel239 = new javax.swing.JPanel();
        jLabel143 = new javax.swing.JLabel();
        jPanel240 = new javax.swing.JPanel();
        jButton193 = new javax.swing.JButton();
        jPanel241 = new javax.swing.JPanel();
        jButton194 = new javax.swing.JButton();
        jPanel242 = new javax.swing.JPanel();
        jButton195 = new javax.swing.JButton();
        jPanel243 = new javax.swing.JPanel();
        jButton196 = new javax.swing.JButton();
        jPanel244 = new javax.swing.JPanel();
        jButton197 = new javax.swing.JButton();
        jPanel245 = new javax.swing.JPanel();
        jButton198 = new javax.swing.JButton();
        jPanel246 = new javax.swing.JPanel();
        jButton199 = new javax.swing.JButton();
        jPanel247 = new javax.swing.JPanel();
        jButton200 = new javax.swing.JButton();
        jPanel248 = new javax.swing.JPanel();
        jButton201 = new javax.swing.JButton();
        jPanel249 = new javax.swing.JPanel();
        jButton202 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Batalla Naval");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setLayout(new java.awt.GridLayout(11, 11, 2, 2));

        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton101.setText("Salir");
        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton101ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton101, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("1");
        jPanel7.add(jLabel104, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel7);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("2");
        jPanel8.add(jLabel105, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel8);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("3");
        jPanel9.add(jLabel106, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel9);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("4");
        jPanel10.add(jLabel107, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel10);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("5");
        jPanel11.add(jLabel108, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel11);

        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setText("6");
        jPanel12.add(jLabel109, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel12);

        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setText("7");
        jPanel13.add(jLabel110, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel13);

        jPanel14.setLayout(new java.awt.BorderLayout());

        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("8");
        jPanel14.add(jLabel111, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel14);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setText("9");
        jPanel15.add(jLabel112, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel15);

        jPanel16.setLayout(new java.awt.BorderLayout());

        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel113.setText("10");
        jPanel16.add(jLabel113, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel16);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("A");
        jPanel17.add(jLabel115, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel17);

        jPanel18.setLayout(new java.awt.BorderLayout());

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel18.add(btn1, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel18);

        jPanel19.setLayout(new java.awt.BorderLayout());

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel19.add(btn2, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel19);

        jPanel20.setLayout(new java.awt.BorderLayout());

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel20.add(btn3, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel20);

        jPanel21.setLayout(new java.awt.BorderLayout());

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel21.add(btn4, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel21);

        jPanel22.setLayout(new java.awt.BorderLayout());

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel22.add(btn5, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel22);

        jPanel23.setLayout(new java.awt.BorderLayout());

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel23.add(btn6, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel23);

        jPanel24.setLayout(new java.awt.BorderLayout());

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel24.add(btn7, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel24);

        jPanel25.setLayout(new java.awt.BorderLayout());

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel25.add(btn8, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel25);

        jPanel26.setLayout(new java.awt.BorderLayout());

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel26.add(btn9, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel26);

        jPanel27.setLayout(new java.awt.BorderLayout());

        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel27.add(btn10, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel27);

        jPanel28.setLayout(new java.awt.BorderLayout());

        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText("B");
        jPanel28.add(jLabel114, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel28);

        jPanel29.setLayout(new java.awt.BorderLayout());

        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        jPanel29.add(btn11, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel29);

        jPanel30.setLayout(new java.awt.BorderLayout());

        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        jPanel30.add(btn12, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel30);

        jPanel31.setLayout(new java.awt.BorderLayout());

        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        jPanel31.add(btn13, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel31);

        jPanel32.setLayout(new java.awt.BorderLayout());

        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        jPanel32.add(btn14, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel32);

        jPanel33.setLayout(new java.awt.BorderLayout());

        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        jPanel33.add(btn15, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel33);

        jPanel34.setLayout(new java.awt.BorderLayout());

        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        jPanel34.add(btn16, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel34);

        jPanel35.setLayout(new java.awt.BorderLayout());

        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });
        jPanel35.add(btn17, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel35);

        jPanel36.setLayout(new java.awt.BorderLayout());

        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });
        jPanel36.add(btn18, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel36);

        jPanel37.setLayout(new java.awt.BorderLayout());

        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });
        jPanel37.add(btn19, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel37);

        jPanel38.setLayout(new java.awt.BorderLayout());

        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        jPanel38.add(btn20, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel38);

        jPanel39.setLayout(new java.awt.BorderLayout());

        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("C");
        jPanel39.add(jLabel116, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel39);

        jPanel40.setLayout(new java.awt.BorderLayout());

        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        jPanel40.add(btn21, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel40);

        jPanel41.setLayout(new java.awt.BorderLayout());

        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        jPanel41.add(btn22, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel41);

        jPanel42.setLayout(new java.awt.BorderLayout());

        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });
        jPanel42.add(btn23, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel42);

        jPanel43.setLayout(new java.awt.BorderLayout());

        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });
        jPanel43.add(btn24, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel43);

        jPanel44.setLayout(new java.awt.BorderLayout());

        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });
        jPanel44.add(btn25, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel44);

        jPanel45.setLayout(new java.awt.BorderLayout());

        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });
        jPanel45.add(btn26, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel45);

        jPanel46.setLayout(new java.awt.BorderLayout());

        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });
        jPanel46.add(btn27, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel46);

        jPanel47.setLayout(new java.awt.BorderLayout());

        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });
        jPanel47.add(btn28, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel47);

        jPanel48.setLayout(new java.awt.BorderLayout());

        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn29ActionPerformed(evt);
            }
        });
        jPanel48.add(btn29, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel48);

        jPanel49.setLayout(new java.awt.BorderLayout());

        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });
        jPanel49.add(btn30, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel49);

        jPanel50.setLayout(new java.awt.BorderLayout());

        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("D");
        jPanel50.add(jLabel117, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel50);

        jPanel51.setLayout(new java.awt.BorderLayout());

        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });
        jPanel51.add(btn31, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel51);

        jPanel52.setLayout(new java.awt.BorderLayout());

        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });
        jPanel52.add(btn32, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel52);

        jPanel53.setLayout(new java.awt.BorderLayout());

        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });
        jPanel53.add(btn33, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel53);

        jPanel54.setLayout(new java.awt.BorderLayout());

        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn34ActionPerformed(evt);
            }
        });
        jPanel54.add(btn34, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel54);

        jPanel55.setLayout(new java.awt.BorderLayout());

        btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn35ActionPerformed(evt);
            }
        });
        jPanel55.add(btn35, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel55);

        jPanel56.setLayout(new java.awt.BorderLayout());

        btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn36ActionPerformed(evt);
            }
        });
        jPanel56.add(btn36, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel56);

        jPanel57.setLayout(new java.awt.BorderLayout());

        btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn37ActionPerformed(evt);
            }
        });
        jPanel57.add(btn37, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel57);

        jPanel58.setLayout(new java.awt.BorderLayout());

        btn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn38ActionPerformed(evt);
            }
        });
        jPanel58.add(btn38, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel58);

        jPanel59.setLayout(new java.awt.BorderLayout());

        btn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn39ActionPerformed(evt);
            }
        });
        jPanel59.add(btn39, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel59);

        jPanel60.setLayout(new java.awt.BorderLayout());

        btn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn40ActionPerformed(evt);
            }
        });
        jPanel60.add(btn40, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel60);

        jPanel61.setLayout(new java.awt.BorderLayout());

        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel118.setText("E");
        jPanel61.add(jLabel118, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel61);

        jPanel62.setLayout(new java.awt.BorderLayout());

        btn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn41ActionPerformed(evt);
            }
        });
        jPanel62.add(btn41, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel62);

        jPanel63.setLayout(new java.awt.BorderLayout());

        btn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn42ActionPerformed(evt);
            }
        });
        jPanel63.add(btn42, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel63);

        jPanel64.setLayout(new java.awt.BorderLayout());

        btn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn43ActionPerformed(evt);
            }
        });
        jPanel64.add(btn43, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel64);

        jPanel65.setLayout(new java.awt.BorderLayout());

        btn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn44ActionPerformed(evt);
            }
        });
        jPanel65.add(btn44, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel65);

        jPanel66.setLayout(new java.awt.BorderLayout());

        btn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn45ActionPerformed(evt);
            }
        });
        jPanel66.add(btn45, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel66);

        jPanel67.setLayout(new java.awt.BorderLayout());

        btn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn46ActionPerformed(evt);
            }
        });
        jPanel67.add(btn46, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel67);

        jPanel68.setLayout(new java.awt.BorderLayout());

        btn47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn47ActionPerformed(evt);
            }
        });
        jPanel68.add(btn47, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel68);

        jPanel69.setLayout(new java.awt.BorderLayout());

        btn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn48ActionPerformed(evt);
            }
        });
        jPanel69.add(btn48, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel69);

        jPanel70.setLayout(new java.awt.BorderLayout());

        btn49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn49ActionPerformed(evt);
            }
        });
        jPanel70.add(btn49, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel70);

        jPanel71.setLayout(new java.awt.BorderLayout());

        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50ActionPerformed(evt);
            }
        });
        jPanel71.add(btn50, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel71);

        jPanel72.setLayout(new java.awt.BorderLayout());

        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel119.setText("F");
        jPanel72.add(jLabel119, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel72);

        jPanel73.setLayout(new java.awt.BorderLayout());

        btn51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn51ActionPerformed(evt);
            }
        });
        jPanel73.add(btn51, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel73);

        jPanel74.setLayout(new java.awt.BorderLayout());

        btn52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn52ActionPerformed(evt);
            }
        });
        jPanel74.add(btn52, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel74);

        jPanel75.setLayout(new java.awt.BorderLayout());

        btn53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn53ActionPerformed(evt);
            }
        });
        jPanel75.add(btn53, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel75);

        jPanel76.setLayout(new java.awt.BorderLayout());

        btn54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn54ActionPerformed(evt);
            }
        });
        jPanel76.add(btn54, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel76);

        jPanel77.setLayout(new java.awt.BorderLayout());

        btn55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn55ActionPerformed(evt);
            }
        });
        jPanel77.add(btn55, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel77);

        jPanel78.setLayout(new java.awt.BorderLayout());

        btn56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn56ActionPerformed(evt);
            }
        });
        jPanel78.add(btn56, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel78);

        jPanel79.setLayout(new java.awt.BorderLayout());

        btn57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn57ActionPerformed(evt);
            }
        });
        jPanel79.add(btn57, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel79);

        jPanel80.setLayout(new java.awt.BorderLayout());

        btn58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn58ActionPerformed(evt);
            }
        });
        jPanel80.add(btn58, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel80);

        jPanel81.setLayout(new java.awt.BorderLayout());

        btn59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn59ActionPerformed(evt);
            }
        });
        jPanel81.add(btn59, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel81);

        jPanel82.setLayout(new java.awt.BorderLayout());

        btn60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn60ActionPerformed(evt);
            }
        });
        jPanel82.add(btn60, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel82);

        jPanel83.setLayout(new java.awt.BorderLayout());

        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel120.setText("G");
        jPanel83.add(jLabel120, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel83);

        jPanel84.setLayout(new java.awt.BorderLayout());

        btn61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn61ActionPerformed(evt);
            }
        });
        jPanel84.add(btn61, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel84);

        jPanel85.setLayout(new java.awt.BorderLayout());

        btn62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn62ActionPerformed(evt);
            }
        });
        jPanel85.add(btn62, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel85);

        jPanel86.setLayout(new java.awt.BorderLayout());

        btn63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn63ActionPerformed(evt);
            }
        });
        jPanel86.add(btn63, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel86);

        jPanel87.setLayout(new java.awt.BorderLayout());

        btn64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn64ActionPerformed(evt);
            }
        });
        jPanel87.add(btn64, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel87);

        jPanel88.setLayout(new java.awt.BorderLayout());

        btn65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn65ActionPerformed(evt);
            }
        });
        jPanel88.add(btn65, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel88);

        jPanel89.setLayout(new java.awt.BorderLayout());

        btn66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn66ActionPerformed(evt);
            }
        });
        jPanel89.add(btn66, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel89);

        jPanel90.setLayout(new java.awt.BorderLayout());

        btn67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn67ActionPerformed(evt);
            }
        });
        jPanel90.add(btn67, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel90);

        jPanel91.setLayout(new java.awt.BorderLayout());

        btn68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn68ActionPerformed(evt);
            }
        });
        jPanel91.add(btn68, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel91);

        jPanel92.setLayout(new java.awt.BorderLayout());

        btn69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn69ActionPerformed(evt);
            }
        });
        jPanel92.add(btn69, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel92);

        jPanel93.setLayout(new java.awt.BorderLayout());

        btn70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn70ActionPerformed(evt);
            }
        });
        jPanel93.add(btn70, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel93);

        jPanel94.setLayout(new java.awt.BorderLayout());

        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel121.setText("H");
        jPanel94.add(jLabel121, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel94);

        jPanel95.setLayout(new java.awt.BorderLayout());

        btn71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn71ActionPerformed(evt);
            }
        });
        jPanel95.add(btn71, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel95);

        jPanel96.setLayout(new java.awt.BorderLayout());

        btn72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn72ActionPerformed(evt);
            }
        });
        jPanel96.add(btn72, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel96);

        jPanel97.setLayout(new java.awt.BorderLayout());

        btn73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn73ActionPerformed(evt);
            }
        });
        jPanel97.add(btn73, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel97);

        jPanel98.setLayout(new java.awt.BorderLayout());

        btn74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn74ActionPerformed(evt);
            }
        });
        jPanel98.add(btn74, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel98);

        jPanel99.setLayout(new java.awt.BorderLayout());

        btn75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn75ActionPerformed(evt);
            }
        });
        jPanel99.add(btn75, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel99);

        jPanel100.setLayout(new java.awt.BorderLayout());

        btn76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn76ActionPerformed(evt);
            }
        });
        jPanel100.add(btn76, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel100);

        jPanel101.setLayout(new java.awt.BorderLayout());

        btn77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn77ActionPerformed(evt);
            }
        });
        jPanel101.add(btn77, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel101);

        jPanel102.setLayout(new java.awt.BorderLayout());

        btn78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn78ActionPerformed(evt);
            }
        });
        jPanel102.add(btn78, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel102);

        jPanel103.setLayout(new java.awt.BorderLayout());

        btn79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn79ActionPerformed(evt);
            }
        });
        jPanel103.add(btn79, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel103);

        jPanel104.setLayout(new java.awt.BorderLayout());

        btn80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn80ActionPerformed(evt);
            }
        });
        jPanel104.add(btn80, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel104);

        jPanel105.setLayout(new java.awt.BorderLayout());

        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel122.setText("I");
        jPanel105.add(jLabel122, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel105);

        jPanel106.setLayout(new java.awt.BorderLayout());

        btn81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn81ActionPerformed(evt);
            }
        });
        jPanel106.add(btn81, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel106);

        jPanel107.setLayout(new java.awt.BorderLayout());

        btn82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn82ActionPerformed(evt);
            }
        });
        jPanel107.add(btn82, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel107);

        jPanel108.setLayout(new java.awt.BorderLayout());

        btn83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn83ActionPerformed(evt);
            }
        });
        jPanel108.add(btn83, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel108);

        jPanel109.setLayout(new java.awt.BorderLayout());

        btn84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn84ActionPerformed(evt);
            }
        });
        jPanel109.add(btn84, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel109);

        jPanel110.setLayout(new java.awt.BorderLayout());

        btn85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn85ActionPerformed(evt);
            }
        });
        jPanel110.add(btn85, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel110);

        jPanel111.setLayout(new java.awt.BorderLayout());

        btn86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn86ActionPerformed(evt);
            }
        });
        jPanel111.add(btn86, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel111);

        jPanel112.setLayout(new java.awt.BorderLayout());

        btn87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn87ActionPerformed(evt);
            }
        });
        jPanel112.add(btn87, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel112);

        jPanel113.setLayout(new java.awt.BorderLayout());

        btn88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn88ActionPerformed(evt);
            }
        });
        jPanel113.add(btn88, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel113);

        jPanel114.setLayout(new java.awt.BorderLayout());

        btn89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn89ActionPerformed(evt);
            }
        });
        jPanel114.add(btn89, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel114);

        jPanel115.setLayout(new java.awt.BorderLayout());

        btn90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn90ActionPerformed(evt);
            }
        });
        jPanel115.add(btn90, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel115);

        jPanel116.setLayout(new java.awt.BorderLayout());

        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("J");
        jPanel116.add(jLabel102, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel116);

        jPanel117.setLayout(new java.awt.BorderLayout());

        btn91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn91ActionPerformed(evt);
            }
        });
        jPanel117.add(btn91, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel117);

        jPanel118.setLayout(new java.awt.BorderLayout());

        btn92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn92ActionPerformed(evt);
            }
        });
        jPanel118.add(btn92, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel118);

        jPanel119.setLayout(new java.awt.BorderLayout());

        btn93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn93ActionPerformed(evt);
            }
        });
        jPanel119.add(btn93, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel119);

        jPanel120.setLayout(new java.awt.BorderLayout());

        btn94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn94ActionPerformed(evt);
            }
        });
        jPanel120.add(btn94, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel120);

        jPanel121.setLayout(new java.awt.BorderLayout());

        btn95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn95ActionPerformed(evt);
            }
        });
        jPanel121.add(btn95, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel121);

        jPanel122.setLayout(new java.awt.BorderLayout());

        btn96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn96ActionPerformed(evt);
            }
        });
        jPanel122.add(btn96, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel122);

        jPanel123.setLayout(new java.awt.BorderLayout());

        btn97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn97ActionPerformed(evt);
            }
        });
        jPanel123.add(btn97, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel123);

        jPanel124.setLayout(new java.awt.BorderLayout());

        btn98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn98ActionPerformed(evt);
            }
        });
        jPanel124.add(btn98, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel124);

        jPanel125.setLayout(new java.awt.BorderLayout());

        btn99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn99ActionPerformed(evt);
            }
        });
        jPanel125.add(btn99, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel125);

        jPanel126.setLayout(new java.awt.BorderLayout());

        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });
        jPanel126.add(btn100, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel126);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTextArea1ComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jPanel128.setBackground(new java.awt.Color(51, 153, 255));
        jPanel128.setLayout(new java.awt.GridLayout(11, 11, 2, 2));

        jPanel129.setLayout(new java.awt.BorderLayout());
        jPanel129.add(jLabel123, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel129);

        jPanel130.setLayout(new java.awt.BorderLayout());

        jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel124.setText("1");
        jPanel130.add(jLabel124, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel130);

        jPanel131.setLayout(new java.awt.BorderLayout());

        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setText("2");
        jPanel131.add(jLabel125, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel131);

        jPanel132.setLayout(new java.awt.BorderLayout());

        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setText("3");
        jPanel132.add(jLabel126, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel132);

        jPanel133.setLayout(new java.awt.BorderLayout());

        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setText("4");
        jPanel133.add(jLabel127, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel133);

        jPanel134.setLayout(new java.awt.BorderLayout());

        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel128.setText("5");
        jPanel134.add(jLabel128, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel134);

        jPanel135.setLayout(new java.awt.BorderLayout());

        jLabel129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel129.setText("6");
        jPanel135.add(jLabel129, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel135);

        jPanel136.setLayout(new java.awt.BorderLayout());

        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel130.setText("7");
        jPanel136.add(jLabel130, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel136);

        jPanel137.setLayout(new java.awt.BorderLayout());

        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setText("8");
        jPanel137.add(jLabel131, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel137);

        jPanel138.setLayout(new java.awt.BorderLayout());

        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel132.setText("9");
        jPanel138.add(jLabel132, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel138);

        jPanel139.setLayout(new java.awt.BorderLayout());

        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel133.setText("10");
        jPanel139.add(jLabel133, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel139);

        jPanel140.setLayout(new java.awt.BorderLayout());

        jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel134.setText("A");
        jPanel140.add(jLabel134, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel140);

        jPanel141.setLayout(new java.awt.BorderLayout());
        jPanel141.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel141);

        jPanel142.setLayout(new java.awt.BorderLayout());
        jPanel128.add(jPanel142);

        jPanel143.setLayout(new java.awt.BorderLayout());
        jPanel128.add(jPanel143);

        jPanel144.setLayout(new java.awt.BorderLayout());
        jPanel128.add(jPanel144);

        jPanel145.setLayout(new java.awt.BorderLayout());
        jPanel128.add(jPanel145);

        jPanel146.setLayout(new java.awt.BorderLayout());
        jPanel128.add(jPanel146);

        jPanel147.setLayout(new java.awt.BorderLayout());
        jPanel128.add(jPanel147);

        jPanel148.setLayout(new java.awt.BorderLayout());
        jPanel128.add(jPanel148);

        jPanel149.setLayout(new java.awt.BorderLayout());
        jPanel128.add(jPanel149);

        jPanel150.setLayout(new java.awt.BorderLayout());
        jPanel128.add(jPanel150);

        jPanel151.setLayout(new java.awt.BorderLayout());

        jLabel135.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel135.setText("B");
        jPanel151.add(jLabel135, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel151);

        jPanel152.setLayout(new java.awt.BorderLayout());

        jButton113.setText("jButton11");
        jPanel152.add(jButton113, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel152);

        jPanel153.setLayout(new java.awt.BorderLayout());

        jButton114.setText("jButton13");
        jPanel153.add(jButton114, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel153);

        jPanel154.setLayout(new java.awt.BorderLayout());

        jButton115.setText("jButton14");
        jPanel154.add(jButton115, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel154);

        jPanel155.setLayout(new java.awt.BorderLayout());

        jButton116.setText("jButton15");
        jPanel155.add(jButton116, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel155);

        jPanel156.setLayout(new java.awt.BorderLayout());

        jButton117.setText("jButton12");
        jPanel156.add(jButton117, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel156);

        jPanel157.setLayout(new java.awt.BorderLayout());

        jButton118.setText("jButton16");
        jPanel157.add(jButton118, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel157);

        jPanel158.setLayout(new java.awt.BorderLayout());

        jButton119.setText("jButton17");
        jPanel158.add(jButton119, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel158);

        jPanel159.setLayout(new java.awt.BorderLayout());

        jButton120.setText("jButton18");
        jPanel159.add(jButton120, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel159);

        jPanel160.setLayout(new java.awt.BorderLayout());

        jButton121.setText("jButton19");
        jPanel160.add(jButton121, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel160);

        jPanel161.setLayout(new java.awt.BorderLayout());

        jButton122.setText("jButton20");
        jPanel161.add(jButton122, java.awt.BorderLayout.LINE_END);

        jPanel128.add(jPanel161);

        jPanel162.setLayout(new java.awt.BorderLayout());

        jLabel136.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel136.setText("C");
        jPanel162.add(jLabel136, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel162);

        jPanel163.setLayout(new java.awt.BorderLayout());

        jButton123.setText("jButton21");
        jPanel163.add(jButton123, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel163);

        jPanel164.setLayout(new java.awt.BorderLayout());

        jButton124.setText("jButton22");
        jPanel164.add(jButton124, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel164);

        jPanel165.setLayout(new java.awt.BorderLayout());

        jButton125.setText("jButton23");
        jPanel165.add(jButton125, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel165);

        jPanel166.setLayout(new java.awt.BorderLayout());

        jButton126.setText("jButton24");
        jPanel166.add(jButton126, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel166);

        jPanel167.setLayout(new java.awt.BorderLayout());

        jButton127.setText("jButton25");
        jPanel167.add(jButton127, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel167);

        jPanel168.setLayout(new java.awt.BorderLayout());

        jButton128.setText("jButton26");
        jPanel168.add(jButton128, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel168);

        jPanel169.setLayout(new java.awt.BorderLayout());

        jButton129.setText("jButton27");
        jPanel169.add(jButton129, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel169);

        jPanel170.setLayout(new java.awt.BorderLayout());

        jButton130.setText("jButton28");
        jPanel170.add(jButton130, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel170);

        jPanel171.setLayout(new java.awt.BorderLayout());

        jButton131.setText("jButton29");
        jPanel171.add(jButton131, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel171);

        jPanel172.setLayout(new java.awt.BorderLayout());

        jButton132.setText("jButton30");
        jPanel172.add(jButton132, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel172);

        jPanel173.setLayout(new java.awt.BorderLayout());

        jLabel137.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel137.setText("D");
        jPanel173.add(jLabel137, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel173);

        jPanel174.setLayout(new java.awt.BorderLayout());

        jButton133.setText("jButton30");
        jPanel174.add(jButton133, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel174);

        jPanel175.setLayout(new java.awt.BorderLayout());

        jButton134.setText("jButton30");
        jPanel175.add(jButton134, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel175);

        jPanel176.setLayout(new java.awt.BorderLayout());

        jButton135.setText("jButton30");
        jPanel176.add(jButton135, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel176);

        jPanel177.setLayout(new java.awt.BorderLayout());

        jButton136.setText("jButton30");
        jPanel177.add(jButton136, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel177);

        jPanel178.setLayout(new java.awt.BorderLayout());

        jButton137.setText("jButton30");
        jPanel178.add(jButton137, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel178);

        jPanel179.setLayout(new java.awt.BorderLayout());

        jButton138.setText("jButton30");
        jPanel179.add(jButton138, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel179);

        jPanel180.setLayout(new java.awt.BorderLayout());

        jButton139.setText("jButton30");
        jPanel180.add(jButton139, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel180);

        jPanel181.setLayout(new java.awt.BorderLayout());

        jButton140.setText("jButton30");
        jPanel181.add(jButton140, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel181);

        jPanel182.setLayout(new java.awt.BorderLayout());

        jButton141.setText("jButton30");
        jPanel182.add(jButton141, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel182);

        jPanel183.setLayout(new java.awt.BorderLayout());

        jButton142.setText("jButton30");
        jPanel183.add(jButton142, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel183);

        jPanel184.setLayout(new java.awt.BorderLayout());

        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel138.setText("E");
        jPanel184.add(jLabel138, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel184);

        jPanel185.setLayout(new java.awt.BorderLayout());

        jButton143.setText("jButton30");
        jPanel185.add(jButton143, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel185);

        jPanel186.setLayout(new java.awt.BorderLayout());

        jButton144.setText("jButton30");
        jPanel186.add(jButton144, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel186);

        jPanel187.setLayout(new java.awt.BorderLayout());

        jButton145.setText("jButton30");
        jPanel187.add(jButton145, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel187);

        jPanel188.setLayout(new java.awt.BorderLayout());

        jButton146.setText("jButton30");
        jPanel188.add(jButton146, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel188);

        jPanel189.setLayout(new java.awt.BorderLayout());

        jButton147.setText("jButton30");
        jPanel189.add(jButton147, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel189);

        jPanel190.setLayout(new java.awt.BorderLayout());

        jButton148.setText("jButton30");
        jPanel190.add(jButton148, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel190);

        jPanel191.setLayout(new java.awt.BorderLayout());

        jButton149.setText("jButton30");
        jPanel191.add(jButton149, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel191);

        jPanel192.setLayout(new java.awt.BorderLayout());

        jButton150.setText("jButton30");
        jPanel192.add(jButton150, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel192);

        jPanel193.setLayout(new java.awt.BorderLayout());

        jButton151.setText("jButton30");
        jPanel193.add(jButton151, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel193);

        jPanel194.setLayout(new java.awt.BorderLayout());

        jButton152.setText("jButton30");
        jPanel194.add(jButton152, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel194);

        jPanel195.setLayout(new java.awt.BorderLayout());

        jLabel139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel139.setText("F");
        jPanel195.add(jLabel139, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel195);

        jPanel196.setLayout(new java.awt.BorderLayout());

        jButton153.setText("jButton30");
        jPanel196.add(jButton153, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel196);

        jPanel197.setLayout(new java.awt.BorderLayout());

        jButton154.setText("jButton30");
        jPanel197.add(jButton154, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel197);

        jPanel198.setLayout(new java.awt.BorderLayout());

        jButton155.setText("jButton30");
        jPanel198.add(jButton155, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel198);

        jPanel199.setLayout(new java.awt.BorderLayout());

        jButton156.setText("jButton30");
        jPanel199.add(jButton156, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel199);

        jPanel200.setLayout(new java.awt.BorderLayout());

        jButton157.setText("jButton30");
        jPanel200.add(jButton157, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel200);

        jPanel201.setLayout(new java.awt.BorderLayout());

        jButton158.setText("jButton30");
        jPanel201.add(jButton158, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel201);

        jPanel202.setLayout(new java.awt.BorderLayout());

        jButton159.setText("jButton30");
        jPanel202.add(jButton159, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel202);

        jPanel203.setLayout(new java.awt.BorderLayout());

        jButton160.setText("jButton30");
        jPanel203.add(jButton160, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel203);

        jPanel204.setLayout(new java.awt.BorderLayout());

        jButton161.setText("jButton30");
        jPanel204.add(jButton161, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel204);

        jPanel205.setLayout(new java.awt.BorderLayout());

        jButton162.setText("jButton30");
        jPanel205.add(jButton162, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel205);

        jPanel206.setLayout(new java.awt.BorderLayout());

        jLabel140.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel140.setText("G");
        jPanel206.add(jLabel140, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel206);

        jPanel207.setLayout(new java.awt.BorderLayout());

        jButton163.setText("jButton30");
        jPanel207.add(jButton163, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel207);

        jPanel208.setLayout(new java.awt.BorderLayout());

        jButton164.setText("jButton30");
        jPanel208.add(jButton164, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel208);

        jPanel209.setLayout(new java.awt.BorderLayout());

        jButton165.setText("jButton30");
        jPanel209.add(jButton165, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel209);

        jPanel210.setLayout(new java.awt.BorderLayout());

        jButton166.setText("jButton30");
        jPanel210.add(jButton166, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel210);

        jPanel211.setLayout(new java.awt.BorderLayout());

        jButton167.setText("jButton30");
        jPanel211.add(jButton167, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel211);

        jPanel212.setLayout(new java.awt.BorderLayout());

        jButton168.setText("jButton30");
        jPanel212.add(jButton168, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel212);

        jPanel213.setLayout(new java.awt.BorderLayout());

        jButton169.setText("jButton30");
        jPanel213.add(jButton169, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel213);

        jPanel214.setLayout(new java.awt.BorderLayout());

        jButton170.setText("jButton30");
        jPanel214.add(jButton170, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel214);

        jPanel215.setLayout(new java.awt.BorderLayout());

        jButton171.setText("jButton30");
        jPanel215.add(jButton171, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel215);

        jPanel216.setLayout(new java.awt.BorderLayout());

        jButton172.setText("jButton30");
        jPanel216.add(jButton172, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel216);

        jPanel217.setLayout(new java.awt.BorderLayout());

        jLabel141.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel141.setText("H");
        jPanel217.add(jLabel141, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel217);

        jPanel218.setLayout(new java.awt.BorderLayout());

        jButton173.setText("jButton30");
        jPanel218.add(jButton173, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel218);

        jPanel219.setLayout(new java.awt.BorderLayout());

        jButton174.setText("jButton30");
        jPanel219.add(jButton174, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel219);

        jPanel220.setLayout(new java.awt.BorderLayout());

        jButton175.setText("jButton30");
        jPanel220.add(jButton175, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel220);

        jPanel221.setLayout(new java.awt.BorderLayout());

        jButton176.setText("jButton30");
        jPanel221.add(jButton176, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel221);

        jPanel222.setLayout(new java.awt.BorderLayout());

        jButton177.setText("jButton30");
        jPanel222.add(jButton177, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel222);

        jPanel223.setLayout(new java.awt.BorderLayout());

        jButton178.setText("jButton30");
        jPanel223.add(jButton178, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel223);

        jPanel224.setLayout(new java.awt.BorderLayout());

        jButton179.setText("jButton30");
        jPanel224.add(jButton179, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel224);

        jPanel225.setLayout(new java.awt.BorderLayout());

        jButton180.setText("jButton30");
        jPanel225.add(jButton180, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel225);

        jPanel226.setLayout(new java.awt.BorderLayout());

        jButton181.setText("jButton30");
        jPanel226.add(jButton181, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel226);

        jPanel227.setLayout(new java.awt.BorderLayout());

        jButton182.setText("jButton30");
        jPanel227.add(jButton182, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel227);

        jPanel228.setLayout(new java.awt.BorderLayout());

        jLabel142.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel142.setText("I");
        jPanel228.add(jLabel142, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel228);

        jPanel229.setLayout(new java.awt.BorderLayout());

        jButton183.setText("jButton30");
        jPanel229.add(jButton183, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel229);

        jPanel230.setLayout(new java.awt.BorderLayout());

        jButton184.setText("jButton30");
        jPanel230.add(jButton184, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel230);

        jPanel231.setLayout(new java.awt.BorderLayout());

        jButton185.setText("jButton30");
        jPanel231.add(jButton185, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel231);

        jPanel232.setLayout(new java.awt.BorderLayout());

        jButton186.setText("jButton30");
        jPanel232.add(jButton186, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel232);

        jPanel233.setLayout(new java.awt.BorderLayout());

        jButton187.setText("jButton30");
        jPanel233.add(jButton187, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel233);

        jPanel234.setLayout(new java.awt.BorderLayout());

        jButton188.setText("jButton30");
        jPanel234.add(jButton188, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel234);

        jPanel235.setLayout(new java.awt.BorderLayout());

        jButton189.setText("jButton30");
        jPanel235.add(jButton189, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel235);

        jPanel236.setLayout(new java.awt.BorderLayout());

        jButton190.setText("jButton30");
        jPanel236.add(jButton190, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel236);

        jPanel237.setLayout(new java.awt.BorderLayout());

        jButton191.setText("jButton30");
        jPanel237.add(jButton191, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel237);

        jPanel238.setLayout(new java.awt.BorderLayout());

        jButton192.setText("jButton30");
        jPanel238.add(jButton192, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel238);

        jPanel239.setLayout(new java.awt.BorderLayout());

        jLabel143.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel143.setText("J");
        jPanel239.add(jLabel143, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel239);

        jPanel240.setLayout(new java.awt.BorderLayout());

        jButton193.setText("jButton30");
        jPanel240.add(jButton193, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel240);

        jPanel241.setLayout(new java.awt.BorderLayout());

        jButton194.setText("jButton30");
        jPanel241.add(jButton194, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel241);

        jPanel242.setLayout(new java.awt.BorderLayout());

        jButton195.setText("jButton30");
        jPanel242.add(jButton195, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel242);

        jPanel243.setLayout(new java.awt.BorderLayout());

        jButton196.setText("jButton30");
        jPanel243.add(jButton196, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel243);

        jPanel244.setLayout(new java.awt.BorderLayout());

        jButton197.setText("jButton30");
        jPanel244.add(jButton197, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel244);

        jPanel245.setLayout(new java.awt.BorderLayout());

        jButton198.setText("jButton30");
        jPanel245.add(jButton198, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel245);

        jPanel246.setLayout(new java.awt.BorderLayout());

        jButton199.setText("jButton30");
        jPanel246.add(jButton199, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel246);

        jPanel247.setLayout(new java.awt.BorderLayout());

        jButton200.setText("jButton30");
        jPanel247.add(jButton200, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel247);

        jPanel248.setLayout(new java.awt.BorderLayout());

        jButton201.setText("jButton30");
        jPanel248.add(jButton201, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel248);

        jPanel249.setLayout(new java.awt.BorderLayout());

        jButton202.setText("jButton30");
        jPanel249.add(jButton202, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel249);

        javax.swing.GroupLayout jPanel127Layout = new javax.swing.GroupLayout(jPanel127);
        jPanel127.setLayout(jPanel127Layout);
        jPanel127Layout.setHorizontalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel127Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel128, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(513, 513, 513)))
        );
        jPanel127Layout.setVerticalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
            .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel127Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel128, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel127, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel127, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton101ActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirma si queres salir", "Batalla Naval", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton101ActionPerformed

    private void jTextArea1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTextArea1ComponentAdded
        //jTextArea1.setText("hola");
    }//GEN-LAST:event_jTextArea1ComponentAdded

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (btn1.isSelected()) {
            if (control.disparable(0, 0)) {
                if (control.generarDisparoJugador(0, 0)) {
                    btn1.setBackground(Color.red);
                } else {
                    btn1.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (btn2.isSelected()) {
            if (control.disparable(0, 1)) {
                if (control.generarDisparoJugador(0, 1)) {
                    btn2.setBackground(Color.red);
                } else {
                    btn2.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }

    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (btn3.isSelected()) {
            if (control.disparable(0, 2)) {
                if (control.generarDisparoJugador(0, 2)) {
                    btn3.setBackground(Color.red);
                } else {
                    btn3.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (btn4.isSelected()) {
            if (control.disparable(0, 3)) {
                if (control.generarDisparoJugador(0, 3)) {
                    btn4.setBackground(Color.red);
                } else {
                    btn4.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (btn5.isSelected()) {
            if (control.disparable(0, 4)) {
                if (control.generarDisparoJugador(0, 4)) {
                    btn5.setBackground(Color.red);
                } else {
                    btn5.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (btn6.isSelected()) {
            if (control.disparable(0, 5)) {
                if (control.generarDisparoJugador(0, 5)) {
                    btn6.setBackground(Color.red);
                } else {
                    btn6.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (btn7.isSelected()) {
            if (control.disparable(0, 6)) {
                if (control.generarDisparoJugador(0, 6)) {
                    btn7.setBackground(Color.red);
                } else {
                    btn7.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (btn8.isSelected()) {
            if (control.disparable(0, 7)) {
                if (control.generarDisparoJugador(0, 7)) {
                    btn8.setBackground(Color.red);
                } else {
                    btn8.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (btn9.isSelected()) {
            if (control.disparable(0, 8)) {
                if (control.generarDisparoJugador(0, 8)) {
                    btn9.setBackground(Color.red);
                } else {
                    btn9.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        if (btn10.isSelected()) {
            if (control.disparable(0, 9)) {
                if (control.generarDisparoJugador(0, 9)) {
                    btn10.setBackground(Color.red);
                } else {
                    btn10.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        if (btn11.isSelected()) {
            if (control.disparable(1, 0)) {
                if (control.generarDisparoJugador(1, 0)) {
                    btn11.setBackground(Color.red);
                } else {
                    btn11.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        if (btn12.isSelected()) {
            if (control.disparable(1, 1)) {
                if (control.generarDisparoJugador(1, 1)) {
                    btn12.setBackground(Color.red);
                } else {
                    btn12.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        if (btn13.isSelected()) {
            if (control.disparable(1, 2)) {
                if (control.generarDisparoJugador(1, 2)) {
                    btn13.setBackground(Color.red);
                } else {
                    btn13.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        if (btn14.isSelected()) {
            if (control.disparable(1, 3)) {
                if (control.generarDisparoJugador(1, 3)) {
                    btn14.setBackground(Color.red);
                } else {
                    btn14.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        if (btn15.isSelected()) {
            if (control.disparable(1, 4)) {
                if (control.generarDisparoJugador(1, 4)) {
                    btn15.setBackground(Color.red);
                } else {
                    btn15.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        if (btn16.isSelected()) {
            if (control.disparable(1, 5)) {
                if (control.generarDisparoJugador(1, 5)) {
                    btn16.setBackground(Color.red);
                } else {
                    btn16.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        if (btn17.isSelected()) {
            if (control.disparable(1, 6)) {
                if (control.generarDisparoJugador(1, 6)) {
                    btn17.setBackground(Color.red);
                } else {
                    btn17.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn17ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        if (btn18.isSelected()) {
            if (control.disparable(1, 7)) {
                if (control.generarDisparoJugador(1, 7)) {
                    btn18.setBackground(Color.red);
                } else {
                    btn18.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn18ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        if (btn19.isSelected()) {
            if (control.disparable(1, 8)) {
                if (control.generarDisparoJugador(1, 8)) {
                    btn19.setBackground(Color.red);
                } else {
                    btn19.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn19ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        if (btn20.isSelected()) {
            if (control.disparable(1, 9)) {
                if (control.generarDisparoJugador(1, 9)) {
                    btn20.setBackground(Color.red);
                } else {
                    btn20.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        if (btn21.isSelected()) {
            if (control.disparable(2, 0)) {
                if (control.generarDisparoJugador(2, 0)) {
                    btn21.setBackground(Color.red);
                } else {
                    btn21.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        if (btn22.isSelected()) {
            if (control.disparable(2, 1)) {
                if (control.generarDisparoJugador(2, 1)) {
                    btn22.setBackground(Color.red);
                } else {
                    btn22.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        if (btn23.isSelected()) {
            if (control.disparable(2, 2)) {
                if (control.generarDisparoJugador(2, 2)) {
                    btn23.setBackground(Color.red);
                } else {
                    btn23.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        if (btn24.isSelected()) {
            if (control.disparable(2, 3)) {
                if (control.generarDisparoJugador(2, 3)) {
                    btn24.setBackground(Color.red);
                } else {
                    btn24.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        if (btn25.isSelected()) {
            if (control.disparable(2, 4)) {
                if (control.generarDisparoJugador(2, 4)) {
                    btn25.setBackground(Color.red);
                } else {
                    btn25.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
        if (btn26.isSelected()) {
            if (control.disparable(2, 5)) {
                if (control.generarDisparoJugador(2, 5)) {
                    btn26.setBackground(Color.red);
                } else {
                    btn26.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
        if (btn27.isSelected()) {
            if (control.disparable(2, 6)) {
                if (control.generarDisparoJugador(2, 6)) {
                    btn27.setBackground(Color.red);
                } else {
                    btn27.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        if (btn28.isSelected()) {
            if (control.disparable(2, 7)) {
                if (control.generarDisparoJugador(2, 7)) {
                    btn28.setBackground(Color.red);
                } else {
                    btn28.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn29ActionPerformed
        if (btn29.isSelected()) {
            if (control.disparable(2, 8)) {
                if (control.generarDisparoJugador(2, 8)) {
                    btn29.setBackground(Color.red);
                } else {
                    btn29.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn29ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        if (btn30.isSelected()) {
            if (control.disparable(2, 9)) {
                if (control.generarDisparoJugador(2, 9)) {
                    btn30.setBackground(Color.red);
                } else {
                    btn30.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        if (btn31.isSelected()) {
            if (control.disparable(3, 0)) {
                if (control.generarDisparoJugador(3, 0)) {
                    btn31.setBackground(Color.red);
                } else {
                    btn31.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        if (btn32.isSelected()) {
            if (control.disparable(3, 1)) {
                if (control.generarDisparoJugador(3, 1)) {
                    btn32.setBackground(Color.red);
                } else {
                    btn32.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        if (btn33.isSelected()) {
            if (control.disparable(3, 2)) {
                if (control.generarDisparoJugador(3, 2)) {
                    btn33.setBackground(Color.red);
                } else {
                    btn33.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34ActionPerformed
        if (btn34.isSelected()) {
            if (control.disparable(3, 3)) {
                if (control.generarDisparoJugador(3, 3)) {
                    btn34.setBackground(Color.red);
                } else {
                    btn34.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn34ActionPerformed

    private void btn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn35ActionPerformed
        if (btn35.isSelected()) {
            if (control.disparable(3, 4)) {
                if (control.generarDisparoJugador(3, 4)) {
                    btn35.setBackground(Color.red);
                } else {
                    btn35.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn35ActionPerformed

    private void btn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn36ActionPerformed
        if (btn36.isSelected()) {
            if (control.disparable(3, 5)) {
                if (control.generarDisparoJugador(3, 5)) {
                    btn36.setBackground(Color.red);
                } else {
                    btn36.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn36ActionPerformed

    private void btn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn37ActionPerformed
        if (btn37.isSelected()) {
            if (control.disparable(3, 6)) {
                if (control.generarDisparoJugador(3, 6)) {
                    btn37.setBackground(Color.red);
                } else {
                    btn37.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn37ActionPerformed

    private void btn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn38ActionPerformed
        if (btn38.isSelected()) {
            if (control.disparable(3, 7)) {
                if (control.generarDisparoJugador(3, 7)) {
                    btn38.setBackground(Color.red);
                } else {
                    btn38.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn38ActionPerformed

    private void btn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn39ActionPerformed
        if (btn39.isSelected()) {
            if (control.disparable(3, 8)) {
                if (control.generarDisparoJugador(3, 8)) {
                    btn39.setBackground(Color.red);
                } else {
                    btn39.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn39ActionPerformed

    private void btn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn40ActionPerformed
        if (btn40.isSelected()) {
            if (control.disparable(3, 9)) {
                if (control.generarDisparoJugador(3, 9)) {
                    btn40.setBackground(Color.red);
                } else {
                    btn40.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn40ActionPerformed

    private void btn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn41ActionPerformed
        if (btn41.isSelected()) {
            if (control.disparable(4, 0)) {
                if (control.generarDisparoJugador(4, 0)) {
                    btn41.setBackground(Color.red);
                } else {
                    btn41.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn41ActionPerformed

    private void btn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn42ActionPerformed
        if (btn42.isSelected()) {
            if (control.disparable(4, 1)) {
                if (control.generarDisparoJugador(4, 1)) {
                    btn42.setBackground(Color.red);
                } else {
                    btn42.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn42ActionPerformed

    private void btn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn43ActionPerformed
        if (btn43.isSelected()) {
            if (control.disparable(4, 2)) {
                if (control.generarDisparoJugador(4, 2)) {
                    btn43.setBackground(Color.red);
                } else {
                    btn43.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn43ActionPerformed

    private void btn44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn44ActionPerformed
        if (btn44.isSelected()) {
            if (control.disparable(4, 3)) {
                if (control.generarDisparoJugador(4, 3)) {
                    btn44.setBackground(Color.red);
                } else {
                    btn44.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn44ActionPerformed

    private void btn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn45ActionPerformed
        if (btn45.isSelected()) {
            if (control.disparable(4, 4)) {
                if (control.generarDisparoJugador(4, 4)) {
                    btn45.setBackground(Color.red);
                } else {
                    btn45.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn45ActionPerformed

    private void btn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn46ActionPerformed
        if (btn46.isSelected()) {
            if (control.disparable(4, 5)) {
                if (control.generarDisparoJugador(4, 5)) {
                    btn46.setBackground(Color.red);
                } else {
                    btn46.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn46ActionPerformed

    private void btn47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn47ActionPerformed
        if (btn47.isSelected()) {
            if (control.disparable(4, 6)) {
                if (control.generarDisparoJugador(4, 6)) {
                    btn47.setBackground(Color.red);
                } else {
                    btn47.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn47ActionPerformed

    private void btn48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn48ActionPerformed
        if (btn48.isSelected()) {
            if (control.disparable(4, 7)) {
                if (control.generarDisparoJugador(4, 7)) {
                    btn48.setBackground(Color.red);
                } else {
                    btn48.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn48ActionPerformed

    private void btn49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn49ActionPerformed
        if (btn49.isSelected()) {
            if (control.disparable(4, 8)) {
                if (control.generarDisparoJugador(4, 8)) {
                    btn49.setBackground(Color.red);
                } else {
                    btn49.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn49ActionPerformed

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
        if (btn50.isSelected()) {
            if (control.disparable(4, 9)) {
                if (control.generarDisparoJugador(4, 9)) {
                    btn50.setBackground(Color.red);
                } else {
                    btn50.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn50ActionPerformed

    private void btn51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn51ActionPerformed
        if (btn51.isSelected()) {
            if (control.disparable(5, 0)) {
                if (control.generarDisparoJugador(5, 0)) {
                    btn51.setBackground(Color.red);
                } else {
                    btn51.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn51ActionPerformed

    private void btn52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn52ActionPerformed
        if (btn52.isSelected()) {
            if (control.disparable(5, 1)) {
                if (control.generarDisparoJugador(5, 1)) {
                    btn52.setBackground(Color.red);
                } else {
                    btn52.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn52ActionPerformed

    private void btn53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn53ActionPerformed
        if (btn53.isSelected()) {
            if (control.disparable(5, 2)) {
                if (control.generarDisparoJugador(5, 2)) {
                    btn53.setBackground(Color.red);
                } else {
                    btn53.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn53ActionPerformed

    private void btn54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn54ActionPerformed
        if (btn54.isSelected()) {
            if (control.disparable(5, 3)) {
                if (control.generarDisparoJugador(5, 3)) {
                    btn54.setBackground(Color.red);
                } else {
                    btn54.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn54ActionPerformed

    private void btn55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn55ActionPerformed
        if (btn55.isSelected()) {
            if (control.disparable(5, 4)) {
                if (control.generarDisparoJugador(5, 4)) {
                    btn55.setBackground(Color.red);
                } else {
                    btn55.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn55ActionPerformed

    private void btn56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn56ActionPerformed
        if (btn56.isSelected()) {
            if (control.disparable(5, 5)) {
                if (control.generarDisparoJugador(5, 5)) {
                    btn56.setBackground(Color.red);
                } else {
                    btn56.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn56ActionPerformed

    private void btn57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn57ActionPerformed
        if (btn57.isSelected()) {
            if (control.disparable(5, 6)) {
                if (control.generarDisparoJugador(5, 6)) {
                    btn57.setBackground(Color.red);
                } else {
                    btn57.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn57ActionPerformed

    private void btn58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn58ActionPerformed
        if (btn58.isSelected()) {
            if (control.disparable(5, 7)) {
                if (control.generarDisparoJugador(5, 7)) {
                    btn58.setBackground(Color.red);
                } else {
                    btn58.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn58ActionPerformed

    private void btn59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn59ActionPerformed
        if (btn59.isSelected()) {
            if (control.disparable(5, 8)) {
                if (control.generarDisparoJugador(5, 8)) {
                    btn59.setBackground(Color.red);
                } else {
                    btn59.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn59ActionPerformed

    private void btn60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn60ActionPerformed
        if (btn60.isSelected()) {
            if (control.disparable(5, 9)) {
                if (control.generarDisparoJugador(5, 9)) {
                    btn60.setBackground(Color.red);
                } else {
                    btn60.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn60ActionPerformed

    private void btn61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn61ActionPerformed
        if (btn61.isSelected()) {
            if (control.disparable(6, 0)) {
                if (control.generarDisparoJugador(6, 0)) {
                    btn61.setBackground(Color.red);
                } else {
                    btn61.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn61ActionPerformed

    private void btn62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn62ActionPerformed
        if (btn62.isSelected()) {
            if (control.disparable(6, 1)) {
                if (control.generarDisparoJugador(6, 1)) {
                    btn62.setBackground(Color.red);
                } else {
                    btn62.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn62ActionPerformed

    private void btn63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn63ActionPerformed
        if (btn63.isSelected()) {
            if (control.disparable(6, 2)) {
                if (control.generarDisparoJugador(6, 2)) {
                    btn63.setBackground(Color.red);
                } else {
                    btn63.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn63ActionPerformed

    private void btn64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn64ActionPerformed
        if (btn64.isSelected()) {
            if (control.disparable(6, 3)) {
                if (control.generarDisparoJugador(6, 3)) {
                    btn64.setBackground(Color.red);
                } else {
                    btn64.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn64ActionPerformed

    private void btn65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn65ActionPerformed
        if (btn65.isSelected()) {
            if (control.disparable(6, 4)) {
                if (control.generarDisparoJugador(6, 4)) {
                    btn65.setBackground(Color.red);
                } else {
                    btn65.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn65ActionPerformed

    private void btn66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn66ActionPerformed
        if (btn66.isSelected()) {
            if (control.disparable(6, 5)) {
                if (control.generarDisparoJugador(6, 5)) {
                    btn66.setBackground(Color.red);
                } else {
                    btn66.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn66ActionPerformed

    private void btn67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn67ActionPerformed
        if (btn67.isSelected()) {
            if (control.disparable(6, 6)) {
                if (control.generarDisparoJugador(6, 6)) {
                    btn67.setBackground(Color.red);
                } else {
                    btn67.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn67ActionPerformed

    private void btn68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn68ActionPerformed
        if (btn68.isSelected()) {
            if (control.disparable(6, 7)) {
                if (control.generarDisparoJugador(6, 7)) {
                    btn68.setBackground(Color.red);
                } else {
                    btn68.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn68ActionPerformed

    private void btn69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn69ActionPerformed
        if (btn69.isSelected()) {
            if (control.disparable(6, 8)) {
                if (control.generarDisparoJugador(6, 8)) {
                    btn69.setBackground(Color.red);
                } else {
                    btn69.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn69ActionPerformed

    private void btn70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn70ActionPerformed
        if (btn70.isSelected()) {
            if (control.disparable(6, 9)) {
                if (control.generarDisparoJugador(6, 9)) {
                    btn70.setBackground(Color.red);
                } else {
                    btn70.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn70ActionPerformed

    private void btn71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn71ActionPerformed
        if (btn71.isSelected()) {
            if (control.disparable(7, 0)) {
                if (control.generarDisparoJugador(7, 0)) {
                    btn71.setBackground(Color.red);
                } else {
                    btn71.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn71ActionPerformed

    private void btn72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn72ActionPerformed
        if (btn72.isSelected()) {
            if (control.disparable(7, 1)) {
                if (control.generarDisparoJugador(7, 1)) {
                    btn72.setBackground(Color.red);
                } else {
                    btn72.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn72ActionPerformed

    private void btn73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn73ActionPerformed
        if (btn73.isSelected()) {
            if (control.disparable(7, 2)) {
                if (control.generarDisparoJugador(7, 2)) {
                    btn73.setBackground(Color.red);
                } else {
                    btn73.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn73ActionPerformed

    private void btn74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn74ActionPerformed
        if (btn74.isSelected()) {
            if (control.disparable(7, 3)) {
                if (control.generarDisparoJugador(7, 3)) {
                    btn74.setBackground(Color.red);
                } else {
                    btn74.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn74ActionPerformed

    private void btn75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn75ActionPerformed
        if (btn75.isSelected()) {
            if (control.disparable(7, 4)) {
                if (control.generarDisparoJugador(7, 4)) {
                    btn75.setBackground(Color.red);
                } else {
                    btn75.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn75ActionPerformed

    private void btn76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn76ActionPerformed
        if (btn76.isSelected()) {
            if (control.disparable(7, 5)) {
                if (control.generarDisparoJugador(7, 5)) {
                    btn76.setBackground(Color.red);
                } else {
                    btn76.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn76ActionPerformed

    private void btn77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn77ActionPerformed
        if (btn77.isSelected()) {
            if (control.disparable(7, 6)) {
                if (control.generarDisparoJugador(7, 6)) {
                    btn77.setBackground(Color.red);
                } else {
                    btn77.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn77ActionPerformed

    private void btn78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn78ActionPerformed
        if (btn78.isSelected()) {
            if (control.disparable(7, 7)) {
                if (control.generarDisparoJugador(7, 7)) {
                    btn78.setBackground(Color.red);
                } else {
                    btn78.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn78ActionPerformed

    private void btn79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn79ActionPerformed
        if (btn79.isSelected()) {
            if (control.disparable(7, 8)) {
                if (control.generarDisparoJugador(7, 8)) {
                    btn79.setBackground(Color.red);
                } else {
                    btn79.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn79ActionPerformed

    private void btn80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn80ActionPerformed
        if (btn80.isSelected()) {
            if (control.disparable(7, 9)) {
                if (control.generarDisparoJugador(7, 9)) {
                    btn80.setBackground(Color.red);
                } else {
                    btn80.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn80ActionPerformed

    private void btn81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn81ActionPerformed
        if (btn81.isSelected()) {
            if (control.disparable(8, 0)) {
                if (control.generarDisparoJugador(8, 0)) {
                    btn81.setBackground(Color.red);
                } else {
                    btn81.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn81ActionPerformed

    private void btn82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn82ActionPerformed
        if (btn82.isSelected()) {
            if (control.disparable(8, 1)) {
                if (control.generarDisparoJugador(8, 1)) {
                    btn82.setBackground(Color.red);
                } else {
                    btn82.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn82ActionPerformed

    private void btn83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn83ActionPerformed
        if (btn83.isSelected()) {
            if (control.disparable(8, 2)) {
                if (control.generarDisparoJugador(8, 2)) {
                    btn83.setBackground(Color.red);
                } else {
                    btn83.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn83ActionPerformed

    private void btn84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn84ActionPerformed
        if (btn84.isSelected()) {
            if (control.disparable(8, 3)) {
                if (control.generarDisparoJugador(8, 3)) {
                    btn84.setBackground(Color.red);
                } else {
                    btn84.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn84ActionPerformed

    private void btn85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn85ActionPerformed
        if (btn85.isSelected()) {
            if (control.disparable(8, 4)) {
                if (control.generarDisparoJugador(8, 4)) {
                    btn85.setBackground(Color.red);
                } else {
                    btn85.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn85ActionPerformed

    private void btn86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn86ActionPerformed
        if (btn86.isSelected()) {
            if (control.disparable(8, 5)) {
                if (control.generarDisparoJugador(8, 5)) {
                    btn86.setBackground(Color.red);
                } else {
                    btn86.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn86ActionPerformed

    private void btn87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn87ActionPerformed
        if (btn87.isSelected()) {
            if (control.disparable(8, 6)) {
                if (control.generarDisparoJugador(8, 6)) {
                    btn87.setBackground(Color.red);
                } else {
                    btn87.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn87ActionPerformed

    private void btn88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn88ActionPerformed
        if (btn88.isSelected()) {
            if (control.disparable(8, 7)) {
                if (control.generarDisparoJugador(8, 7)) {
                    btn88.setBackground(Color.red);
                } else {
                    btn88.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn88ActionPerformed

    private void btn89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn89ActionPerformed
        if (btn89.isSelected()) {
            if (control.disparable(8, 8)) {
                if (control.generarDisparoJugador(8, 8)) {
                    btn89.setBackground(Color.red);
                } else {
                    btn89.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn89ActionPerformed

    private void btn90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn90ActionPerformed
        if (btn90.isSelected()) {
            if (control.disparable(8, 9)) {
                if (control.generarDisparoJugador(8, 9)) {
                    btn90.setBackground(Color.red);
                } else {
                    btn90.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn90ActionPerformed

    private void btn91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn91ActionPerformed
        if (btn91.isSelected()) {
            if (control.disparable(9, 0)) {
                if (control.generarDisparoJugador(9, 0)) {
                    btn91.setBackground(Color.red);
                } else {
                    btn91.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn91ActionPerformed

    private void btn92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn92ActionPerformed
        if (btn92.isSelected()) {
            if (control.disparable(9, 1)) {
                if (control.generarDisparoJugador(9, 1)) {
                    btn92.setBackground(Color.red);
                } else {
                    btn92.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn92ActionPerformed

    private void btn93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn93ActionPerformed
        if (btn93.isSelected()) {
            if (control.disparable(9, 2)) {
                if (control.generarDisparoJugador(9, 2)) {
                    btn93.setBackground(Color.red);
                } else {
                    btn93.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn93ActionPerformed

    private void btn94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn94ActionPerformed
        if (btn94.isSelected()) {
            if (control.disparable(9, 3)) {
                if (control.generarDisparoJugador(9, 3)) {
                    btn94.setBackground(Color.red);
                } else {
                    btn94.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn94ActionPerformed

    private void btn95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn95ActionPerformed
        if (btn95.isSelected()) {
            if (control.disparable(9, 4)) {
                if (control.generarDisparoJugador(9, 4)) {
                    btn95.setBackground(Color.red);
                } else {
                    btn95.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn95ActionPerformed

    private void btn96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn96ActionPerformed
        if (btn96.isSelected()) {
            if (control.disparable(9, 5)) {
                if (control.generarDisparoJugador(9, 5)) {
                    btn96.setBackground(Color.red);
                } else {
                    btn96.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn96ActionPerformed

    private void btn97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn97ActionPerformed
        if (btn97.isSelected()) {
            if (control.disparable(9, 6)) {
                if (control.generarDisparoJugador(9, 6)) {
                    btn97.setBackground(Color.red);
                } else {
                    btn97.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn97ActionPerformed

    private void btn98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn98ActionPerformed
        if (btn98.isSelected()) {
            if (control.disparable(9, 7)) {
                if (control.generarDisparoJugador(9, 7)) {
                    btn98.setBackground(Color.red);
                } else {
                    btn98.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn98ActionPerformed

    private void btn99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn99ActionPerformed
        if (btn99.isSelected()) {
            if (control.disparable(9, 8)) {
                if (control.generarDisparoJugador(9, 8)) {
                    btn99.setBackground(Color.red);
                } else {
                    btn99.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn99ActionPerformed

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        if (btn100.isSelected()) {
            if (control.disparable(9, 9)) {
                if (control.generarDisparoJugador(9, 9)) {
                    btn100.setBackground(Color.red);
                } else {
                    btn100.setBackground(Color.blue);
                }
                revisarEstado();
            }
        }
            }//GEN-LAST:event_btn100ActionPerformed

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
    private javax.swing.JToggleButton btn1;
    private javax.swing.JToggleButton btn10;
    private javax.swing.JToggleButton btn100;
    private javax.swing.JToggleButton btn11;
    private javax.swing.JToggleButton btn12;
    private javax.swing.JToggleButton btn13;
    private javax.swing.JToggleButton btn14;
    private javax.swing.JToggleButton btn15;
    private javax.swing.JToggleButton btn16;
    private javax.swing.JToggleButton btn17;
    private javax.swing.JToggleButton btn18;
    private javax.swing.JToggleButton btn19;
    private javax.swing.JToggleButton btn2;
    private javax.swing.JToggleButton btn20;
    private javax.swing.JToggleButton btn21;
    private javax.swing.JToggleButton btn22;
    private javax.swing.JToggleButton btn23;
    private javax.swing.JToggleButton btn24;
    private javax.swing.JToggleButton btn25;
    private javax.swing.JToggleButton btn26;
    private javax.swing.JToggleButton btn27;
    private javax.swing.JToggleButton btn28;
    private javax.swing.JToggleButton btn29;
    private javax.swing.JToggleButton btn3;
    private javax.swing.JToggleButton btn30;
    private javax.swing.JToggleButton btn31;
    private javax.swing.JToggleButton btn32;
    private javax.swing.JToggleButton btn33;
    private javax.swing.JToggleButton btn34;
    private javax.swing.JToggleButton btn35;
    private javax.swing.JToggleButton btn36;
    private javax.swing.JToggleButton btn37;
    private javax.swing.JToggleButton btn38;
    private javax.swing.JToggleButton btn39;
    private javax.swing.JToggleButton btn4;
    private javax.swing.JToggleButton btn40;
    private javax.swing.JToggleButton btn41;
    private javax.swing.JToggleButton btn42;
    private javax.swing.JToggleButton btn43;
    private javax.swing.JToggleButton btn44;
    private javax.swing.JToggleButton btn45;
    private javax.swing.JToggleButton btn46;
    private javax.swing.JToggleButton btn47;
    private javax.swing.JToggleButton btn48;
    private javax.swing.JToggleButton btn49;
    private javax.swing.JToggleButton btn5;
    private javax.swing.JToggleButton btn50;
    private javax.swing.JToggleButton btn51;
    private javax.swing.JToggleButton btn52;
    private javax.swing.JToggleButton btn53;
    private javax.swing.JToggleButton btn54;
    private javax.swing.JToggleButton btn55;
    private javax.swing.JToggleButton btn56;
    private javax.swing.JToggleButton btn57;
    private javax.swing.JToggleButton btn58;
    private javax.swing.JToggleButton btn59;
    private javax.swing.JToggleButton btn6;
    private javax.swing.JToggleButton btn60;
    private javax.swing.JToggleButton btn61;
    private javax.swing.JToggleButton btn62;
    private javax.swing.JToggleButton btn63;
    private javax.swing.JToggleButton btn64;
    private javax.swing.JToggleButton btn65;
    private javax.swing.JToggleButton btn66;
    private javax.swing.JToggleButton btn67;
    private javax.swing.JToggleButton btn68;
    private javax.swing.JToggleButton btn69;
    private javax.swing.JToggleButton btn7;
    private javax.swing.JToggleButton btn70;
    private javax.swing.JToggleButton btn71;
    private javax.swing.JToggleButton btn72;
    private javax.swing.JToggleButton btn73;
    private javax.swing.JToggleButton btn74;
    private javax.swing.JToggleButton btn75;
    private javax.swing.JToggleButton btn76;
    private javax.swing.JToggleButton btn77;
    private javax.swing.JToggleButton btn78;
    private javax.swing.JToggleButton btn79;
    private javax.swing.JToggleButton btn8;
    private javax.swing.JToggleButton btn80;
    private javax.swing.JToggleButton btn81;
    private javax.swing.JToggleButton btn82;
    private javax.swing.JToggleButton btn83;
    private javax.swing.JToggleButton btn84;
    private javax.swing.JToggleButton btn85;
    private javax.swing.JToggleButton btn86;
    private javax.swing.JToggleButton btn87;
    private javax.swing.JToggleButton btn88;
    private javax.swing.JToggleButton btn89;
    private javax.swing.JToggleButton btn9;
    private javax.swing.JToggleButton btn90;
    private javax.swing.JToggleButton btn91;
    private javax.swing.JToggleButton btn92;
    private javax.swing.JToggleButton btn93;
    private javax.swing.JToggleButton btn94;
    private javax.swing.JToggleButton btn95;
    private javax.swing.JToggleButton btn96;
    private javax.swing.JToggleButton btn97;
    private javax.swing.JToggleButton btn98;
    private javax.swing.JToggleButton btn99;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton116;
    private javax.swing.JButton jButton117;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton119;
    private javax.swing.JButton jButton120;
    private javax.swing.JButton jButton121;
    private javax.swing.JButton jButton122;
    private javax.swing.JButton jButton123;
    private javax.swing.JButton jButton124;
    private javax.swing.JButton jButton125;
    private javax.swing.JButton jButton126;
    private javax.swing.JButton jButton127;
    private javax.swing.JButton jButton128;
    private javax.swing.JButton jButton129;
    private javax.swing.JButton jButton130;
    private javax.swing.JButton jButton131;
    private javax.swing.JButton jButton132;
    private javax.swing.JButton jButton133;
    private javax.swing.JButton jButton134;
    private javax.swing.JButton jButton135;
    private javax.swing.JButton jButton136;
    private javax.swing.JButton jButton137;
    private javax.swing.JButton jButton138;
    private javax.swing.JButton jButton139;
    private javax.swing.JButton jButton140;
    private javax.swing.JButton jButton141;
    private javax.swing.JButton jButton142;
    private javax.swing.JButton jButton143;
    private javax.swing.JButton jButton144;
    private javax.swing.JButton jButton145;
    private javax.swing.JButton jButton146;
    private javax.swing.JButton jButton147;
    private javax.swing.JButton jButton148;
    private javax.swing.JButton jButton149;
    private javax.swing.JButton jButton150;
    private javax.swing.JButton jButton151;
    private javax.swing.JButton jButton152;
    private javax.swing.JButton jButton153;
    private javax.swing.JButton jButton154;
    private javax.swing.JButton jButton155;
    private javax.swing.JButton jButton156;
    private javax.swing.JButton jButton157;
    private javax.swing.JButton jButton158;
    private javax.swing.JButton jButton159;
    private javax.swing.JButton jButton160;
    private javax.swing.JButton jButton161;
    private javax.swing.JButton jButton162;
    private javax.swing.JButton jButton163;
    private javax.swing.JButton jButton164;
    private javax.swing.JButton jButton165;
    private javax.swing.JButton jButton166;
    private javax.swing.JButton jButton167;
    private javax.swing.JButton jButton168;
    private javax.swing.JButton jButton169;
    private javax.swing.JButton jButton170;
    private javax.swing.JButton jButton171;
    private javax.swing.JButton jButton172;
    private javax.swing.JButton jButton173;
    private javax.swing.JButton jButton174;
    private javax.swing.JButton jButton175;
    private javax.swing.JButton jButton176;
    private javax.swing.JButton jButton177;
    private javax.swing.JButton jButton178;
    private javax.swing.JButton jButton179;
    private javax.swing.JButton jButton180;
    private javax.swing.JButton jButton181;
    private javax.swing.JButton jButton182;
    private javax.swing.JButton jButton183;
    private javax.swing.JButton jButton184;
    private javax.swing.JButton jButton185;
    private javax.swing.JButton jButton186;
    private javax.swing.JButton jButton187;
    private javax.swing.JButton jButton188;
    private javax.swing.JButton jButton189;
    private javax.swing.JButton jButton190;
    private javax.swing.JButton jButton191;
    private javax.swing.JButton jButton192;
    private javax.swing.JButton jButton193;
    private javax.swing.JButton jButton194;
    private javax.swing.JButton jButton195;
    private javax.swing.JButton jButton196;
    private javax.swing.JButton jButton197;
    private javax.swing.JButton jButton198;
    private javax.swing.JButton jButton199;
    private javax.swing.JButton jButton200;
    private javax.swing.JButton jButton201;
    private javax.swing.JButton jButton202;
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
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
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
    private javax.swing.JPanel jPanel128;
    private javax.swing.JPanel jPanel129;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel130;
    private javax.swing.JPanel jPanel131;
    private javax.swing.JPanel jPanel132;
    private javax.swing.JPanel jPanel133;
    private javax.swing.JPanel jPanel134;
    private javax.swing.JPanel jPanel135;
    private javax.swing.JPanel jPanel136;
    private javax.swing.JPanel jPanel137;
    private javax.swing.JPanel jPanel138;
    private javax.swing.JPanel jPanel139;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel140;
    private javax.swing.JPanel jPanel141;
    private javax.swing.JPanel jPanel142;
    private javax.swing.JPanel jPanel143;
    private javax.swing.JPanel jPanel144;
    private javax.swing.JPanel jPanel145;
    private javax.swing.JPanel jPanel146;
    private javax.swing.JPanel jPanel147;
    private javax.swing.JPanel jPanel148;
    private javax.swing.JPanel jPanel149;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel151;
    private javax.swing.JPanel jPanel152;
    private javax.swing.JPanel jPanel153;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel155;
    private javax.swing.JPanel jPanel156;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JPanel jPanel158;
    private javax.swing.JPanel jPanel159;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel160;
    private javax.swing.JPanel jPanel161;
    private javax.swing.JPanel jPanel162;
    private javax.swing.JPanel jPanel163;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel165;
    private javax.swing.JPanel jPanel166;
    private javax.swing.JPanel jPanel167;
    private javax.swing.JPanel jPanel168;
    private javax.swing.JPanel jPanel169;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel170;
    private javax.swing.JPanel jPanel171;
    private javax.swing.JPanel jPanel172;
    private javax.swing.JPanel jPanel173;
    private javax.swing.JPanel jPanel174;
    private javax.swing.JPanel jPanel175;
    private javax.swing.JPanel jPanel176;
    private javax.swing.JPanel jPanel177;
    private javax.swing.JPanel jPanel178;
    private javax.swing.JPanel jPanel179;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel180;
    private javax.swing.JPanel jPanel181;
    private javax.swing.JPanel jPanel182;
    private javax.swing.JPanel jPanel183;
    private javax.swing.JPanel jPanel184;
    private javax.swing.JPanel jPanel185;
    private javax.swing.JPanel jPanel186;
    private javax.swing.JPanel jPanel187;
    private javax.swing.JPanel jPanel188;
    private javax.swing.JPanel jPanel189;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel190;
    private javax.swing.JPanel jPanel191;
    private javax.swing.JPanel jPanel192;
    private javax.swing.JPanel jPanel193;
    private javax.swing.JPanel jPanel194;
    private javax.swing.JPanel jPanel195;
    private javax.swing.JPanel jPanel196;
    private javax.swing.JPanel jPanel197;
    private javax.swing.JPanel jPanel198;
    private javax.swing.JPanel jPanel199;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel200;
    private javax.swing.JPanel jPanel201;
    private javax.swing.JPanel jPanel202;
    private javax.swing.JPanel jPanel203;
    private javax.swing.JPanel jPanel204;
    private javax.swing.JPanel jPanel205;
    private javax.swing.JPanel jPanel206;
    private javax.swing.JPanel jPanel207;
    private javax.swing.JPanel jPanel208;
    private javax.swing.JPanel jPanel209;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel210;
    private javax.swing.JPanel jPanel211;
    private javax.swing.JPanel jPanel212;
    private javax.swing.JPanel jPanel213;
    private javax.swing.JPanel jPanel214;
    private javax.swing.JPanel jPanel215;
    private javax.swing.JPanel jPanel216;
    private javax.swing.JPanel jPanel217;
    private javax.swing.JPanel jPanel218;
    private javax.swing.JPanel jPanel219;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel220;
    private javax.swing.JPanel jPanel221;
    private javax.swing.JPanel jPanel222;
    private javax.swing.JPanel jPanel223;
    private javax.swing.JPanel jPanel224;
    private javax.swing.JPanel jPanel225;
    private javax.swing.JPanel jPanel226;
    private javax.swing.JPanel jPanel227;
    private javax.swing.JPanel jPanel228;
    private javax.swing.JPanel jPanel229;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel230;
    private javax.swing.JPanel jPanel231;
    private javax.swing.JPanel jPanel232;
    private javax.swing.JPanel jPanel233;
    private javax.swing.JPanel jPanel234;
    private javax.swing.JPanel jPanel235;
    private javax.swing.JPanel jPanel236;
    private javax.swing.JPanel jPanel237;
    private javax.swing.JPanel jPanel238;
    private javax.swing.JPanel jPanel239;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel240;
    private javax.swing.JPanel jPanel241;
    private javax.swing.JPanel jPanel242;
    private javax.swing.JPanel jPanel243;
    private javax.swing.JPanel jPanel244;
    private javax.swing.JPanel jPanel245;
    private javax.swing.JPanel jPanel246;
    private javax.swing.JPanel jPanel247;
    private javax.swing.JPanel jPanel248;
    private javax.swing.JPanel jPanel249;
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
    private javax.swing.JPanel jPanel5;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
