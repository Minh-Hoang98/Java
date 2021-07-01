/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2;

import java.util.List;
import org.apache.struts2.ServletActionContext;
import sample.registration.RegistrationDAO;
import sample.registration.RegistrationDTO;

/**
 *
 * @author huynhducduy
 */
public class SearchLastNameAction {
    private String searchValue;
    private List<RegistrationDTO> listAccounts;
    
    private final String SUCCESS = "success";
    
    public SearchLastNameAction() {
    }
    
    public String execute() throws Exception {
        RegistrationDAO dao = new RegistrationDAO();
        dao.searchLastname(searchValue);
        
        listAccounts = dao.getListAccounts();
        
        return SUCCESS;
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
    
    public List<RegistrationDTO> getListAccounts() {
        return listAccounts;
    }   
    
}
