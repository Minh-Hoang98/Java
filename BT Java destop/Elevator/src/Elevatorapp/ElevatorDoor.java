

package Elevatorapp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;



final class ElevatorDoor extends JPanel {
    private int w,h;
    private JButton b,c;
    private JPanel leftDoor, rightDoor;
    private boolean isOpen = false;
    
    public boolean isOpen(){
        return isOpen;
    }
    public void doorsClose(){
        leftDoor.setVisible(true);
        rightDoor.setVisible(true);
    }
    public void doorsOpen(){
        leftDoor.setVisible(false);
        rightDoor.setVisible(false);
    }
     class EDoor extends JPanel{
        public EDoor(){
         super();
         setBackground(Color.red);
            setDoubleBuffered(true);
        }
        @Override
        public void paint(Graphics g){
            super.paint(g);
            Image Img = Toolkit.getDefaultToolkit().getImage("");
            g.drawImage(Img,2,2,getWidth()-4,getHeight()-4, this);
        }
    }
    public ElevatorDoor(Elevator e){
        w = e.getWidths()/2;
        h  = e.getHeight()/e.getFloors();
        setBackground(Color.red);
        setLayout(new BorderLayout());
        JPanel doors = new JPanel(new GridLayout(1,2,1,1));
        doors.setBackground(Color.red);
        leftDoor = new EDoor();
        rightDoor = new EDoor();
        doors.add(leftDoor);
        doors.add(rightDoor);
        add(doors);
        b = new JButton("<||>");
        b.addActionListener((ActionEvent e1) -> {
            open();
        });
       c = new JButton("|><|");
       c.addActionListener((ActionEvent e1) -> {
           close();
        });
       JPanel p = new JPanel(new GridLayout(1,2,5,5)); p.add(c);p.add(b);
       add(p, BorderLayout.SOUTH);
       setSize(2*w, h+60);
       this.setDoubleBuffered(true);
    }
     public void open(){
        if(isOpen) return;
        Graphics g=this.getGraphics();
        g.setColor(Color.white);
        for(int x=1;x<w;x++){
            g.fillRect(1, 0, w-x,h);
            g.fillRect(w+2+x, 0,w-x,h);
        try{
            Thread.sleep(100);
        }catch(InterruptedException ex){
            Logger.getLogger(ElevatorDoor.class.getName()).log(Level.SEVERE, null, ex);
        }
        g.setXORMode(this.getBackground());
        g.fillRect(1, 0, w-x, h);
        g.fillRect(w+2+x, 0,w-x, h);
    }
        g.setPaintMode();
        g.setColor(Color.blue);
        g.fillRect(1, 0, w, h);
        g.fillRect(w+2, 0,w, h);
        isOpen=true;
        leftDoor.setVisible(false);
        rightDoor.setVisible(false);
        g.dispose();
    }
    public void close(){
        if(isOpen) return;
        Graphics g=this.getGraphics();
        g.setColor(Color.cyan);
        int x=0;
        for(x=1;x<w;x++){
            g.fillRect(1, 0, x,h);
            g.fillRect(2*w-x, 0,x,h);
        try{
            Thread.sleep(100);
        }catch(InterruptedException ex){
            Logger.getLogger(ElevatorDoor.class.getName()).log(Level.SEVERE, null, ex);
        }
        g.setXORMode(this.getBackground());
        g.fillRect(1, 0, x, h);
        g.fillRect(2*w-x, 0,x, h);
    }
        g.setPaintMode();
        g.setColor(Color.BLUE);
        g.fillRect(1, 0, x, h);
        g.fillRect(2*w, 0,x, h);
        isOpen=true;
        leftDoor.setVisible(false);
        rightDoor.setVisible(false);
        g.dispose();
    }
}