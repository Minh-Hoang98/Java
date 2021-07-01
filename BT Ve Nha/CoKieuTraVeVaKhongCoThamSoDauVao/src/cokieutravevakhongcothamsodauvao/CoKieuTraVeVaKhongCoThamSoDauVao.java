/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cokieutravevakhongcothamsodauvao;

import java.util.Scanner;

/**
 *
 * @author Laptop88
 */
public class CoKieuTraVeVaKhongCoThamSoDauVao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(TinhTong());
    }
    public static int TinhTong(){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao a: ");
        a = sc.nextInt();
        System.out.println("Moi ban nhap vao b: ");
        b = sc.nextInt();
        int tong = a + b;
        return tong;
    }
}
