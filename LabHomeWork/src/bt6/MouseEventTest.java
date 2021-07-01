/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt6;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Laptop88
 */
public class MouseEventTest extends JFrame implements MouseListener{

    public MouseEventTest(String title){
        super(title);
        requestFocus();
        addMouseListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.isMetaDown()){}
       else System.out.println("You left click the moust at"+e.getX()+" "+e.getY());       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You press the moust at"+e.getX()+" "+e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You release the moust at"+e.getX()+" "+e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You enter the moust at"+e.getX()+" "+e.getY());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exit the moust at"+e.getX()+" "+e.getY());
    }
    
    public static void main(String[] args) {
        MouseEventTest me=new MouseEventTest("MouseTest");
        me.setBounds(100,100,300,200);
        me.setVisible(true);
    }
}
