/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.function.Predicate;
import search.Student;
import search.Student2;

/**
 *
 * @author OS
 */
public class StudentDB2 {

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

    public static Vector<Student2> search(Predicate p) throws ClassNotFoundException, SQLException {
        Vector<Student2> list = getList();
        Vector<Student2> kq = new Vector<>();
        for (Student2 s : list) {
            if (p.test(s)) {
                kq.add(s);
            }
        }
        return kq;
    }   
}
