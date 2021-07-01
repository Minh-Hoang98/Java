/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxing;

public class Autoboxing {
    
    private static int cube(int x) {
        
        return x * x * x;
    }

    public static void main(String[] args) {
        
        Integer i = 10; // Automatic boxing cho dòng lệnh này. Giá trị i được đóng hộp vào kiểu Integer.
        int j = i; // Automatic boxing
        
        System.out.println(i);
        System.out.println(j);        
        
        Integer a = cube(i);
        System.out.println(a);    
    }
}
