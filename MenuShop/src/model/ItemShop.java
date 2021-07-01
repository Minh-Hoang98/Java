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
public class ItemShop {
    protected int maHang;
    protected String donHang;
    protected double donGia;
    protected int soLuong;

    public ItemShop(int maHang, String donHang, double donGia, int soLuong) {
        this.maHang = maHang;
        this.donHang = donHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public ItemShop() {
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getDonHang() {
        return donHang;
    }

    public void setDonHang(String donHang) {
        this.donHang = donHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
       
    public double Total(){
        return soLuong*donGia;
    }

    @Override
    public String toString() {
        return "ItemShop{" + "maHang: " + maHang + ", donHang: " + donHang + ", donGia: " + donGia + ", soLuong:" + soLuong + '}';
    }
        
    public double phiVanChuyen(){
        return 0;
    }
}
