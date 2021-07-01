package lab211_2;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {

    static ArrayList<Student> dsSV = new ArrayList<>();
    private final static Scanner in = new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max) {

        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    private static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number.");
                System.out.print("Enter again: ");
            }
        }
    }

    private static void xuLyNhap() {
        Student st = new Student();
        System.out.print("Enter ID: ");
        int ID = checkInputInt();
        System.out.print("Enter Name: ");
        String name = checkInputString();
        System.out.print("Enter Address: ");
        String addre = checkInputString();
        System.out.print("Enter Priorities(1-Area 1 or 2-Area 2): ");
        int prior = checkInputIntLimit(1, 2);

        st.setIdNames(ID);
        st.setNames(name);
        st.setAddresses(addre);
        st.setPriorities(prior);
        dsSV.add(st);
    }

    private static void xuLyXuat() {
        System.out.println("===========================");
        System.out.println("ID\tName\tAdress\t     Priorities");
        for (Student sv : dsSV) {
            System.out.println(sv);
        }
        System.out.println("===========================");
    }

    private static void timKiem() {

        System.out.println("Enter the search ID: ");
        int id = new Scanner(System.in).nextInt();
        System.out.println("===========================");
        System.out.println("ID\tName\tAdress\t     Priorities");;
        for (Student sv : dsSV) {
            if (sv.getIdNames() == id) {
                System.out.println(sv);
            }
        }
        System.out.println("===========================");

    }

    private static void lietKe() {
        System.out.println("Enter search priorities(1-Area 1 or 2-Area 2): ");
        int pri = checkInputIntLimit(1, 2);
        System.out.println("===========================");
        System.out.println("ID\tName\tAdress\t     Priorities");;
        for (Student sv : dsSV) {
            if (sv.getPriorities() == pri) {
                System.out.println(sv);
            }
        }
        System.out.println("===========================");
    }

    public static void menu() {
        System.out.println("1: Enter information about the contestants.");
        System.out.println("2: Display information about all contestant.");
        System.out.println("3: Search by idNames.");
        System.out.println("4: List information about the contestants for Area 1 or Area 2 or None");
        System.out.println("5: End program");
        System.out.println("Please choice one option: ");
        int chon = checkInputIntLimit(1, 5);
        switch (chon) {
            case 1:
                xuLyNhap();
                break;
            case 2:
                xuLyXuat();
                break;
            case 3:
                timKiem();
                break;
            case 4:
                lietKe();
                break;
            case 5:
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
}
