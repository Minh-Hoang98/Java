using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyDocGia
{
    class Program
    {
        static void Main(string[] args)
        {
            ThuVien x = new ThuVien();
            x.Nhap();
            x.Xuat();
            Console.Write("\nTong tien lam the: {0}", x.TinhTongTien());

            Console.ReadKey(); // <=> system("pause")

        }
    }
}
