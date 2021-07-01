/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author OS
 */
public class Student2 implements Serializable {

    public int id;
    public String name;
    public Date dob;
    public String address;
    public boolean gender;

    public Student2() {
    }

    public Student2(int id, String name, Date dob, String address, String gender) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        setGender(gender);
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return (gender ? "M" : "F");
    }

    public void setGender(String gender) {
        this.gender = gender.equals("M");
    }

}
