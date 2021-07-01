/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidu1_Thread;

/**
 *
 * @author Laptop88
 */
public class Thread2 {
    public static void main(String[] args) {
        Thread dt1 = new Thread(new Chao1());
        dt1.start();
        Thread dt2 = new Thread(new Chao2());
        dt2.start();
    }
}

class Chao1 implements Runnable {

    public void run() {
        for (int i = 1; i <= 5000; i++) {
            System.out.println("Chao ban den voi toi!!");
        }
    }
}

class Chao2 implements Runnable {

    public void run() {
        for (int i = 1; i <= 5000; i++) {
            System.out.println("Welcome you!!!");
        }
    }
}
