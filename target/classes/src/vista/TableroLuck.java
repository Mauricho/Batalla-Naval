/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import src.Observador;
import src.Sujeto;
import src.controlador.CtrJuegoLuck;

/**
 *
 * @author f_acu
 */
public class TableroLuck extends javax.swing.JFrame implements Vista, Observador{

    /**
     * Creates new form TableroLuck
     */
    JButton[][] botones=new JButton[10][10];
    JButton posJug[][]=new JButton[10][10];
    //private jugador player = new jugador();
    private static CtrJuegoLuck control;
    //boolean result = false;
    private Sujeto sujeto;
    int barcosEnemigo=10;
    int barcosJugador=10;
    String letras="ABCDEFGHIJ";

    public TableroLuck(Sujeto sujeto) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.control = new CtrJuegoLuck();
        sujeto.suscribirObservador(this);
        crear_tablero();
        pos_jug();
        this.control.setArmaJugador();
        this.control.setArmaEnemigo();
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
                            control.setArmaJugador();
                            revisarEstado();
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
                if (control.checkBarco(i, j)){
                    tab.setBackground(Color.green);
                }
                
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
    
    @Override
    public void actualizar(int x,int y, int condicion, String jugador) {
        String resultado = "";
        char x1=letras.charAt(x);

        jTextArea1.append("El "+jugador+" ha disparado en la posicion ("+x1+","+(y+1)+").\n");
        switch (condicion){
            case 0:
                resultado = "AGUA";
                if(jugador.equals("Enemigo")){
                    this.posJug[x][y].setBackground(Color.blue);
                }
                break;
            case 1:
                resultado = "AVERIADO";
                if(jugador.equals("Enemigo")){
                    this.posJug[x][y].setBackground(Color.red);
                }
                break;
            case 2:
                resultado = "HUNDIDO";
                if(jugador.equals("Enemigo")){
                    this.posJug[x][y].setBackground(Color.red);
                }
                break;
        }
        jTextArea1.append("Resultado del disparo: "+resultado+"\n");
        if(resultado.equals("HUNDIDO")){
            if(jugador.equals("Jugador")){
                barcosEnemigo--;
                jTextArea1.append("Quedan "+barcosEnemigo+" restantes por el mar.\n\n");
            }
            else{
                barcosJugador--;
                jTextArea1.append("Quedan "+barcosJugador+" restantes por el mar.\n\n");
            }
        }
        else{
            jTextArea1.append("\n");
        }
    }
    
    public void revisarEstado() {
        if (control.estadoJuego(2)) {
            control.partidaGanada();
        }
        try{
            TimeUnit.SECONDS.sleep(1);}
        catch(InterruptedException e){
            e.printStackTrace();
        }
        control.generarDisparoEnemigo();
        if (control.estadoJuego(1)) {
            control.partidaPerdida();
        }
        this.control.setArmaEnemigo();
    }

    @Override
    public void hacerVisible(boolean b) {
        setVisible(b);
    }

    @Override
    public void cargarImagenes() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel127 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Batalla Naval");

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        panel1.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        panel2.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel127Layout = new javax.swing.GroupLayout(jPanel127);
        jPanel127.setLayout(jPanel127Layout);
        jPanel127Layout.setHorizontalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel127Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(513, 513, 513)))
        );
        jPanel127Layout.setVerticalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
            .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel127Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1196, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(513, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
