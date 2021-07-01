/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlab;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import testlab.Student2;

/**
 *
 * @author OS
 */
public class StudentDB2 {

//     public static Student2 getStudent(int id) {
//        ArrayList<Student2> student = new ArrayList<>();
//        try {
//            Class.forName(driverName);
//            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("Select Name,Ngay,DiaChi,Gender from Student where ID='"+ id +"'");
//            if (rs.next()) {
//                
//                String name = rs.getString(2);
//                String dob= rs.getString(3);
//                String ngay = rs.getString(4);
//                String gender = rs.getString(5);
// 
//                Student2 st = new Student2(id,name,dob, ngay, gender);
//                student.add(st);
//                return st;
//            }
//            con.close();
//            
//        } catch (Exception ex) {
//            Logger.getLogger(Student2.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            return null;       
//    }
     
    public static Vector<Student2> getList() throws ClassNotFoundException, SQLException {
        Vector<Student2> list = new Vector<>();
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://Mr_Css:1433;databaseName=DATA;", "se1305", "abcd");
        Statement stmt = conn.createStatement();
        String sql = "Select * from Student";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            int id = rs.getInt("Id");
            String name = rs.getString("Name");
            Date dob = rs.getDate("Ngay");
            String address = rs.getString("DiaChi");
            String gender = rs.getString("Gender");
            list.add(new Student2(id, name, dob, address, gender));
        }
        rs.close();
        return list;
    }

    public static void updateStudent(Student2 s) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://Mr_Css:1433;databaseName=DATA;", "se1305", "abcd");
            PreparedStatement stmt = con.prepareStatement("Update Student set Name=?,Ngay=?,DiaChi=?,Gender=? where ID=?");
            stmt.setString(1, s.getName());
            stmt.setString(2, s.getDob());
            stmt.setString(3, s.getAddress());       
            stmt.setString(4, s.getGender());       
            stmt.setInt(5, s.getId());       
            int rc = stmt.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println(getList());
       // Student2 a = new Student2(1,"Hoang","22/01/2019","gl","a");
        //updateStudent(a);
    }
}
