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
import java.util.Set;
import model.Cart;
import model.CartDB;
import model.Customer;
import model.Product;

/**
 *
 * @author Nguyen Van Duc
 */
public class ConfirmAction extends ActionSupport{
    
    @Override
    public String execute() throws Exception {
               
        Cart cart = (Cart) ActionContext.getContext().getSession().get("cart");
        if (cart == null) {
            return ERROR;
        }
          Customer customer =  (Customer) ActionContext.getContext().getSession().get("Customer");
        CartDB cdb = new CartDB();
         cdb.addOrder(customer.getcID());
            Set<Product> keys = cart.c.keySet();
        for (Product product : keys) {
             cdb.addOrderLine(cdb.getOrderid(),product.getProductID(),cart.c.get(product),product.getPrice()* cart.c.get(product));
      
        }
        cart.getProducts().clear();
        
        return SUCCESS;
    }
}
