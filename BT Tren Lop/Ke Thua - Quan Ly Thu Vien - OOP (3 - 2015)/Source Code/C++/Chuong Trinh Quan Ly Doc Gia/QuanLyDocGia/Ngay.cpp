#include "Ngay.h"

istream& operator >>(istream &is, CNgay &x)
{
	cout << "\nNhap vao ngay: ";
	is >> x.Ngay;

	cout << "\nNhap vao thang: ";
	is >> x.Thang;

	cout << "\nNhap vao nam: ";
	is >> x.Nam;

	return is;
}

ostream& operator <<(ostream &os, CNgay x)
{
	os << "Ngay " << x.Ngay << " thang " << x.Thang << " nam " << x.Nam;

	return os;
}

CNgay::CNgay(void)
{
}


CNgay::~CNgay(void)
{
}
