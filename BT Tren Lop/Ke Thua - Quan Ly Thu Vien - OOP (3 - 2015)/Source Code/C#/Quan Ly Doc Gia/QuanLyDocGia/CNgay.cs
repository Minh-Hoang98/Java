using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyDocGia
{
    class CNgay
    {
        private int Ngay, Thang, Nam;

        public void Nhap()
        {
            Console.Write("\nNhap ngay: ");
            Ngay = int.Parse(Console.ReadLine());

            Console.Write("\nNhap thang: ");
            Thang = int.Parse(Console.ReadLine());

            Console.Write("\nNhap nam: ");
            Nam = int.Parse(Console.ReadLine());
        }

        public void Xuat()
        {
            Console.Write("Ngay {0} thang {1} nam {2}", Ngay, Thang, Nam);
        }
    }
}
