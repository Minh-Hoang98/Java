package student; 

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    private static final Scanner sc = new Scanner(System.in);

    static int menu() {
        System.out.println("");
        System.out.println("====================Menu=====================");
        System.out.println("1.Creat Student.");
        System.out.println("2.Find Student.");
        System.out.println("3.Sort Student.");
        System.out.println("4.Update Student.");
        System.out.println("5.Delete Student.");
        System.out.println("6.Report.");
        System.out.println("7.List Student.");
        System.out.println("8.Load file.");
        System.out.println("9.Save file.");
        System.out.println("0.Exit.");
        System.out.println("============================================");
        System.out.print("Enter Your Choice: ");
        int choi = checkInputLimit(0, 9);
        return choi;
    }

    static int checkInputLimit(int min, int max) {
        while (true) {
            try {
                int r = Integer.parseInt(sc.nextLine().trim());
                if (r < min || r > max) {
                    throw new NumberFormatException();
                }
                return r;
            } catch (Exception e) {
                System.out.println("Please input " + min + " to " + max + "");
                System.out.print("Enter Again:");
            }

        }
    }

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static boolean checkCodeExist(ArrayList<Student> ld, String code) {
        for (Student sv : ld) {
            if (code.equalsIgnoreCase(sv.getStudentId())) {
                return false;
            }
        }
        return true;
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number integer");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    public static boolean checkInputUD() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("U")) {
                return true;
            }
            if (result.equalsIgnoreCase("D")) {
                return false;
            }
            System.err.println("Please input u/U or d/D.");
            System.out.print("Enter again: ");
        }
    }

    static String checkInputCouserName() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("java")
                    || result.equalsIgnoreCase(".net")
                    || result.equalsIgnoreCase("c/c++")) {
                return result;
            }
            System.err.println("Please input couser name: Java, .Net, C/C++");
            System.out.println("Enter again: ");
        }
    }

    public static boolean checkReportExist(ArrayList<Report> lr, String name,
            String course, int total) {
        for (Report report : lr) {
            if (name.equalsIgnoreCase(report.getStudentName())
                    && course.equalsIgnoreCase(report.getCourseName())
                    && total == report.getTotalCourse()) {
                return false;
            }
        }
        return true;
    }
}
