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


import java.io.*;  
import java.util.*;  
import java.net.*;  
/*Chuong trinh chat don gian  
 Server nhan message tu Client  
 */  
public class SimpleChatServer {  
    public static void main(String[] args) throws Exception  
  {  
      ServerSocket server = new ServerSocket(7000);  
      System.out.println("Server is started");      

      while(true) {    
           Socket socket = server.accept();  
           new doRequest(socket).start(); 
      }  
      //socket.close();   
    }  
  } 
class doRequest extends Thread{ 
    Socket socket; 
    DataInputStream din; 
    DataOutputStream dos; 
    public doRequest(Socket sk){ 
        socket=sk; 
    } 
    public void run(){ 
    try{ 
     
    din=new DataInputStream(socket.getInputStream()); 
    dos=new DataOutputStream(socket.getOutputStream()); 
    Scanner kb=new Scanner(System.in); 
    while(true){ 
        String nhan=din.readUTF(); 
        System.out.println(nhan); 
        System.out.println("server: "); 
        String gui=kb.nextLine(); 
        dos.writeUTF("server:"+gui); 
        dos.flush(); 
        kb=kb.reset(); 
    } 
    }catch(Exception e) 
    { 
         
    } 
    } 
    
}
