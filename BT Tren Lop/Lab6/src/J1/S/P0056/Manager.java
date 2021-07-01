
package J1.S.P0056;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    private static final Scanner sc = new Scanner(System.in);

    static int menu() {
        System.out.println("");
        System.out.println("====================Menu=====================");
        System.out.println("1.Add Worker.");
        System.out.println("2.Increase salary for worked.");
        System.out.println("3.Decrease salary for worker.");
        System.out.println("4.Show adjusted salary worker information.");
        System.out.println("5.Exit.");
        System.out.println("============================================");
        System.out.print("Enter Your Choice: ");
        int choi = checkInputLimit(1, 5);
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

    static int checkInputInt() {
        while (true) {
            try {
                int r = Integer.parseInt(sc.nextLine().trim());
                return r;
            } catch (Exception e) {
                System.err.println("Please input integer!!!");
                System.err.print("Enter Again:");
            }
        }
    }

    static String checkInputString() {
        String s = sc.nextLine().trim();
        return s;
    }
  public static int checkSalary(){
       while(true){
           try {
               int r = Integer.parseInt(sc.nextLine().trim());
               if(r<0){
                   throw new NumberFormatException();
                   } 
               return r;
           }catch (Exception e) {
               System.err.println("Please input salary > 0");
               System.out.print("Enter again: ");
           }
           
       }
   }  
}
