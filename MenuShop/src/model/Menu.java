/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Laptop88
 */
public class Menu {

    private String tieuDe;
    private ArrayList mChon;

    public Menu() {
    }

    public Menu(String[] a) {
        tieuDe = a[0];
        mChon = new ArrayList();
        for (int i = 1; i <= mChon.size(); i++) {
            mChon.add(a[i]);
        }
    }

    public void display() {
        System.out.println(tieuDe);
        System.out.println("");
        for (int i = 0; i < mChon.size(); i++) {
            System.out.println((i + 1) + "." + mChon.get(i));
        }
        System.out.println("");
    }

    public int getSelect() {
        display();
        System.out.print("Mời bạn chọn:  ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void excute(int n) {
    }

    public void run() {
        while (true) {
            int n = getSelect();
            if (n > mChon.size()) {
                break;
            } else {
                excute(n);
            }
        }
    }
}
