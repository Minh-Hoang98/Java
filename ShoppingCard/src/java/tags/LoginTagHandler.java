/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import static javax.servlet.jsp.PageContext.SESSION_SCOPE;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import model.Customer;

/**
 *
 * @author Laptop88
 */
public class LoginTagHandler extends SimpleTagSupport {

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        Customer s = (Customer) (this.getJspContext().getAttribute("cus",PageContext.SESSION_SCOPE));
        if(s==null) throw  new RuntimeException("Please login!!!");
        try {
            out.print("<B>" + s.getcName()+"</b>");
        } catch (IOException ex) {
            Logger.getLogger(LoginTagHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
