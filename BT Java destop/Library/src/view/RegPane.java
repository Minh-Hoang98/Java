
package view;

import java.awt.*;
import java.io.File;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;
import model.User;
import static model.DatabaseInfo.dbURL;
import static model.DatabaseInfo.driverName;
import static model.DatabaseInfo.passDB;
import static model.DatabaseInfo.userDB;
import model.UserDB;

public class RegPane extends javax.swing.JPanel {

    private GridBagLayout gridbag = new GridBagLayout();
    private JButton chose;
    private JLabel ud;
    private JTextField idTxt, nameTxt, emailTxt, urTxt,areaTxt;
    private JPasswordField pwTxt;
    private JRadioButton uR = new JRadioButton("User"), sR = new JRadioButton("Staff"), mR = new JRadioButton("Manager");

    
    public RegPane() {
        initComponents();
        createForm();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        centerPane = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registration");
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout centerPaneLayout = new javax.swing.GroupLayout(centerPane);
        centerPane.setLayout(centerPaneLayout);
        centerPaneLayout.setHorizontalGroup(
            centerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        centerPaneLayout.setVerticalGroup(
            centerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

        add(centerPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        this.idTxt.setText("");
        this.nameTxt.setText("");
        this.emailTxt.setText("");
        this.pwTxt.setText("");              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        RegPane rp = new RegPane();
        String uid = new String(idTxt.getText());      
        String name = new String(nameTxt.getText());
        String mail = new String(emailTxt.getText());
        String pw = new String(pwTxt.getPassword()); 
        int ur =0;
        if(uR.isSelected()){
            ur = 1;
        }
        if(sR.isSelected()){
            ur = 2;
        }
        if(mR.isSelected()){
            ur = 3;
        }
        boolean u = UserDB.addNewUser(uid, name, mail, pw, "BT", ur);
        
            if(u==false){
                    JOptionPane.showMessageDialog(this, "User or Password incorrect!");}
            else{
                JOptionPane.showMessageDialog(this, "Add Success!!!");       
    }    
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel centerPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void createForm() {
        centerPane.setLayout(gridbag);
        addComponent(new JLabel("Image"), 1, 1, 1, 5, 0, 0);
        //addComponent(areaTxt = new JTextField(), 2, 1, 2, 5, 0, 0);
        addComponent(ud = new JLabel(), 2, 1, 2, 5, 0, 0);
        addComponent(chose = new JButton("Choose Image"), 2, 2, 2, 1, 0, 0);
        //addComponent(chose = new JButton("Choose Image"), 2, 1, 2, 5, 0, 0);
        addComponent(new JLabel("User ID"), 1, 6, 1, 1, 0, 0);
        addComponent(idTxt = new JTextField(), 2, 6, 2, 1, 0, 0);
        addComponent(new JLabel("Fullname"), 1, 7, 1, 1, 0, 0);
        addComponent(nameTxt = new JTextField(), 2, 7, 3, 1, 1, 0);
        addComponent(new JLabel("Email"), 1, 8, 2, 1, 0, 0);
        addComponent(emailTxt = new JTextField(), 2, 8, 3, 1, 1, 0);
        addComponent(new JLabel("Password"), 1, 9, 1, 1, 0, 0);
        addComponent(pwTxt = new JPasswordField(), 2, 9, 2, 1, 0, 0);
        addComponent(new JLabel("User Right"), 1, 10, 1, 1, 0, 0);
        addComponent(uR, 2, 10, 1, 1, 0, 0);
        addComponent(sR, 3, 10, 1, 1, 0, 0);
        addComponent(mR, 4, 10, 1, 1, 0, 0);
        ButtonGroup bg = new ButtonGroup();
        bg.add(uR);
        bg.add(sR);
        bg.add(mR);
        chose.setText("Choose Image");
        chose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choseActionPerformed(evt);
            }
        });
    }

   private void choseActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            String path = f.getAbsolutePath();
            ImageIcon icon = new ImageIcon(path);
            ud.setIcon(icon);
            ((JFrame) (this.getRootPane().getParent())).pack();
        }
    }
    
    private void addComponent(JComponent comp, int col, int row, int width, int height, double wx, double wy) {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints. BOTH; 
        c.gridx = col;
        c.gridy = row;
        c.gridwidth = width;		
        c.gridheight = height;
        c.weightx = wx;
        c.weighty = wy;
        c.insets = new Insets(2,2,2,2);
        gridbag.setConstraints(comp, c);
        centerPane.add(comp);
    }   
}
