/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import model.Cart;
import model.Product;
import model.ProductDB;


/**
 *
 * @author duchx123
 */
public class AddProductToCart extends ActionSupport {

    private int newProductId;

    public void setNewProductId(int newProductId) {
        this.newProductId = newProductId;
    }

    @Override
    public String execute() throws Exception {
        Cart cart = (Cart) ActionContext.getContext().getSession().get("cart");
        if (cart == null) {
            cart = new Cart();
        }
        Product p = new ProductDB().getProduct(newProductId);
        if (p.getProductID()== 0) {
            return ERROR;
        }
        cart.addProduct(p);
        ActionContext.getContext().getSession().put("cart", cart);
        return SUCCESS;
    }

}
