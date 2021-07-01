/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soke;

/**
 *
 * @author Long
 */
import java.io.DataInputStream;  
import java.io.DataOutputStream;  
import java.net.Socket;  
import java.util.*;  
  

public class SimpleChatClient {  
  public static void main(String[] args) throws Exception {  
    Socket socket = new Socket("localhost", 7000);  
    DataInputStream din = new   
      DataInputStream(socket.getInputStream());  
        
       DataOutputStream dos = new   
         DataOutputStream(socket.getOutputStream());  
      
      //nhap chuoi de gui den sever   
    Scanner kb = new Scanner(System.in);  
          
    while(true) {    
                    
    System.out.print("haithuong: ");  
        String msg=kb.nextLine();  
                     
     dos.writeUTF("ABC: "+msg);  
     dos.flush();  
             
     //nhan du lieu tu server  
      String st = din.readUTF();  
      System.out.println(st);  
        
      kb = kb.reset();  
    }    
            
    }  
  
  }  

