package model;

import static model.DatabaseInfo.dbURL;
import static model.DatabaseInfo.driverName;
import static model.DatabaseInfo.passDB;
import static model.DatabaseInfo.userDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentDB {

    public static ArrayList<Student> listAll() {
        ArrayList<Student> list = new ArrayList<>();
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Select id, name, gender, dob from Student");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                boolean gender = rs.getBoolean(3);
                Date dob = rs.getDate(4);
                Student st = new Student(id, name, gender, dob);
                list.add(st);
            }   
            rs.close();
            stmt.close();
            con.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void insertStudent(String name, int gender, String dob) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Insert into Student(name,gender,dob) output inserted.id values(?,?,?)");
            stmt.setString(1, name);
            stmt.setInt(2, gender);
            stmt.setString(3, dob);
            stmt.executeQuery();
            stmt.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean updateStudent(String id, String name, String gender, String dob){           
        try{
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Update Student set name=?,gender=? ,dob=? where id=?");
            stmt.setString(4, id);
            stmt.setString(1, name);
            stmt.setString(2, gender);
            stmt.setString(3, dob);
            stmt.executeUpdate();
            stmt.close();
            con.close();  
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean deleteStudent(String id) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Delete from Student where id=?");
            stmt.setString(1, id);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static Student findStudentById(String id) throws SQLException {

        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Select * from Student where id=?");
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String name = rs.getString(2);
                int gender = rs.getInt(3);
                Date dob = rs.getDate(4);
                Student student = new Student();
                student.setId(Integer.parseInt(id));
                student.setName(name);
                student.setGender(true);
                student.setDob(dob);
                return student;
            }
            stmt.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        insertStudent("Cuong", 1, "1999-09-12");
//        insertStudent("Minh", 1, "1978-01-23");
//        insertStudent("Huong", 0, "1995-09-19");
//        insertStudent("Lien", 1, "1994-05-16");
//        deleteStudent("3");
  //     updateStudent("7", "Hoang", "1", "2004-07-09");
////        List<Student> list = listAll();
////        for (int i = 0; i < list.size(); i++) {
////            System.out.println(list.get(i).getName());
////        }
////        Student s = findStudentById("5");
////        System.out.println(s.getName());

    }

}
