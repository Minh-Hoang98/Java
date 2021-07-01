/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt5;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Laptop88
 */
class KeyEventTest extends JFrame implements KeyListener {

    JLabel l;

    KeyEventTest(String title) {
        super(title);
        l = new JLabel("A", JLabel.CENTER);
        add(l);
        requestFocus();
        l.addKeyListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });     
    }   
    public void keyTyped(KeyEvent e) {
         l.setText(String.valueOf(e.getKeyChar()));
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        KeyEventTest ke = new KeyEventTest("KeyTest") {
        };
        ke.setBounds(100, 100, 300, 200);
        ke.setVisible(true);
    }
}
