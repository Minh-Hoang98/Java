/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Laptop88
 */
public class ItemEventTest extends JFrame implements ItemListener{

    Checkbox male,female;
    Choice ch;
    List list;
    JLabel l;

    ItemEventTest(String title){
        super(title);
        setLayout(new FlowLayout());
        male= new Checkbox("Male");
        female= new Checkbox("Female");
        
        ch = new Choice();
        ch.add("MS DOS");
        ch.add("MS Windows");
        ch.add("UNIX");
        
        list = new List(3);
        list.add("Tiger");
        list.add("Lion");
        list.add("Elephant");
        list.add("Fox");
        list.add("Monkey");
        
        l = new JLabel("The event is display here   ");
        add(male);
        add(female);
        add(ch);
        add(list);
        add(l);
        
        male.addItemListener(this);
        female.addItemListener(this);
        ch.addItemListener(this);
        list.addItemListener(this);       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()== male){
            if(male.getState()) l.setText("You select male item");
            else l.setText("You deletect male item");
        }
        else if(e.getSource()== female){
            if(female.getState()) l.setText("You select female item");
            else l.setText("You deletect female item");
        }
        else if(e.getSource()== ch){
            l.setText("You select "+ch.getSelectedItem()+"in the choice");
        }
        else if(e.getSource()== list){
            l.setText("You select "+list.getSelectedItem()+"on the list");
        }
    }
    public static void main(String[] args) {
       ItemEventTest a = new ItemEventTest("ItemEventTest");
        a.setBounds(100,100,300,200);
        a.show();
    }
    
}
