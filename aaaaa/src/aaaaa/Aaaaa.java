/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaaaa;

/**
 *
 * @author Admin
 */
public class Aaaaa {

    public int a;
    public int b;

    public Aaaaa() {
    }

    public Aaaaa(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void abc(int ae, int be){
        this.a = ae;
        this.b = be;
    }
   
    public static void main(String[] args) {
        Aaaaa a = new Aaaaa(0,0);
        Aaaaa b = new Aaaaa(1,1);
        a.abc(2, 1);
        System.out.println(a);
        System.out.println(b);
    }
    
}
