/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author Laptop88
 */
public class DrawWithMouse extends javax.swing.JFrame {

    /**
     * Creates new form DrawWithMouse
     */
    Graphics g = null;
    Point p1 = null, p2 = null;
    Color color = Color.RED;
    
    public DrawWithMouse() {
        initComponents();
        this.setTitle("Draw Manager");
        g = this.pLines.getGraphics();
        this.rdFill.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pChooser = new javax.swing.JPanel();
        btnColor = new javax.swing.JButton();
        rdDraw = new javax.swing.JRadioButton();
        rdFill = new javax.swing.JRadioButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pLines = new javax.swing.JPanel();
        pElipses = new javax.swing.JPanel();
        pRectangle = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnColor.setText("Select Color");
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });
        pChooser.add(btnColor);

        rdDraw.setText("Draw Only");
        pChooser.add(rdDraw);

        rdFill.setText("Draw and Fill");
        pChooser.add(rdFill);

        getContentPane().add(pChooser, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
        });

        pLines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pLinesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pLinesMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pLinesLayout = new javax.swing.GroupLayout(pLines);
        pLines.setLayout(pLinesLayout);
        pLinesLayout.setHorizontalGroup(
            pLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        pLinesLayout.setVerticalGroup(
            pLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Line", pLines);

        pElipses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pElipsesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pElipsesMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pElipsesLayout = new javax.swing.GroupLayout(pElipses);
        pElipses.setLayout(pElipsesLayout);
        pElipsesLayout.setHorizontalGroup(
            pElipsesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        pElipsesLayout.setVerticalGroup(
            pElipsesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Elipses", pElipses);

        pRectangle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pRectangleMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pRectangleMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pRectangleLayout = new javax.swing.GroupLayout(pRectangle);
        pRectangle.setLayout(pRectangleLayout);
        pRectangleLayout.setHorizontalGroup(
            pRectangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        pRectangleLayout.setVerticalGroup(
            pRectangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Rectangles", pRectangle);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        // TODO add your handling code here:
        color = JColorChooser.showDialog(this, "Choose a color", Color.BLACK);
        g.setColor(color);
    }//GEN-LAST:event_btnColorActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        int index = this.jTabbedPane1.getSelectedIndex();
        switch (index) {
            case 0:
                g = pLines.getGraphics();
                this.rdDraw.setSelected(true);
                this.rdFill.setEnabled(false);
                break;
            case 1: 
                g = pElipses.getGraphics();
                this.rdFill.setEnabled(true);
                break;
            case 2: 
                g = pRectangle.getGraphics();
                this.rdFill.setEnabled(true);
                break;
        }
        g.setColor(color);
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MousePressed

    private void pLinesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pLinesMousePressed
        // TODO add your handling code here:
        p1 = evt.getPoint();
    }//GEN-LAST:event_pLinesMousePressed

    private void pLinesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pLinesMouseReleased
        // TODO add your handling code here:
        p2 = evt.getPoint();
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
        p1 = p2 = null;
    }//GEN-LAST:event_pLinesMouseReleased

    private void pElipsesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pElipsesMousePressed
        // TODO add your handling code here:
        p1 = evt.getPoint();
    }//GEN-LAST:event_pElipsesMousePressed

    private void pElipsesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pElipsesMouseReleased
        // TODO add your handling code here:
        p2 = evt.getPoint();
        int left = p1.x < p2.x ? p1.x : p2.x;
        int top = p1.y < p2.y ? p1.y : p2.y;
        int width = p1.y - p2.y;
        if (width<0) width = -width;
        int height = p1.y - p2.y;
        if(height<0) height = -height;
        if(rdDraw.isSelected()){
            g.drawOval(left, top, width, height);
        }
        else{
            g.fillOval(left, top, width, height);
        }
        p1 = p2 = null;
        
    }//GEN-LAST:event_pElipsesMouseReleased

    private void pRectangleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRectangleMousePressed
        // TODO add your handling code here:
        p1 = evt.getPoint();
    }//GEN-LAST:event_pRectangleMousePressed

    private void pRectangleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRectangleMouseReleased
        // TODO add your handling code here:
        p2 = evt.getPoint();
        int left = p1.x < p2.x ? p1.x : p2.x;
        int top = p1.y < p2.y ? p1.y : p2.y;
        int width = p1.y - p2.y;
        if (width<0) width = -width;
        int height = p1.y - p2.y;
        if(height<0) height = -height;
        if(rdDraw.isSelected()){
            g.drawRect(left, top, width, height);
        }
        else{
            g.fillRect(left, top, width, height);
        }
        p1 = p2 = null;
    }//GEN-LAST:event_pRectangleMouseReleased

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
            java.util.logging.Logger.getLogger(DrawWithMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrawWithMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrawWithMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrawWithMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrawWithMouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pChooser;
    private javax.swing.JPanel pElipses;
    private javax.swing.JPanel pLines;
    private javax.swing.JPanel pRectangle;
    private javax.swing.JRadioButton rdDraw;
    private javax.swing.JRadioButton rdFill;
    // End of variables declaration//GEN-END:variables
}