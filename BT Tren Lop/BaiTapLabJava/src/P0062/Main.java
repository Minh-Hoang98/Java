/*      
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0062;

import java.util.Scanner;

public class Main {
    
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("===== Analysis Path Program =====");
        System.out.println("Please input Path:");
        String path = a.nextLine();
        Path b = new Path(path);       
        b.display();
      
    }
}
