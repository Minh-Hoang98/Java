/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import static Model.DatabaseInfo.dbURL;
import static Model.DatabaseInfo.driverName;
import static Model.DatabaseInfo.passDB;
import static Model.DatabaseInfo.userDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class StudentDB {

    public static Vector<Student> getListStudent() {
        Vector<Student> a = new Vector<Student>();
        Student s;
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from Student");
            while (rs.next()) {
                String code = rs.getString(1);
                String name = rs.getString(2);
                LocalDate date = rs.getDate(3).toLocalDate();
                String gender = rs.getString(4);
                s = new Student(code, name, date, gender);
                a.add(s);
            }
        } catch (Exception ex) {
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
     public static boolean addNewStudent(Student s){ 
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("INSERT INTO Student (sCode,sName,sDob,sGender) Values(?,?,?,?)");
            stmt.setString(1, s.scode);
            stmt.setString(2,s.sname );
            stmt.setDate(3, java.sql.Date.valueOf(s.dob));           
            stmt.setString(4, s.sGender);         
            int rc = stmt.executeUpdate();
            con.close();
            return rc==1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
