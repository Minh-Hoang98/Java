/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

/**
 *
 * @author Admin
 */
public class Triangle {
    
    public static TriangleType classify(final int a, final int b, final int c){
        int trian;
        if((a <= 0) || (b <= 0) || (c <= 0)){
            return TriangleType.INVALID;
        }
        
        trian = 0;
        
        if(a == b){
            trian += 1;
        }
        if(a == c){
            trian += 2;
        }
        if(b == c){
            trian += 3;
        }
        
        if(trian == 0){
            if(((a+b) < c) || ((a+c) < b) || ((c+b) < a)){
                return TriangleType.INVALID;
            }
            else{
                return TriangleType.SCALENE;
            }
        }
        
        if(trian > 3){
            return TriangleType.EQUILATERAL;
        }
        
        if((trian == 1) && ((a+b) > c)){
            return TriangleType.ISOSCELES;
        }else if((trian == 2) && ((a+c) > b)) {
            return TriangleType.ISOSCELES;
        }else if((trian == 3) && ((c+b) > a)){
            return TriangleType.ISOSCELES;
        }
        return TriangleType.INVALID;
    }
}
