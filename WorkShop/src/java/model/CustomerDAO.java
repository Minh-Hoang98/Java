/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import static model.DatabaseInfo.dbURL;
import static model.DatabaseInfo.driverName;
import static model.DatabaseInfo.passDB;
import static model.DatabaseInfo.userDB;

public class CustomerDAO implements Serializable {


     public String getfullname(String id) throws SQLException{
            Connection con  = null;
            PreparedStatement stm =null;
            ResultSet rs =null;
            try {
            Class.forName(driverName);
            con = DriverManager.getConnection(dbURL, userDB, passDB);
            if(con!=null){
                String sql = "select * from CustomerTBL where CustomerID = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, id);
                rs = stm.executeQuery();
                if(rs.next()){
                   return rs.getString("CustomerName");            
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
     
    public boolean checkLogin(String username, String password)
            throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        // 1.ket noi DB
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(dbURL, userDB, passDB);
            if (con != null) {
                //2.tao sql statement
                String sql = "Select * From CustomerTBL Where CustomerID = ? And PW = ?";
                //3 tao statement
                ps = con.prepareStatement(sql);
                ps.setString(1, username);
                ps.setString(2, password);

                //4 thuc thi cau lenh
                rs = ps.executeQuery();

                //5 lay du lieu
                if (rs.next()) {
                    return true;
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public static Customer getCustomer(String uid) {
        Customer s = null;
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (Connection con = DriverManager.getConnection(dbURL, userDB, passDB)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select CustomerName,PW from CustomerTBL where CustomerID ='" + uid + "'");
            if (rs.next()) {
                String name = rs.getString(1);
                String password = rs.getString(2);
                s = new Customer(uid, name, password);                
            }
            con.close();
            return s;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        CustomerDAO a = new CustomerDAO();
     
        //System.out.println(getCustomer("PR001"));
        System.out.println(a.getfullname("PR001"));
    }
}
