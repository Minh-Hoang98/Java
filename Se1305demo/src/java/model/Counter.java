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
public class Counter {
    private int m=0;

    public Counter() {
    }

    public int getCount() {
        return m++;
    }

    public void setCount(int m) {
        this.m = m;
    }
    
    
}
