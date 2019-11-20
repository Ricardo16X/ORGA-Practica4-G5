/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orga.practica_04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author aiyel
 */
public class PlayerForm extends javax.swing.JFrame {

    /**
     * Creates new form PlayerForm
     */
    public PlayerForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        System.out.println("___________________________________");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_time = new javax.swing.JTextField();
        tf_score = new javax.swing.JTextField();
        tf_level = new javax.swing.JTextField();
        tf_user = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIBORITA");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("Inciar Juego");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Fin del Juego");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Acerca De");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ver Documentacion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tiempo");

        jLabel2.setText("Puntos");

        jLabel3.setText("Nivel");

        jLabel4.setText("Usuario");

        tf_time.setEditable(false);
        tf_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_timeActionPerformed(evt);
            }
        });

        tf_score.setEditable(false);

        tf_level.setEditable(false);

        tf_user.setEditable(false);

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_score, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_level, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(tf_time, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(tf_score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:        
        PantallaJuego gameboard = new PantallaJuego();
        this.dispose();
        gameboard.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"VIBORITA 3.0\n Universidad de San Carlos de Guatemala \n" );
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        LogIn login = new LogIn();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if(LogIn.loggedPlayer!=null){
            tf_user.setText(LogIn.loggedPlayer.getUsername());
            tf_time.setText(String.valueOf(LogIn.loggedPlayer.getTiempo()));
            tf_score.setText(String.valueOf(LogIn.loggedPlayer.getPuntos()));
            tf_level.setText(String.valueOf(LogIn.loggedPlayer.getNivel()));
            
            if(LogIn.loggedPlayer.getTiempo() > 0){
                AdminForm.tiempos[1][AdminForm.correlativo]=String.valueOf(LogIn.loggedPlayer.getTiempo());
                AdminForm.puntaje[1][AdminForm.correlativo]=String.valueOf(LogIn.loggedPlayer.getPuntos());
                AdminForm.tiempos[0][AdminForm.correlativo]=LogIn.loggedPlayer.getUsername(); 
                AdminForm.puntaje[0][AdminForm.correlativo]=LogIn.loggedPlayer.getUsername(); 
            }
        }else{
            LogIn login = new LogIn();
            this.dispose();
            login.setVisible(true);
        }
        
        
        
        if(AdminForm.correlativo ==9) 
                AdminForm.correlativo =0;
            else
                AdminForm.correlativo ++;
        
//  ORDENAMIENTO ---------------------------------------------------------------
        
    tiempos();
     puntajes();
        
    }//GEN-LAST:event_formWindowOpened

    private void tf_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_timeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerForm().setVisible(true);
            }
        });
    }
    
    public void tiempos(){
        double tiempo[] = new double[10];
        String user[] = new String[10];
        
        for (int i = 0; i < 10; i++) {
            if(AdminForm.tiempos[0][i] != null){
                tiempo[i] = Double.valueOf(String.valueOf(AdminForm.tiempos[1][i]));
            }
        }
        Arrays.sort(tiempo); 

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(AdminForm.tiempos[0][i] != null){
                    if(Double.valueOf(String.valueOf(AdminForm.tiempos[1][i]))== tiempo[j]){
                        user[j] = String.valueOf(AdminForm.tiempos[0][i]);
                    }
                }
            }
        }
        
        for (int i = 0; i < tiempo.length; i++) {
                System.out.print(tiempo[i] + " - ");
                System.out.println(user[i]);
        }
//         File f;
//        f = new File("Top10_tiempo.txt");
//        try{
//            FileWriter filew = new FileWriter(f);
//            BufferedWriter escibiendo = new BufferedWriter(filew);
//            PrintWriter codigo = new PrintWriter(escibiendo);  
//                codigo.append("digraph G {\n");
//                codigo.append("node [shape=record];");
//                codigo.append("\nrankdir=TB;\n");
//                codigo.append("subgraph 1{\n");
//                codigo.append("struct1 [label=");
//                codigo.append(" \"<f"+0+"> "+0 );
//                
//                for (int i = 1; i < tiempo.length; i++) {
//                    codigo.append("| <f"+(i)+"> "+i +"\n"+tiempo[9-i]+"\n"+user[9-i]);
//                }
//                
//                
//                
//                codigo.append("\n}");
//                codigo.append("\n}");
//                codigo.close();
//        }
//        catch(IOException e){};
//        
//        
//        
//        try {
//
//            String cmd = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe -Tpng Top10_tiempo.txt -o t.jpg";
//            Runtime rt = Runtime.getRuntime();
//            rt.exec(cmd);
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        
//        try {
//            
//            String cmd = "cmd /C start t.jpg";
//            Runtime rt = Runtime.getRuntime();
//            rt.exec(cmd);
//            
//        } catch (Exception e) {
//            System.out.println(e);
//        }        
//        
        
    }
    
    public void puntajes(){
        double puntos[] = new double[10];
        String user[] = new String[10];
        
        for (int i = 0; i < 10; i++) {
            if(AdminForm.puntaje[0][i] != null){
                puntos[i] = Double.valueOf(String.valueOf(AdminForm.puntaje[1][i]));
            }
        }
        Arrays.sort(puntos); 

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(AdminForm.puntaje[0][i] != null){
                    if(Double.valueOf(String.valueOf(AdminForm.puntaje[1][i]))== puntos[j]){
                        user[j] = String.valueOf(AdminForm.puntaje[0][i]);
                    }
                }
            }
        }
        
        for (int i = 0; i < puntos.length; i++) {
                System.out.print(puntos[i] + " - ");
                System.out.println(user[i]);
        }
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tf_level;
    private javax.swing.JTextField tf_score;
    private javax.swing.JTextField tf_time;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
