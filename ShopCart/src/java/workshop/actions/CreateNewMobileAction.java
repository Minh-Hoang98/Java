/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import workshop.mobile.MobileDAO;

/**
 *
 * @author huynhducduy
 */
public class CreateNewMobileAction extends ActionSupport{

    private String mobileid;
    private String mobilename;
    private String price;
    private String quantity;
    private String yearofproduction;
    private String description;
    private boolean chksale;
    private final String SUCCESS = "success";
    private final String FAIL = "fail";

    public CreateNewMobileAction() {
    }

    public String execute() throws Exception {
        HttpServletRequest req = ServletActionContext.getRequest();
        HttpSession session = req.getSession(false);
        String url = FAIL;
        if (session != null) {
        MobileDAO dao = new MobileDAO();
        boolean result = dao.CreateNewMobile(mobileid, mobilename, description, price, yearofproduction, quantity, chksale);
        if (result) {
            url = SUCCESS;
        }
        }
        return url;
    }

    /**
     * @return the mobileid
     */
    public String getMobileid() {
        return mobileid;
    }

    /**
     * @param mobileid the mobileid to set
     */
    @RequiredStringValidator(message = "Cant not null")
    public void setMobileid(String mobileid) {
        this.mobileid = mobileid;
    }

    /**
     * @return the mobilename
     */
    public String getMobilename() {
        return mobilename;
    }

    /**
     * @param mobilename the mobilename to set
     */
    @RequiredStringValidator(message = "Cant not null")
    public void setMobilename(String mobilename) {
        this.mobilename = mobilename;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    @RequiredStringValidator(message = "Cant not null")
    @RegexFieldValidator(message = "Must be number and >0", regexExpression = "([0-9]*[.][0-9]*)||([0-9]*)")
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    @RequiredStringValidator(message = "Cant not null")
    @RegexFieldValidator(message = "Must be interger and >0", regexExpression = "[0-9]*")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the yearofproduction
     */
    public String getYearofproduction() {
        return yearofproduction;
    }

    /**
     * @param yearofproduction the yearofproduction to set
     */
    @RequiredStringValidator(message = "Cant not null")
    @RegexFieldValidator(message = "Must be interger and >0", regexExpression = "[0-9]*")
    public void setYearofproduction(String yearofproduction) {
        this.yearofproduction = yearofproduction;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    @RequiredStringValidator(message = "Cant not null")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the chksale
     */
    public boolean isChksale() {
        return chksale;
    }

    /**
     * @param chksale the chksale to set
     */
    public void setChksale(boolean chksale) {
        this.chksale = chksale;
    }

}
