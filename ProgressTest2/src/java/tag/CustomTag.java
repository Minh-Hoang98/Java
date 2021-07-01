/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import patient.Patient;

/**
 *
 * @author Laptop88
 */
public class CustomTag extends SimpleTagSupport {

    private String id;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException, IOException {
     
        try {
            JspWriter out = getJspContext().getOut();
            Patient a = new Patient();
            ArrayList<Patient> list = a.getAll();

            if (id != null) {
                for (Patient p : list) {
                    if (id.equalsIgnoreCase(p.getpID())) {
                        out.write(p.getpID() + "  " + p.getpName() + " " + p.getDate_exam());
                        out.write("<br>");
                    }
                }
            } else {
                for (Patient p : list) {
                    out.println(p.getpID() + "  " + p.getpName() + " " + p.getDate_exam());
                    out.write("<br>");
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(CustomTag.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    

}
