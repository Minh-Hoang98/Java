package model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import static model.DatabaseInfo.dbURL;
import static model.DatabaseInfo.driverName;
import static model.DatabaseInfo.passDB;
import static model.DatabaseInfo.userDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nguyen Van Duc
 */
public class ProductDB implements DatabaseInfo, Serializable {

    public List<Product> getList() throws ClassNotFoundException, SQLException {
        List<Product> list = new ArrayList();
        String sql = "Select * from ProductTBL";
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Product a = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3));
                list.add(a);
            }
            rs.close();
        }catch(SQLException e){
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE,null,e);
        }
        return list;
    }

    public List<Product> listsearch;

    public List<Product> getListSearch() {
        return listsearch;
    }
    public void search(String value1, String value2) throws SQLException, NamingException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(dbURL, userDB, passDB);
            if (con != null) {
                String sql = "select * from ProductTBL where ProductPrice BETWEEN ? AND ? ;";
                stm = con.prepareStatement(sql);
                stm.setString(1, value1);
                stm.setString(2, value2);
                rs = stm.executeQuery();

                while (rs.next()) {
                    int id = rs.getInt("ProductID");
                    String name = rs.getString("ProductName");
                    int price = rs.getInt("ProductPrice");

                    Product dto = new Product(id, name, price);
                    if (listsearch == null) {
                        listsearch = new ArrayList<>();
                    }
                    listsearch.add(dto);
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
    
    private Map<String, String> itemlist;

    public Map<String, String> getItemlist() {
        return itemlist;
    }

    public void getAllProduct() throws ClassNotFoundException, SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(dbURL, userDB, passDB);
            if (con != null) {
                String sql = "select * from ProductTBL";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("ProductID");
                    String name = rs.getString("ProductName");
                    String uid = Integer.toString(id);
                    if (itemlist == null) {
                        itemlist = new HashMap<>();
                    }
                    this.itemlist.put(uid, name);
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
    public Product getProduct(int productID) {
        Product st = null;
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select ProductID,ProductName,ProductPrice from ProductTBL where ProductID=" + productID + "");
            if (rs.next()) {
                int pid = rs.getInt("ProductID");
                String pname = rs.getString("ProductName");
                int price = rs.getInt("ProductPrice");

                st = new Product(pid, pname, price);
            }
            con.close();

        } catch (Exception ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return st;
    }
}
