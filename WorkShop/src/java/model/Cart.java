/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author duchx123
 */
public class Cart {
    public final  Map<Product, Integer> c = new HashMap<>();

    
    public Cart() {
    }

    public void addProduct(Product product) {
        boolean check= true;
         Set<Product> keys = c.keySet();
        for (Product a : keys) {
         if( a.getProductID()==product.getProductID()){
             Integer amount = c.get(a);
           c.replace(a, amount+1);
             check=false;
        }}
        if(check==true) c.put(product,1);


    }

    public Map<Product, Integer> getProducts() {
        return c;
    }

    public float getTotalPrice() {
        float total = 0;
        Set<Product> keys = c.keySet();
        for (Product product : keys) {
            total += product.getPrice() * c.get(product);
        }
        
        return total;
    }
}
