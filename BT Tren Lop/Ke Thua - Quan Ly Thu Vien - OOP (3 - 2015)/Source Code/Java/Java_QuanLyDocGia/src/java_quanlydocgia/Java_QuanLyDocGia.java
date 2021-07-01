/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_quanlydocgia;

/**
 *
 * @author NguyenVietNamSon
 */
public class Java_QuanLyDocGia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ThuVien x = new ThuVien();
        x.Nhap();
        x.Xuat();
        System.out.print("\nTong tien lam the cua thu vien: " + String.valueOf(x.TinhTongTien()));
        
    }
    
}
