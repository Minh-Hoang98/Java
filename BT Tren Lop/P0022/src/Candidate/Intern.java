
package Candidate;

public class Intern extends Candidate{
    private String major;
    private String semester;
    private String university;

    public Intern() {
        super();
    }

    public Intern(String major, String semester, String university, String cid, String fName, String lName, int bDate, String address, String phone, String email, int cdType) {
        super(cid, fName, lName, bDate, address, phone, email, cdType);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString()+ "|major=" + this.major + "|semester=" + this.semester + "|university=" + this.university;
    }
    
}
