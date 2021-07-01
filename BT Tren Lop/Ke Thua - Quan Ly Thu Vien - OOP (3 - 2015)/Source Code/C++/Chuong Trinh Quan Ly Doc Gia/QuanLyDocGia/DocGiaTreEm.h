#pragma once
#include "DocGia.h"

// Lớp DocGiaTreEm kế thừa lại từ lớp DocGia
class DocGiaTreEm : public DocGia
{
private:
	string HoTenNguoiDaiDien;
public:
	friend istream& operator >>(istream &, DocGiaTreEm &);
	friend ostream& operator <<(ostream &, DocGiaTreEm);
	float TinhTienLamThe();
	DocGiaTreEm(void);
	~DocGiaTreEm(void);
};

