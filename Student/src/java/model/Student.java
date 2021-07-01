/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.rmi.CORBA.Stub;
import static model.DatabaseInfo.*;

/**
 *
 * @author Laptop88
 */
public class Student {
    private int id;
    private String name;
    private Boolean gender;
    private Date dob;

    public Student() {
    }
    
    public Student(int id, String name, Boolean gender, Date dob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public Student(String id, String name, String gender, String dob) {
        this.id = Integer.parseInt(id);
        this.name = name;
        setGender(gender);
        SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
        try{
            this.dob=new Date(sd.parse(dob).getTime());
        }
        catch(ParseException ex){
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE,null,ex);
        }        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;  
    }

    public String getDob() {
        SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
        return sd.format(dob);
    }

    public void setDob(String dob) {
        SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
        try{
            this.dob=new Date(sd.parse(dob).getTime());
        }
        catch(ParseException ex){
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
     public static boolean updateStudent(Student s) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Update Student set name=?,gender=?,dob=? where id=?");
            stmt.setString(1, s.getName());
            stmt.setBoolean(2, s.getGender());
            stmt.setString(3, s.getDob());  
            stmt.setInt(4, s.getId());
            int rc = stmt.executeUpdate();
            con.close();
            return rc == 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
     public static Student getStudent(int id) {
        ArrayList<Student> student = new ArrayList<>();
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select id,name,gender,dob from Student where id ='" + id + "'");
            if (rs.next()) {
                
                String name = rs.getString(2);
                boolean gender = rs.getBoolean(3);
                Date dob=rs.getDate(4);
                
                Student st = new Student(id, name, gender, dob);
                student.add(st);
                return st;
            }
            con.close();
            
        } catch (Exception ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
            return null;       
    }
     
    public static boolean deleteStudent(int id) {        
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Delete from Student where id =? ");                   
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            con.close();  
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
            return false;       
    }
    
    public static boolean newStudent(String name,String gender,String dob) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("INSERT INTO Student(name,gender,dob) output inserted.id Values(?,?,?)");
            stmt.setString(1, name);    
            stmt.setString(2, gender);
            stmt.setString(3, dob);           
            stmt.executeQuery();  
            stmt.close();
            con.close(); 
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<Student> listAll() {
        ArrayList<Student> student = new ArrayList<>();
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Select id, name, gender, dob from Student");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                boolean gender = rs.getBoolean(3);
                Date dob=rs.getDate(4);
                
                Student st = new Student(id, name, gender, dob);
                student.add(st);
            }
            rs.close();
            stmt.close();
            con.close();
            return student;
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void main(String[] args) throws ParseException {
        //Student a = new Student();       
       // System.out.println(a.newStudent("Hung","M",""));
       // System.out.println(a.getStudent(7));
       // System.out.println(a.listAll());
       // a.deleteStudent(15);
        Student v = new Student("6","Hung","","22/09/2019");  
        System.out.println(v.updateStudent(v));
    }
}
