#include "DocGiaNguoiLon.h"

istream& operator >>(istream &is, DocGiaNguoiLon &x)
{
	// Gọi lại operator nhập của lớp cha
	DocGia *cha = static_cast<DocGia *>(&x);
	is >> *cha;

	/*fflush(stdin);
	cout << "\nNhap vao CMND: ";
	getline(is, x.CMND);*/

	return is;
}

ostream& operator <<(ostream &os, DocGiaNguoiLon x)
{
	DocGia cha = static_cast<DocGia>(x);
	os << cha;

	os << "\nCMND: " << x.CMND;
	os << "\nTien lam the: " << (size_t)x.TinhTienLamThe();
	return os;
}

float DocGiaNguoiLon::TinhTienLamThe()
{
	return SoThangHieuLuc * 10000;
}

string DocGiaNguoiLon::Getter_CMND()
{
	return CMND;
}

void DocGiaNguoiLon::Setter_CMND(string cmnd)
{
	CMND = cmnd;
}

DocGiaNguoiLon::DocGiaNguoiLon(void)
{
}


DocGiaNguoiLon::~DocGiaNguoiLon(void)
{
}
