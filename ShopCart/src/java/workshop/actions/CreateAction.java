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
public class CreateAction {
    
    private final String SUCCESS = "success";
    private final String FAIL= "fail";
    public CreateAction() {
    }
    
    public String execute() throws Exception {
        HttpServletRequest req = ServletActionContext.getRequest();
        HttpSession session = req.getSession(false);
        String url = FAIL;
        if(session!=null){
            url= SUCCESS;
        }
        return url;
    }
    
}
