    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1lp0023;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Quynh Tran Ly
 */
public class Validation {
    private static final Scanner in = new Scanner(System.in);

    //check user input number limit
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
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

    public static boolean checkIdExist(ArrayList<Fruit> lf, String id) {
        for (Fruit fruit : lf) {
            if (id.equalsIgnoreCase(fruit.getFruitId())) {
                return false;
            }
        }
        return true;
    }

    public static double checkInputDouble() {
        while(true){
            try{
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e){
                System.err.println("Must be input double!!!");
                System.out.print("Enter again: ");
            }
        }
    }

    public static int checkInputInt() {
        while(true){
            try{
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch(NumberFormatException e){
                System.err.println("Must be input integer!!!");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean checkInputYN() {
        System.out.print("Do you want to continue (Y/N)? ");
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

    public static boolean checkItemExist(ArrayList<Order> lo, String fruitId) {
        for(Order order: lo){
            if(order.getFruitId().equalsIgnoreCase(fruitId)){
                return false;
            }
        }
        return true;
    }
    
}
