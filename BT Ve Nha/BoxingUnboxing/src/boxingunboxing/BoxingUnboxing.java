/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxingunboxing;

public class BoxingUnboxing {

    public static void main(String[] args) {
        
        long a = 124235L; // Khởi tạo a có kiểu dữ liệu long     
        
        Long b = new Long(a); // boxing
        long c = b.longValue(); // unboxing
        
        System.out.println(c);
    }
}

