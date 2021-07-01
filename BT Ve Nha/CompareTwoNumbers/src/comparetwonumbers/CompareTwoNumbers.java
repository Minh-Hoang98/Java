/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparetwonumbers;

import java.util.Scanner;

/**
 *
 * @author Laptop88
 */
public class CompareTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
        System.out.print("Please input a: ");
        a = sc.nextInt();
        System.out.print("Please input b: ");
        b = sc.nextInt();
        boolean kiemTra = (a > b);
        System.out.println(a + " co lon hon "+ b +" hay khong ? " + kiemTra);
        kiemTra = (a < b);
        System.out.println(a + " co nho hon "+ b +" hay khong ? " + kiemTra);
        kiemTra = (a == b);
        System.out.println(a + " co bang hon "+ b +" hay khong ? " + kiemTra);
    }
    
}
