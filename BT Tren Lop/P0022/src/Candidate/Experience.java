
package Candidate;

public class Experience extends Candidate {
    
    private int yearEx;
    private String proSkill;

    public Experience() {
        super();
    }

    public Experience(int yearEx, String proSkill, String cid, String fName, String lName, int bDate, String address, String phone, String email, int cdType) {
        super(cid, fName, lName, bDate, address, phone, email, cdType);
        this.yearEx = yearEx;
        this.proSkill = proSkill;
    }

    public int getYearEx() {
        return yearEx;
    }

    public void setYearEx(int yearEx) {
        this.yearEx = yearEx;
    }

    public String getpSkill() {
        return proSkill;
    }

    public void setpSkill(String pSkill) {
        this.proSkill = pSkill;
    }

    @Override
    public String toString() {
        return super.toString() + "|yearEx= " + this.yearEx + "|proSkill= " + this.proSkill;
    }
    
}
