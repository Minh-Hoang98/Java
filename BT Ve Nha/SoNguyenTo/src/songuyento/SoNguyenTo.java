/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyento;

import java.util.Scanner;

/**
 *
 * @author Laptop88
 */
public class SoNguyenTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap n : ");
        n = sc.nextInt();
        if(snt(n) == true) System.out.println(n + " la So nguyen to");
        else System.out.println(n +" khong phai la so nguyen to");
        
    }
    public static boolean snt(int n){
        if( n == 0 || n == 1) return false;
        for(int i = 2; i <= n - 1; i++){
            if ( n % i == 0) return false;
        }
        return true;
    }
    
}
