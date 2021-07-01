package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Validate {

    static ArrayList<Student> dsSV = new ArrayList<>();

    public static void xuLyDoc() {
        try{
            dsSV = SerializeFileFactory.docFile("student.txt");        
            if (dsSV.isEmpty()) {
            System.out.println("File is empty!!!");
            }
            else{
                System.out.println("Read file successfully!!!");
            }
        }catch (Exception e) {
            System.err.println("Error!!!");
        }       
    }

    public static void xuLyLuu() {
        boolean kt = SerializeFileFactory.luuFile(dsSV, "student.txt");
        if (kt == true) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }

    public static void addStudent() {
        if (dsSV.isEmpty()) {
            for (int i = 1; i <= 3; i++) {
                Student sv = new Student();                
                System.out.print("Enter Id: ");
                String id = Manager.checkInputString();               
                if (!Manager.checkCodeExist(dsSV, id)) {
                    System.err.println("Code exist.");
                    return;
                         
                }
                System.out.print("Enter Name: ");
                String name = Manager.checkInputString();
                System.out.print("Work Semester: ");
                String semester = Manager.checkInputString();
                System.out.print("Enter CouserName: ");
                String cName = Manager.checkInputCouserName();
                System.err.println("Add Successful");

                sv.setStudentId(id);
                sv.setStudentName(name);
                sv.setSemester(semester);
                sv.setCourseName(cName);

                dsSV.add(sv);
            }
            
            while (true) {
                System.out.println("Do you want to continue Y/N)?");
                boolean a = Manager.checkInputYN();
                if (a == true) {
                    Student sv = new Student();
                    System.out.print("Enter Id: ");
                    String id = Manager.checkInputString();
                    if (!Manager.checkCodeExist(dsSV, id)) {
                        System.err.println("Code exist.");
                        return;
                    }
                    System.out.print("Enter Name: ");
                    String name = Manager.checkInputString();
                    System.out.print("Work Semester: ");
                    String semester = Manager.checkInputString();
                    System.out.print("Enter CouserName: ");
                    String cName = Manager.checkInputCouserName();
                    System.err.println("Add Successful");

                    sv.setStudentId(id);
                    sv.setStudentName(name);
                    sv.setSemester(semester);
                    sv.setCourseName(cName);

                    dsSV.add(sv);
                } else {
                    break;
                }
            }
        } else {
            Student sv = new Student();
            System.out.print("Enter Id: ");
            String id = Manager.checkInputString();
            if (!Manager.checkCodeExist(dsSV, id)) {
                System.err.println("Code exist.");
                return;
            }
            System.out.print("Enter Name: ");
            String name = Manager.checkInputString();
            System.out.print("Work Semester: ");
            String semester = Manager.checkInputString();
            System.out.print("Enter CouserName: ");
            String cName = Manager.checkInputCouserName();
            System.err.println("Add Successful");

            sv.setStudentId(id);
            sv.setStudentName(name);
            sv.setSemester(semester);
            sv.setCourseName(cName);

            dsSV.add(sv);
        }
    }

    public static void findStudent() {

        System.out.println("Enter the search name: ");
        String name = Manager.checkInputString();
        System.out.println("====================================");
        System.out.println("ID\tName\tSemester\tCourse");
        for (Student sv : dsSV) {
            if (sv.getStudentName().startsWith(name)) {
                System.out.println(sv);
                return;
            }
        }
        System.err.println("Not found!!");
        //System.out.println("===========================");

    }

    public static void report() {
        if (dsSV.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        ArrayList<Report> lr = new ArrayList<>();
        int size = dsSV.size();
        for (int i = 0; i < size; i++) {
            int total = 0;
            for (Student student : dsSV) {
                String id = student.getStudentId();
                String courseName = student.getCourseName();
                String studentName = student.getStudentName();
                for (Student studentCountTotal : dsSV) {
                    if (id.equalsIgnoreCase(studentCountTotal.getStudentId())
                            && courseName.equalsIgnoreCase(studentCountTotal.getCourseName())) {
                        total++;
                    }
                }
                if (Manager.checkReportExist(lr, studentName,
                        courseName, total)) {
                    lr.add(new Report(student.getStudentName(), courseName, total));
                }
            }
        }
        //print report
        for (int i = 0; i < lr.size(); i++) {
            System.out.printf("%-15s|%-10s|%-5d\n", lr.get(i).getStudentName(),
                    lr.get(i).getCourseName(), lr.get(i).getTotalCourse());
        }
    }

    public static void sortStudent() {
        if (dsSV.isEmpty()) {
            System.err.println("List empty.");
            return;
        } else {
            Collections.sort(dsSV);
            System.out.println("Success");
        }
    }

    public static Student getStudentById(String nameDelete) {
        for (Student Student : dsSV) {
            if (Student.getCourseName().equalsIgnoreCase(nameDelete)) {
                return Student;
            }
        }
        return null;
    }

    public static void printAllStudent() {
        System.out.println("====================================");
        System.out.println("ID\tName\tSemester\tCourse");
        for (Student student : dsSV) {
            System.out.println(student);
        }
        System.out.println("====================================");
    }

    public static void Delete() {
        System.out.println("Enter the delete name: ");
        String name = new Scanner(System.in).nextLine();
        for (Student sv : dsSV) {
            if (sv.getStudentName().startsWith(name)) {
                dsSV.remove(sv);
                System.err.println("Delete Success");
                return;
            }
        }
        System.err.println("Not Found!!!");
        //Student studentDelete = getStudentById(name);
//        if (studentDelete == null) {
//            System.err.println("Not found Student.");
//            return;
//        } else {
//            dsSV.remove(studentDelete);
//        }
//        System.err.println("Delete successful.");
    }

    public static void updateStudent() {
        try {
            System.out.print("Enter id you want change: ");
            String id = Manager.checkInputString();

            for (Student st : dsSV) {
                if (st.getStudentId().equalsIgnoreCase(id)) {
                    System.out.print("Enter id: ");
                    String nameid = Manager.checkInputString();
                    if (!Manager.checkCodeExist(dsSV, nameid)) {
                        System.err.println("Code exist.");
                        return;
                    }

                    System.out.print("Enter Name: ");
                    String Name = Manager.checkInputString();

                    System.out.print("Enter Semester: ");
                    String semester = Manager.checkInputString();

                    System.out.print("Enter Course: ");
                    String course = Manager.checkInputString();

                    dsSV.set(dsSV.indexOf(st), new Student(nameid, Name, semester, course));
                    System.err.println("Add successful.");
                    return;
                }                
            }
            System.err.println("Not Found!!!");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
