package model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.DatabaseInfo.*;

public class Manager {

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

    public static void addOrder(String customerID,String pay) {
        long milli = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(milli);
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            CallableStatement stmt = con.prepareCall("insert into OrderTBL(OrderDate,PaymentMethod,CustomerID) values(?,?,?)");
            stmt.setDate(1, date);
            stmt.setString(2, pay);
            stmt.setString(3, customerID);
            stmt.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void addOrderLine(int orderID, int productID, int quantity, float Price) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            CallableStatement stmt = con.prepareCall("Insert into OrderLineTBL(OrderID,ProductID,Quantity,Price) values(?,?,?,?)");
            stmt.setInt(1, orderID);
            stmt.setInt(2, productID);
            stmt.setInt(3, quantity);
            stmt.setFloat(4, Price);
            stmt.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean addCustomer(String id, String name, String pw) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            CallableStatement stmt = con.prepareCall("Insert into CustomerTBL(CustomerID,CustomerName,PW) values(?,?,?)");
            stmt.setString(1, id);
            stmt.setString(2, name);
            stmt.setString(3, pw);
            stmt.executeUpdate();
            con.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static int getOrderid() {
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

    public static void main(String[] args) {
        Manager b = new Manager();
        if (b.checkLogin("KH00001", "1234")) {
            System.out.println("xxxx");
        } else {
            System.out.println("y");
        }
        //addOrder("Hoang");
        //addOrderLine(1, 100, 1, 0);
    }
}
