package student;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {

    private String studentId;
    private String studentName;
    private String semester;
    private String courseName;

    public Student() {
    }

    public Student(String studentId, String studentName, String semester, String courseName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    

    @Override
    public String toString() {
        return this.studentId + "\t" + this.studentName + "\t" + this.semester +"    \t "+ courseName;
    }

   
    @Override
    public int compareTo(Student o) {
        return this.studentId.compareToIgnoreCase(o.studentId);
    }

}
