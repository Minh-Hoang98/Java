package model;

import Product.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.DatabaseInfo.dbURL;
import static model.DatabaseInfo.driverName;
import static model.DatabaseInfo.passDB;
import static model.DatabaseInfo.userDB;

/**
 *
 * @author PC
 */
public class ProductDB {

    public static Vector<Product> getListProduct() {
        Vector<Product> a = new Vector<Product>();
        Product s;
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from Product_YourID");
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String unit = rs.getString(3);
                float price = rs.getFloat(4);
                s = new Product(id, name, unit, price);
                a.add(s);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
     public static boolean NewProduct(Product s){ 
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("INSERT INTO Product_YourID(ID,Name,Unit,Price) Values(?,?,?,?)");
            stmt.setString(1, s.id);
            stmt.setString(2,s.name );
            stmt.setString(3, s.unit);           
            stmt.setFloat(4, s.price);         
            int rc = stmt.executeUpdate();
            con.close();
            return rc==1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
     
    public static Product getProduct(String uid) {
        Product s = null;
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select ID,Name,Unit,Price from Product_YourID where ID='" + uid + "'");
            if (rs.next()) {
                String id  = rs.getString(1);
                String name = rs.getString(2);
                String unit = rs.getString(3);
                float price = rs.getFloat(4);
                s = new Product(id, name, unit, price);
            }
            con.close();
            return s;
        } catch (Exception ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
