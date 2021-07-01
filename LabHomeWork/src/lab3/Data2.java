/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Data2 {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://Mr_Css:1433;databaseName=DATA;";
            Connection con = DriverManager.getConnection(url, "se1305", "abcd");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from Table1");
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String address = rs.getString(3);
                int total = rs.getInt(4);
                System.out.println("Id = " + id + ", Name = " + name + ", Address = " + address + ", Total = " + total);
            }
            con.close();
        } catch (Exception ex) {
            System.err.println("Cannot connect database, " + ex);
        }
    }
}
