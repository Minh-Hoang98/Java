/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidu3_Thread;

/**
 *
 * @author Laptop88
 */

class Syn{
    public void display(){
        for(int i =1;i<10;i+=2){
            System.out.println(i);
            try{
                Thread.sleep(1000);                 
            }catch(Exception e){}
        }
    }
}

public class MultiThread extends Thread
{
    static Syn a = new Syn();
    public void run(){
        synchronized(a)
        {
        a.display();
        }
    }
    public static void main(String[] args){
        MultiThread m = new MultiThread();
        MultiThread n = new MultiThread();
        m.start();       
        n.start();
    }
}
