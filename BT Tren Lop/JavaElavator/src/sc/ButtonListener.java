/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ButtonListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        JButton eventbutton = (JButton) e.getSource();
        if (eventbutton.getBackground() != Color.RED) {
            eventbutton.setBackground(Color.RED);
        }
    }
}
