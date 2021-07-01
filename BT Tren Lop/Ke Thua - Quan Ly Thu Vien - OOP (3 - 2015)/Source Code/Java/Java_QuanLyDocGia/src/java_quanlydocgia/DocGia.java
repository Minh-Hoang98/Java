
package java_quanlydocgia;

import java.util.Scanner;

public class DocGia {
        protected String HoTen;
	protected CNgay NgayLapThe = new CNgay();
	protected int SoThangHieuLuc;

        public void Nhap()
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("\nNhap vao ho ten: ");
            HoTen = scan.nextLine();

            System.out.print("\nNhap vao ngay lam the: ");
            NgayLapThe.Nhap();

            do{
		        System.out.print("\nNhap vao so thang co hieu luc: ");
                        SoThangHieuLuc = Integer.parseInt(scan.nextLine());

		        if(SoThangHieuLuc <= 0)
		        {
			        System.out.print("\nSo thang co hieu luc phai la so duong khac 0. Xin kiem tra lai !");
		        }
	        }while(SoThangHieuLuc <= 0);
            
        }

        public void Xuat()
        {
            System.out.print("\nHo ten: " + String.valueOf(HoTen));
            
            System.out.print("\nNgay lap the: ");
            NgayLapThe.Xuat();

            System.out.print("\nSo thang co hieu luc: " + String.valueOf(SoThangHieuLuc));
        }
}
