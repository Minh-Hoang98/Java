/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputvaluefromkeyboard;

import java.util.Scanner;

/**
 *
 * @author Laptop88
 */
public class InputValueFromKeyBoard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String ten;
        System.out.print("Moi ban nhap ten : ");
        ten = sc.nextLine();
        int tuoi;
        System.out.print("Moi ban nhap tuoi : ");
        tuoi = sc.nextInt();
        System.out.println("Thong tin ban vua nhap la : ");
        System.out.println("Ten ban la : " + ten);
        System.out.println("Tuoi ban la : " + tuoi);
        
    }
    
}
