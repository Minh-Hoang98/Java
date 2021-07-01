
package bt3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Laptop88
 */
public class Caculator extends JFrame implements ActionListener {
             
        JButton nhan,chia,cong,tru,phantram,reset,thoat;
        JTextField txta,txtb,txtkq;
        JLabel lb1,lb2,lb3,lb;
        JPanel pn,pn1,pn2,pn3,pn4;
        
        Caculator(String title) {
            super(title);    
            GUI();
        } 
        
        public void GUI(){
            lb=new JLabel("Basic Arithmetic Operations");
            lb1=new JLabel("Number 1:");
            lb2=new JLabel("Number 2:");
            lb3=new JLabel("Result:");
            
            txta=new JTextField();
            txtb=new JTextField();
            txtkq=new JTextField();
            
            
            reset=new JButton("Reset");
            thoat=new JButton("Thoat");
            cong=new JButton("+");
            tru=new JButton("-");
            nhan=new JButton("*");
            chia=new JButton("/");
            phantram=new JButton("%");
                       
            cong.addActionListener(this);
            tru.addActionListener(this);
            nhan.addActionListener(this);
            chia.addActionListener(this);
            phantram.addActionListener(this);
            reset.addActionListener(this);
            thoat.addActionListener(this);
            
            pn=new JPanel(new BorderLayout());
            pn1=new JPanel(new FlowLayout());
            pn2=new JPanel(new GridLayout(3,2));
            pn3=new JPanel(new GridLayout(1,5));
            pn4=new JPanel(new GridLayout(1,2));
            
            pn1.add(lb);
            
            pn2.add(lb1);
            pn2.add(txta);
            pn2.add(lb2);
            pn2.add(txtb);
            pn2.add(lb3);
            pn2.add(txtkq);
            
            pn3.add(cong);
            pn3.add(tru);
            pn3.add(nhan);
            pn3.add(chia);
            pn3.add(phantram);
                              
            pn4.add(reset);
            pn4.add(thoat);
            
            pn.add(pn1);
            pn.add(pn2);
            pn.add(pn3);
            pn.add(pn4);
            
            add(pn);
            setSize(500,350);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            show();
        }
           
        public void actionPerformed(ActionEvent e) {
          if(e.getSource()== cong){
              float a=Integer.parseInt(txta.getText());
              float b=Integer.parseInt(txtb.getText());
              txtkq.setText(Float.toString(a+b));             
          }
          if(e.getSource()== tru){
              float a=Integer.parseInt(txta.getText());
              float b=Integer.parseInt(txtb.getText());
              txtkq.setText(Float.toString(a-b));             
          }
          if(e.getSource()== nhan){
              float a=Integer.parseInt(txta.getText());
              float b=Integer.parseInt(txtb.getText());
              txtkq.setText(Float.toString(a*b));             
          }
          if(e.getSource()== chia){
              float a=Integer.parseInt(txta.getText());
              float b=Integer.parseInt(txtb.getText());
              txtkq.setText(Float.toString(a/b));             
          }
          if(e.getSource()== phantram){
              float a=Integer.parseInt(txta.getText());
              float b=Integer.parseInt(txtb.getText());
              txtkq.setText(Float.toString(a%b));             
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
        String s1="obama";
		s1=s1.toUpperCase();
		System.out.println(s1);
		
		s1="obama";
		s1=s1.replaceFirst("o", "o".toUpperCase());
		System.out.println(s1);
		
		s1="chu Bá Thông";
		s1=s1.replaceFirst(
				(s1.charAt(0)+""), 
				(s1.charAt(0)+"").toUpperCase());
		System.out.println(s1);
		
		String s2="PUTIN";
		s2=s2.toLowerCase();
		s2=s2.replaceFirst(
				(s2.charAt(0)+""), 
				(s2.charAt(0)+"").toUpperCase());
		System.out.println(s2);
	} 
    
}               

