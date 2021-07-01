/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.actions;

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
public class SearchAdminAction {
    
    private String searchValue;
    private List<MobileDTO> listmobile ;
    private final String SUCCESS ="success";
    private final String FAIL ="fail";
    public SearchAdminAction() {
    }
    
    public String execute() throws Exception {
        HttpServletRequest req = ServletActionContext.getRequest();
        HttpSession session = req.getSession(false);
        String url = FAIL;
        if(session!=null){
        MobileDAO dao = new MobileDAO();
        dao.staffsearch(searchValue);
        listmobile = dao.getListmobistaff();
        url=SUCCESS;
        }
        return url;
    }

    public List<MobileDTO> getListmobile() {
        return listmobile;
    }

    
    /**
     * @return the searchValue
     */
    public String getSearchValue() {
        return searchValue;
    }

    /**
     * @param searchValue the searchValue to set
     */
    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }
}
