
package J1.S.P0057;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Validate {
    private static final Scanner sc = new Scanner(System.in);
    private static final String VALID_USERNAME="^\\S{5}\\S*$";
    private static final String VALID_PASSWORD="^\\S{5}\\S*$";
       
    public static boolean checkInputYN() {
        //loop until user input correct
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
    
    public static String checkInputString(){
        String s = sc.nextLine().trim();
        return s;
    }
    
    public static int checkInputLimit(int min,int max){
        while(true){
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
            if(result<min || result>max){
                throw new NumberFormatException();
            }
            return result;
            } catch (Exception e) {
                System.err.println("Please input "+min+" to "+max+"");
                System.out.print("Enter Again: ");
            }
        }
    }
    
    public static boolean checkFileExist(){
        File file = new File("user.txt");
        if(!file.exists()){
            try {
                System.out.println("File not exist!!!");
                file.createNewFile();
                System.out.println("File Created.");
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }
    
    public static String checkInputUserName(){
        System.out.print("Enter username: ");
        while(true){
            String result = checkInputString();
            if(result.matches(VALID_USERNAME)){
                return result;
            }
            System.out.println("You must enter least at 5 character, and no space!!!");
            System.out.print("Enter again: ");
            
        }
    }
    
    public static String checkInputPassword(){
        System.out.print("Enter password: ");
        while(true){
            String pass = checkInputString();
            if(pass.matches(VALID_PASSWORD)){
                return pass;
            }
            System.out.println("You must enter least at 6 character, and no space!!!");
            System.out.print("Enter again: ");
        }
    }
    
    public static boolean checkUserNameExist(String userName){
        File file = new File("user.txt");
        try {
            FileReader fileRead = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileRead); 
            String line;
            while((line = bufferedReader.readLine())!= null){
                String [] account = line.split(";");
                if(userName.equalsIgnoreCase(account[0])){
                    return false;
                }
            }
            bufferedReader.close();
            fileRead.close();
            return true;
        } 
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } 
        catch (IOException e){
            e.printStackTrace();
        }
        return true;
    }
    
    
}
