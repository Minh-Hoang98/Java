/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaiphuongtrinhbachai;

import java.util.Scanner;

/**
 *
 * @author Laptop88
 */
public class GiaiPhuongTrinhBacHai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao a: ");
        a = sc.nextInt();
        System.out.println("Hay nhap vao b: ");
        b = sc.nextInt();
        System.out.println("Hay nhap vao c: ");
        c = sc.nextInt();
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("Phuong trinh co vo so nghiem!");
                }else {
                    System.out.println("Phuong trinh vo nghiem!");
                }
            } else {
                float x = (float) - c / b;
                System.out.println("Phuong trinh co mot nghiem: " + x);
        }
        }else {
                int delta = (b * b) - (4 * a * c);
                if(delta < 0){
                    System.out.println("Phuong trinh vo nghiem!");
                } else if (delta == 0){
                    float x = (float) -b / (2 * a);
                    System.out.println("Phuong trinh co nghiem kep :" +x);
                } else {
                    float canDelta = (float)Math.sqrt(delta);
                    float x1 = (float) (-b + canDelta) / (2 * a);
                    float x2 = (float) (-b - canDelta) / (2 * a);
                    System.out.println("Phuong trinh co 2 nghiem: ");
                    System.out.println("x1: " + x1);
                    System.out.println("x2: " + x2);
                }
        }  
    }
    
}
