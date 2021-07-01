package model;
import com.opensymphony.xwork2.ActionSupport;
import java.io.Serializable;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import static model.DatabaseInfo.*;

public class Product implements Serializable{
    private int productID;
    private String productName;
    private int price;

    public Product() {
    }   
    public Product(int pid) {
        productID = pid;
    }
    public Product(int productID, String productName, int price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }
    public int getProductID() {
        return productID;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    } 

    @Override
    public String toString() {
        return  + productID  +"   "+ productName +"   " + price ;
    }
    
    
}
