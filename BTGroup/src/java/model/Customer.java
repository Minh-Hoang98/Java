/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import static model.DatabaseInfo.dbURL;
import static model.DatabaseInfo.password;
import static model.DatabaseInfo.userName;

/**
 *
 * @author Admin
 */
public class Customer {
    private int customerID;
    private String customerName;
    private String email;
    private String note;

    public Customer() {
    }

    public Customer(int customerID, String customerName, String email, String note) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.email = email;
        this.note = note;   
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public static int insertCustomer(int cusID, String cusName, String email, String note) {
        int i = 0;
        try {
            Connection con=DriverManager.getConnection(dbURL, userName, password);
            PreparedStatement ps = con.prepareCall("Insert into Customer values(?,?,?,?)");         
            ps.setInt(1, cusID);
            ps.setString(2, cusName);
            ps.setString(3, email);
            ps.setString(4, note);         
            i = ps.executeUpdate();
            ps.close();
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return i;
    }
    
    public static void main(String[] args) {
        insertCustomer(1, "Hoang", "abc@gmail.com", "ábvssww");
    }
}
