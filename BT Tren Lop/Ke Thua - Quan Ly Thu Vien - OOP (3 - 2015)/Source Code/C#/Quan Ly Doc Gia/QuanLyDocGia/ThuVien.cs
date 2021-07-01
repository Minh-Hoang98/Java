using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyDocGia
{
    class ThuVien
    {
        private List<DocGiaTreEm> ListDGTE = new List<DocGiaTreEm>();
        private List<DocGiaNguoiLon> ListDGNL = new List<DocGiaNguoiLon>();

        public void Nhap()
        {
            int LuaChon;
	        do{
		        Console.Write("\n----------- Menu -----------\n");
		        Console.Write("\n1. Doc gia tre em");
		        Console.Write("\n2. Doc gia nguoi lon");
		        Console.Write("\n3. Thoat");
		        Console.Write("\n----------------------------\n");

		        do{
			        Console.Write("\nNhap vao lua chon cua ban: ");
			        LuaChon = int.Parse(Console.ReadLine());

			        if(LuaChon < 1 || LuaChon > 3)
			        {
				        Console.Write("\nLua chon khong hop le. Xin kiem tra lai !");
			        }
		        }while(LuaChon < 1 || LuaChon > 3);

		        if(LuaChon == 1) // Trẻ em
		        {
			        DocGiaTreEm a = new DocGiaTreEm();
			        a.Nhap();

			        ListDGTE.Add(a);
			
		        }
		        else if(LuaChon == 2) // Người lớn
		        {
			        bool Check;
			        DocGiaNguoiLon a = new DocGiaNguoiLon();
			        string cmnd;
			        a.Nhap();

			        do{
				
				        Console.Write("\nNhap vao CMND: ");
                        cmnd = Console.ReadLine();

				        Check = true; // Mặc định ban đầu là chưa bị trùng

                        int size = ListDGNL.Count();

				        // Kiểm tra mã cmnd không được trùng nhau giữa các độc giả người lớn
				        for(int i = 0; i < size; i++)
				        {
					        if(ListDGNL[i]._CMND == cmnd)
					        {
						        Check = false;
						        break;
					        }
				        }
				        if(Check == false)
				        {
				        Console.Write("\nMa so CMND da bi trung. Xin kiem tra lai !");
				        }
			        }while(Check == false);
                    a._CMND = cmnd;
                    ListDGNL.Add(a); // Nếu Check là true => thoát khỏi vòng lặp => lúc này push_back vào
		        }

	        }while (LuaChon != 3);
        }

        public void Xuat()
        {
            Console.Write("\n--------- Danh Sach Doc Gia Tre Em ---------\n");

            int sizetreem = ListDGTE.Count();
            for (int i = 0; i < sizetreem; i++)
            {
                Console.Write("\nDoc gia thu {0}", i + 1);
                ListDGTE[i].Xuat();
            }


            Console.Write("\n--------- Danh Sach Doc Gia Nguoi Lon ---------\n");

            int sizenguoilon = ListDGNL.Count();
            for (int i = 0; i < sizenguoilon; i++)
            {
                Console.Write("\nDoc gia thu {0}", i + 1);
                ListDGNL[i].Xuat();
            }
        }

        public float TinhTongTien()
        {
            float Tong = 0;

            int sizetreem = ListDGTE.Count();
            for (int i = 0; i < sizetreem; i++)
            {
                Tong += ListDGTE[i].TinhTienLamThe();
            }

            int sizenguoilon = ListDGNL.Count();
            for (int i = 0; i < sizenguoilon; i++)
            {
                Tong += ListDGNL[i].TinhTienLamThe();
            }
            return Tong;
        }

    }
}
