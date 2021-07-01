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
public class Software extends ItemShop{
     
    private int soLuongCD;

    public Software(int soLuongCD, int maHang, String donHang, double donGia, int soLuong) {
        super(maHang, donHang, donGia, soLuong);
        this.soLuongCD = soLuongCD;
    }

    public int getSoLuongCD() {
        return soLuongCD;
    }

    public void setSoLuongCD(int soLuongCD) {
        this.soLuongCD = soLuongCD;
    }

    @Override
    public double phiVanChuyen() {
        return soLuongCD*donGia;
    }

    @Override
    public String toString() {
        return "Software{" + "soLuongCD=" + soLuongCD + '}';
    }

    
    
 
}
