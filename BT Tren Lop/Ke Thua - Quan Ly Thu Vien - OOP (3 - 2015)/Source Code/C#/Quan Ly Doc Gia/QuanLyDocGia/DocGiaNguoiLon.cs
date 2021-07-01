using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyDocGia
{
    class DocGiaNguoiLon : DocGia
    {
        private string CMND;

        public string _CMND
        {
            get { return CMND; }
            set { CMND = value; }
        }

        public void Nhap()
        {
            base.Nhap(); // Gọi lại phương thức nhập của cha

            // CMND sẽ nhập trong thư viện
        }

        public void Xuat()
        {
            base.Xuat(); // Gọi lại phương thức xuất của cha

            Console.Write("\nCMND: {0}", CMND);
        }

        public float TinhTienLamThe()
        {
            return SoThangHieuLuc * 10000;
        }
    }
}
