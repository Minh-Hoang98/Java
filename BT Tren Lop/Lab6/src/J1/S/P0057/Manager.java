
package J1.S.P0057;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Manager {
       
    public static int menu(){
        System.out.println("====================Menu=====================");
        System.out.println("1.Create a new account.");
        System.out.println("2.Login system");
        System.out.println("0.Exit");
        System.out.println("=============================================");
        System.out.print("Enter Your Choice: ");
        int choice = Validate.checkInputLimit(0, 2);
        return choice;
    }
    
    public static void createNewAccount(){
        if(!Validate.checkFileExist()){
            return;
        }
        String userName = Validate.checkInputUserName();
        String passWord = Validate.checkInputPassword();
        if(!Validate.checkUserNameExist(userName)){
            System.out.println("UserName exist.");
            return;
        }
        
        System.out.println("");
        addAccountData(userName, passWord);
        
    }
    
    public static void loginSystem(){
        if(!Validate.checkFileExist()){
            return;
        }
        String userName = Validate.checkInputUserName();
        String passwork = Validate.checkInputPassword();
        if(!Validate.checkUserNameExist(userName)){
            if(!passwork.equalsIgnoreCase(passwordByUserName(userName))){
                System.out.println("Login fail!!!");
            }
            else System.out.println("Login Successful.");
        }
        
    }

    public static void addAccountData(String userName,String passWord){
        File file = new File("user.txt");
        
        try {
            
            FileWriter fileWrite = new FileWriter(file,true);            
            fileWrite.write("\n" + userName + ";" + passWord);
            fileWrite.close();
            
            System.out.println("Create Successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String passwordByUserName(String userName){
        File file = new File("user.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader buff = new BufferedReader(fileReader);
            String line = buff.readLine();
            while(line!=null){
                String[] account = line.split(";");
                if(userName.equalsIgnoreCase(account[0])){
                    return account[1];
                }
            }
                    buff.close();
                    fileReader.close();
               
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    
}
