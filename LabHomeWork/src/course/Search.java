/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import static Course.DatabaseInfo.dbURL;
import static Course.DatabaseInfo.driverName;
import static Course.DatabaseInfo.passDB;
import static Course.DatabaseInfo.userDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class Search extends javax.swing.JPanel {

    /**
     * Creates new form Add
     */
    public Search() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SE2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SE3 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(300, 200));
        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search");
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 50));
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setPreferredSize(new java.awt.Dimension(161, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Clear");
        jPanel1.add(jButton3);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(3, 3, 10, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter Code");
        jPanel2.add(jLabel2);

        SE.setPreferredSize(new java.awt.Dimension(3, 10));
        SE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEActionPerformed(evt);
            }
        });
        jPanel2.add(SE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Course Name");
        jPanel2.add(jLabel3);

        SE2.setPreferredSize(new java.awt.Dimension(3, 10));
        SE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SE2ActionPerformed(evt);
            }
        });
        jPanel2.add(SE2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Credit");
        jPanel2.add(jLabel4);

        SE3.setPreferredSize(new java.awt.Dimension(3, 10));
        jPanel2.add(SE3);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void SEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SEActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            String sql;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from Course where Code ='" + SE.getText() + "'");
            while (rs.next()) {
                SE2.setText(rs.getString("Name"));
                SE3.setText(Integer.toString(rs.getInt("Credit")));
                SE2.setEditable(false);
                SE3.setEditable(false);
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            System.err.println("Error " + e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SE2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SE;
    private javax.swing.JTextField SE2;
    private javax.swing.JTextField SE3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}