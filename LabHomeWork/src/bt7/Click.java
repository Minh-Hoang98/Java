
package bt7;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Laptop88
 */
public class Click extends JFrame implements ActionListener {
             
        JButton b;
        JTextField c;
        List list;
        JLabel d;
        
        Click(String title) {
            super(title);
            setLayout(new FlowLayout());
            
            b = new JButton("OK");
            c = new JTextField(12);
            list = new List(3);
            list.add("Tiger");
            list.add("Lion");
            list.add("Elephant");
            list.add("Fox");
            list.add("Monkey");
            d = new JLabel("The event is display here");
            add(b);
            add(c);
            add(list);
            add(d);
            b.addActionListener(this);
            c.addActionListener(this);
            list.addActionListener(this);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    dispose();
                    System.exit(0);
                }
            });
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b) {
                d.setText("You click on the button");
            } else if (e.getSource() == c) {
                d.setText("You Enter in the TextFiled");
            } else if (e.getSource() == list) {
                d.setText("You double click on the list ite");
            }
        }       
    
    public static void main(String[] args) {
        Click ae = new Click("ActionEventTest");
        ae.setBounds(400, 300, 400, 200);
        ae.show();
    }
}               

