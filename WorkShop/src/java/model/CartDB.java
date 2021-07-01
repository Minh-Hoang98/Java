/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import static model.DatabaseInfo.dbURL;
import static model.DatabaseInfo.driverName;
import static model.DatabaseInfo.passDB;
import static model.DatabaseInfo.userDB;

/**
 *
 * @author Nguyen Van Duc
 */
public class CartDB {

    public void addOrder(String customerID) {
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);

        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            CallableStatement stmt = con.prepareCall("insert into OrderTBL(OrderDate,PaymentMethod,CustomerID) values(?,?,?)");
            stmt.setDate(1, date);
            stmt.setDouble(2, 0);
            stmt.setString(3, customerID);
            stmt.executeUpdate();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void addOrderLine(int orderID, int productID, int quantity, double Price) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            CallableStatement stmt = con.prepareCall("insert into OrderLineTBL(OrderID,ProductID,Quantity,Price) values(?,?,?,?)");
            stmt.setInt(1, orderID);
            stmt.setInt(2, productID);
            stmt.setInt(3, quantity);
            stmt.setDouble(4, Price);
            stmt.executeUpdate();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public int getOrderid() {
        int oderid = 0;
        try {

            Class.forName(driverName);
            Connection conn = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select* from OrderTBL");
            while (rs.next()) {
                oderid = rs.getInt("OrderID");
            }

            rs.close();

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        return oderid;
    }
}
