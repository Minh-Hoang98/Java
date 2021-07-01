package bt8;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Laptop88
 */
public class btChangeNumber extends JFrame implements ActionListener {

    public static final String BASE = "0123456789ABCDEFGHIJKLMNOPQRSTUVXYZW";
    public static final float b = 00000000;

    JLabel lb4, lb1, lb2, lb3;
    JTextField txta, txtb, txtc, txtd;
    JButton btkq, btreset, btexit;
    JPanel pn, pn1, pn2;

    btChangeNumber(String title) {
        super(title);
        GUI();
    }

    public void GUI() {
        lb1 = new JLabel("Enter a number");
        lb2 = new JLabel("Binary representation");
        lb3 = new JLabel("Octal representation");
        lb4 = new JLabel("Hecxa representation");

        txta = new JTextField();
        txtb = new JTextField();
        txtc = new JTextField();
        txtd = new JTextField();

        btkq = new JButton("OK");
        btreset = new JButton("Reset");
        btexit = new JButton("Exit");

        btkq.addActionListener(this);
        btreset.addActionListener(this);
        btexit.addActionListener(this);
        pn = new JPanel(new GridLayout(2, 1));
        pn1 = new JPanel(new GridLayout(4, 1));
        pn2 = new JPanel(new FlowLayout());

        pn1.add(lb1);
        pn1.add(txta);
        pn1.add(lb2);
        pn1.add(txtb);
        pn1.add(lb3);
        pn1.add(txtc);
        pn1.add(lb4);
        pn1.add(txtd);

        pn2.add(btkq);
        pn2.add(btreset);
        pn2.add(btexit);

        pn.add(pn1);
        pn.add(pn2);
        add(pn);
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btkq) {
            int a=Integer.parseInt(txta.getText());             
            txtb.setText(result(a, 2));            
            int b=Integer.parseInt(txta.getText()); 
            txtc.setText(result(b, 8));            
            int c=Integer.parseInt(txta.getText()); 
            txtd.setText(result(c, 16));
            
        }
        if (e.getSource() == btreset) {
            txta.setText("");
            txtb.setText("");
            txtc.setText("");
            txtd.setText("");
        }
        if (e.getSource() == btexit) {
            System.exit(0);
        }

    }
    public static String result(int n,int b){
        StringBuilder stringBuilder= new StringBuilder();
        int x=0;
        while(n > 0){
            x = n%b;
            n /=b;
            stringBuilder.append(BASE.charAt(x));
        }       
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        btChangeNumber u = new btChangeNumber("Hello");
    }
}
