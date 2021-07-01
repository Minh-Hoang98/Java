/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import workshop.mobile.MobileDAO;
import workshop.mobile.MobileDTO;

/**
 *
 * @author huynhducduy
 */
public class SearchUserAction extends ActionSupport {

    private String fromprice;
    private String toprice;
    private List<MobileDTO> listmobile;
    private final String SUCCESS = "success";
    private final String FAIL = "fail";

    public SearchUserAction() {
    }

    public String execute() throws Exception {
        HttpServletRequest req = ServletActionContext.getRequest();
        HttpSession session = req.getSession(false);
        String url = FAIL;
        if (session != null) {
            MobileDAO dao = new MobileDAO();
            dao.usersearch(getFromprice(), getToprice());
            listmobile = dao.getListmobiuser();
            url = SUCCESS;
        }
        return url;
    }

    /**
     * @return the fromprice
     */
    public String getFromprice() {
        return fromprice;
    }

    /**
     * @param fromprice the fromprice to set
     */
    @RequiredStringValidator(message = "Cant be empty!")
    @RegexFieldValidator(message = "Not a number and >0", regexExpression = "([0-9]*[.][0-9]*)||([0-9]*)")
    public void setFromprice(String fromprice) {
        this.fromprice = fromprice;
    }

    /**
     * @return the toprice
     */
    public String getToprice() {
        return toprice;
    }

    /**
     * @param toprice the toprice to set
     */ 
    @RequiredStringValidator(message = "Cant be empty!")
    @RegexFieldValidator(message = "Not a number and >0", regexExpression = "([0-9]*[.][0-9]*)||([0-9]*)")
    public void setToprice(String toprice) {
        this.toprice = toprice;
    }

    /**
     * @return the listmobile
     */
    public List<MobileDTO> getListmobile() {
        return listmobile;
    }

}
