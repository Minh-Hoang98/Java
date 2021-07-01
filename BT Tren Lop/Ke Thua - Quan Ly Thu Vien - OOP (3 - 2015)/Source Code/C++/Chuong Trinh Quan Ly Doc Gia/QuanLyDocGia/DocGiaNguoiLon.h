#pragma once
#include "DocGia.h"

class DocGiaNguoiLon : public DocGia
{
private:
	string CMND;
public:
	friend istream& operator >>(istream &, DocGiaNguoiLon &);
	friend ostream& operator <<(ostream &, DocGiaNguoiLon);
	float TinhTienLamThe();
	string Getter_CMND();
	void Setter_CMND(string);
	DocGiaNguoiLon(void);
	~DocGiaNguoiLon(void);
};

