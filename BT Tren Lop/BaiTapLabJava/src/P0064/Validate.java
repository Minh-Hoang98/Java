/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0064;

import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Validate {
    
    private static final String PHONE_VALID = "^\\d{10}\\d*$";
    private static final String EMAIL_VALID = "^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";
    private static final Scanner scanner = new Scanner(System.in);
    
     static String checkInputString(){
        while(true){
           String s = scanner.nextLine().trim();
           if(s.isEmpty()){
               System.err.println("Not Empty");
               System.out.print("Enter Again: ");
           }
           return s;
        }  
    }
//==========================================================================
    static String checkPhone(){       
        while(true){
            System.out.print("Phone number: ");
            String s = checkInputString();
            if(s.matches(PHONE_VALID)){
                return s;
            }if(s==null){
                return "Not number phone";
            }
            System.err.println("Phone number must be 10 digits");
        }
    }
    //==========================================================================
    static String checkEmail(){
        
        while(true){
            System.out.print("Email: ");
            String s = scanner.nextLine().trim();
             if(s.isEmpty()){
                return "Not Email";
            }
            if(s.matches(EMAIL_VALID)){
                return s;
            } 
            System.err.println("Email have format <account name>@<domain>");           
        }
    }
    //==========================================================================
    static String checkDay(){
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        while(true){
            System.out.print("Date: ");
            String s = checkInputString();
            try {
                sf.parse(s);
                return s;
            } catch (Exception e) {
                System.err.println("Day Format: dd/MM/yyyy");
            }
        }
    }
}
