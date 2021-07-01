
package lab211;

public class Student {
    private int idStudent;
    private String fullName;
    private double theoryMark, assignmentMark;

    public Student() {
    }

    public Student(int idStudent, String fullName, double theoryMark, double assignmentMark) {
        this.idStudent = idStudent;
        this.fullName = fullName;
        this.theoryMark = theoryMark;
        this.assignmentMark = assignmentMark;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getTheoryMark() {
        return theoryMark;
    }

    public void setTheoryMark(double theoryMark) {
        this.theoryMark = theoryMark;
    }

    public double getAssignmentMark() {
        return assignmentMark;
    }

    public void setAssignmentMark(double assignmentMark) {
        this.assignmentMark = assignmentMark;
    }
    
    public double averageMark(){
        return (this.assignmentMark + this.theoryMark) / 2;
    }

    @Override
    public String toString() {
        return "ID: "+idStudent + " ,Name: " + fullName + ", TheoryMark= " + theoryMark + ", AssignmentMark=" + assignmentMark + ", AverageMark=" + averageMark();
    }   
}   
