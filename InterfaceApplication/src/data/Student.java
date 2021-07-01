package data;

/**
 *
 * @author giao-lang | fb/giao.lang.bis | fb/doit.now.oha
 * version 20.0330
 */

public class Student {
    private String id;  
    public String name;  
    public int yob;     //năm sinh 
    private double gpa; //điểm trung bình 

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
   
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", yob=" + yob + ", gpa=" + gpa + '}';    
    } 
   
    //Xếp hạng dựa trên điểm trung bình, làm đơn giản với 3 mức xếp hạng
    public String getRank() {
        if(gpa < 5)
            return "POOR";
        else if(gpa < 6)
            return "AVERAGE";
        else
            return "GOOD";
    }
        
    public void showProfile() {
        System.out.printf("|%-8s|%-25s|%4d|%4.1f|%-10s|\n", 
                              id, name, yob, gpa, getRank());       
    } //In gióng lề/canh lề kiểu soái ca/Excel/tabular 
}
