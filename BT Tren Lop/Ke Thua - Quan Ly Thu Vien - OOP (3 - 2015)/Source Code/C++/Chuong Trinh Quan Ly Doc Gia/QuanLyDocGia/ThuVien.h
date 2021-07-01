#pragma once
//#ifndef Sondeptrai
//#define Sondeptrai

#include "DocGiaNguoiLon.h"
#include "DocGiaTreEm.h"
#include <vector>

class ThuVien
{
private:
	vector<DocGiaNguoiLon> ListDGNL;
	vector<DocGiaTreEm> ListDGTE;
public:
	friend istream& operator >>(istream &, ThuVien &);
	friend ostream& operator <<(ostream &, ThuVien);
	float TinhTongTienLamThe();
	ThuVien(void);
	~ThuVien(void);
};
//#endif Sondeptrai
