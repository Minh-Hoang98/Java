/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2;

import sample.registration.RegistrationDAO;

/**
 *
 * @author huynhducduy
 */
public class DeleteAccountAction {
    
    private String pk;
    private String lastSearchValue;
    
    private final String SUCCESS = "success";
    private final String FAIL = "fail";
    
    public DeleteAccountAction() {
    }
    
    public String execute() throws Exception {
        RegistrationDAO dao = new RegistrationDAO();
        boolean result = dao.deleteAccount(pk);
        
        String url = FAIL;
        if(result){
            url = SUCCESS;
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
     * @return the lastSeachValue
     */
    public String getLastSearchValue() {
        return lastSearchValue;
    }

    /**
     * @param lastSeachValue the lastSeachValue to set
     */
    public void setLastSearchValue(String lastSeachValue) {
        this.lastSearchValue = lastSeachValue;
    }
    
}
