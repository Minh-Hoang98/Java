using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyDocGia
{
    class DocGiaTreEm : DocGia
    {
        private string HoTenNguoiDaiDien;

        public void Nhap()
        {
            base.Nhap(); // Gọi phương thức nhập của cha

            Console.Write("\nNhap vao ho ten nguoi dai dien: ");
            HoTenNguoiDaiDien = Console.ReadLine();
        }

        public void Xuat()
        {
            base.Xuat();

            Console.Write("\nHo ten nguoi dai dien: {0}", HoTenNguoiDaiDien);
        }

        public float TinhTienLamThe()
        {
            return 20000;
        }
    }
}
