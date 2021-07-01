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
public class Thread1 {

    public static void main(String[] args) {
        Thongbao1 dt1 = new Thongbao1();
        dt1.start();
        Thongbao1 dt2 = new Thongbao1();
        dt2.start();
    }
}

class Thongbao1 extends Thread {

    public void run() {
        for (int i = 1; i < 5000; i++) {
            System.out.println("Chao ban den voi toi!!");
        }
    }
}

class Thongbao2 extends Thread {

    public void run() {
        for (int i = 1; i < 5000; i++) {
            System.out.println("Welcome you!!!");
        }
    }
}
