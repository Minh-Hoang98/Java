/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapmangnangcao;

import java.util.Scanner;

public class NhapMangNangCao {
    public static void main(String[] args) {
        int n;
        int Check;
        do{
        Scanner scanner = new Scanner(System.in);
        //MENU:
        System.out.println("");
        System.out.println("1. Input Array INT.");
        System.out.println("2. Input Array DOUBLE.");
        System.out.println("3. Input Array STRING.");
        System.out.println("0. EXIT.");
        
        System.out.print("Enter number: ");
        Check=scanner.nextInt();
        switch(Check){
            case 1: System.out.println("");
                    System.out.print("Enter n: ");
                    n=scanner.nextInt();
                    int[] A_Int=new int[n];       
                    for(int i=0; i<A_Int.length ;i++){
                    System.out.print("Array["+(i+1)+"]= ");
                    A_Int[i]=scanner.nextInt();
                    }
                    System.out.print("Array: ");
                    for(int i=0; i<A_Int.length ;i++)
                    System.out.print(A_Int[i]+"\t");
                    break;
            case 2: System.out.println("");
                    System.out.print("Enter n: ");
                    n=scanner.nextInt();
                    double[] A_Dou=new double[n];
                    System.out.println("");
                    for(int i=0; i<A_Dou.length ;i++){
                    System.out.print("Array["+(i+1)+"]= ");
                    A_Dou[i]=scanner.nextDouble();
                    }
                    System.out.print("Array: ");
                    for(int i=0; i<A_Dou.length ;i++)
                    System.out.print(A_Dou[i]+"\t");
                    break;
            case 3: System.out.println("");
                    System.out.print("Enter n: ");
                    n=scanner.nextInt();
                    String[] A_Str=new String[n];
                    System.out.println("");
                    for(int i=0; i<A_Str.length ;i++){
                    System.out.print("Array["+(i+1)+"]= ");
                    A_Str[i]=scanner.next();
                    }
                    System.out.print("Array: ");
                    for(int i=0; i<A_Str.length ;i++)
                    System.out.print(A_Str[i]+"\t");
                    break;
            case 0: System.out.println("Goodbye!!!");
                    break;
            default: System.out.println("Input not valid!"); 
                    break;
        }       
        }while(Check!=0);
}
}

        
