/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.Cart;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author huynhducduy
 */
public class CartObj {
    private String customerID;
    private Map<String, Integer> items;

    /**
     * @return the customerID
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the items
     */
    public Map<String, Integer> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(Map<String, Integer> items) {
        this.items = items;
    }
    
    public void addtoCart(String name){
        if(this.items==null){
            this.items= new HashMap<>();
        }
        int quantity =1;
        if(this.items.containsKey(name)){
            quantity = this.items.get(name) +1;
        }
        this.items.put(name, quantity);
    }
    
    public void removefromCart (String name ){
        if(this.items==null){
            return;
        }
        if(this.items.containsKey(name)){
            this.items.remove(name);
            if(this.items.isEmpty()){
                this.items=null;
            }
        }
    }
}
