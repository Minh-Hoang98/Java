/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.DatabaseInfo.dbURL;
import static model.DatabaseInfo.driverName;
import static model.DatabaseInfo.passDB;
import static model.DatabaseInfo.userDB;

/**
 *
 * @author Laptop88
 */
public class Customer {
    private String cID;
    private String cName;
    private String pw;

    public Customer() {
    }   
     public Customer(String uid) {
        Customer s = getCustomer(uid);
        this.cID = s.cID;
        this.cName = s.cName;
        this.pw = s.pw;       
    }

    public Customer(String cID, String cName, String pw) {
        this.cID = cID;
        this.cName = cName;
        this.pw = pw;
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public boolean checkLogin(String a, String b) {
        try {

            Class.forName(driverName);
            Connection conn = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select* from CustomerTBL where CustomerID = '" + a + "'");
            while (rs.next()) {
                if (rs.getString("CustomerID").equals(a) && rs.getString("PW").equals(b)) {
                    return true;
                }
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
     public static Customer getCustomer(String uid) {
        Customer s = null;
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery("Select CustomerName,PW from CustomerTBL where CustomerID ='" + uid + "'");
            if (rs.next()) {
                String name = rs.getString(1);           
                String password = rs.getString(2);               
                s = new Customer(uid,name,password);
            }
            con.close();
            return s;
        } catch (Exception ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }   
     public static void main(String[] args) {
        Customer a= Customer.getCustomer("KH0001");
         System.out.println(a.getcName());
    }
}
