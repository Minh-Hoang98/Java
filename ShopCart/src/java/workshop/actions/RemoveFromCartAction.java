/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import workshop.Cart.CartObj;

/**
 *
 * @author huynhducduy
 */
public class RemoveFromCartAction {

    private String[] itemList;
    private String mobilename;
    private final String FAIL = "fail";
    private final String SUCCESS = "success";
    private String fromprice;
    private String toprice;
    public RemoveFromCartAction() {
    }

    public String execute() throws Exception {
        HttpServletRequest req = ServletActionContext.getRequest();
        HttpSession session = req.getSession(false);
        String url = FAIL;
        if (session != null) {
            CartObj cart = (CartObj) session.getAttribute("CART");

            for (String item : getItemList()) {
                System.out.println(item);
                cart.removefromCart(item);
            }
            session.setAttribute("CART", cart);
            url = SUCCESS;

        }
        return url;
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
    public void setMobilename(String mobilename) {
        this.mobilename = mobilename;
    }

    /**
     * @return the itemList
     */
    public String[] getItemList() {
        return itemList;
    }

    /**
     * @param itemList the itemList to set
     */
    public void setItemList(String[] itemList) {
        this.itemList = itemList;
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
