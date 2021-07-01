
package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Clock extends JLabel implements Runnable{
    SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
    public Clock(){
        this.setText(sd.format(new Date()));
    }

    @Override
    public void run() {
        while(true){
            this.setText(sd.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
