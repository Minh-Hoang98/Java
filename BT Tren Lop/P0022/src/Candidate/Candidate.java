
package Candidate;

import java.io.Serializable;

public class Candidate implements Serializable{
    private String cid;
    private String fName;
    private String lName;
    private int bDate;
    private String address;
    private String phone;
    private String email;
    private int cdType;

    public Candidate() {
    }

    public Candidate(String cid, String fName, String lName, int bDate, String address, String phone, String email, int cdType) {
        this.cid = cid;
        this.fName = fName;
        this.lName = lName;
        this.bDate = bDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.cdType = cdType;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getbDate() {
        return bDate;
    }

    public void setbDate(int bDate) {
        this.bDate = bDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCdType() {
        return cdType;
    }

    public void setCdType(int cdType) {
        this.cdType = cdType;
    }

    @Override
    public String toString() {
        return "FirstName= "+this.fName +"|LastName= "+ this.lName + "|BirthDay= " + this.bDate + "|Address= "
                + this.address + "|Phone= " + this.phone + "|Email= " + this.email + "|Type= "
                + this.cdType;
    }
    
    
}
