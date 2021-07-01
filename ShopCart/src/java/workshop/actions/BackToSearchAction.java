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
public class BackToSearchAction {

    private String fromprice;
    private String toprice;
    private final String SUCCESS = "success";
    private final String FAIL = "fail";
    public BackToSearchAction() {
    }

    public String execute() throws Exception {
        HttpServletRequest req = ServletActionContext.getRequest();
        HttpSession session = req.getSession(false);
        String url = FAIL;
        if (session != null) {
        url = SUCCESS;
        }
        return  url;
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
    public void setToprice(String toprice) {
        this.toprice = toprice;
    }

    
}
