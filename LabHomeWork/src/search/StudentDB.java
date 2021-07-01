package search;

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.sql.*;
import search.Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author OS
 */
public class StudentDB {

    public static Vector<Student> listStudent(String url, String sql) throws ClassNotFoundException, SQLException {
        Vector<Student> list = new Vector<>();
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(url, "se1305", "abcd");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            int id = rs.getInt("Id");
            String name = rs.getString("Name");
            String address = rs.getString("Address");
            int total = rs.getInt("Total");
            list.add(new Student(id, name, address, total));
        }
        rs.close();
        return list;
    }

    public static void executeStudent(String url, String sql) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(url, "se1305", "abcd");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
    }

    public static void main(String[] args) {
        System.out.println("Database Programming");
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://Mr_Css:1433;databaseName=DATA;";
            Connection conn = DriverManager.getConnection(url, "se1305", "abcd");
            Statement stmt = conn.createStatement();
            String sql = "Select * from Table1";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int scount = rsmd.getColumnCount();
            while (rs.next()) {
                int id = rs.getInt("Id");
                String name = rs.getString("Name");
                String address = rs.getString("Address");
                int total = rs.getInt("Total");
                System.out.println("ID:" + id + " Name:" + name + "Address:  " + address + "  total:" + total);
            }
            rs.close();
        } catch (Exception e) {
        }
    }
}
