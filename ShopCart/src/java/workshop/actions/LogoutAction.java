/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author huynhducduy
 */
public class LogoutAction {
    public final String SUCCESS ="success";
    public LogoutAction() {
    }
    
    public String execute() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public String LogOut(){
        HttpServletRequest req = ServletActionContext.getRequest();
        HttpSession session = req.getSession(false);
        if(session!=null){
            session.invalidate();
        }
        return SUCCESS;
    }
    
}
