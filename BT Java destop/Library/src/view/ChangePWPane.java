
package view;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import model.User;

public class ChangePWPane extends javax.swing.JPanel {

    
    public ChangePWPane() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Reset = new javax.swing.JButton();
        Change = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        uidTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        oldP = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        newP = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        cfPw = new javax.swing.JPasswordField();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHANGE PASSWORD");
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel1.add(Reset);

        Change.setText("Change");
        Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeActionPerformed(evt);
            }
        });
        jPanel1.add(Change);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(4, 4, 10, 10));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User");
        jPanel2.add(jLabel2);

        uidTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidTxtActionPerformed(evt);
            }
        });
        jPanel2.add(uidTxt);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Old Password");
        jPanel2.add(jLabel3);
        jPanel2.add(oldP);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("New Password");
        jPanel2.add(jLabel4);
        jPanel2.add(newP);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Confirm Password");
        jPanel2.add(jLabel5);
        jPanel2.add(cfPw);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void uidTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidTxtActionPerformed

    private void ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeActionPerformed
        ChangePWPane cp = new ChangePWPane();
        String currentP = new String(oldP.getPassword());
        String newPw = new String(newP.getPassword());
        String confirmP = new String(cfPw.getPassword());
        String uid = uidTxt.getText();
        User u= User.login(uid,currentP); 
        try{
            if(u == null){
            JOptionPane.showMessageDialog(cp, "User or Password incorrect!");
        }else if (newPw.equals(confirmP)) {
            if (u.changePass(currentP, confirmP)) {
                JOptionPane.showMessageDialog(cp, "Password was changed!");
            } else {
                JOptionPane.showMessageDialog(cp, "Current password is incorrect!!");
            }
        }else JOptionPane.showMessageDialog(cp, "New Password does not match Confirm Password!");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }//GEN-LAST:event_ChangeActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        this.uidTxt.setText("");
        this.oldP.setText("");
        this.newP.setText("");
        this.cfPw.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change;
    private javax.swing.JButton Reset;
    private javax.swing.JPasswordField cfPw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField newP;
    private javax.swing.JPasswordField oldP;
    private javax.swing.JTextField uidTxt;
    // End of variables declaration//GEN-END:variables
}
