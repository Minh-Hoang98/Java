
package lab211;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {  
    static ArrayList<Student>dsSv=new ArrayList<>();
    public static void main(String[] args) {
        Student sv1 = new Student(130119,"Vuong Minh Hoang",9,8);        
        
        Student sv2 = new Student(130100,"Le Van Tro",9,9);              
        
        Student sv3 = new Student();
        System.out.print("Enter ID: ");
        int id = new Scanner(System.in).nextInt();
        System.out.print("Enter FullName: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter TheoryMark: ");
        int theoMark = new Scanner(System.in).nextInt();
        System.out.print("Enter AssignmentMark: ");
        int assMark = new Scanner(System.in).nextInt();
        
        sv3.setIdStudent(id);
        sv3.setFullName(name);
        sv3.setTheoryMark(theoMark);
        sv3.setAssignmentMark(assMark);
        
        dsSv.add(sv1);
        dsSv.add(sv2);
        dsSv.add(sv3);
        
        System.out.println("===========================");
        //System.out.println("ID\tFullname\t TheoryMark\t AssignmentMark\t AverageMark");
        System.out.printf("%-10s%-20s%-20s%-20s%-20s\n", "IdStudent", "FullName", "TheoryMark",
                "AssignmentMark","AverageMark");
	for(Student sv : dsSv){
	    System.out.printf("%-10s%-20s%-20s%-20s%-20s\n", sv.getIdStudent(), sv.getFullName(), sv.getTheoryMark(),
                sv.getAssignmentMark(),sv.averageMark());
	}
	System.out.println("===========================");
        
    }
}
