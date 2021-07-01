/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import workshop.mobile.MobileDAO;

/**
 *
 * @author huynhducduy
 */
public class DeleteAction {

    private String pk;
    private String lastSearchValue;
    private final String SUCCESS = "success";
    private final String FAIL = "fail";

    public DeleteAction() {
    }

    public String execute() throws Exception {
        HttpServletRequest req = ServletActionContext.getRequest();
        HttpSession session = req.getSession(false);
        String url = FAIL;
        if (session != null) {
            MobileDAO dao = new MobileDAO();
            boolean result = dao.Delete(pk);

            if (result) {
                url = SUCCESS;
            }
        }
        return url;
    }

    /**
     * @return the pk
     */
    public String getPk() {
        return pk;
    }

    /**
     * @param pk the pk to set
     */
    public void setPk(String pk) {
        this.pk = pk;
    }

    /**
     * @return the lastSearchValue
     */
    public String getLastSearchValue() {
        return lastSearchValue;
    }

    /**
     * @param lastSearchValue the lastSearchValue to set
     */
    public void setLastSearchValue(String lastSearchValue) {
        this.lastSearchValue = lastSearchValue;
    }

}
