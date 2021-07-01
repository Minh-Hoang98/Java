/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Logger;

/**
 *
 * @author Laptop88
 */
public class Book extends ItemShop{
    private int bookId;
    private String bookName;
    private double trongLuong;

    public Book() {
    }

    public Book(int bookId, String bookName, double trongLuong, int maHang, String donHang, double donGia, int soLuong) {
        super(maHang, donHang, donGia, soLuong);
        this.bookId = bookId;
        this.bookName = bookName;
        this.trongLuong = trongLuong;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(double trongLuong) {
        this.trongLuong = trongLuong;
    }

    @Override
    public double phiVanChuyen() {
        return trongLuong*donGia;
    }  

    @Override
    public String toString() {
        return "Book{" + "bookId=" + bookId + ", bookName=" + bookName + ", trongLuong=" + trongLuong + '}';
    }
}
