/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Laptop88
 */
public class NewClass {
    public static void main(String[] args) {
        PhanSo A = new PhanSo(2,3);      
        PhanSo B = new PhanSo(7);
        PhanSo C = new PhanSo(); 
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}

class PhanSo{
    public int TuSo;
    public int MauSo;
    
    public PhanSo(int... vaList){
        TuSo = 0;
        MauSo = 1;
        
        if(vaList.length > 0){
            TuSo = vaList[0];
            System.out.println(TuSo);
        }
        
        if(vaList.length > 1){
            MauSo = vaList[1];
            System.out.println(MauSo);
        }
    }
}