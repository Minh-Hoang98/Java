/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaiphuongtrinhbacnhat;

import java.util.Scanner;

/**
 *
 * @author Laptop88
 */
public class GiaiPhuongTrinhBacNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban hay nhap a: ");
        a = sc.nextInt();
        System.out.println("Ban hay nhap b: ");
        b = sc.nextInt();
        if(a == 0){
            if(b == 0)
                System.out.println("Phuong trinh co vo so nghiem!");
            else
                System.out.println("Phuong trinh vo nghiem!");
        }else{
            float x = (float) -b/a;
            System.out.println("Phuong trinh co nghiem duy nhat la : "+ x);
        }
    }
    
}
