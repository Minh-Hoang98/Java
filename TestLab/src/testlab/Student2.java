/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlab;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OS
 */
public class Student2 implements Serializable {

    public int id;
    public String name;
    public Date dob;
    public String address;
    public String gender;

    public Student2() {
    }

    public Student2(int id, String name, Date dob, String address, String gender) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
    }

     public Student2(int id, String name, String dob, String address, String gender) {
        this.id = id;
        this.name = name;
        this.gender=gender;
        SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
        try{
            this.dob=new java.sql.Date(sd.parse(dob).getTime());
        }
        catch(ParseException ex){
            Logger.getLogger(Student2.class.getName()).log(Level.SEVERE,null,ex);
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

     public String getDob() {
        SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
        return sd.format(dob);
    }

    public void setDob(String dob) {
        SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
        try{
            this.dob=new java.sql.Date(sd.parse(dob).getTime());
        }
        catch(ParseException ex){
            Logger.getLogger(Student2.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
