/*                                                              
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0063;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Person> ds = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("You must input digit.");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static double checkInputSalary() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                if (result < 0) {
                    System.err.println("Salary is greater than zero.");
                    System.out.print("Enter again: ");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.err.println("You must input Salary.");
                System.out.print("Please input salary: ");
            }
        }
    }

    private static void inputPersonInfo() {
        Person sv = new Person();
        System.out.println("Input Information of Person");
        System.out.print("Please input name: ");
        String name = checkInputString();
        System.out.print("Please input address: ");
        String address = checkInputString();
        System.out.print("Please input salary: ");
        double salary = checkInputSalary();
        sv.setName(name);
        sv.setAddress(address);
        sv.setSalary(salary);
        ds.add(sv);      
    }
    
    
}
