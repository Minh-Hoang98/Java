/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangdong;

import java.util.ArrayList;

/**
 *
 * @author Laptop88
 */
public class MangDong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList<KieuDuLieu> tenmang = new ArrayList<KieuDuLieu>();
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(19); // 19 = 0
        a.add(54); // 54 = 1
        a.add(12); // 12 = 2
        System.out.println(a.get(2));
        System.out.println(a.size());
        a.add(29);
        a.add(11);
        System.out.println(a.size());
    }
    
}
