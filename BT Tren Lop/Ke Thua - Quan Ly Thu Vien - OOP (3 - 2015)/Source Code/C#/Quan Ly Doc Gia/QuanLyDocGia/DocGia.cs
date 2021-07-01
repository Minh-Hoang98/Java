using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyDocGia
{
    class DocGia
    {
        protected string HoTen;
	    protected CNgay NgayLapThe = new CNgay();
	    protected int SoThangHieuLuc;

        public void Nhap()
        {
            Console.Write("\nNhap vao ho ten: ");
            HoTen = Console.ReadLine();

            Console.Write("\nNhap vao ngay lam the: ");
            NgayLapThe.Nhap();

            do{
		        Console.Write("\nNhap vao so thang co hieu luc: ");
                SoThangHieuLuc = int.Parse(Console.ReadLine());

		        if(SoThangHieuLuc <= 0)
		        {
			        Console.Write("\nSo thang co hieu luc phai la so duong khac 0. Xin kiem tra lai !");
		        }
	        }while(SoThangHieuLuc <= 0);
            
        }

        public void Xuat()
        {
            Console.Write("\nHo ten: {0}", HoTen);
            
            Console.Write("\nNgay lap the: ");
            NgayLapThe.Xuat();

            Console.Write("\nSo thang co hieu luc: {0}", SoThangHieuLuc);
        }


    }
}
