/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

public class Customer implements Serializable {

    private String cID, PW, Name;

    public Customer() {
    }

    public Customer(String cID, String PW, String Name) {
        this.cID = cID;
        this.PW = PW;
        this.Name = Name;
    }

    public Customer(Customer s) {
        this(s.cID, s.PW, s.Name);
    }

    public Customer(String cID) {
        this(CustomerDAO.getCustomer(cID));
    }

    public static Customer login(String uid, String pw) {
        Customer s = new Customer(uid);
        if (s.PW.equals(pw)) {
            return s;
        }
        return null;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getPW() {
        return PW;
    }

    public void setPW(String PW) {
        this.PW = PW;
    }
    
    public static void main(String[] args) {
        Customer a = new Customer();
        System.out.println(a.login("PR001", "123qwe"));
    }
}
