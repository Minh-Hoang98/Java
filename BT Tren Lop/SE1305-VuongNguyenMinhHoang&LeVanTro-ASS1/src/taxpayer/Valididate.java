
package taxpayer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Valididate {

    private final static Scanner in = new Scanner(System.in);

    public static int checkInputLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result > max || result < min) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("You have to input number in range [" + min + "," + max + "]");
                System.out.println("Enter again!");
            }
        }
    }

    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine().trim());
                if (result < 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Input number greater than 0!");
                System.out.println("Enter again!");
            }
        }
    }
    
    public static int checkInputInt() {       
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (Exception e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static double getTax(double result) {   
            double tax = 0;
            try {
                if (result <5000&&result>0) {
                    tax = 5;
                } else if (result >= 5000 && result <= 10000) {
                    tax = 10;
                } else {
                    tax = 15;
                }
            } catch (Exception e) {
            }return tax;
        }
    
    public static double getDeduct(double income,double deduct){
        while(true){
            double tax=0;
            deduct=(income*tax)/100;
        }
    }

   public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Empty!");
                System.out.println("Enter again!");
            } else {
                return result;
            }
        }
    } 
        public static boolean checkCodeExist(TaxpayerList a, String code) {
        for (int i = 0; i < a.size(); i++) {
            if (code.equalsIgnoreCase(a.getNode(i).info.code)) {
                return true;
            }
        }
        return false;
    }
   
    public static boolean checkFileExist() {
        File file = new File("taxpayer.txt");
        if (!file.exists()) {
            try {
                System.err.println("File not exist!!!");
                file.createNewFile();
                System.err.println("File created.");
                return false;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return true;
    }
    
    public static int checkPositionK(TaxpayerList taxpayer){
        while(true){
            try {
                int result =Integer.parseInt(in.nextLine().trim());
                if(result<=0||result>=taxpayer.size()-1){
                    throw new NumberFormatException();
                }return result;
            } catch (Exception e) {
                System.err.println("Please enter number 0 < n < size - 2");
                System.out.println("Enter again!");
            }
        }
    }
    
     public static boolean checkIdExist(TaxpayerList taxpayerlist,String code){
        for(int i=0;i<taxpayerlist.size();i++){
            if(code.equalsIgnoreCase(taxpayerlist.getNode(i).info.getCode())){
                return true;
            }
        }return false;
    }
}

