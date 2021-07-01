/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insochan;

import java.util.Scanner;

/**
 *
 * @author Laptop88
 */
public class InSoChan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0)
                System.out.println(i);
        }
    }
}
