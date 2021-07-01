/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Laptop88
 */
public class Color extends JFrame implements ActionListener {

    JButton bt1 = new JButton("RED");
    JButton bt2 = new JButton("GREEN");
    JButton bt3 = new JButton("BLUE");
    JButton bt4 = new JButton("EXIT");
    JPanel pn = new JPanel(new BorderLayout(11, 11));
    JPanel pn1 = new JPanel();


    public Color() {
        pn1.add(bt1);
        pn1.add(bt2);
        pn1.add(bt3);
        pn1.add(bt4);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        
        pn.add("South", pn1);
        setContentPane(pn);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Backgroud Color");
        setVisible(true);
        setSize(500, 300);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt1) {
            pn.setBackground(java.awt.Color.RED);
            pn1.setBackground(java.awt.Color.RED);
        }
        
        if (e.getSource() == bt2) {
            pn.setBackground(java.awt.Color.GREEN);
            pn1.setBackground(java.awt.Color.GREEN);
        }
        
        if (e.getSource() == bt3) {
            pn.setBackground(java.awt.Color.BLUE);
            pn1.setBackground(java.awt.Color.BLUE);
        }
        
         if(e.getSource()==bt4){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Color();
    }

}
