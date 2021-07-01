/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soke;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Long
 */
public class Sever extends javax.swing.JFrame {

    /**
     * Creates new form Sever
     */
    public Sever()  {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tarea = new javax.swing.JTextArea();
        jSplitPane2 = new javax.swing.JSplitPane();
        jButton3 = new javax.swing.JButton();
        Ttext = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout(0, 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sever");
        getContentPane().add(jLabel2, java.awt.BorderLayout.PAGE_START);

        Tarea.setColumns(20);
        Tarea.setRows(5);
        jScrollPane3.setViewportView(Tarea);

        getContentPane().add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jButton3.setText("Send");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jSplitPane2.setRightComponent(jButton3);

        Ttext.setColumns(35);
        Ttext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtextActionPerformed(evt);
            }
        });
        jSplitPane2.setLeftComponent(Ttext);

        getContentPane().add(jSplitPane2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtextActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            String ms="";
            ms=Ttext.getText();
            out.writeUTF(ms);
            Tarea.append("\nSever: "+ms);
            Ttext.setText("");
        } catch (Exception e) {
           //handle exception here;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    static ServerSocket ss;
    static Socket s;
    static DataInputStream in;
    static DataOutputStream out;
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
            java.util.logging.Logger.getLogger(Sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sever().setVisible(true);
            }
            
        });
        try {
            String ms="";
           
            ss=new ServerSocket(1201);
            s=ss.accept();
            in=new DataInputStream(s.getInputStream());
            out= new DataOutputStream(s.getOutputStream());
            while(!ms.equals("exit")){
                ms=in.readUTF();
                Tarea.setText(Tarea.getText()+"\n Client : "+ms);
                
            }
        } catch (Exception e) {
           
            //handle exception here;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextArea Tarea;
    private javax.swing.JTextField Ttext;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane2;
    // End of variables declaration//GEN-END:variables
}
