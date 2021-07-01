package model;

import Student.Student;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.DatabaseInfo.dbURL;
import static model.DatabaseInfo.driverName;
import static model.DatabaseInfo.passDB;
import static model.DatabaseInfo.userDB;

public class StudentDB implements DatabaseInfo {

    public static boolean addNewStudent(String sCode, String sName, String sDob, int sGender) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            CallableStatement stmt = con.prepareCall("INSERT INTO Student Values(?,?,?,?)");
            stmt.setString(1, sCode);
            stmt.setString(2, sName);
            stmt.setString(3, sDob);
            stmt.setInt(4, sGender);
            int rc = stmt.executeUpdate();
            con.close();
            return rc == 1;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static Vector<Vector> listAllStudent(String uid) {
        try {           
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Select Scode,Sname,Sdob,Sgender from Student");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Vector row = new Vector();
                row.add(rs.getString(1));
                row.add(rs.getString(2));
                row.add(rs.getString(3));
                row.add(rs.getString(4));
            }
        return null;
    }
    }
    public static Student getStudent(String uid) {
        Student s = null;
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select Scode,Sname,Sdob,Sgender from Student where Scode='" + uid + "'");
            if (rs.next()) {
                String sCode = rs.getString(1);
                String sName = rs.getString(2);
                String sDob = rs.getString(3);
                int sGender = rs.getInt(4);
                s = new Student(sCode, sName, sDob, sGender);
            }
            con.close();
            return s;
        } catch (Exception ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
