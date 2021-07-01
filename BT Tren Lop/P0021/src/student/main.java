package student;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList();       
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    int i;                   
                    Validate.addStudent();                                    
                    break;
                case 2:
                    Validate.findStudent();
                    break;
                case 3:
                    Validate.sortStudent();
                    break;
                case 4:
                    Validate.updateStudent();
                    break;
                case 5:
                    Validate.Delete();
                    break;                      
                case 6:
                    Validate.report();
                    break;
                case 7:
                    Validate.printAllStudent();
                    break;
                case 8:
                    Validate.xuLyDoc();
                    break;
                case 9:
                    Validate.xuLyLuu();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
 }
