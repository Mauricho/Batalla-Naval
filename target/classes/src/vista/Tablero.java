/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.vista;

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

    public void cargarImagenes(){
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
        x0y0 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        x0y1 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        x0y2 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        x0x3 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        x0x4 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        x0x5 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        x0x6 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        x0x7 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        x0x8 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        x0x9 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        x1x0 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        x1y1 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        x1y2 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        x1y3 = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        x1y4 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        x1y5 = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        x1y6 = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        x1y7 = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        x1y8 = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        x1y9 = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        x2y0 = new javax.swing.JButton();
        jPanel41 = new javax.swing.JPanel();
        x2y1 = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        x2y2 = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        x2y3 = new javax.swing.JButton();
        jPanel44 = new javax.swing.JPanel();
        x2y4 = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        x2y5 = new javax.swing.JButton();
        jPanel46 = new javax.swing.JPanel();
        x2y6 = new javax.swing.JButton();
        jPanel47 = new javax.swing.JPanel();
        x2y7 = new javax.swing.JButton();
        jPanel48 = new javax.swing.JPanel();
        x2y8 = new javax.swing.JButton();
        jPanel49 = new javax.swing.JPanel();
        x2y9 = new javax.swing.JButton();
        jPanel50 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        x3y0 = new javax.swing.JButton();
        jPanel52 = new javax.swing.JPanel();
        x3y1 = new javax.swing.JButton();
        jPanel53 = new javax.swing.JPanel();
        x3y2 = new javax.swing.JButton();
        jPanel54 = new javax.swing.JPanel();
        x3y3 = new javax.swing.JButton();
        jPanel55 = new javax.swing.JPanel();
        x3y4 = new javax.swing.JButton();
        jPanel56 = new javax.swing.JPanel();
        x3y5 = new javax.swing.JButton();
        jPanel57 = new javax.swing.JPanel();
        x3y6 = new javax.swing.JButton();
        jPanel58 = new javax.swing.JPanel();
        x3y7 = new javax.swing.JButton();
        jPanel59 = new javax.swing.JPanel();
        x3y8 = new javax.swing.JButton();
        jPanel60 = new javax.swing.JPanel();
        x3y9 = new javax.swing.JButton();
        jPanel61 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        x4y0 = new javax.swing.JButton();
        jPanel63 = new javax.swing.JPanel();
        x4y1 = new javax.swing.JButton();
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

        x0y0.setToolTipText("");
        x0y0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0y0ActionPerformed(evt);
            }
        });
        jPanel18.add(x0y0, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel18);

        jPanel19.setLayout(new java.awt.BorderLayout());

        x0y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0y1ActionPerformed(evt);
            }
        });
        jPanel19.add(x0y1, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel19);

        jPanel20.setLayout(new java.awt.BorderLayout());

        x0y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0y2ActionPerformed(evt);
            }
        });
        jPanel20.add(x0y2, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel20);

        jPanel21.setLayout(new java.awt.BorderLayout());

        x0x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0x3ActionPerformed(evt);
            }
        });
        jPanel21.add(x0x3, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel21);

        jPanel22.setLayout(new java.awt.BorderLayout());

        x0x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0x4ActionPerformed(evt);
            }
        });
        jPanel22.add(x0x4, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel22);

        jPanel23.setLayout(new java.awt.BorderLayout());

        x0x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0x5ActionPerformed(evt);
            }
        });
        jPanel23.add(x0x5, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel23);

        jPanel24.setLayout(new java.awt.BorderLayout());

        x0x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0x6ActionPerformed(evt);
            }
        });
        jPanel24.add(x0x6, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel24);

        jPanel25.setLayout(new java.awt.BorderLayout());

        x0x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0x7ActionPerformed(evt);
            }
        });
        jPanel25.add(x0x7, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel25);

        jPanel26.setLayout(new java.awt.BorderLayout());

        x0x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0x8ActionPerformed(evt);
            }
        });
        jPanel26.add(x0x8, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel26);

        jPanel27.setLayout(new java.awt.BorderLayout());

        x0x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0x9ActionPerformed(evt);
            }
        });
        jPanel27.add(x0x9, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel27);

        jPanel28.setLayout(new java.awt.BorderLayout());

        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText("B");
        jPanel28.add(jLabel114, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel28);

        jPanel29.setLayout(new java.awt.BorderLayout());

        x1x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1x0ActionPerformed(evt);
            }
        });
        jPanel29.add(x1x0, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel29);

        jPanel30.setLayout(new java.awt.BorderLayout());

        x1y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1y1ActionPerformed(evt);
            }
        });
        jPanel30.add(x1y1, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel30);

        jPanel31.setLayout(new java.awt.BorderLayout());

        x1y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1y2ActionPerformed(evt);
            }
        });
        jPanel31.add(x1y2, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel31);

        jPanel32.setLayout(new java.awt.BorderLayout());

        x1y3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1y3ActionPerformed(evt);
            }
        });
        jPanel32.add(x1y3, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel32);

        jPanel33.setLayout(new java.awt.BorderLayout());

        x1y4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1y4ActionPerformed(evt);
            }
        });
        jPanel33.add(x1y4, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel33);

        jPanel34.setLayout(new java.awt.BorderLayout());

        x1y5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1y5ActionPerformed(evt);
            }
        });
        jPanel34.add(x1y5, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel34);

        jPanel35.setLayout(new java.awt.BorderLayout());

        x1y6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1y6ActionPerformed(evt);
            }
        });
        jPanel35.add(x1y6, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel35);

        jPanel36.setLayout(new java.awt.BorderLayout());

        x1y7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1y7ActionPerformed(evt);
            }
        });
        jPanel36.add(x1y7, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel36);

        jPanel37.setLayout(new java.awt.BorderLayout());

        x1y8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1y8ActionPerformed(evt);
            }
        });
        jPanel37.add(x1y8, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel37);

        jPanel38.setLayout(new java.awt.BorderLayout());

        x1y9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1y9ActionPerformed(evt);
            }
        });
        jPanel38.add(x1y9, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel38);

        jPanel39.setLayout(new java.awt.BorderLayout());

        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("C");
        jPanel39.add(jLabel116, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel39);

        jPanel40.setLayout(new java.awt.BorderLayout());

        x2y0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2y0ActionPerformed(evt);
            }
        });
        jPanel40.add(x2y0, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel40);

        jPanel41.setLayout(new java.awt.BorderLayout());

        x2y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2y1ActionPerformed(evt);
            }
        });
        jPanel41.add(x2y1, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel41);

        jPanel42.setLayout(new java.awt.BorderLayout());

        x2y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2y2ActionPerformed(evt);
            }
        });
        jPanel42.add(x2y2, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel42);

        jPanel43.setLayout(new java.awt.BorderLayout());

        x2y3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2y3ActionPerformed(evt);
            }
        });
        jPanel43.add(x2y3, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel43);

        jPanel44.setLayout(new java.awt.BorderLayout());

        x2y4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2y4ActionPerformed(evt);
            }
        });
        jPanel44.add(x2y4, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel44);

        jPanel45.setLayout(new java.awt.BorderLayout());

        x2y5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2y5ActionPerformed(evt);
            }
        });
        jPanel45.add(x2y5, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel45);

        jPanel46.setLayout(new java.awt.BorderLayout());

        x2y6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2y6ActionPerformed(evt);
            }
        });
        jPanel46.add(x2y6, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel46);

        jPanel47.setLayout(new java.awt.BorderLayout());

        x2y7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2y7ActionPerformed(evt);
            }
        });
        jPanel47.add(x2y7, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel47);

        jPanel48.setLayout(new java.awt.BorderLayout());

        x2y8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2y8ActionPerformed(evt);
            }
        });
        jPanel48.add(x2y8, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel48);

        jPanel49.setLayout(new java.awt.BorderLayout());

        x2y9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2y9ActionPerformed(evt);
            }
        });
        jPanel49.add(x2y9, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel49);

        jPanel50.setLayout(new java.awt.BorderLayout());

        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("D");
        jPanel50.add(jLabel117, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel50);

        jPanel51.setLayout(new java.awt.BorderLayout());

        x3y0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3y0ActionPerformed(evt);
            }
        });
        jPanel51.add(x3y0, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel51);

        jPanel52.setLayout(new java.awt.BorderLayout());

        x3y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3y1ActionPerformed(evt);
            }
        });
        jPanel52.add(x3y1, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel52);

        jPanel53.setLayout(new java.awt.BorderLayout());

        x3y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3y2ActionPerformed(evt);
            }
        });
        jPanel53.add(x3y2, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel53);

        jPanel54.setLayout(new java.awt.BorderLayout());

        x3y3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3y3ActionPerformed(evt);
            }
        });
        jPanel54.add(x3y3, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel54);

        jPanel55.setLayout(new java.awt.BorderLayout());

        x3y4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3y4ActionPerformed(evt);
            }
        });
        jPanel55.add(x3y4, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel55);

        jPanel56.setLayout(new java.awt.BorderLayout());

        x3y5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3y5ActionPerformed(evt);
            }
        });
        jPanel56.add(x3y5, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel56);

        jPanel57.setLayout(new java.awt.BorderLayout());

        x3y6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3y6ActionPerformed(evt);
            }
        });
        jPanel57.add(x3y6, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel57);

        jPanel58.setLayout(new java.awt.BorderLayout());

        x3y7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3y7ActionPerformed(evt);
            }
        });
        jPanel58.add(x3y7, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel58);

        jPanel59.setLayout(new java.awt.BorderLayout());

        x3y8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3y8ActionPerformed(evt);
            }
        });
        jPanel59.add(x3y8, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel59);

        jPanel60.setLayout(new java.awt.BorderLayout());

        x3y9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3y9ActionPerformed(evt);
            }
        });
        jPanel60.add(x3y9, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel60);

        jPanel61.setLayout(new java.awt.BorderLayout());

        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel118.setText("E");
        jPanel61.add(jLabel118, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel61);

        jPanel62.setLayout(new java.awt.BorderLayout());

        x4y0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x4y0ActionPerformed(evt);
            }
        });
        jPanel62.add(x4y0, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel62);

        jPanel63.setLayout(new java.awt.BorderLayout());

        x4y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x4y1ActionPerformed(evt);
            }
        });
        jPanel63.add(x4y1, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel63);

        jPanel64.setLayout(new java.awt.BorderLayout());

        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel64.add(jButton44, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel64);

        jPanel65.setLayout(new java.awt.BorderLayout());

        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel65.add(jButton45, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel65);

        jPanel66.setLayout(new java.awt.BorderLayout());

        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel66.add(jButton46, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel66);

        jPanel67.setLayout(new java.awt.BorderLayout());

        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel67.add(jButton47, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel67);

        jPanel68.setLayout(new java.awt.BorderLayout());

        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel68.add(jButton48, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel68);

        jPanel69.setLayout(new java.awt.BorderLayout());

        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel69.add(jButton49, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel69);

        jPanel70.setLayout(new java.awt.BorderLayout());

        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel70.add(jButton50, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel70);

        jPanel71.setLayout(new java.awt.BorderLayout());

        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel71.add(jButton51, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel71);

        jPanel72.setLayout(new java.awt.BorderLayout());

        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel119.setText("F");
        jPanel72.add(jLabel119, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel72);

        jPanel73.setLayout(new java.awt.BorderLayout());

        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jPanel73.add(jButton52, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel73);

        jPanel74.setLayout(new java.awt.BorderLayout());

        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel74.add(jButton53, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel74);

        jPanel75.setLayout(new java.awt.BorderLayout());

        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel75.add(jButton54, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel75);

        jPanel76.setLayout(new java.awt.BorderLayout());

        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jPanel76.add(jButton56, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel76);

        jPanel77.setLayout(new java.awt.BorderLayout());

        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        jPanel77.add(jButton57, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel77);

        jPanel78.setLayout(new java.awt.BorderLayout());

        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel78.add(jButton30, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel78);

        jPanel79.setLayout(new java.awt.BorderLayout());

        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        jPanel79.add(jButton58, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel79);

        jPanel80.setLayout(new java.awt.BorderLayout());

        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        jPanel80.add(jButton59, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel80);

        jPanel81.setLayout(new java.awt.BorderLayout());

        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });
        jPanel81.add(jButton60, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel81);

        jPanel82.setLayout(new java.awt.BorderLayout());

        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        jPanel82.add(jButton61, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel82);

        jPanel83.setLayout(new java.awt.BorderLayout());

        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel120.setText("G");
        jPanel83.add(jLabel120, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel83);

        jPanel84.setLayout(new java.awt.BorderLayout());

        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        jPanel84.add(jButton62, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel84);

        jPanel85.setLayout(new java.awt.BorderLayout());

        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        jPanel85.add(jButton63, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel85);

        jPanel86.setLayout(new java.awt.BorderLayout());

        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        jPanel86.add(jButton64, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel86);

        jPanel87.setLayout(new java.awt.BorderLayout());

        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });
        jPanel87.add(jButton65, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel87);

        jPanel88.setLayout(new java.awt.BorderLayout());

        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });
        jPanel88.add(jButton67, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel88);

        jPanel89.setLayout(new java.awt.BorderLayout());

        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });
        jPanel89.add(jButton66, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel89);

        jPanel90.setLayout(new java.awt.BorderLayout());

        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });
        jPanel90.add(jButton68, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel90);

        jPanel91.setLayout(new java.awt.BorderLayout());

        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });
        jPanel91.add(jButton69, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel91);

        jPanel92.setLayout(new java.awt.BorderLayout());

        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });
        jPanel92.add(jButton70, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel92);

        jPanel93.setLayout(new java.awt.BorderLayout());

        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });
        jPanel93.add(jButton71, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel93);

        jPanel94.setLayout(new java.awt.BorderLayout());

        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel121.setText("H");
        jPanel94.add(jLabel121, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel94);

        jPanel95.setLayout(new java.awt.BorderLayout());

        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });
        jPanel95.add(jButton72, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel95);

        jPanel96.setLayout(new java.awt.BorderLayout());

        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });
        jPanel96.add(jButton73, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel96);

        jPanel97.setLayout(new java.awt.BorderLayout());

        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });
        jPanel97.add(jButton74, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel97);

        jPanel98.setLayout(new java.awt.BorderLayout());

        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });
        jPanel98.add(jButton75, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel98);

        jPanel99.setLayout(new java.awt.BorderLayout());

        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });
        jPanel99.add(jButton76, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel99);

        jPanel100.setLayout(new java.awt.BorderLayout());

        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });
        jPanel100.add(jButton77, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel100);

        jPanel101.setLayout(new java.awt.BorderLayout());

        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });
        jPanel101.add(jButton78, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel101);

        jPanel102.setLayout(new java.awt.BorderLayout());

        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });
        jPanel102.add(jButton79, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel102);

        jPanel103.setLayout(new java.awt.BorderLayout());

        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });
        jPanel103.add(jButton80, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel103);

        jPanel104.setLayout(new java.awt.BorderLayout());

        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });
        jPanel104.add(jButton81, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel104);

        jPanel105.setLayout(new java.awt.BorderLayout());

        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel122.setText("I");
        jPanel105.add(jLabel122, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel105);

        jPanel106.setLayout(new java.awt.BorderLayout());

        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });
        jPanel106.add(jButton82, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel106);

        jPanel107.setLayout(new java.awt.BorderLayout());

        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });
        jPanel107.add(jButton83, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel107);

        jPanel108.setLayout(new java.awt.BorderLayout());

        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });
        jPanel108.add(jButton84, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel108);

        jPanel109.setLayout(new java.awt.BorderLayout());

        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });
        jPanel109.add(jButton85, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel109);

        jPanel110.setLayout(new java.awt.BorderLayout());

        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });
        jPanel110.add(jButton86, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel110);

        jPanel111.setLayout(new java.awt.BorderLayout());

        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });
        jPanel111.add(jButton87, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel111);

        jPanel112.setLayout(new java.awt.BorderLayout());

        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });
        jPanel112.add(jButton88, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel112);

        jPanel113.setLayout(new java.awt.BorderLayout());

        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });
        jPanel113.add(jButton89, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel113);

        jPanel114.setLayout(new java.awt.BorderLayout());

        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });
        jPanel114.add(jButton90, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel114);

        jPanel115.setLayout(new java.awt.BorderLayout());

        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });
        jPanel115.add(jButton91, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel115);

        jPanel116.setLayout(new java.awt.BorderLayout());

        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("J");
        jPanel116.add(jLabel102, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel116);

        jPanel117.setLayout(new java.awt.BorderLayout());

        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });
        jPanel117.add(jButton92, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel117);

        jPanel118.setLayout(new java.awt.BorderLayout());

        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });
        jPanel118.add(jButton93, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel118);

        jPanel119.setLayout(new java.awt.BorderLayout());

        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });
        jPanel119.add(jButton94, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel119);

        jPanel120.setLayout(new java.awt.BorderLayout());

        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });
        jPanel120.add(jButton95, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel120);

        jPanel121.setLayout(new java.awt.BorderLayout());

        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });
        jPanel121.add(jButton96, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel121);

        jPanel122.setLayout(new java.awt.BorderLayout());

        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });
        jPanel122.add(jButton97, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel122);

        jPanel123.setLayout(new java.awt.BorderLayout());

        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });
        jPanel123.add(jButton98, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel123);

        jPanel124.setLayout(new java.awt.BorderLayout());

        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });
        jPanel124.add(jButton99, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel124);

        jPanel125.setLayout(new java.awt.BorderLayout());

        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });
        jPanel125.add(jButton100, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel125);

        jPanel126.setLayout(new java.awt.BorderLayout());

        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jPanel126.add(jButton55, java.awt.BorderLayout.CENTER);

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

    private void x0y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0y1ActionPerformed
        // TODO add your handling code here:
        this.result = this.lugarDisparado(0, 1);
        this.resultadoDisparo(result);
        this.revisarEstado();
    }//GEN-LAST:event_x0y1ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        this.result = this.lugarDisparado(9, 2);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton94ActionPerformed

    private void x2y9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2y9ActionPerformed
        this.result = this.lugarDisparado(2, 9);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x2y9ActionPerformed

    private void x0y0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0y0ActionPerformed
        // TODO add your handling code here:
        this.result = this.lugarDisparado(0, 0);
        this.resultadoDisparo(result);
        this.revisarEstado();
    }//GEN-LAST:event_x0y0ActionPerformed

    private void x0y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0y2ActionPerformed
        // TODO add your handling code here:
        this.result = this.lugarDisparado(0, 2);
        this.resultadoDisparo(result);
        this.revisarEstado();
    }//GEN-LAST:event_x0y2ActionPerformed

    private void x0x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0x3ActionPerformed
        // TODO add your handling code here:
        this.result = this.lugarDisparado(0, 3);
        this.resultadoDisparo(result);
        this.revisarEstado();
    }//GEN-LAST:event_x0x3ActionPerformed

    private void x0x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0x4ActionPerformed
        // TODO add your handling code here:
        this.result = this.lugarDisparado(0, 4);
        this.resultadoDisparo(result);
        this.revisarEstado();
    }//GEN-LAST:event_x0x4ActionPerformed

    private void x0x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0x5ActionPerformed
        // TODO add your handling code here:
        this.result = this.lugarDisparado(0, 5);
        this.resultadoDisparo(result);
        this.revisarEstado();
    }//GEN-LAST:event_x0x5ActionPerformed

    private void x0x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0x6ActionPerformed
        // TODO add your handling code here:
        this.result = this.lugarDisparado(0, 6);
        this.resultadoDisparo(result);
        this.revisarEstado();
    }//GEN-LAST:event_x0x6ActionPerformed

    private void x0x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0x7ActionPerformed
        this.result = this.lugarDisparado(0, 7);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x0x7ActionPerformed

    private void x0x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0x8ActionPerformed
        this.result = this.lugarDisparado(0, 8);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x0x8ActionPerformed

    private void x0x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0x9ActionPerformed
        // TODO add your handling code here:
        this.result = this.lugarDisparado(0, 9);
        this.resultadoDisparo(result);
        this.revisarEstado();
    }//GEN-LAST:event_x0x9ActionPerformed

    private void x1x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1x0ActionPerformed
        this.result = this.lugarDisparado(1, 0);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x1x0ActionPerformed

    private void x1y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1y1ActionPerformed
        this.result = this.lugarDisparado(1, 1);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x1y1ActionPerformed

    private void x1y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1y2ActionPerformed
        this.result = this.lugarDisparado(1, 2);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x1y2ActionPerformed

    private void x1y3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1y3ActionPerformed
        this.result = this.lugarDisparado(1, 3);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x1y3ActionPerformed

    private void x1y4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1y4ActionPerformed
        this.result = this.lugarDisparado(1, 4);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x1y4ActionPerformed

    private void x1y5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1y5ActionPerformed
        this.result = this.lugarDisparado(1, 5);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x1y5ActionPerformed

    private void x1y6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1y6ActionPerformed
        this.result = this.lugarDisparado(1, 6);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x1y6ActionPerformed

    private void x1y7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1y7ActionPerformed
        this.result = this.lugarDisparado(1, 7);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x1y7ActionPerformed

    private void x1y8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1y8ActionPerformed
        this.result = this.lugarDisparado(1, 8);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x1y8ActionPerformed

    private void x1y9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1y9ActionPerformed
        this.result = this.lugarDisparado(1, 9);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x1y9ActionPerformed

    private void x2y0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2y0ActionPerformed
        this.result = this.lugarDisparado(2, 0);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x2y0ActionPerformed

    private void x2y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2y1ActionPerformed
        this.result = this.lugarDisparado(2, 1);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x2y1ActionPerformed

    private void x2y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2y2ActionPerformed
        this.result = this.lugarDisparado(2, 2);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x2y2ActionPerformed

    private void x2y3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2y3ActionPerformed
        this.result = this.lugarDisparado(2, 3);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x2y3ActionPerformed

    private void x2y4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2y4ActionPerformed
        this.result = this.lugarDisparado(2, 4);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x2y4ActionPerformed

    private void x2y5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2y5ActionPerformed
        this.result = this.lugarDisparado(2, 5);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x2y5ActionPerformed

    private void x2y6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2y6ActionPerformed
        this.result = this.lugarDisparado(2, 6);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x2y6ActionPerformed

    private void x2y7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2y7ActionPerformed
        this.result = this.lugarDisparado(2, 7);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x2y7ActionPerformed

    private void x2y8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2y8ActionPerformed
        this.result = this.lugarDisparado(2, 8);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x2y8ActionPerformed

    private void x3y0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3y0ActionPerformed
        this.result = this.lugarDisparado(3, 0);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x3y0ActionPerformed

    private void x3y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3y1ActionPerformed
        this.result = this.lugarDisparado(3, 1);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x3y1ActionPerformed

    private void x3y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3y2ActionPerformed
        this.result = this.lugarDisparado(3, 2);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x3y2ActionPerformed

    private void x3y3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3y3ActionPerformed
        this.result = this.lugarDisparado(3, 3);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x3y3ActionPerformed

    private void x3y4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3y4ActionPerformed
        this.result = this.lugarDisparado(3, 4);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x3y4ActionPerformed

    private void x3y5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3y5ActionPerformed
        this.result = this.lugarDisparado(3, 5);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x3y5ActionPerformed

    private void x3y6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3y6ActionPerformed
        this.result = this.lugarDisparado(3, 6);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x3y6ActionPerformed

    private void x3y7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3y7ActionPerformed
        this.result = this.lugarDisparado(3, 7);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x3y7ActionPerformed

    private void x3y8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3y8ActionPerformed
        this.result = this.lugarDisparado(3, 8);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x3y8ActionPerformed

    private void x3y9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3y9ActionPerformed
        this.result = this.lugarDisparado(3, 9);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x3y9ActionPerformed

    private void x4y0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x4y0ActionPerformed
        this.result = this.lugarDisparado(4, 0);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x4y0ActionPerformed

    private void x4y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x4y1ActionPerformed
        this.result = this.lugarDisparado(4, 1);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_x4y1ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        this.result = this.lugarDisparado(4, 2);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        this.result = this.lugarDisparado(4, 3);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        this.result = this.lugarDisparado(4, 4);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        this.result = this.lugarDisparado(4, 5);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        this.result = this.lugarDisparado(4, 6);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        this.result = this.lugarDisparado(4, 7);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        this.result = this.lugarDisparado(4, 8);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        this.result = this.lugarDisparado(4, 9);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        this.result = this.lugarDisparado(5, 0);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        this.result = this.lugarDisparado(5, 1);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        this.result = this.lugarDisparado(5, 2);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        this.result = this.lugarDisparado(5, 3);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        this.result = this.lugarDisparado(5, 4);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        this.result = this.lugarDisparado(5, 5);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        this.result = this.lugarDisparado(5, 6);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        this.result = this.lugarDisparado(5, 7);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        this.result = this.lugarDisparado(5, 8);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        this.result = this.lugarDisparado(5, 9);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        this.result = this.lugarDisparado(6, 0);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        this.result = this.lugarDisparado(6, 1);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        this.result = this.lugarDisparado(6, 2);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        this.result = this.lugarDisparado(6, 3);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        this.result = this.lugarDisparado(6, 4);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        this.result = this.lugarDisparado(6, 5);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        this.result = this.lugarDisparado(6, 6);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        this.result = this.lugarDisparado(6, 7);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        this.result = this.lugarDisparado(6, 8);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        this.result = this.lugarDisparado(6, 9);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        this.result = this.lugarDisparado(7, 0);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        this.result = this.lugarDisparado(7, 1);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        this.result = this.lugarDisparado(7, 2);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        this.result = this.lugarDisparado(7, 3);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        this.result = this.lugarDisparado(7, 4);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        this.result = this.lugarDisparado(7, 5);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        this.result = this.lugarDisparado(7, 6);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        this.result = this.lugarDisparado(7, 7);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        this.result = this.lugarDisparado(7, 8);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        this.result = this.lugarDisparado(7, 9);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        this.result = this.lugarDisparado(8, 0);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        this.result = this.lugarDisparado(8, 1);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        this.result = this.lugarDisparado(8, 2);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        this.result = this.lugarDisparado(8, 3);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        this.result = this.lugarDisparado(8, 4);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        this.result = this.lugarDisparado(8, 5);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        this.result = this.lugarDisparado(8, 6);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        this.result = this.lugarDisparado(8, 7);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        this.result = this.lugarDisparado(8, 8);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        this.result = this.lugarDisparado(8, 9);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        this.result = this.lugarDisparado(9, 0);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        this.result = this.lugarDisparado(9, 1);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
        this.result = this.lugarDisparado(9, 3);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        this.result = this.lugarDisparado(9, 4);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        this.result = this.lugarDisparado(9, 5);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
        this.result = this.lugarDisparado(9, 6);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
        this.result = this.lugarDisparado(9, 7);
        this.resultadoDisparo(result);
        this.revisarEstado();
    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
        this.result = this.lugarDisparado(9, 8);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton100ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        this.result = this.lugarDisparado(9, 9);
        this.resultadoDisparo(result);
        this.revisarEstado();    }//GEN-LAST:event_jButton55ActionPerformed

    private void jTextArea1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTextArea1ComponentAdded
        //jTextArea1.setText("hola");
    }//GEN-LAST:event_jTextArea1ComponentAdded

    public boolean lugarDisparado(int x, int y) {
        return control.generarDisparoJugador(x, y);
    }

    public void revisarEstado() {
        /*if (!control.estadoJuego(2)) {
            control.partidaPerdida();
        }
        control.generarDisparoEnemigo();
        if (control.estadoJuego(1)) {
            control.partidaGanada();
        }*/
    }

    public void resultadoDisparo(boolean res) {

    }

    @Override
    public void hacerVisible(boolean b) {
        setVisible(b);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton100;
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
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
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
    private javax.swing.JButton x0x3;
    private javax.swing.JButton x0x4;
    private javax.swing.JButton x0x5;
    private javax.swing.JButton x0x6;
    private javax.swing.JButton x0x7;
    private javax.swing.JButton x0x8;
    private javax.swing.JButton x0x9;
    private javax.swing.JButton x0y0;
    private javax.swing.JButton x0y1;
    private javax.swing.JButton x0y2;
    private javax.swing.JButton x1x0;
    private javax.swing.JButton x1y1;
    private javax.swing.JButton x1y2;
    private javax.swing.JButton x1y3;
    private javax.swing.JButton x1y4;
    private javax.swing.JButton x1y5;
    private javax.swing.JButton x1y6;
    private javax.swing.JButton x1y7;
    private javax.swing.JButton x1y8;
    private javax.swing.JButton x1y9;
    private javax.swing.JButton x2y0;
    private javax.swing.JButton x2y1;
    private javax.swing.JButton x2y2;
    private javax.swing.JButton x2y3;
    private javax.swing.JButton x2y4;
    private javax.swing.JButton x2y5;
    private javax.swing.JButton x2y6;
    private javax.swing.JButton x2y7;
    private javax.swing.JButton x2y8;
    private javax.swing.JButton x2y9;
    private javax.swing.JButton x3y0;
    private javax.swing.JButton x3y1;
    private javax.swing.JButton x3y2;
    private javax.swing.JButton x3y3;
    private javax.swing.JButton x3y4;
    private javax.swing.JButton x3y5;
    private javax.swing.JButton x3y6;
    private javax.swing.JButton x3y7;
    private javax.swing.JButton x3y8;
    private javax.swing.JButton x3y9;
    private javax.swing.JButton x4y0;
    private javax.swing.JButton x4y1;
    // End of variables declaration//GEN-END:variables

}
