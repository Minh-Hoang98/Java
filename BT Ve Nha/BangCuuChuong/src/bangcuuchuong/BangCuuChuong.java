/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangcuuchuong;

/**
 *
 * @author Laptop88
 */
public class BangCuuChuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 2; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.print(i + " x " + j + " = " + i * j + "\n");
            }
            System.out.println(" ");
        }
    }
    
}
