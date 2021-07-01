/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlab;

import java.awt.Dimension;
import testlab.StudentDB2;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import testlab.Student2;

/**
 *
 * @author OS
 */
public class Show extends javax.swing.JFrame {

    /**
     * Creates new form Show
     */
    public Show() {
        initComponents();
        try {
            Vector<Student2> list = StudentDB2.getList();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            Object[] row = new Object[5];
            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getName();
                row[2] = list.get(i).getDob();
                row[3] = list.get(i).getAddress();
                row[4] = list.get(i).getGender();
                model.addRow(row);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Show.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Show.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        mF = new javax.swing.JButton();
        mN = new javax.swing.JButton();
        mP = new javax.swing.JButton();
        mL = new javax.swing.JButton();
        oP = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(315, 60));
        jPanel2.setLayout(new java.awt.GridLayout(2, 2, 3, 3));

        mF.setText("Move First");
        mF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFActionPerformed(evt);
            }
        });
        jPanel2.add(mF);

        mN.setText("Move Next");
        mN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNActionPerformed(evt);
            }
        });
        jPanel2.add(mN);

        mP.setText("Move Previous");
        mP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPActionPerformed(evt);
            }
        });
        jPanel2.add(mP);

        mL.setText("Move Last");
        mL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLActionPerformed(evt);
            }
        });
        jPanel2.add(mL);

        oP.setText("Open Item");
        oP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oPActionPerformed(evt);
            }
        });
        jPanel2.add(oP);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Date", "Address", "Gender"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFActionPerformed
        jTable1.setRowSelectionInterval(0, 0);
    }//GEN-LAST:event_mFActionPerformed

    private void mNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNActionPerformed
        int i = jTable1.getSelectedRow();
        if (i == jTable1.getRowCount() - 1) {
            jTable1.setRowSelectionInterval(i, i);
        } else {
            jTable1.setRowSelectionInterval(i + 1, i + 1);
        }
    }//GEN-LAST:event_mNActionPerformed

    private void mPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPActionPerformed
        int i = jTable1.getSelectedRow();
        if (i == 0) {
            jTable1.setRowSelectionInterval(i, i);
        } else {
            jTable1.setRowSelectionInterval(i - 1, i - 1);
        }
    }//GEN-LAST:event_mPActionPerformed

    private void mLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLActionPerformed
        // TODO add your handling code here:
        jTable1.setRowSelectionInterval(jTable1.getRowCount() - 1, jTable1.getRowCount() - 1);
    }//GEN-LAST:event_mLActionPerformed

    private void oPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oPActionPerformed
        // TODO add your handling code here:
        String id = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
        AddPanel s = new AddPanel(id);
        Show x = new Show();
        s.setPreferredSize(new Dimension(400, 300));
        x.setVisible(true);
        x.setContentPane(s);
        x.pack();
        this.setVisible(false);
    }//GEN-LAST:event_oPActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton mF;
    private javax.swing.JButton mL;
    private javax.swing.JButton mN;
    private javax.swing.JButton mP;
    private javax.swing.JButton oP;
    // End of variables declaration//GEN-END:variables
}
