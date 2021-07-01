#include "ThuVien.h"

istream& operator >>(istream &is, ThuVien &x)
{
	int LuaChon;
	do{
		cout << "\n----------- Menu -----------\n";
		cout << "\n1. Doc gia tre em";
		cout << "\n2. Doc gia nguoi lon";
		cout << "\n3. Thoat";
		cout << "\n----------------------------\n";

		do{
			cout << "\nNhap vao lua chon cua ban: ";
			cin >> LuaChon;

			if(LuaChon < 1 || LuaChon > 3)
			{
				cout << "\nLua chon khong hop le. Xin kiem tra lai !";
			}
		}while(LuaChon < 1 || LuaChon > 3);

		if(LuaChon == 1) // Trẻ em
		{
			DocGiaTreEm a;
			is >> a;

			x.ListDGTE.push_back(a);
			
		}
		else if(LuaChon == 2) // Người lớn
		{
			bool Check;
			DocGiaNguoiLon a;
			string cmnd;
			is >> a;

			do{
				fflush(stdin);
				cout << "\nNhap vao CMND: ";
				getline(is, cmnd);

				Check = true; // Mặc định ban đầu là chưa bị trùng

				int size = x.ListDGNL.size();

				// Kiểm tra mã cmnd không được trùng nhau giữa các độc giả người lớn
				for(int i = 0; i < size; i++)
				{
					if(x.ListDGNL[i].Getter_CMND() == cmnd)
					{
						Check = false;
						break;
					}
				}
				if(Check == false)
				{
					cout << "\nMa so CMND da bi trung. Xin kiem tra lai !";
				}
			}while(Check == false);
			a.Setter_CMND(cmnd);
			x.ListDGNL.push_back(a); // Nếu Check là true => thoát khỏi vòng lặp => lúc này push_back vào
		}

	}while (LuaChon != 3);

	return is;
}

ostream& operator <<(ostream &os, ThuVien x)
{
	os << "\n--------- Danh Sach Doc Gia Tre Em ---------\n";

	int sizetreem = x.ListDGTE.size();
	for(int i = 0; i < sizetreem; i++)
	{
		os << "\nDoc gia thu " << i + 1 << x.ListDGTE[i];
	}


	os << "\n--------- Danh Sach Doc Gia Nguoi Lon ---------\n";

	int sizenguoilon = x.ListDGNL.size();
	for(int i = 0; i < sizenguoilon; i++)
	{
		os << "\nDoc gia thu " << i + 1 << x.ListDGNL[i];
	}

	return os;
}

float ThuVien::TinhTongTienLamThe()
{
	float Tong = 0;

	int sizetreem = ListDGTE.size();
	for(int i = 0; i < sizetreem; i++)
	{
		Tong += ListDGTE[i].TinhTienLamThe();
	}

	int sizenguoilon = ListDGNL.size();
	for(int i = 0; i < sizenguoilon; i++)
	{
		Tong += ListDGNL[i].TinhTienLamThe();
	}
	return Tong;
}

ThuVien::ThuVien(void)
{
}


ThuVien::~ThuVien(void)
{
}
