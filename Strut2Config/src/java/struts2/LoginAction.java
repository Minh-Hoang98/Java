/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2;

import com.opensymphony.xwork2.ActionContext;
import java.util.Map;
import org.apache.struts2.ServletActionContext;
import sample.registration.RegistrationDAO;

/**
 *
 * @author huynhducduy
 */
public class LoginAction {

    private String username;
    private String password;

    private final String SUCCESS = "success";
    private final String FAIL = "fail";

    public LoginAction() {
    }

    public String execute() throws Exception {
        RegistrationDAO dao = new RegistrationDAO();

        boolean result = dao.checkLogin(username, password);

        String url = FAIL;
        if (result) {
            url = SUCCESS;
            Map session = ActionContext.getContext().getSession();
            session.put("USERNAME", username);
            //ServletActionContext.getRequest().getSession().setAttribute("USERNAME", username);
        }
        return url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

    
}
