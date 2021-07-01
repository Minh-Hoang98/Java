
package Candidate;

public class Fresher extends Candidate{
    private String graDate;
    private String graRank;
    private String Education;

    public Fresher() {
        super();
    } 

    public Fresher(String graDate, String graRank, String Education, String cid, String fName, String lName, int bDate, String address, String phone, String email, int cdType) {
        super(cid, fName, lName, bDate, address, phone, email, cdType);
        this.graDate = graDate;
        this.graRank = graRank;
        this.Education = Education;
    }

    public String getGraDate() {
        return graDate;
    }

    public void setGraDate(String graDate) {
        this.graDate = graDate;
    }

    public String getGraRank() {
        return graRank;
    }

    public void setGraRank(String graRank) {
        this.graRank = graRank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }      

    @Override
    public String toString() {
        return super.toString() +"|graDate= " + this.graDate + "|graRank= " + this.graRank + "|Education=" + this.Education;
    }
    
}
