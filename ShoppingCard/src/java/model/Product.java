package model;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import static model.DatabaseInfo.*;

public class Product {
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
    
    public ArrayList<Product> getAll() {
        ArrayList<Product> list= new ArrayList<>();
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Select * from ProductTBL");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int price = rs.getInt(3);                
                Product st = new Product(id, name,price);
                System.out.println(st.toString());
                list.add(st);
            }
            rs.close();
            stmt.close();
            con.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
      return list;
    }
     public static Product getProduct(int productID){
        Product st=null;
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL,userDB,passDB);
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery("Select ProductID,ProductName,ProductPrice from ProductTBL where ProductID="+productID+"");
            if(rs.next()){
                int pid = rs.getInt("ProductID");
                String pname=rs.getString("ProductName");
                int price=rs.getInt("ProductPrice");
          
            st =new Product(pid, pname, price);
            }
            con.close();
   
         
        } catch (Exception ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
           return st;
}
    public static void main(String[] args) {
       
        Product a = getProduct(1);
        System.out.println(a.toString());
    }

}
