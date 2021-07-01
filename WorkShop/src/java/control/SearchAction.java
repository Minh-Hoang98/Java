/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Product;
import model.ProductDB;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Laptop88
 */
public class SearchAction extends ActionSupport{
    
    private String fromprice;
    private String toprice;
    private List<Product> listProduct;
    private final String SUCCESS = "success";
    private final String FAIL = "fail";

    public SearchAction() {
    }

    public String execute() throws Exception {
        HttpServletRequest req = ServletActionContext.getRequest();
        HttpSession session = req.getSession(false);
        String url = FAIL;
        if (session != null) {
            ProductDB dao = new ProductDB();
            dao.search(getFromprice(), getToprice());
            listProduct = dao.getListSearch();
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
    public List<Product> getListProduct() {
        return listProduct;
    }
    
}
