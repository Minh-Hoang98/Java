
package bt2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Laptop88
 */
public class PhuongTrinhBac1UI extends JFrame implements ActionListener {
             
        JButton kq,reset,thoat;
        JTextField txta,txtb,txtkq;
        JLabel lb1,lb2,lb3,lb;
        JPanel pn,pn1,pn2,pn3;
        
        PhuongTrinhBac1UI(String title) {
            super(title);    
            GUI();
        } 
        
        public void GUI(){
            lb=new JLabel("GIAI PHUONG TRINH BAC NHAT");
            lb1=new JLabel("Nhap a:");
            lb2=new JLabel("Nhap b:");
            lb3=new JLabel("Ket qua:");
            
            txta=new JTextField();
            txtb=new JTextField();
            txtkq=new JTextField();
            
            kq=new JButton("Ket Qua");
            reset=new JButton("Reset");
            thoat=new JButton("Thoat");
            
            kq.addActionListener(this);
            reset.addActionListener(this);
            thoat.addActionListener(this);
            
            pn=new JPanel(new GridLayout(3,1));
            pn1=new JPanel(new FlowLayout());
            pn2=new JPanel(new GridLayout(3,2));
            pn3=new JPanel(new GridLayout(1,3));
            
            pn1.add(lb);
            
            pn2.add(lb1);
            pn2.add(txta);
            pn2.add(lb2);
            pn2.add(txtb);
            pn2.add(lb3);
            pn2.add(txtkq);
            
            pn3.add(kq);
            pn3.add(reset);
            pn3.add(thoat);
            
            pn.add(pn1);
            pn.add(pn2);
            pn.add(pn3);
            
            add(pn);
            setSize(500,300);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            show();
        }
           
        public void actionPerformed(ActionEvent e) {
          if(e.getSource()== kq){
              int a=Integer.parseInt(txta.getText());
              int b=Integer.parseInt(txtb.getText());
              if(a!=0)txtkq.setText(Float.toString((float)-b/a));
              else
                  if(b==0)txtkq.setText("Phuong Trinh vo so nghiem");
                  else txtkq.setText("Phuong Trinh vo nghiem");
          }
          if(e.getSource()== reset){
              txta.setText("");
              txtb.setText("");
              txtkq.setText("");
          }
          if(e.getSource()== thoat){
              System.exit(0);
          }
        }       
    
    public static void main(String[] args) {
        PhuongTrinhBac1UI ae = new PhuongTrinhBac1UI("ActionEventTest");        
    }
}               

