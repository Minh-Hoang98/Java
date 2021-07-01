/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import workshop.user.UserDAO;

/**
 *
 * @author huynhducduy
 */
public class LoginAction {

    private String username;
    private String password;
    
    private final String USER = "user";
    private final String STAFF = "staff";
    private final String FAIL = "fail";

    public LoginAction() {
    }

    public String execute() throws Exception {
        return null;
    }

    public String checkLogin()throws Exception {
        HttpServletRequest req = ServletActionContext.getRequest();
        HttpSession session = req.getSession();
        String url = FAIL;

            UserDAO dao = new UserDAO();
            String result = dao.checklogin(username, password);
            String name = dao.getfullname(username);
            
            if (result.equals("user")) {
                session.setAttribute("USERNAME", name);
                url = USER;
            }
            
            if (result.equals("staff")) {
                session.setAttribute("USERNAME", name);
                url = STAFF;
            }
        return url;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
