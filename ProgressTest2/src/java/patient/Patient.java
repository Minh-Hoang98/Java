package patient;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Laptop88
 */
public class Patient implements Serializable {

    private String pID, pName;
    private Date date_exam;
    //private ArrayList<Patient> list = new ArrayList<>();

    public Patient() {
    }

    public Patient(String pID, String pName, String date_exam) throws ParseException {
        this.pID = pID;
        this.pName = pName;
        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = simple.parse(date_exam);
        this.date_exam = date;
    }

    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getDate_exam() {
        
        return new SimpleDateFormat("yyyy-MM-dd").format(date_exam);
    }

    public void setDate_exam(String date_exam) {
        this.date_exam = this.date_exam;
    }


    @Override
    public String toString() {
        return "Patient{" + "pID=" + pID + ", pName=" + pName + ", date_exam=" + date_exam ;
    }

    
    public ArrayList<Patient> getAll() throws ParseException {
        ArrayList<Patient> list = new ArrayList<>();
        list.add(new Patient("P001", "Minh Hoang", "2001-05-01"));
        list.add(new Patient("P002", "Minh Vu", "2003-05-01"));
        list.add(new Patient("P003", "Quy Quan", "2001-05-01"));
        list.add(new Patient("P004", "Bao Phi", "2001-05-01"));
        list.add(new Patient("P005", "Trong Hoang", "2001-05-01"));
        return list;      
    }
    
//    public List<Patient> getPatientByID(String id){
//        
//        Patient a = new Patient();       
//        if(a.getpID().equalsIgnoreCase(id))
//    }
    public static void main(String[] args) throws ParseException {
        Patient a = new Patient();
        ArrayList<Patient> list = a.getAll();
        for(Patient p: list){
            System.out.println(p.getpID()+p.getDate_exam());
        }
    }
}

