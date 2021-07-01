package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.DatabaseInfo.dbURL;
import static model.DatabaseInfo.driverName;
import static model.DatabaseInfo.passDB;
import static model.DatabaseInfo.userDB;

public class ProductDB {

    public ArrayList<Product> listAll() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet re = stmt.executeQuery("Select ProductID, ProductName, Unit, Price from Product_DE130119");
            while (re.next()) {
                String id = re.getString(1);
                String name = re.getString(2);
                String unit = re.getString(3);
                int price = re.getInt(4);
                list.add(new Product(id, name, unit, price));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void newProduct(Product p) throws ClassNotFoundException {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Insert into Product_DE130119(ProductID, ProductName, Unit, Price) values(?,?,?,?)");
            stmt.setString(1, p.getProductID());
            stmt.setString(2, p.getProductName());
            stmt.setString(3, p.getUnit());
            stmt.setFloat(4, p.getPrice());
            int rc = stmt.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Product getProduct(String pID) {
        Product p = null;
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select ProductID, ProductName, Unit, Price from Product_De130119 where ProductID='" + pID + "'");
            if (rs.next()) {
                String name = rs.getString(2);
                String unit = rs.getString(3);
                float price = rs.getFloat(4);
                p = new Product(pID, name, unit, price);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException e){
            
        }
        return p;
    }
    
    public static void main(String[] args) {
        ProductDB a = new ProductDB();
        System.out.println(a.getProduct("P004"));
    }
}
