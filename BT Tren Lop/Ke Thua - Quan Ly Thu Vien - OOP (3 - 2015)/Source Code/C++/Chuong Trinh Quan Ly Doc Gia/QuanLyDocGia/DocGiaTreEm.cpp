#include "DocGiaTreEm.h"

istream& operator >>(istream &is, DocGiaTreEm &x)
{
	// Gọi lại operator nhập của cha
	DocGia *cha = static_cast<DocGia *>(&x);
	is >> *cha; 

	fflush(stdin);
	cout << "\nNhap vao ho ten nguoi dai dien: ";
	getline(is, x.HoTenNguoiDaiDien);

	return is;
}

ostream& operator <<(ostream &os, DocGiaTreEm x)
{
	// Gọi lại operator xuất của cha
	DocGia cha = static_cast<DocGia>(x);
	os << cha;

	os << "\nHo ten nguoi dai dien: " << x.HoTenNguoiDaiDien;
	os << "\nTien lam the: " << (size_t)x.TinhTienLamThe();

	return os;
}

float DocGiaTreEm::TinhTienLamThe()
{
	return 20000;
}

DocGiaTreEm::DocGiaTreEm(void)
{
}


DocGiaTreEm::~DocGiaTreEm(void)
{
}
