/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import java.util.Map;
import model.Cart;
import model.CustomerDAO;

/**
 *
 * @author Laptop88
 */
public class LoginAction {

    private String id;
    private String pass;

    private final String SUCCESS = "success";
    private final String FAIL = "fail";

    public LoginAction() {
    }

    public String execute() throws Exception {
        CustomerDAO dao = new CustomerDAO();

        boolean result = dao.checkLogin(id, pass);
        String name = dao.getfullname(id);
        String url = FAIL;
        if (result) {
            url = SUCCESS;
            Map session = ActionContext.getContext().getSession();
            session.put("USERID", id);
            session.put("USERNAME", name);
            //ServletActionContext.getRequest().getSession().setAttribute("USERNAME", username);
        }
        return url;
    }
    
     public String logout() {
           Cart cart = (Cart) ActionContext.getContext().getSession().get("cart");
        if (cart == null) {
            return ERROR;
        }
        Map session = ActionContext.getContext().getSession();
        cart.getProducts().clear();
        if (session.containsKey("Customer")) {
            session.remove("Customer");
            ((org.apache.struts2.dispatcher.SessionMap) session).invalidate();
        }
        return SUCCESS;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
     public String getMessage(){
        return "Login success.... Hello "+id;
    }
}
