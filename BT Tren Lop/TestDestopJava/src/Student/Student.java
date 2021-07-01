
package Student;

import java.io.Serializable;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DatabaseInfo;
//import java.time.LocalDate;
import model.StudentDB;

public class Student implements DatabaseInfo, Serializable{
    private String sCode;
    private String sName;
    private Date sDob;
    private int sGender;

    public Student() {
    }
    
    public Student(String sc) {
        Student s = StudentDB.getStudent(sc);
        this.sCode = s.sCode;
        this.sName = s.sName;
        this.sDob = s.sDob;
        this.sGender = s.sGender;
    }

    public Student(String sCode, String sName, String sDob, int sGender){
        this.sCode = sCode;
        this.sName = sName;
        this.sGender = sGender;
        try {
            this.sDob = new Date(new SimpleDateFormat("dd/MM/yy").parse(sDob).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public Student NewStudent(String sCode, String sName, String sDob, int sGender){
        this.sCode = sCode;
        this.sName = sName;
        this.sGender = sGender;
        try {
            this.sDob = new Date(new SimpleDateFormat("dd/MM/yy").parse(sDob).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return this;
    }


    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Date getsDob() {
        return sDob;
    }

    public void setsDob(Date sDob) {        
        this.sDob = sDob;
    }

    public int getsGender() {
        return sGender;
    }

    public void setsGender(int sGender) {
        this.sGender = sGender;
    }
    
}
