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
public class AddToCartAction {

    private String mobilename;
    private float fromprice;
    private float toprice;
    private final String FAIL = "fail";
    private final String SUCCESS = "success";

    public AddToCartAction() {
    }

    public String execute() throws Exception {
        HttpServletRequest req = ServletActionContext.getRequest();
        HttpSession session = req.getSession(false);
        String url = FAIL;
        if (session != null) {
            CartObj cart = (CartObj) session.getAttribute("CART") ;
            if (cart== null) {
                cart = new CartObj();
            }
            cart.addtoCart(mobilename);
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
     * @return the fromprice
     */
    public float getFromprice() {
        return fromprice;
    }

    /**
     * @param fromprice the fromprice to set
     */
    public void setFromprice(float fromprice) {
        this.fromprice = fromprice;
    }

    /**
     * @return the toprice
     */
    public float getToprice() {
        return toprice;
    }

    /**
     * @param toprice the toprice to set
     */
    public void setToprice(float toprice) {
        this.toprice = toprice;
    }

   
}
