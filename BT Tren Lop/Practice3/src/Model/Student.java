/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author PC
 */
public class Student {

    public String scode;
    public String sname;
    public LocalDate dob;
    public String sGender;

    public Student() {
    }

    public Student(String scode, String sname, LocalDate dob, String sGender) {
        this.scode = scode;
        this.sname = sname;
        this.dob = dob;
        this.sGender = sGender;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getsGender() {
        return sGender;
    }

    public void setsGender(String sGender) {
        this.sGender = sGender;
    }
    
}
