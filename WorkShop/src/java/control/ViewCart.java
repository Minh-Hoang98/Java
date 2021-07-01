/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import model.Cart;
import model.Customer;
import model.Product;

/**
 *
 * @author Nguyen Van Duc
 */

    public class ViewCart extends ActionSupport {

    private Map<Product, Integer> products;
    private float total;
    @Override
    public String execute() throws Exception {
        Cart cart = (Cart) ActionContext.getContext().getSession().get("cart");
        if (cart == null) {
            return ERROR;
        }
        Customer customer =  (Customer) ActionContext.getContext().getSession().get("Customer");
        if(customer==null) return LOGIN;
        products = cart.getProducts();
        total = cart.getTotalPrice();
        return SUCCESS;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public float getTotal() {
        return total;
    }
}
