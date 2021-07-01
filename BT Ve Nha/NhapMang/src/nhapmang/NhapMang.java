
package nhapmang;

import java.util.Scanner;

/**
 *
 * @author Laptop88
 */
public class NhapMang {

    public static void main(String[] args) {
        int ar = 100, n,i;
        int[] a = new int[ar];
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter n: ");
            n = sc.nextInt();
        }while(n <= 0 || n > ar - 1);
        
        for(i = 0; i < n; i++){
            System.out.print("a[" + i + "] = ");   
            a[i] =  sc.nextInt();
        }
        for(i = 0; i < n; i++){
            System.out.print(a[i] + "\t");
        }
    }   
}
